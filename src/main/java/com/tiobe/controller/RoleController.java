package com.tiobe.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tiobe.dao.UserMapper;
import com.tiobe.model.User;

/**
* Title: RoleController
* Description: 
* Team: SSflow
* @author Ss
* @date 2017年2月10日
*
*/
@Controller
@RequestMapping("/role")
public class RoleController {
	private static Logger logger = Logger.getLogger(RoleController.class);
	
//	@Autowired
//	private UserMapper userMapper;
	
	@RequestMapping("/admin")
	public ModelAndView admin(){
		logger.info("get into admin page ");
		User user =new User();
//		User user = userMapper.selectByPrimaryKey(3);
		logger.info("name:"+user.getUserName());
		logger.info("role:"+user.getRoleId());
		logger.info("pwd:"+user.getPassword());
		return new ModelAndView("admin");
		
	}
	@RequestMapping("/login")
	public ModelAndView login(){
		logger.info("get into login page ");
		logger.info("get into admin page ");
		User user = new User();
//		User user = userMapper.selectByPrimaryKey(3);
		logger.info("name:"+user.getUserName());
		logger.info("role:"+user.getRoleId());
		logger.info("pwd:"+user.getPassword());
		return new ModelAndView("login");
		
	}
}
