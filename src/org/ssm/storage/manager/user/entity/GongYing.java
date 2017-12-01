package org.ssm.storage.manager.user.entity;

public class GongYing {
	
	private Integer id;
	private String gyName;
	private String gyAddress;
	private String gyPhone;
	private String content;
	public GongYing() {
		super();
	}
	public GongYing(Integer id, String gyName, String gyAddress, String gyPhone, String content) {
		super();
		this.id = id;
		this.gyName = gyName;
		this.gyAddress = gyAddress;
		this.gyPhone = gyPhone;
		this.content = content;
	}
	@Override
	public String toString() {
		return "GongYing [id=" + id + ", gyName=" + gyName + ", gyAddress=" + gyAddress + ", gyPhone=" + gyPhone
				+ ", content=" + content + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGyName() {
		return gyName;
	}
	public void setGyName(String gyName) {
		this.gyName = gyName;
	}
	public String getGyAddress() {
		return gyAddress;
	}
	public void setGyAddress(String gyAddress) {
		this.gyAddress = gyAddress;
	}
	public String getGyPhone() {
		return gyPhone;
	}
	public void setGyPhone(String gyPhone) {
		this.gyPhone = gyPhone;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	

}
