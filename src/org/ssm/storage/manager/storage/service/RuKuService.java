package org.ssm.storage.manager.storage.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssm.storage.manager.storage.entity.RuKu;
import org.ssm.storage.manager.storage.mapper.RuKuMapper;

@Service
public class RuKuService implements IRuKuService {

	@Autowired
	private RuKuMapper rukuMapper;
	
	@Override
	public void saveRuKu(RuKu ruku) {

		rukuMapper.addRuKu(ruku);
	}

	@Override
	public void removeRuKu(int id) {

		rukuMapper.deleteRuKu(id);
	}

	@Override
	public void modifyRuKu(RuKu ruku) {

		rukuMapper.updateRuKu(ruku);
	}

	@Override
	public RuKu queryoneRuKu(int id) {

		return rukuMapper.getoneRuKu(id);
	}

	@Override
	public List<RuKu> queryMoreRuku() {

		List<RuKu> rukuList = rukuMapper.getMoreRuKu();
		return rukuList;
	}

	@Override
	public Integer querycounts(String goodsName, String ckName) {

		int count = rukuMapper.getcounts(goodsName, ckName);
		return count;
	}

	@Override
	public Double queryinPrice(String goodsName, String ckName) {

		Double inprice = rukuMapper.getinPrice(goodsName, ckName);
		return inprice;
	}

	@Override
	public List<Map<String, Object>> queryRuKuByckName(String ckName) {
		List<Map<String, Object>> ByckNameList = rukuMapper.getRuKuByckName(ckName);
		return ByckNameList;
	}

}
