package com.tiobe.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.omg.CORBA.UserException;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tiobe.bean.UserBean;
import com.tiobe.dao.UserMapper;
import com.tiobe.model.User;
import com.tiobe.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private static Logger logger = Logger.getLogger(UserController.class);

	@Resource(name = "userService")
	UserService userService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public Map<String, String> getUser(@PathVariable String id) {
		logger.info("getting the user:"+ id );
		Map<String, String> map = new HashMap<String, String>();
		User user = userService.getUserByKey(id);
		String msg = "";
		if (!(user == null)) {
			map.put("userId", user.getUserId().toString());
			map.put("name", user.getUserName());
			map.put("password", user.getPassword());
			map.put("role", user.getRoleId().toString());
			msg = "success";
		} else {
			msg = "can't find the user";
		}
		logger.info(map);
		map.put("msg", msg);
		return map;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public Map<String, String> addUser(@RequestBody User user) {
		logger.info("start the method: add");
		Map<String, String> map = new HashMap<String, String>();
		System.out.println("controller");
		int i = userService.addUser(user);
		map.put("map", "end" + 1);
		return map;
	}

	@RequestMapping(value = "/{name}/show", method = RequestMethod.GET)
	public Map<String, Object> getUsers(@PathVariable String name) {
		logger.info("start");
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		UserBean userBean = userService.getUserByName(name);
		userService.getUser();
		map.put(name, userBean);
		return map;
	}

	@RequestMapping(value = "/lists", method = RequestMethod.GET)
	public Map<String, Object> getUsers() {
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		map.put("users", userService.getUser());
		return map;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(UserBean userBean) {
		Map<String, Object> map = new LinkedHashMap<String, Object>();
		UserDetails details = null;
		try {
			logger.info("login method");
			// 用户名,密码,是否激活,accountnonexpired如果帐户没有过期设置为true
			// credentialsnonexpired如果证书没有过期设置为true
			// accountnonlocked如果帐户不锁定设置为true
//			User u = userMapper.getUserByName(userBean.getName());
			// 目前是把角色给写死了
//			details = new org.springframework.security.core.userdetails.User(u.getName(), u.getPassword(), false, false, false,u.isEnable(), AuthorityUtils.createAuthorityList("ROLE_USER"));
		} catch (UsernameNotFoundException usernameNotFoundException) {
			usernameNotFoundException.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "index";
	}

}
