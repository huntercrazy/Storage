package org.ssm.storage.manager.storage.service;

import java.util.List;
import java.util.Map;

import org.ssm.storage.manager.storage.entity.DiaoBo;

public interface IDiaoBoService {

	public void saveDiaoBo(DiaoBo diaobo);
	
	public void removeDiaoBo(int id);
	
	public void modifyDiaoBo(DiaoBo diaobo);
	
	public DiaoBo queryoneDiaoBo(int id);
	
	public List<DiaoBo> queryMoreDiaoBo();
	
	public List<Map<String, Object>> queryDiaoBoByckName(String oldCkName,String newCkName);
}
