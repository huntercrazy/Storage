package org.ssm.storage.manager.storage.mapper;

import java.util.List;
import java.util.Map;

import org.ssm.storage.manager.storage.entity.RuKu;

public interface RuKuMapper {

	public void addRuKu(RuKu ruku);
	
	public void deleteRuKu(int id);
	
	public void updateRuKu(RuKu ruku);
	
	public RuKu getoneRuKu(int id);
	
	public List<RuKu> getMoreRuKu();
	
	public Integer getcounts(String goodsName,String ckName);
	
	public Double getinPrice(String goodsName,String ckName);
	
	public List<Map<String, Object>> getRuKuByckName(String ckName);
}
