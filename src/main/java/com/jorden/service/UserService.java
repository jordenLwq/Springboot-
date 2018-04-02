package com.jorden.service;

import java.util.List;
import java.util.Map;

import com.jorden.entity.User;

/**
 * 
 * @ClassName:  UserService   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: jorden.li
 * @date:   2018年4月2日 上午10:49:43   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 * Success is never final. Failure is never fatal. Courage is what counts. -Sir Winston Churchill
 */
public interface UserService {

	/**
	 * 
	 * @Title: selectAll   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @return      
	 * @return: List<Map<String, Object>>    
	 * @throws
	 */
	List<Map<String, Object>>  selectAll();
	 
	 /**
	  * 
	  * @Title: selectOne   
	  * @Description: TODO(这里用一句话描述这个方法的作用)   
	  * @param: @param t
	  * @param: @return      
	  * @return: T      
	  * @throws
	  */
	 User  selectByPirmayKey(User t);
	 /**
	  * 
	  * @Title: deleteByPrimayKey   
	  * @Description: TODO(这里用一句话描述这个方法的作用)   
	  * @param: @param t      
	  * @return: void      
	  * @throws
	  */
	 void deleteByPrimayKey(User t );
	
}
