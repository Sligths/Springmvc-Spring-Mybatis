package com.tiobe.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tiobe.bean.UserBean;
import com.tiobe.model.User;
import com.tiobe.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	private static Logger logger = Logger.getLogger(UserController.class);
	
	@Resource(name="UserService")
	UserService userService;

	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Map<String, String> getUser(@PathVariable String id){
		Map<String, String> map =new HashMap<String, String>();
		User user = userService.getUserByKey(id);
		String msg="";
		if(!(user==null)){
			map.put("userId", user.getId().toString());
			map.put("name", user.getName());
			map.put("password", user.getPassword());
			msg="success";
		}else{
			msg="can't find the user";
		}
		
		logger.info(map);
		map.put("msg", msg);
		return map;
	}
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public Map<String, String> addUser(@RequestBody User user){
		logger.info("start the method: add");
		Map<String, String> map =new HashMap<String, String>();
		System.out.println("controller");
		int i = userService.addUser(user);
		map.put("map", "end"+i);
		return map;
	}
	
	@RequestMapping(value="/{name}/show",method = RequestMethod.GET)
	public Map<String,Object> getUsers(@PathVariable String name){
		logger.info("start");
		Map<String, Object> map =new LinkedHashMap<String, Object>();
		UserBean userBean = userService.getUserByName(name);
		userService.getUser();		
		map.put(name, userBean);
		return map;
	}
	@RequestMapping(value="/lists",method = RequestMethod.GET)
	public Map<String,Object> getUsers(){
		Map<String, Object> map =new LinkedHashMap<String, Object>();
		map.put("users",userService.getUser());
		return map;
	}
}
