package org.ssm.storage.manager.goods.entity;

public class Goods{
	
	private Integer id;
	private String goodsName;
	private String goodsType;
	private String goodsKind;
	private String content;
	public Goods() {
		super();
	}
	public Goods(Integer id, String goodsName, String goodsType, String goodsKind, String content) {
		super();
		this.id = id;
		this.goodsName = goodsName;
		this.goodsType = goodsType;
		this.goodsKind = goodsKind;
		this.content = content;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", goodsName=" + goodsName + ", goodsType=" + goodsType + ", goodsKind=" + goodsKind
				+ ", content=" + content + "]";
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
	public String getGoodsType() {
		return goodsType;
	}
	public void setGoodsType(String goodsType) {
		this.goodsType = goodsType;
	}
	public String getGoodsKind() {
		return goodsKind;
	}
	public void setGoodsKind(String goodsKind) {
		this.goodsKind = goodsKind;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
