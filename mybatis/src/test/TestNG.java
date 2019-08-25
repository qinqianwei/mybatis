package test;

import org.testng.annotations.Test;

import dao.UserDao;
import pojo.User;
import utils.SqlSessionFactoryUtils;

import org.testng.annotations.BeforeClass;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.AfterClass;

public class TestNG {
  @Test
  public void f() {
	  //System.out.println("hello testing");
	  SqlSession sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
	  UserDao userDao = sqlSession.getMapper(UserDao.class);
	  User user = userDao.getUserById(10);
	  System.out.println(user);
	  sqlSession.close();
	  
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
