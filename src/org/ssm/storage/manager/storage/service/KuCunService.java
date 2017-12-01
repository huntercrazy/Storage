package org.ssm.storage.manager.storage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssm.storage.manager.storage.entity.KuCun;
import org.ssm.storage.manager.storage.mapper.KuCunMapper;

@Service
public class KuCunService implements IKuCunService {

	@Autowired
	private KuCunMapper kucunMapper;
	
	@Override
	public List<KuCun> queryAllKuCunByName(String goodsName) {

		List<KuCun> kucunByNameList = kucunMapper.getAllKuCunByName(goodsName); 
		return kucunByNameList;
	}

	@Override
	public List<KuCun> queryAllKuCun() {

		List<KuCun> kucunList = kucunMapper.getAllKuCun();
		return kucunList;
	}

	@Override
	public int queryOneCount(String goodsName, String ckName) {
		int onecount = kucunMapper.getOneCount(goodsName, ckName);
		return onecount;
	}

	@Override
	public KuCun queryckName(String goodsName, String ckName) {

		KuCun kucun = kucunMapper.getckName(goodsName, ckName);
		return kucun;
	}

	@Override
	public void saveKuCun(KuCun kucun) {

		kucunMapper.addKuCun(kucun);
	}

	@Override
	public void modifyCount(KuCun kucun) {

		kucunMapper.updateCount(kucun);
	}
	
	@Override
	public List<KuCun> kcckList(String ckName){
		List<KuCun> ckkcList = kucunMapper.kcckList(ckName);
		return ckkcList;
		
	}

}
