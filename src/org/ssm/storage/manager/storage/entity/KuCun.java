package org.ssm.storage.manager.storage.entity;

public class KuCun {

	private Integer id;
	private String goodsName;
	private Integer cunCount;
	private String ckName;
	public KuCun() {
		super();
	}
	public KuCun(Integer id, String goodsName, Integer cunCount, String ckName) {
		super();
		this.id = id;
		this.goodsName = goodsName;
		this.cunCount = cunCount;
		this.ckName = ckName;
	}
	@Override
	public String toString() {
		return "KuCun [id=" + id + ", goodsName=" + goodsName + ", cunCount=" + cunCount + ", ckName=" + ckName + "]";
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
	public Integer getCunCount() {
		return cunCount;
	}
	public void setCunCount(Integer cunCount) {
		this.cunCount = cunCount;
	}
	public String getCkName() {
		return ckName;
	}
	public void setCkName(String ckName) {
		this.ckName = ckName;
	}
	
	
}
