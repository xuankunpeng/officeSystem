package com.tarena.office.action;

import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.tarena.office.dao.ProductDAO;
import com.tarena.office.entity.Product;
@Controller
@Scope("prototype")
@Namespace("/product")
@Action(value="listProductAction")
@Results(@Result(name="success",location="/WEB-INF/jsp/login_form.jsp"))
/*
 * 用来显示用品列表的Action
 */
public class ListProductAction {

	
	private List<Product> productList;// Output
	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}
	@Resource
	private ProductDAO productDAO ;


	public String execute() throws Exception {
		productList = productDAO.findAll();
		return "success";
	}
}
