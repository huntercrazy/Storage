package org.ssm.storage.manager.storage.entity;

import java.util.Date;

public class ChuKu {

	private Integer id;
	private String goodsName;
	private String userName;
	private Date outTime;
	private Double outPrice;
	private Integer outNum;
	private String khName;
	private String ckName;
	private String status;
	private Double otherPrice;
	private String content;
	public ChuKu() {
		super();
	}
	public ChuKu(Integer id, String goodsName, String userName, Date outTime, Double outPrice, Integer outNum,
			String khName, String ckName, String status, Double otherPrice, String content) {
		super();
		this.id = id;
		this.goodsName = goodsName;
		this.userName = userName;
		this.outTime = outTime;
		this.outPrice = outPrice;
		this.outNum = outNum;
		this.khName = khName;
		this.ckName = ckName;
		this.status = status;
		this.otherPrice = otherPrice;
		this.content = content;
	}
	@Override
	public String toString() {
		return "ChuKu [id=" + id + ", goodsName=" + goodsName + ", userName=" + userName + ", outTime=" + outTime
				+ ", outPrice=" + outPrice + ", outNum=" + outNum + ", khName=" + khName + ", ckName=" + ckName
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
	public Date getOutTime() {
		return outTime;
	}
	public void setOutTime(Date outTime) {
		this.outTime = outTime;
	}
	public Double getOutPrice() {
		return outPrice;
	}
	public void setOutPrice(Double outPrice) {
		this.outPrice = outPrice;
	}
	public Integer getOutNum() {
		return outNum;
	}
	public void setOutNum(Integer outNum) {
		this.outNum = outNum;
	}
	public String getKhName() {
		return khName;
	}
	public void setKhName(String khName) {
		this.khName = khName;
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
