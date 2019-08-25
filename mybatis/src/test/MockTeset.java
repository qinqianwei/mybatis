package test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import dao.UserDao;
import pojo.User;
public class MockTeset {
	//@Mock
	//UserDao userDao;
	
	@Test
	public void getUserByIdMockTest() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		User user = new User(10,"张三",sdf.parse("2014-07-10"),"1","北京市");
		
		//创建mock对象
		UserDao userDao = mock(UserDao.class);
		//通过id号返回User对象
		when(userDao.getUserById(10)).thenReturn(user);
		System.out.println(userDao.getUserById(10));
		assertEquals(userDao.getUserById(10),user);
	}
	@Test
    
	public void idTest() {
		UserDao userDao = mock(UserDao.class);
		doAnswer(new Answer<Void>() {

			@Override
			public Void answer(InvocationOnMock invocation) throws Throwable {
				int userId = (int) invocation.getArguments()[0];
				System.out.println("id:"+userId);
				assertEquals(111,userId);
			
				return null;
			}
			
		}).when(userDao).getUserById(anyInt());
		
		userDao.getUserById(111);
	}

	
	

}
