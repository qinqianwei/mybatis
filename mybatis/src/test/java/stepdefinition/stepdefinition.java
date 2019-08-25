package test.java.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import dao.UserDao;
import pojo.User;
import utils.SqlSessionFactoryUtils;
import cucumber.api.java.en.Then;
import org.apache.ibatis.session.SqlSession;
import cucumber.api.java.en.And;

public class stepdefinition {
	SqlSession sqlSession;
	UserDao userDao;
	User user;
  @Given("^init UserDaoMapper$")
  public void given() throws Throwable {
	  sqlSession = SqlSessionFactoryUtils.getSqlSessionFactory().openSession();
	  userDao= sqlSession.getMapper(UserDao.class);
  }

  @When("^apply ID$")
  public void when() throws Throwable {
	   user = userDao.getUserById(10);
	  
  }
  @Then("^print User$")
  public void then() throws Throwable {
	  System.out.println(user);
  }
  @And("^close session$")
  public void and() throws Throwable{
	  sqlSession.close();
  }

  

}
