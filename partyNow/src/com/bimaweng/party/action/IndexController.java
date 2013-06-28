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
@ReqPath("regsiter")
public class IndexController extends BaseController{
	
	@Autowired
	UserService userService;
	
	@AsController(path = "reg")
	public Object regsiter(User user,HttpServletRequest request) {
		String stateCode = Constant.COMMON_SUCCESS;
		JSONObject json = new JSONObject();
		try{
			//TODO 校验数据
			User libUser = userService.regsitUser(user);
			if(libUser!=null){
				json.put("userinfo", libUser);
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
			//TODO 校验数据
			User libUser = userService.userAuthentication(username,password);
			if(libUser!=null){
				json.put("userinfo", libUser);
			}
		}catch(Exception e){
			
			stateCode = Constant.COMMON_EXCEPTION;
		}finally{
			json.put("state", stateCode);
		}
		return new ActionForward.Text(json.toString());
	}
	
}
