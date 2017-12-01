package org.ssm.storage.manager.goods.mapper;

import java.util.List;

import org.ssm.storage.manager.goods.entity.Goods;

public interface GoodsMapper {

	public void addGoods(Goods goods);
	
	public void deleteGoods(int id);
	
	public void updateGoods(Goods goods);
	
	public Goods getoneGoods(int id);
	
	public Goods getoneGoodsN(String goodsName);
	
	public List<Goods> getMoreGoods();
	
	public List<Goods> getgoodsName();
	
}
