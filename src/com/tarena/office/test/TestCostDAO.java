package com.tarena.office.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tarena.office.dao.AdminDAO;
import com.tarena.office.entity.Admin;

public class TestCostDAO {
	
	@Test
	 public void testFindbypwd() throws Exception{
		String conf="/abapplicationContext.xml";		ApplicationContext ac=new ClassPathXmlApplicationContext(conf);
		AdminDAO costDAo=(AdminDAO) ac.getBean("hibernateAdminDAO");
		Admin admin= costDAo.findByCodeAndPwd("xuan","xkp123");
		System.out.println(admin);
	}
	}	

