package dao;

import java.util.List;

import pojo.User;

public interface UserDao {
	/*
	 * 根据id查询出用户信息
	 *
	 */
	User getUserById(Integer id);
	/*
	 * 根据用户姓名查询用户信息
	 * 
	 */
	List<User> getUserByUserName(String username);
	/*
	 * 
	 * 插入用户信息
	 */
	void insertUser(User user);
	

}
