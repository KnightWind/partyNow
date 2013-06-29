package com.bimaweng.party.action;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;

import com.bimaweng.party.entity.User;
import com.bimaweng.party.service.UserService;
import com.bimaweng.party.util.Constant;
import com.libernate.liberc.ActionForward;
import com.libernate.liberc.annotation.AsController;
import com.libernate.liberc.annotation.CParam;
import com.libernate.liberc.annotation.ReqPath;
@ReqPath("index")
public class IndexController extends BaseController{
	
	@Autowired
	UserService userService;
	
	@AsController(path = "reg")
	public Object regsiter(User user,HttpServletRequest request) {
		String stateCode = Constant.COMMON_SUCCESS;
		JSONObject json = new JSONObject();
		try{
			String verfifyCode = userService.verifyUserReg(user);
			if(!Constant.COMMON_SUCCESS.equals(verfifyCode)){
				stateCode = verfifyCode;
			}else{
				User libUser = userService.regsitUser(user);
				if(libUser!=null){
					json.put("userinfo", libUser);
				}else{
					stateCode = Constant.COMMON_EXCEPTION;
				}
			}
		}catch(Exception e){
			stateCode = Constant.COMMON_EXCEPTION;
		}finally{
			json.put("state", stateCode);
		}
		return new ActionForward.Text(json.toString());
	}
	
	@AsController(path = "login")
	public Object login(@CParam("username")String username,@CParam("password")String password,
			@CParam("registerType")int registerType,HttpServletRequest request) {
		String stateCode = Constant.COMMON_SUCCESS;
		JSONObject json = new JSONObject();
		try{
			User libUser = null;
			if(registerType==Constant.REG_TYPE_GENERAL){
				libUser = userService.userAuthentication(username,password);
			}else{
				libUser = userService.userAuthenticationByOpenId(username, registerType);
			}
			
			if(libUser!=null){
				json.put("userinfo", libUser); 
				
			}else{
				stateCode = Constant.COMMON_EXCEPTION;
			}
		}catch(Exception e){
			
			stateCode = Constant.COMMON_EXCEPTION;
		}finally{
			json.put("state", stateCode);
		}
		return new ActionForward.Text(json.toString());
	}
	
}
