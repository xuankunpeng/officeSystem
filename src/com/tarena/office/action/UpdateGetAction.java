package com.tarena.office.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tarena.office.dao.ProductDAO;
import com.tarena.office.entity.Product;
import com.tarena.office.entity.Record;
@Controller
@Scope("prototype")
public class UpdateGetAction {
	private Product product;
	private Record record;
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Resource
	private ProductDAO productDAO;
	public Record getRecord() {
		return record;
	}
	public void setRecord(Record record) {
		this.record = record;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public String execute() throws Exception {
		product=productDAO.findById(id);
		product.setAmount(product.getAmount()-record.getAmount());
		 productDAO.update(product);
		 productDAO.save(record);
		return "success";
	}
}
