package com.tarena.office.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.tarena.office.dao.AdminDAO;
import com.tarena.office.dao.DAOException;
import com.tarena.office.entity.Admin;
@Repository
@Scope("prototype")
//此类实现了AdminDAO
public class HibernateAdminDAO extends HibernateDaoSupport implements AdminDAO{

	/* (non-Javadoc)
	 * @see com.tarena.office.dao.impl.Isdfs#setMySessionFactory(org.hibernate.SessionFactory)
	 */
	@Resource//注入SessionFactory
	public void setMySessionFactory(SessionFactory sf){
		super.setSessionFactory(sf);
	}
	/* (non-Javadoc)
	 * @see com.tarena.office.dao.impl.Isdfs#findByCodeAndPwd(java.lang.String, java.lang.String)
	 */
	public Admin findByCodeAndPwd(String code, String pwd) throws DAOException {
		
		String hql="from Admin where username=? and password=?";
		Object[] params={code,pwd};
		List<Admin> list=getHibernateTemplate().find(hql,params);
		if(!list.isEmpty()){
			return  list.get(0);
		}else{
			return null;
		}
	}

}
