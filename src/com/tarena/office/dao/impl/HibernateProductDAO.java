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
//����ʵ����ProductDAO�Ͷ����ݿ���ʵ�һϵ�з���
public class HibernateProductDAO extends HibernateDaoSupport implements ProductDAO{

	@Resource
	public void setMySessionFactory(SessionFactory sf){
		super.setSessionFactory(sf);
	}
	//��Ʒ�б���ʾ����
	public List<Product> findAll() throws DAOException {
		String hql="from Product";
		List list=getHibernateTemplate().find(hql);
		return list;
	}
	//��Ʒɾ������
	public void delete(Integer id) throws DAOException {
		
			Product product=findById(id);
			getHibernateTemplate().delete(product);
		
		
	}
	//ͨ��ID��ѯ��Ʒ
	public Product findById(Integer id) throws DAOException {
		Product product=(Product)getHibernateTemplate().load(Product.class, id);
        return product;
	}
	//�޸���Ʒ��Ϣ
	public void update(Product product) throws DAOException {
		getHibernateTemplate().update(product);
	}
	//������Ʒ����
	public void save(Product product) throws DAOException {
		getHibernateTemplate().save(product);
	}
	//��ȡ��¼����
	public void save(Record record) throws DAOException {
		getHibernateTemplate().save(record);
	} 
	
	
}
