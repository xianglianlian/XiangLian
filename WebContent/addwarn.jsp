<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	td{
		padding:5px;
	}
	a{
		text-decoration: none ;
		color:black;
	}
</style>
</head>
<body>
	<form action="warnAction_addWarn" method="post">
		<table border="1" width="400" height="300" cellpadding="0" cellspacing="0">
			<tr>
				<th colspan="2"><h2>珠海气象信息发布系统</h2></th>
			</tr>
			<tr>
				<td>气象类型：</td>
				<td>
					<select name="warn.wtype">
						<option>请选择类型</option>
						<option value="黄色高温预警">黄色高温预警</option>
						<option value="黄色降雨预警">黄色降雨预警</option>
						<option value="红色高温预警">红色高温预警</option>
						<option value="红色降雨预警">红色降雨预警</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>影响天数：</td>
				<td><input name="warn.wdays"></td>
			</tr>
			<tr>
				<td>影响区域：</td>
				<td>
					<textarea rows="2" cols="22" name="warn.warea"></textarea>
				</td>
			</tr>
			<tr>
				<td>气象描述：</td>
				<td>
					<textarea rows="3" cols="28" name="warn.winfo"></textarea>
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="发布预警">
					<button><a href="index.jsp">查看已发布预警</a></button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>