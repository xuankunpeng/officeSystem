package com.tarena.office.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.tarena.office.Constants;
/*
 * ����Map�����������û���¼��Ϣ��map���ϵ���ʽ��ŵ�session��
 * @author  xuan
 */
public class BaseAction implements SessionAware,Constants{
	protected Map<String, Object> session;

	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

}
