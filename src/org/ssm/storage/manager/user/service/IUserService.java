package org.ssm.storage.manager.user.service;

import java.util.Date;
import java.util.List;

import org.ssm.storage.manager.user.entity.User;

public interface IUserService {
	
	public User login(User user);

	public void saveUser(User user);
	
	public void removeUser(String userId);
	
	public void modifyUser(User user);
	
	public User queryoneUser(int id);
	
	public List<User> queryMoreUser();
	
	public List<User> queryUserName();
	
	public User querySameUser(String userName,String userType);
	
	public Integer saveWorkTime(String userId, String userName, String userType, Date workTime);
}
