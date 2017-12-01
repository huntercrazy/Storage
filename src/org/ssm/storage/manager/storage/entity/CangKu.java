package org.ssm.storage.manager.storage.entity;

public class CangKu {

	private Integer id;
	private String ckName;
	private String userName;
	private String ckAddress;
	private String content;
	public CangKu() {
		super();
	}
	public CangKu(Integer id, String ckName, String userName, String ckAddress, String content) {
		super();
		this.id = id;
		this.ckName = ckName;
		this.userName = userName;
		this.ckAddress = ckAddress;
		this.content = content;
	}
	@Override
	public String toString() {
		return "CangKu [id=" + id + ", ckName=" + ckName + ", userName=" + userName + ", ckAddress=" + ckAddress
				+ ", content=" + content + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCkName() {
		return ckName;
	}
	public void setCkName(String ckName) {
		this.ckName = ckName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCkAddress() {
		return ckAddress;
	}
	public void setCkAddress(String ckAddress) {
		this.ckAddress = ckAddress;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
