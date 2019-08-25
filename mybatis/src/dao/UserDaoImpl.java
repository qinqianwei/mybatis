package dao;

import java.util.ArrayList;
import java.util.List;

import pojo.User;

public class UserDaoImpl implements UserDao {

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		User user = new User();
		if(user.getId() == id) {
			return user;
		}
		return null;
	}

	@Override
	public List<User> getUserByUserName(String username) {
		// TODO Auto-generated method stub
	
			
		return null;
	}

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub

	}

}
