package com.tiobe.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.Resource;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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
@Service("userService")
public class UserSerivceImpl  implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	private  Logger logger = Logger.getLogger(UserSerivceImpl.class);


	@Override
	public int addUser(User user) {
		boolean code=false;
		int i=0;
		logger.info("UserSerivceImpl insert user and w_user");
//		user.setCreateTime(new Date());
//		user.setLastLoginTime(new Date());
//		user.setStatus(user.getStatus()==null?0:user.getStatus());//0:不可用,1:可用,2:锁定中
		try {
//			 i= userMapper.insert(user);
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
//		return userMapper.deleteByPrimaryKey(user.getId());
		return 0;
	}

	@Override
	public int updateUser(User user) {
		// TODO Auto-generated method stub
//		return userMapper.updateByPrimaryKey(user);
		return 0;
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
//		User user = userMapper.getUserByName(name);
		UserBean userBean =new UserBean();
		userBean.setName(name);
//		userBean.setPassword(user.getPassword());
//		userBean.setStatus(user.getStatus().toString());
//		userBean.setLastlogintime(new SimpleDateFormat().DateToString(user.getLastLoginTime()));
		return userBean;
	}

	@Override
	public List<User> getUser() {
		int i=0;
		List<User> listbean = new ArrayList<>();
		List<User> list = userMapper.getUser();
		if(list.size()<0&&list.isEmpty()){
			logger.error("user is empty");
		}
		for(User user:list){
			listbean.add(i,user);
			logger.info("put the user into list :"+user.getUsername());
			i++;
		}
		return listbean;
	}
	

}
