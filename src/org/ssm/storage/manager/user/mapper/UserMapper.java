package org.ssm.storage.manager.user.mapper;

import java.util.Date;
import java.util.List;

import org.ssm.storage.manager.user.entity.User;

public interface UserMapper {
	
	public User login(User user);

	public void addUser(User user);
	
	public void deleteUser(String userId);
	
	public void updateUser(User user);
	
	public User getoneUser(int id);
	
	public List<User> getMoreUser();
	
	public List<User> getUserName();
	
	public User getSameUser(String userName, String userType);
	
	public Integer addWorkTime(String userId, String userName, String userType, Date workTime);
}
