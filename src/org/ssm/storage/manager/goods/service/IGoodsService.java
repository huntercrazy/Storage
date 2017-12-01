package org.ssm.storage.manager.goods.service;

import java.util.List;

import org.ssm.storage.manager.goods.entity.Goods;

public interface IGoodsService {

	public void saveGoods(Goods goods);
	
	public void removeGoods(int id);
	
	public void modifyGoods(Goods goods);
	
	public Goods queryoneGoods(int id);
	
	public Goods queryoneGoodsN(String goodsName);
	
	public List<Goods> queryMoreGoods();
	
	public List<Goods> querygoodsName();
}
