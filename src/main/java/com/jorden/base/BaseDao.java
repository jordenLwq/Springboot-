package com.jorden.base;

import java.util.List;
/**
 * 
 * @ClassName:  BaseDao   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: jorden.li
 * @date:   2018年4月2日 上午11:25:41   
 *   
 * @param <T>  
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 * Success is never final. Failure is never fatal. Courage is what counts. -Sir Winston Churchill
 */
public interface  BaseDao<T> {
	
	
	/**
	 * 
	 * @Title: selectAll   
	 * @Description: TODO(这里用一句话描述这个方法的作用)   
	 * @param: @return      
	 * @return: List<T>      
	 * @throws
	 */
	 List<T> selectAll();
	 
	 /**
	  * 
	  * @Title: selectOne   
	  * @Description: TODO(这里用一句话描述这个方法的作用)   
	  * @param: @param t
	  * @param: @return      
	  * @return: T      
	  * @throws
	  */
	 T  selectByPirmayKey(T t);
	 /**
	  * 
	  * @Title: deleteByPrimayKey   
	  * @Description: TODO(这里用一句话描述这个方法的作用)   
	  * @param: @param t      
	  * @return: void      
	  * @throws
	  */
	 void deleteByPrimayKey(T t );
	
	

}
