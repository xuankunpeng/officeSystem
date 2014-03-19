package com.tarena.office.action;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tarena.office.dao.ProductDAO;
import com.tarena.office.entity.Product;
/*
 * 用来增加用户信息的Action类
 */
@Controller
@Scope("prototype")
@Namespace("/product")
@Action(value="addProductAction")
@Results(@Result(name="success",type="redirectAction",location="/WEB-INF/jsp/login_form.jsp"))
 public class AddProductAction extends BaseAction{
	private Product product;
	@Resource
    private ProductDAO productDAO ;

	

	public Product getProduct() {
		return product;
	}



	public void setProduct(Product product) {
		this.product = product;
	}


	@Transactional(propagation=Propagation.REQUIRED)
	public String execute() throws Exception {
		productDAO.save(product);
		return "success";
	}
}
