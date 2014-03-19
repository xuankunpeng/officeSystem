package com.tarena.office.dao;

import java.util.List;

import com.tarena.office.entity.Product;
import com.tarena.office.entity.Record;
/*
 * �ӿ��ж����˲���Product���һϵ�з���
 */
public interface ProductDAO {
	public List<Product> findAll() throws DAOException;

	public void delete(Integer id) throws DAOException;
	public Product findById(Integer id) throws DAOException;
	public void update(Product product) throws DAOException;
	
	public void save(Product product) throws DAOException;
	public void save(Record record) throws DAOException;
}
