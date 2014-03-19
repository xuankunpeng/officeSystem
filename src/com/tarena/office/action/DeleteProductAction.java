package com.tarena.office.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tarena.office.dao.ProductDAO;
@Controller
@Scope("prototype")
/*
 * ����ɾ����Ʒ��Ϣ��Action
 */
public class DeleteProductAction {
	
	private Integer id;
	
	@Resource
	private ProductDAO productDAO ;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	@Transactional(propagation=Propagation.REQUIRED)//ע������
	public String execute() throws Exception {
		 productDAO.delete(id);
		return "success";
	}
}
