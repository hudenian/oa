package com.huma.oa.business.user.dao;

import com.huma.oa.base.mybatis.MyBatisRepository;
import com.huma.oa.business.user.bean.User;

/**
 * 用户DAO接口
 *
 */
@MyBatisRepository
public interface UserDao {

	public User get(User user);
}
