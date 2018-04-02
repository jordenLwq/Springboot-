package com.jorden.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.jorden.entity.User;
import com.jorden.service.UserService;
/**
 * 
 * @ClassName:  UserServiceImpl   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: jorden.li
 * @date:   2018年4月2日 上午10:49:39   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 * Success is never final. Failure is never fatal. Courage is what counts. -Sir Winston Churchill
 */
@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Map<String, Object>> selectAll() {
		return jdbcTemplate.queryForList("select * from user");
	}

	@Override
	public User selectByPirmayKey(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteByPrimayKey(User t) {
		jdbcTemplate.update("delete  from user  where id = "+t.getId());
	}

}
