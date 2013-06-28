package com.bimaweng.party.service;

import com.bimaweng.party.entity.User;

/**
 * @desc 
 * @author knight
 * @date 2013-6-24
 */
public interface UserService  {

	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	public User regsitUser(User user) throws Exception;
	
	
	/**
	 * 用户登录
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public User userAuthentication(String username,String password) throws Exception;
	
	
	/**
	 * 
	 * @param openId
	 * @return
	 * @throws Exception
	 */
	public User userAuthenticationByOpenId(String openId) throws Exception;
}
