package com.job.web;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.job.dao.WarnDao;
import com.job.entity.WarnWeathers;
import com.job.service.WarnService;

public class WarnAction {
	
	private WarnService warnService ;
	
	private List<WarnWeathers> warnList;
	
	private WarnWeathers warn ;
	
	//����һ�����ԣ���װ���ID
	private int[] selId;
	
	//��ѯȫ��
	public String findAllWarn(){
		System.out.println("ahaha");
		warnList = warnService.findAllWarn();
		return "warnlist";
	}
	
	//���
	public String addWarn() throws Exception{
		HttpServletResponse response = ServletActionContext.getResponse() ;
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter() ;
		if(warnService.addWarn(warn)){
			out.print("<script>alert('��ӳɹ���') ;location.href='index.jsp';</script>");
		}else{
			out.print("<script>alert('���ʧ�ܣ�') ;history.back ;</script>");
		}
		out.close();
		return null ;
	}
	
	//����ɾ��
	public String deleteWarn() throws Exception{
		HttpServletResponse response = ServletActionContext.getResponse() ;
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter() ;
		if(warnService.deleteWarn(selId)){
			out.print("<script>alert('�����Ѿ����ɾ����') ;location.href='index.jsp';</script>");
		}else{
			out.print("<script>alert('����ɾ��ʧ�ܣ�') ;history.back ;</script>");
		}
		out.close();
		return null ;
	}
	
	
	public void setWarnService(WarnService warnService) {
		this.warnService = warnService;
	}

	public List<WarnWeathers> getWarnList() {
		return warnList;
	}

	public void setWarnList(List<WarnWeathers> warnList) {
		this.warnList = warnList;
	}

	public WarnWeathers getWarn() {
		return warn;
	}

	public void setWarn(WarnWeathers warn) {
		this.warn = warn;
	}

	public int[] getSelId() {
		return selId;
	}

	public void setSelId(int[] selId) {
		this.selId = selId;
	}
	
}
