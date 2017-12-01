package org.ssm.storage.manager.storage.entity;

import java.util.Date;

public class DiaoBo {

	private Integer id;
	private String goodsName;
	private String userName;
	private Date dbTime;
	private Integer dbNum;
	private String oldCkName;
	private String newCkName;
	private Double otherPrice;
	private String content;
	public DiaoBo() {
		super();
	}
	public DiaoBo(Integer id, String goodsName, String userName, Date dbTime, Integer dbNum, String oldCkName, String newCkName,
			Double otherPrice, String content) {
		super();
		this.id = id;
		this.goodsName = goodsName;
		this.userName = userName;
		this.dbTime = dbTime;
		this.dbNum = dbNum;
		this.oldCkName = oldCkName;
		this.newCkName = newCkName;
		this.otherPrice = otherPrice;
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "DiaoBo [id=" + id + ", goodsName=" + goodsName + ", userName=" + userName + ", dbTime=" + dbTime
				+ ", dbNum=" + dbNum + ", oldCkName=" + oldCkName + ", newCkName=" + newCkName + ", otherPrice="
				+ otherPrice + ", content=" + content + "]";
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
	public Date getDbTime() {
		return dbTime;
	}
	public void setDbTime(Date dbTime) {
		this.dbTime = dbTime;
	}
	
	public Integer getDbNum() {
		return dbNum;
	}
	public void setDbNum(Integer dbNum) {
		this.dbNum = dbNum;
	}
	public String getOldCkName() {
		return oldCkName;
	}
	public void setOldCkName(String oldCkName) {
		this.oldCkName = oldCkName;
	}
	public String getNewCkName() {
		return newCkName;
	}
	public void setNewCkName(String newCkName) {
		this.newCkName = newCkName;
	}
	public Double getOtherPrice() {
		return otherPrice;
	}
	public void setOtherPrice(Double otherPrice) {
		this.otherPrice = otherPrice;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
