package org.ssm.storage.manager.storage.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssm.storage.manager.storage.entity.ShunHuai;
import org.ssm.storage.manager.storage.mapper.ShunHuaiMapper;

@Service
public class ShunHuaiService implements IShunHuaiService {

	@Autowired
	private ShunHuaiMapper shunhuaiMapper;
	
	@Override
	public void saveShunHuai(ShunHuai shunhuai) {

		shunhuaiMapper.addShunHuai(shunhuai);
	}

	@Override
	public void removeShunHuai(int id) {

		shunhuaiMapper.deleteShunHuai(id);
	}

	@Override
	public void modifyShunHuai(ShunHuai shunhuai) {

		shunhuaiMapper.updateShunHuai(shunhuai);
	}

	@Override
	public ShunHuai queryoneShunHuai(int id) {

		return shunhuaiMapper.getoneShunHuai(id);
	}

	@Override
	public List<ShunHuai> queryMoreShunHuai() {

		List<ShunHuai> shunhuaiList = shunhuaiMapper.getMoreShunHuai();
		return shunhuaiList;
	}

	@Override
	public List<Map<String, Object>> queryShunHuaiByckName(String ckName) {

		List<Map<String, Object>> ByckNameList = shunhuaiMapper.getShunHuaiByckName(ckName);
		return ByckNameList;
	}

}
