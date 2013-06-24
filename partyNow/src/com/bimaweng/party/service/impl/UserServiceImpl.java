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
		
	
	
}
