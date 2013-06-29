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
	public User userAuthenticationByOpenId(String openId,int regType) throws Exception;
	
	
	/**
	 * 通过邮箱获取用户
	 * @param email
	 * @return
	 * @throws Exception
	 */
	public User getUserbyEmail(String email) throws Exception;
	
	/**
	 * 
	 * @param username
	 * @return
	 * @throws Exception
	 */
	public User getUserbyUserName(String username) throws Exception;
	
	
	/**
	 * 
	 * @param user
	 * @return
	 * @throws Exception
	 */
	public String verifyUserReg(User user) throws Exception;
}
