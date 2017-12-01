package org.ssm.storage.manager.user.service;

import java.util.List;

import org.ssm.storage.manager.user.entity.GongYing;

public interface IGongYingService {

	public void saveGongYing(GongYing gongying);
	
	public void removeGongYing(int id);
	
	public void modifyGongYing(GongYing gongying);
	
	public GongYing queryoneGongYing(String gyName);
	
	public List<GongYing> queryMoreGongYing();
	
	public List<GongYing> queryGongYingName();
}
