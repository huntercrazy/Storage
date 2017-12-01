package org.ssm.storage.manager.user.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssm.storage.manager.user.entity.User;
import org.ssm.storage.manager.user.mapper.UserMapper;

@Service
public class UserService implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void saveUser(User user) {

		userMapper.addUser(user);
	}

	@Override
	public void removeUser(String userId) {

		userMapper.deleteUser(userId);
	}

	@Override
	public void modifyUser(User user) {

		userMapper.updateUser(user);
	}

	@Override
	public User queryoneUser(int id) {

		return userMapper.getoneUser(id);
	}

	@Override
	public List<User> queryMoreUser() {

		List<User> userList = userMapper.getMoreUser();
		return userList;
	}

	@Override
	public List<User> queryUserName() {

		List<User> userNameList = userMapper.getUserName();
		return userNameList;
	}

	@Override
	public User login(User user) {
		user = userMapper.login(user);
		return user;
	}

	@Override
	public User querySameUser(String userName, String userType) {
		
		return userMapper.getSameUser(userName, userType);
	}

	@Override
	public Integer saveWorkTime(String userId, String userName, String userType, Date workTime) {

		int count = userMapper.addWorkTime(userId, userName, userType, workTime);
		return count;
	}

}
