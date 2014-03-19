<%@page pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>NetCTOSS</title>
		<link type="text/css" rel="stylesheet" media="all"
			href="../styles/global.css" />
		<link type="text/css" rel="stylesheet" media="all"
			href="../styles/global_color.css" />

	</head>
	<body>
		<!--Logo区域开始-->
		<div id="header">
			<img src="../images/logo.png" alt="logo" class="left" />
			<a href="#">[退出]</a>
		</div>
		<!--Logo区域结束-->
		<!--导航区域开始-->
		<div id="navi">
			<ul id="menu">
				
			</ul>
		</div>
		<!--导航区域结束-->
		<!--主要区域开始-->
		<div id="main">
			<s:form id="productForm" theme="simple" action="update1.action" cssClass="main_form">
				<div class="text_info clearfix">
					<span>用品ID：</span>
				</div>
				<div class="input_info">
					<s:textfield cssClass="readonly" name="product.id" readonly="true" />
				</div>
				<div class="text_info clearfix">
					<span>用品名称：</span>
				</div>
				<div class="input_info">
					<s:textfield id="productName"  cssClass="readonly" name="product.name" readonly="true"/>
	
				</div>
				<div class="text_info clearfix">
					<span>用品数量：</span>
				</div>
				<div class="input_info">
					<s:textfield id="productAmount" cssClass="readonly" name="product.amount" readonly="true" />
				
				</div>
				<div class="text_info clearfix">
					<span>用品价格：</span>
				</div>
				<div class="input_info">
					<s:textfield cssClass="readonly" name="product.price" />
					<span>元</span>
				</div>
				
				<div class="text_info clearfix">
					<span>用品说明：</span>
				</div>
				<div class="input_info_high">
					<s:textarea cssClass="width300 height70 readonly" name="product.description" />
				</div>
				<div class="button_info clearfix">
                    <input id="save" type="submit" value="保存" class="btn_save" />
                    <input type="button" value="取消" class="btn_save" 
                    onclick="location.href='list.action'"/>
                </div>
			</s:form>
		</div>
		<!--主要区域结束-->
		<div id="footer">
			<span>[源自北美的技术，最优秀的师资，最真实的企业环境，最适用的实战项目]</span>
			<br />
			<span>版权所有(C)</span>
		</div>
	</body>
</html>
