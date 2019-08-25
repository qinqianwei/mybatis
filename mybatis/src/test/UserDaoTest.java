package test;

import org.junit.Test;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import dao.UserDao;
import pojo.User;
import utils.SqlSessionFactoryUtils;

import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
public class UserDaoTest {

	@Test
	public void testGetUserById() {
		SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		UserDao userDao = sqlSession.getMapper(UserDao.class);
		User user = userDao.getUserById(40);
		System.out.println(user);
		sqlSession.close();
		
	}

	@Test
	public void testGetUserByUserName() {
		SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
		UserDao userDao = sqlSession.getMapper(UserDao.class);
		List<User> list = userDao.getUserByUserName("张");
		for (User user : list) {
			System.out.println(user.toString());
		}
		sqlSession.commit();
		sqlSession.close();
	}

	

}
