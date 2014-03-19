package com.tarena.office.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.tarena.office.dao.DAOException;
import com.tarena.office.dao.ProductDAO;
import com.tarena.office.entity.Product;
import com.tarena.office.entity.Record;
@Repository
@Scope("prototype")
//此类实现了ProductDAO和对数据库访问的一系列方法
public class HibernateProductDAO extends HibernateDaoSupport implements ProductDAO{

	@Resource
	public void setMySessionFactory(SessionFactory sf){
		super.setSessionFactory(sf);
	}
	//用品列表显示方法
	public List<Product> findAll() throws DAOException {
		String hql="from Product";
		List list=getHibernateTemplate().find(hql);
		return list;
	}
	//用品删除方法
	public void delete(Integer id) throws DAOException {
		
			Product product=findById(id);
			getHibernateTemplate().delete(product);
		
		
	}
	//通过ID查询用品
	public Product findById(Integer id) throws DAOException {
		Product product=(Product)getHibernateTemplate().load(Product.class, id);
        return product;
	}
	//修改用品信息
	public void update(Product product) throws DAOException {
		getHibernateTemplate().update(product);
	}
	//增加用品方法
	public void save(Product product) throws DAOException {
		getHibernateTemplate().save(product);
	}
	//领取记录方法
	public void save(Record record) throws DAOException {
		getHibernateTemplate().save(record);
	} 
	
	
}
