package org.ssm.storage.manager.user.service;

import java.util.List;

import org.ssm.storage.manager.user.entity.KeHu;

public interface IKeHuService {

	public void saveKeHu(KeHu kehu);
	
	public void removeKeHu(int id);
	
	public void modifyKeHu(KeHu kehu);
	
	public KeHu queryoneKeHu(int id);
	
	public KeHu queryoneKeHuN(String khName);
	
	public List<KeHu> queryMoreKeHu();
	
	public List<KeHu> queryKeHuName();
}
