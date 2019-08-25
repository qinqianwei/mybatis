package test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import pojo.User;
import utils.SqlSessionFactoryUtils;

public class MybatisTest {
	@Test
	public void testGetUserById() throws Exception {
		SqlSessionFactoryBuilder b = new SqlSessionFactoryBuilder();
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		SqlSessionFactory f = b.build(inputStream);
		SqlSession s = f.openSession();
		//User user = s.selectOne("user.getuserById", 1);
		User user = s.selectOne("getUserById", 1);
		System.out.println(user.toString());
		s.close();
		
		
	}
	@Test
	public void testGetUserByUserName() {
		SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<User> list = sqlSession.selectList("user.getUserByUserName", "��");
		
		for (User user : list) {
			System.out.println(user);
			
		}
		sqlSession.close();
		
		
	}
	@Test
	public void testInsertUser() {
		SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user  =  new User();
		sqlSession.insert("user.insertUser", user);
		//sqlSession.commit();
		sqlSession.close();
		
	}
	
	@Test
	public void testUpdateUser() {
		SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		User user  =  new User();
		user.setId(31);
		user.setUsername("wangwu");
		sqlSession.update("user.updateUser", user);
		
		sqlSession.commit();
		sqlSession.close();
		
	}
	@Test
	public void testDeleteUser() {
		SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		sqlSession.delete("user.deleteUser", 31);
		sqlSession.commit();
		sqlSession.close();
		
	}
}
