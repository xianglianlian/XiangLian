package com.job.service;

import java.util.List;

import com.job.dao.WarnDao;
import com.job.entity.WarnWeathers;

public class WarnService {

	private WarnDao warnDao ;
	
	//��ѯȫ��
	public List<WarnWeathers> findAllWarn(){
		return warnDao.findAllWarn();
	}
	
	//���
	public boolean addWarn(WarnWeathers w){
		return warnDao.addWarn(w);
	}
	
	//����ɾ��
	public boolean deleteWarn(int[] ids){
		if(ids!=null&&ids.length>0){
			for (int i = 0; i < ids.length; i++) {
				warnDao.deleteWarn(warnDao.findById(ids[i]));
			}
			return true;
		}
		return false;
	}
	
	
	public void setWarnDao(WarnDao warnDao) {
		this.warnDao = warnDao;
	}
}
