package com.jorden;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
/**
 * 项目启动主类
 *  
 * @ClassName:  ApplicationStart   
 * @Description:TODO(这里用一句话描述这个类的作用)   
 * @author: jorden.li
 * @date:   2018年4月2日 上午11:23:49   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 * Success is never final. Failure is never fatal. Courage is what counts. -Sir Winston Churchill
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class ApplicationStart {
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationStart.class, args);
	}

}
