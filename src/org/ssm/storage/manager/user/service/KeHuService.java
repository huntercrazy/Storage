package org.ssm.storage.manager.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.ssm.storage.manager.user.entity.KeHu;
import org.ssm.storage.manager.user.mapper.KeHuMapper;

@Service
public class KeHuService implements IKeHuService {

	@Autowired
	private KeHuMapper kehuMapper;
	
	@Override
	public void saveKeHu(KeHu kehu) {

		kehuMapper.addKeHu(kehu);
	}

	@Override
	public void removeKeHu(int id) {

		kehuMapper.deleteKeHu(id);
	}

	@Override
	public void modifyKeHu(KeHu kehu) {

		kehuMapper.updateKeHu(kehu);
	}

	@Override
	public KeHu queryoneKeHu(int id) {

		return kehuMapper.getoneKeHu(id);
	}

	@Override
	public KeHu queryoneKeHuN(String khName) {

		return kehuMapper.getoneKeHuN(khName);
	}
	
	@Override
	public List<KeHu> queryMoreKeHu() {

		List<KeHu> kehuList = kehuMapper.getMoreKeHu();
		return kehuList;
	}

	@Override
	public List<KeHu> queryKeHuName() {

		List<KeHu> khNameList = kehuMapper.getKeHuName();
		return khNameList;
	}

}
