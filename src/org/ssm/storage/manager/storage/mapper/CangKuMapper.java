package org.ssm.storage.manager.storage.mapper;

import java.util.List;

import org.ssm.storage.manager.storage.entity.CangKu;

public interface CangKuMapper {

	public void addCangKu(CangKu cangku);
	
	public void updateCangKu(CangKu cangku);
	
	public CangKu getoneCangKu(int id);
	
	public CangKu getoneCangKuN(String ckName);
	
	public List<CangKu> getMoreCangKu();
	
	public List<CangKu> getCangKuName();
	
	public List<CangKu> getownerCangku(String userName);
	
}
