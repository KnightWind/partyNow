package com.bimaweng.party.service.impl;

import org.springframework.stereotype.Service;

import com.bimaweng.party.entity.User;
import com.bimaweng.party.service.UserService;
import com.bimaweng.party.util.Constant;

/**
 * @desc 
 * @author knight
 * @date 2013-6-24
 */
@Service
public class UserServiceImpl extends BaseService implements UserService {
	
	@Override
	public User regsitUser(User user) throws Exception {
		return libernate.saveEntity(user);
	}

	
	@Override
	public User userAuthentication(String username,String password) throws Exception {
		String sql = "select * from t_user where user_name=? and password=?";
		return libernate.getEntityCustomized(User.class,sql, new Object[]{username,password});
	}

	
	@Override
	public User userAuthenticationByOpenId(String openId,int regType) throws Exception {
		String sql = "select * from t_user where user_name=? and register_type = ?";
		return libernate.getEntityCustomized(User.class,sql, new Object[]{openId,regType});
	}


	@Override
	public User getUserbyEmail(String email) throws Exception {
		
		String sql = "select * from t_user where email=? ";
		return  libernate.getEntityCustomized(User.class,sql, new Object[]{email});
	}

	
	@Override
	public User getUserbyUserName(String username) throws Exception {
		String sql = "select * from t_user where user_name=? ";
		return libernate.getEntityCustomized(User.class,sql, new Object[]{username});
	}


	@Override
	public String verifyUserReg(User user) throws Exception {
		if(user==null){ 
			return Constant.COMMON_EXCEPTION;
		//普通登录
		}
		if(user.getUserName().equals("")){
			
			return Constant.ACCOUT_ERROR;
		}
		if(user.getRegisterType()==Constant.REG_TYPE_GENERAL){
			if(user.getPassword().equals("")){
				return Constant.PASS_ERROR;
			}else if(user.getEmail().equals("") || getUserbyEmail(user.getEmail())!=null){
				return Constant.EMAIL_ERROR;
			}else if(getUserbyUserName(user.getUserName())!=null){
				return Constant.ACCOUT_ERROR;
			}
		}
		return Constant.COMMON_SUCCESS;
	}
		
	
	
}
