package org.ssm.storage.manager.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssm.storage.manager.user.entity.GongYing;
import org.ssm.storage.manager.user.mapper.GongYingMapper;

@Service
public class GongYingService implements IGongYingService {

	@Autowired
	private GongYingMapper gongyingMapper;
	
	@Override
	public void saveGongYing(GongYing gongying) {

		gongyingMapper.addGongYing(gongying);
	}

	@Override
	public void removeGongYing(int id) {

		gongyingMapper.deleteGongYing(id);
	}

	@Override
	public void modifyGongYing(GongYing gongying) {

		gongyingMapper.updateGongYing(gongying);
	}

	@Override
	public GongYing queryoneGongYing(String gyName) {

		return gongyingMapper.getoneGongYing(gyName);
	}

	@Override
	public List<GongYing> queryMoreGongYing() {

		List<GongYing> gongyingList = gongyingMapper.getMoreGongYing();
		return gongyingList;
	}

	@Override
	public List<GongYing> queryGongYingName() {

		List<GongYing> gyNameList = gongyingMapper.getGongYingName();
		return gyNameList;
	}

}
