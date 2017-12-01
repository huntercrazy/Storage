package org.ssm.storage.manager.user.mapper;

import java.util.List;

import org.ssm.storage.manager.user.entity.KeHu;

public interface KeHuMapper {

	public void addKeHu(KeHu kehu);
	
	public void deleteKeHu(int id);
	
	public void updateKeHu(KeHu kehu);
	
	public KeHu getoneKeHu(int id);
	
	public KeHu getoneKeHuN(String khName);
	
	public List<KeHu> getMoreKeHu();
	
	public List<KeHu> getKeHuName();
}
