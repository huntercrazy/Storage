package org.ssm.storage.manager.storage.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.ssm.storage.manager.storage.entity.CangKu;

public interface ICangKuService {

	public void saveCangKu(CangKu cangku);
	
	public CangKu queryoneCangKu(int id);
	
	public CangKu queryoneCangKuN(String ckName);
	
	public List<CangKu> queryMoreCangKu();
	
	public void modifyCangKu(CangKu cangku);
	
	public List<CangKu> queryCangKuName();
	
	public List<CangKu> queryownerCangku(@Param("userName")String userName);
}
