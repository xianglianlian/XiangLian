package com.job.dao;

import java.util.List;

import com.job.entity.WarnWeathers;

public class WarnDao extends BaseDao{
	
	//查询全部
	public List findAllWarn(){
		return getSession().createQuery("from WarnWeathers").list();
	}
	//添加
	public boolean addWarn(WarnWeathers w){
		try {
			getSession().save(w) ;
			return true ;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//根据id查询
	public WarnWeathers findById(int id){
		return (WarnWeathers)getSession().get(WarnWeathers.class, id);
	}
	
	//删除
	public boolean deleteWarn(WarnWeathers w){
		getSession().delete(w);
		return true;
	}
	
}
