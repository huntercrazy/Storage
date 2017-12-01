package org.ssm.storage.manager.storage.mapper;

import java.util.List;

import org.ssm.storage.manager.storage.entity.KuCun;

public interface KuCunMapper {

	public List<KuCun> getAllKuCunByName(String goodsName);
	
	public List<KuCun> getAllKuCun();
	
	public int getOneCount(String goodsName, String ckName);
	
	public KuCun getckName(String goodsName, String ckName);
	
	public void updateCount(KuCun kucun);
	
	public void addKuCun(KuCun kucun);
	
	public List<KuCun> kcckList(String ckName);
	
}
