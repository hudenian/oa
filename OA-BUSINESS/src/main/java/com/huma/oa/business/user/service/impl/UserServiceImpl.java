package com.huma.oa.business.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huma.oa.business.user.bean.User;
import com.huma.oa.business.user.dao.UserDao;
import com.huma.oa.business.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	public User login(User user) {
		//FIXME 开发时要进行改造
		User user1 = userDao.get(user);
		return user1;
	}


}
