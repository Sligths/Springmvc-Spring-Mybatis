package Test;


import java.io.Reader;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.tiobe.bean.UserBean;
import com.tiobe.dao.UserMapper;
import com.tiobe.model.User;
import com.tiobe.service.UserService;
import com.tiobe.serviceImpl.UserSerivceImpl;

public class Test {
	
	static UserSerivceImpl userService = new UserSerivceImpl();
	
//	static SqlSessionFactory sqlSessionFactory =null;
//	static SqlSession session ;
//	static Reader reader;
//	static {
//	try{
//		reader = Resources.getResourceAsReader("configuration.xml"); 
//	}catch(Exception e){
//        e.printStackTrace();
//	}
//}
	public static void main(String[] args) {
//		SqlSession session = sqlSessionFactory.openSession();
        try {
//        	UserBean user = userService.getUser();
//        	UserMapper userMapper=session.getMapper(UserMapper.class);
//            userMapper.insert(user);
//            System.out.println(user.getName()+"-	-"+user.getPassword());
        } finally {
//            session.close();
        	System.out.println("end of get user list");
        }
    }
}
