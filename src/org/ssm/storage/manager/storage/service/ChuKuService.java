package org.ssm.storage.manager.storage.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssm.storage.manager.storage.entity.ChuKu;
import org.ssm.storage.manager.storage.mapper.ChuKuMapper;

@Service
public class ChuKuService implements IChuKuService {

	@Autowired
	private ChuKuMapper chukuMapper;
	
	@Override
	public void saveChuKu(ChuKu chuku) {

		chukuMapper.addChuku(chuku);
	}

	@Override
	public void removeChuKu(int id) {

		chukuMapper.deleteChuKu(id);
	}

	@Override
	public void modifyChuKu(ChuKu chuku) {

		chukuMapper.updateChuKu(chuku);
	}

	@Override
	public ChuKu queryoneChuKu(int id) {

		return chukuMapper.getoneChuKu(id);
	}

	@Override
	public List<ChuKu> queryMoreChuKu() {

		List<ChuKu> chukuList = chukuMapper.getMoreChuKu();
		return chukuList;
	}

	@Override
	public Integer querycounts(String goodsName, String ckName) {

		int count = chukuMapper.getcounts(goodsName, ckName);
		return count;
	}

	@Override
	public Double queryoutPrice(String goodsName, String ckName) {

		Double outprice = chukuMapper.getoutPrice(goodsName, ckName);
		return outprice;
	}

	@Override
	public List<Map<String, Object>> queryChuKuByckName(String ckName) {
		List<Map<String,Object>> ByckNameList = chukuMapper.getChuKuByckName(ckName);
		return ByckNameList;
	}


}
