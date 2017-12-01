package org.ssm.storage.manager.user.mapper;

import java.util.List;

import org.ssm.storage.manager.user.entity.GongYing;

public interface GongYingMapper {

	public void addGongYing(GongYing gongying);
	
	public void deleteGongYing(int id);
	
	public void updateGongYing(GongYing gongying);
	
	public GongYing getoneGongYing(String gyName);
	
	public List<GongYing> getMoreGongYing();
	
	public List<GongYing> getGongYingName();
}
