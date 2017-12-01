package org.ssm.storage.manager.storage.mapper;

import java.util.List;
import java.util.Map;

import org.ssm.storage.manager.storage.entity.ChuKu;

public interface ChuKuMapper {
	
	public void addChuku(ChuKu chuku);
	
	public void deleteChuKu(int id);
	
	public void updateChuKu(ChuKu chuku);
	
	public ChuKu getoneChuKu(int id);
	
	public List<ChuKu> getMoreChuKu();
	
	public Integer getcounts(String goodsName,String ckName);
	
	public Double getoutPrice(String goodsName,String ckName);
	
	public List<Map<String, Object>> getChuKuByckName(String ckName);

}
