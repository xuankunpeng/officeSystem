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
 * �ڲɹ������ύ����Action����Ʒ���������޸ģ�ʵ�ֲɹ��Ĺ���
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
 
	//ʹ��ע���������ʽ�������
	@Transactional(propagation = Propagation.REQUIRED)
	public String execute() throws Exception {
		Product product = productDAO.findById(productId);
		/*
		 * ���Product���е���Ʒ����Ϊ�յĻ�����û��ɹ�������ֱ�����ӵ����� ������û��ɹ���������ԭ�е��������
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
