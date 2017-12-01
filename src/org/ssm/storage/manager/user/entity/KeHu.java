package org.ssm.storage.manager.user.entity;

public class KeHu {
	
	private Integer id;
	private String khName;
	private String khAddress;
	private String khPhone;
	private String content;
	public KeHu() {
		super();
	}
	public KeHu(Integer id, String khName, String khAddress, String khPhone, String content) {
		super();
		this.id = id;
		this.khName = khName;
		this.khAddress = khAddress;
		this.khPhone = khPhone;
		this.content = content;
	}
	@Override
	public String toString() {
		return "KeHu [id=" + id + ", khName=" + khName + ", khAddress=" + khAddress + ", khPhone=" + khPhone
				+ ", content=" + content + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getKhName() {
		return khName;
	}
	public void setKhName(String khName) {
		this.khName = khName;
	}
	public String getKhAddress() {
		return khAddress;
	}
	public void setKhAddress(String khAddress) {
		this.khAddress = khAddress;
	}
	public String getKhPhone() {
		return khPhone;
	}
	public void setKhPhone(String khPhone) {
		this.khPhone = khPhone;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
}
