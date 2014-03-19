package com.tarena.office.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.tarena.office.dao.AdminDAO;
import com.tarena.office.entity.Admin;
@Controller
@Scope("prototype")
/*
 * 用户登录Action，使用findByCodeAndPwd方法从ADMIN表中查找用户信息
 */
public class LoginAction extends BaseAction {

	private Admin admin;
   @Resource
	private AdminDAO adminDAO ;

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String execute() throws Exception {
		admin = adminDAO.findByCodeAndPwd(admin.getUsername(), admin.getPassword());
		if (admin != null) {
			// 把用户信息存入Session
			session.put(ADMIN_KEY, admin);
			return "success";
		} else {
			return "fail";
		}
	}
}
