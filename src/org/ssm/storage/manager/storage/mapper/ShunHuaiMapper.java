package org.ssm.storage.manager.storage.mapper;

import java.util.List;
import java.util.Map;

import org.ssm.storage.manager.storage.entity.ShunHuai;

public interface ShunHuaiMapper {

	public void addShunHuai(ShunHuai shunhuai);
	
	public void deleteShunHuai(int id);
	
	public void updateShunHuai(ShunHuai shunhuai);
	
	public ShunHuai getoneShunHuai(int id);
	
	public List<ShunHuai> getMoreShunHuai();
	
	public List<Map<String, Object>> getShunHuaiByckName(String ckName);
}
