package com.tarena.office.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.tarena.office.Constants;
/*
 * 创建Map集合用来将用户登录信息以map集合的形式存放到session中
 * @author  xuan
 */
public class BaseAction implements SessionAware,Constants{
	protected Map<String, Object> session;

	public void setSession(Map<String, Object> session) {
		this.session = session;

	}

}
