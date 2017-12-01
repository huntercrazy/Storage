package org.ssm.storage.manager.storage.mapper;

import java.util.List;
import java.util.Map;

import org.ssm.storage.manager.storage.entity.DiaoBo;

public interface DiaoBoMapper {

	public void addDiaoBo(DiaoBo diaobo);
	
	public void deleteDiaoBo(int id);
	
	public void updateDiaoBo(DiaoBo diaobo);
	
	public DiaoBo getoneDiaoBo(int id);
	
	public List<DiaoBo> getMoreDiaoBo();
	
	public List<Map<String, Object>> getDiaoBoByckName(String oldCkName,String newCkName);
}
