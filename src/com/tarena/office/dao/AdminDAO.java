package com.tarena.office.dao;

import com.tarena.office.entity.Admin;
/*
 * �ӿ��ж����˲���ADMIN���һϵ�з���
 */
public interface AdminDAO {
	public Admin findByCodeAndPwd(String code, String pwd) throws DAOException;
}
