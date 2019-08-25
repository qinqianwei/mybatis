package test;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import dao.UserDao;
import pojo.User;
import utils.SqlSessionFactoryUtils;

public class UserDaoTestInsert {
	
	@Test
	public void testInsertUser() {
		SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		UserDao userDao = sqlSession.getMapper(UserDao.class);
		User user = new User(10,"qianwei",new Date(),"1","henan");
		userDao.insertUser(user);
		sqlSession.commit();
		sqlSession.close();
	}
	

}
