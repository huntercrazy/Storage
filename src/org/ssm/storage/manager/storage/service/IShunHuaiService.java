package org.ssm.storage.manager.storage.service;

import java.util.List;
import java.util.Map;

import org.ssm.storage.manager.storage.entity.ShunHuai;

public interface IShunHuaiService {

	public void saveShunHuai(ShunHuai shunhuai);
	
	public void removeShunHuai(int id);
	
	public void modifyShunHuai(ShunHuai shunhuai);
	
	public ShunHuai queryoneShunHuai(int id);
	
	public List<ShunHuai> queryMoreShunHuai();
	
	public List<Map<String, Object>> queryShunHuaiByckName(String ckName);
}
