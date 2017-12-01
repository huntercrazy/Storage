package org.ssm.storage.manager.goods.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssm.storage.manager.goods.entity.Goods;
import org.ssm.storage.manager.goods.mapper.GoodsMapper;

@Service
public class GoodsService implements IGoodsService {
	
	@Autowired
	private GoodsMapper goodsMapper;
	
	@Override
	public void saveGoods(Goods goods) {

		goodsMapper.addGoods(goods);
		
	}

	@Override
	public void removeGoods(int id) {

		goodsMapper.deleteGoods(id);
	}

	@Override
	public void modifyGoods(Goods goods) {

		goodsMapper.updateGoods(goods);
	}

	@Override
	public Goods queryoneGoods(int id) {
		
		return goodsMapper.getoneGoods(id);
	}

	@Override
	public Goods queryoneGoodsN(String goodsName) {

		return goodsMapper.getoneGoodsN(goodsName);
	}

	@Override
	public List<Goods> queryMoreGoods() {

		List<Goods> goodsList = goodsMapper.getMoreGoods();
		return goodsList;
	}

	@Override
	public List<Goods> querygoodsName() {

		List<Goods> goodsNameList = goodsMapper.getgoodsName();
		return goodsNameList;
	}

}
