package com.tarena.office.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tarena.office.dao.ProductDAO;
import com.tarena.office.entity.Product;

@Controller
@Scope("prototype")
/*
 * ��product_updateform.jsp���ύ����Action����Ʒ��Ϣ�����޸�
 */
public class UpdateProductAction  {

	private Product product;
	@Resource
	private ProductDAO productDAO;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public String execute() throws Exception {
		 productDAO.update(product);
		return "success";
	}
}
