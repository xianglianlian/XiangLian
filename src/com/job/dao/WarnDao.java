package com.job.dao;

import java.util.List;

import com.job.entity.WarnWeathers;

public class WarnDao extends BaseDao{
	
	//��ѯȫ��
	public List findAllWarn(){
		return getSession().createQuery("from WarnWeathers").list();
	}
	//���
	public boolean addWarn(WarnWeathers w){
		try {
			getSession().save(w) ;
			return true ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//����id��ѯ
	public WarnWeathers findById(int id){
		return (WarnWeathers)getSession().get(WarnWeathers.class, id);
	}
	
	//ɾ��
	public boolean deleteWarn(WarnWeathers w){
		getSession().delete(w);
		return true;
	}
	
}
