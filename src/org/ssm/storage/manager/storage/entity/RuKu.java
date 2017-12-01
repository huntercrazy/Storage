package org.ssm.storage.manager.storage.entity;

import java.util.Date;

public class RuKu {

	private Integer id;
	private String goodsName;
	private String userName;
	private Date inTime;
	private Double inPrice;
	private Integer inNum;
	private String gyName;
	private String ckName;
	private String status;
	private Double otherPrice;
	private String content;
	public RuKu() {
		super();
	}
	public RuKu(Integer id, String goodsName, String userName, Date inTime, Double inPrice, Integer inNum,
			String gyName, String ckName, String status, Double otherPrice, String content) {
		super();
		this.id = id;
		this.goodsName = goodsName;
		this.userName = userName;
		this.inTime = inTime;
		this.inPrice = inPrice;
		this.inNum = inNum;
		this.gyName = gyName;
		this.ckName = ckName;
		this.status = status;
		this.otherPrice = otherPrice;
		this.content = content;
	}
	@Override
	public String toString() {
		return "RuKu [id=" + id + ", goodsName=" + goodsName + ", userName=" + userName + ", inTime=" + inTime
				+ ", inPrice=" + inPrice + ", inNum=" + inNum + ", gyName=" + gyName + ", ckName=" + ckName
				+ ", status=" + status + ", otherPrice=" + otherPrice + ", content=" + content + "]";
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
	public Date getInTime() {
		return inTime;
	}
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	public Double getInPrice() {
		return inPrice;
	}
	public void setInPrice(Double inPrice) {
		this.inPrice = inPrice;
	}
	public Integer getInNum() {
		return inNum;
	}
	public void setInNum(Integer inNum) {
		this.inNum = inNum;
	}
	public String getGyName() {
		return gyName;
	}
	public void setGyName(String gyName) {
		this.gyName = gyName;
	}
	public String getCkName() {
		return ckName;
	}
	public void setCkName(String ckName) {
		this.ckName = ckName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
