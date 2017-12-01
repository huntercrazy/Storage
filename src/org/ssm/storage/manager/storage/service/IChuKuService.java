package org.ssm.storage.manager.storage.service;

import java.util.List;
import java.util.Map;

import org.ssm.storage.manager.storage.entity.ChuKu;

public interface IChuKuService {

	public void saveChuKu(ChuKu chuku);
	
	public void removeChuKu(int id);
	
	public void modifyChuKu(ChuKu chuku);
	
	public ChuKu queryoneChuKu(int id);
	
	public List<ChuKu> queryMoreChuKu();
	
	public Integer querycounts(String goodsName,String ckName);
	
	public Double queryoutPrice(String goodsName,String ckName);
	
	public List<Map<String,Object>> queryChuKuByckName(String ckName);
}
