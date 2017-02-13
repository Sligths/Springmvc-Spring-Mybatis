package com.tiobe.service;

import java.util.List;
import com.tiobe.bean.UserBean;
import com.tiobe.model.User;

public interface UserService {
	public int addUser(User user);
	public int dedleUser(User user);
	public int updateUser(User user);
	public User getUserByKey(String key);
	public UserBean getUserByName(String name);
	public List<User> getUser();
}
