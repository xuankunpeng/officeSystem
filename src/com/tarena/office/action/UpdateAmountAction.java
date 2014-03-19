package com.tarena.office.action;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSON;
import com.opensymphony.xwork2.ActionContext;
import com.tarena.office.dao.ProductDAO;
import com.tarena.office.entity.Product;

@Controller
@Scope("prototype")
/*
 * 在采购表单中提交给此Action将用品数量进行修改，实现采购的功能
 */
public class UpdateAmountAction {

	private Integer productId;
	private Integer amount;
	
	@Resource
	private ProductDAO productDAO;

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
 
	//使用注解添加声明式事务管理
	@Transactional(propagation = Propagation.REQUIRED)
	public String execute() throws Exception {
		Product product = productDAO.findById(productId);
		/*
		 * 如果Product表中的用品数量为空的话则把用户采购的数量直接增加到表里 否则把用户采购的数量和原有的数量相加
		 */
		if (product.getAmount() == null) {
			product.setAmount(amount);
		} else {
			product.setAmount(product.getAmount() + amount);
		}
		productDAO.update(product);
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("application/json;charset=UTF-8");
		
		Map<String, Object> resp = new HashMap<String, Object>();
		resp.put("success", true);
		resp.put("amount", product.getAmount());
		response.getWriter().println(JSON.toJSONString(resp));
		return null;
	}
}
