package com.bimaweng.party.service.impl;

import org.springframework.stereotype.Service;

import com.bimaweng.party.entity.User;
import com.bimaweng.party.service.UserService;

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
	public User userAuthenticationByOpenId(String openId) throws Exception {
		String sql = "select * from t_user where user_name=? ";
		return libernate.getEntityCustomized(User.class,sql, new Object[]{openId});
	}
		
	
	
}
