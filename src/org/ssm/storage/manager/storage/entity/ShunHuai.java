package org.ssm.storage.manager.storage.entity;

public class ShunHuai {

	private Integer id;
	private String goodsName;
	private String userName;
	private Integer breakNum;
	private String ckName;
	private String content;
	public ShunHuai() {
		super();
	}
	public ShunHuai(Integer id, String goodsName, String userName, Integer breakNum, String ckName, String content) {
		super();
		this.id = id;
		this.goodsName = goodsName;
		this.userName = userName;
		this.breakNum = breakNum;
		this.ckName = ckName;
		this.content = content;
	}
	@Override
	public String toString() {
		return "ShunHuai [id=" + id + ", goodsName=" + goodsName + ", userName=" + userName + ", breakNum=" + breakNum
				+ ", ckName=" + ckName + ", content=" + content + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getBreakNum() {
		return breakNum;
	}
	public void setBreakNum(Integer breakNum) {
		this.breakNum = breakNum;
	}
	public String getCkName() {
		return ckName;
	}
	public void setCkName(String ckName) {
		this.ckName = ckName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
