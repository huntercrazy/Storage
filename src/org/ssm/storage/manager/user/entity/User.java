package org.ssm.storage.manager.user.entity;

public class User {

	private Integer id;
	private String userId;
	private String password;
	private String userName;
	private String userType;
	public User() {
		super();
	}
	
	public User(Integer id, String userId, String password, String userName, String userType) {
		super();
		this.id = id;
		this.userId = userId;
		this.password = password;
		this.userName = userName;
		this.userType = userType;
	}

	
	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", password=" + password + ", userName=" + userName
				+ ", userType=" + userType + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	
	
}
