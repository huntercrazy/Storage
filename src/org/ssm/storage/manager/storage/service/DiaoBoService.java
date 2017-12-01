package org.ssm.storage.manager.storage.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssm.storage.manager.storage.entity.DiaoBo;
import org.ssm.storage.manager.storage.mapper.DiaoBoMapper;

@Service
public class DiaoBoService implements IDiaoBoService {

	@Autowired
	private DiaoBoMapper diaoboMapper;
	
	@Override
	public void saveDiaoBo(DiaoBo diaobo) {

		diaoboMapper.addDiaoBo(diaobo);
	}

	@Override
	public void removeDiaoBo(int id) {

		diaoboMapper.deleteDiaoBo(id);
	}

	@Override
	public void modifyDiaoBo(DiaoBo diaobo) {

		diaoboMapper.updateDiaoBo(diaobo);
	}

	@Override
	public DiaoBo queryoneDiaoBo(int id) {

//		DiaoBo diaobo = diaoboMapper.getoneDiaoBo(id);
//		return diaobo;
		return diaoboMapper.getoneDiaoBo(id);
	}

	@Override
	public List<DiaoBo> queryMoreDiaoBo() {

		List<DiaoBo> diaoboList = diaoboMapper.getMoreDiaoBo();
		return diaoboList;
	}

	@Override
	public List<Map<String, Object>> queryDiaoBoByckName(String oldCkName, String newCkName) {
		List<Map<String, Object>> ByckNameList = diaoboMapper.getDiaoBoByckName(oldCkName, newCkName);
		return ByckNameList;
	}

}
