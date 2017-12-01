package org.ssm.storage.manager.storage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssm.storage.manager.storage.entity.CangKu;
import org.ssm.storage.manager.storage.mapper.CangKuMapper;

@Service
public class CangKuService implements ICangKuService {

	@Autowired
	private CangKuMapper cangkuMapper;
	
	@Override
	public void saveCangKu(CangKu cangku) {

		cangkuMapper.addCangKu(cangku);
	}

	@Override
	public void modifyCangKu(CangKu cangku) {

		cangkuMapper.updateCangKu(cangku);
	}
	
	@Override
	public CangKu queryoneCangKu(int id) {

		return cangkuMapper.getoneCangKu(id);
	}

	@Override
	public CangKu queryoneCangKuN(String ckName) {

		return cangkuMapper.getoneCangKuN(ckName);
	}

	@Override
	public List<CangKu> queryMoreCangKu() {

		List<CangKu> cangkuList = cangkuMapper.getMoreCangKu();
		return cangkuList;
	}

	@Override
	public List<CangKu> queryCangKuName() {
		
		List<CangKu> ckNameList = cangkuMapper.getCangKuName();
		return ckNameList;
	}

	@Override
	public List<CangKu> queryownerCangku(String userName) {

		List<CangKu> ownercangkuList = cangkuMapper.getownerCangku(userName);
		return ownercangkuList;
	}


}
