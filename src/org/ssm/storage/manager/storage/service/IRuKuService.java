package org.ssm.storage.manager.storage.service;

import java.util.List;
import java.util.Map;

import org.ssm.storage.manager.storage.entity.RuKu;

public interface IRuKuService {

	public void saveRuKu(RuKu ruku);
	
	public void removeRuKu(int id);
	
	public void modifyRuKu(RuKu ruku);
	
	public RuKu queryoneRuKu(int id);
	
	public List<RuKu> queryMoreRuku();
	
	public Integer querycounts(String goodsName,String ckName);
	
	public Double queryinPrice(String goodsName,String ckName);
	
	public List<Map<String, Object>> queryRuKuByckName(String ckName);
}
