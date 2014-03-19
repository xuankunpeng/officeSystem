package com.tarena.office.dao;
/*
 * 自定义异常，访问数据库时抛出此异常
 */
public class DAOException extends Exception {

	public DAOException(String message, Throwable cause) {
		super(message, cause);
	}

}
