package com.jorden.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jorden.entity.User;
import com.jorden.service.UserService;
/**
 * 
 * @ClassName:  UserContorller   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: jorden.li
 * @date:   2018年4月2日 下午1:03:57   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 * Success is never final. Failure is never fatal. Courage is what counts. -Sir Winston Churchill
 */
@RestController
@RequestMapping("user")
public class UserContorller {
	
	@Autowired
	UserService userService;
	/**
	 * 
	 * @Title: getList   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @return      
	 * @return: ResponseEntity<List<User>>      
	 * @throws
	 */
	@RequestMapping("/getList")
	public ResponseEntity<List<Map<String, Object>> > getList(){
		return ResponseEntity.ok(userService.selectAll());
		
	}
	@RequestMapping("/deleteForPrimayKey")
	public ResponseEntity<String> deleteForPrimayKey(){
		userService.deleteByPrimayKey(new User(7));
		return  ResponseEntity.ok("success");
		
	}

}
