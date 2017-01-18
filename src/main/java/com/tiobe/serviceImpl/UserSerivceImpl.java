package com.tiobe.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.tiobe.bean.UserBean;
import com.tiobe.dao.UserMapper;
import com.tiobe.model.User;
import com.tiobe.service.UserService;
import com.tiobe.utill.SimpleDateFormat;

/**
 * @author Ss
 *
 */
@Service(value="UserService")
public class UserSerivceImpl  implements UserService{

	@Resource
	UserMapper userMapper;
	private  Logger logger = Logger.getLogger(UserSerivceImpl.class);


	@Override
	public int addUser(User user) {
		boolean code=false;
		int i=0;
		logger.info("UserSerivceImpl insert user and w_user");
		user.setCreateTime(new Date());
		user.setLastLoginTime(new Date());
		user.setStatus(user.getStatus()==null?0:user.getStatus());//0:不可用,1:可用,2:锁定中
		try {
			 i= userMapper.insert(user);
			 code=true;
		} finally {
			if(code){	
				logger.info("insert success");
				}else{
					logger.info("error");
				}
		}
		logger.info(i);
		return i;
	}

	@Override
	public int dedleUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.deleteByPrimaryKey(user.getId());
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.updateByPrimaryKey(user);
	}

	@Override
	public User getUserByKey(String key) {
		User user = null ;
		try{
			user = userMapper.selectByPrimaryKey(Integer.valueOf(key));
		}catch (Exception e){
			logger.error("can't get the user with the " +key);
		}
		return user;
	}

	@Override
	public UserBean getUserByName(String name) {
		logger.info("getUserByName");
		User user = userMapper.getUserByName(name);
		UserBean userBean =new UserBean();
		userBean.setName(name);
		userBean.setPassword(user.getPassword());
		userBean.setStatus(user.getStatus().toString());
		userBean.setLastlogintime(new SimpleDateFormat().DateToString(user.getLastLoginTime()));
		return userBean;
	}

	@Override
	public List<UserBean> getUser() {
		int i=0;
		List<UserBean> listbean = new ArrayList<>();
		UserBean ub =new UserBean();
		List<User> list = userMapper.queryAllUser();
		if(list.size()<0&&list.isEmpty()){
			logger.error("user is empty");
		}
		for(User user:list){
			ub.setName(user.getName());
			ub.setPassword(user.getPassword());
			ub.setStatus(user.getStatus().toString());
			ub.setLastlogintime(new SimpleDateFormat().DateToString(user.getLastLoginTime()));
			listbean.add(i, ub);;
			logger.info(i+":"+user.getName());
			i++;
		}
		System.out.println(listbean.toString());
		return listbean;
	}
	

}
