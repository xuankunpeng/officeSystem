﻿<%@page pageEncoding="utf-8"%>
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
	<body class="index">
		<div class="login_box">
			<form name="loginForm"action="login.action" method="post">
				<table>
					<tr>
						<td class="login_info">
							账号：
						</td>
						<td colspan="2">
							<input name="admin.username" type="text" class="width150" />
						</td>
						<td class="login_error_info">
							<span class="required"></span>
						</td>
					</tr>
					<tr>
						<td class="login_info">
							密码：
						</td>
						<td colspan="2">
							<input name="admin.password" type="password" class="width150" />
						</td>
						<td>
							<span class="required"></span>
						</td>
					</tr>
					
					<tr>
						<td></td>
						<td class="login_button" colspan="2">
							<a href="javascript:;" onclick="loginForm.submit();"><img src="../images/login_btn.png" /> </a>
						</td>
						<td>
							<span class="required"></span>
						</td>
					</tr>
				</table>
			</form>
		</div>
	</body>
</html>
