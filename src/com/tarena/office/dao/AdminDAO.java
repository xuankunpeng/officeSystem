package com.tarena.office.dao;

import com.tarena.office.entity.Admin;
/*
 * 接口中定义了操作ADMIN表的一系列方法
 */
public interface AdminDAO {
	public Admin findByCodeAndPwd(String code, String pwd) throws DAOException;
}
