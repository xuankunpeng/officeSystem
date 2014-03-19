<%@page pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!--普通用户领取用品列表显示-->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>OFFICE用品列表</title>
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

		<!--导航区域开始-->
		<div id="navi">
			<ul id="menu">
			</ul>
		</div>

		<!--主要区域开始-->
		<div id="main">
			<div class="search_add">


			</div>
			<!--数据区域：用表格展示数据-->
			<div id="data">
				<table id="datalist">
					<tr>
						<th>
							用品ID
						</th>
						<th class="width100">
							用品名称
						</th>
						<th>
							用品价格（元）
						</th>
						<th>
							用品数量
						</th>
						<th>
							用品描述
						</th>
						<th>
							用品操作
						</th>
					</tr>
					<!-- 使用struts标签遍历集合 -->
					<s:iterator value="productList">

						<tr>
							<td>
								<s:property value="id" />
							</td>
							<td>
								<a href="detail.action?id=${id}"><s:property value="name" />
								</a>
							</td>
							<td>
								<s:property value="price" />
							</td>
							<td>
								<s:property value="amount" />

							</td>

							<td>
								<s:property value="description" />
							</td>

							<td>
								<input type="button" value="领取" class="btn_add"
									onclick="location.href='get.action?product.id=${id}'" />
							</td>

						</tr>

					</s:iterator>

				</table>
				<p>
					其他说明：
					<br />
					1、请写明数据库设计word文档和sql脚本（数据库的名称用姓名全拼）或者用powerDesigner建模（使用mysql数据库）
					<br />
					2、要求在操作两张表的过程中必须使用事务。
					<br />
					3、请注意写全每个程序说明文档。程序说明文档是java和jsp程序的最上面一块注释中标注程序的功能和作者。
					<br />
					4、建议使用注解（Annotation）方式定义Bean、Entity，根据使用情况考虑加分
				</p>
			</div>
		</div>

	</body>
</html>
