package org.ssm.storage.manager.storage.service;

import java.util.List;

import org.ssm.storage.manager.storage.entity.KuCun;

public interface IKuCunService {

	public List<KuCun> queryAllKuCunByName(String goodsName);
	
	public List<KuCun> queryAllKuCun();
	
	public int queryOneCount(String goodsName, String ckName);
	
	public KuCun queryckName(String goodsName, String ckName);
	
	public void modifyCount(KuCun kucun);
	
	public void saveKuCun(KuCun kucun);
	
	public List<KuCun> kcckList(String ckName);
}
