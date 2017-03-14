<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="js/jquery-1.7.2.js"></script>
<style>
	body,html{
		height:100%;
		width:100%;
	}
	#aa{
		width:300px;
		height:150px;
		border: 1px solid #e0e0e0;
		box-shadow:0 0 20px rgba(0, 0, 0, .5); 
		position: absolute;
		right:40% ;
		top:15%;
		background: #fff;
		z-index: 1000;
		display: none;
	}
	#bb{
		width:280px;
		height:40px;
		margin-top:40px;
		text-align: right;
	}
	button{
		width:55px;
		height:30px;
		border:0;
	}
	.a{
		background: green;
		color:white;
		margin-right:10px;
	}
	.b{
		background: white;
		color:#000;
		border:1px solid #e0e0e0;
	}

</style>
</head>
<body>
	<div id="aa">
		<h4 align="center" style="margin-top:40px">确定要删除这些信息吗？</h4>
		<div id="bb">
			<button class="a" onclick="Delete()">确定</button>
			<button class="b" onclick="Close()">取消</button>
		</div>
	</div>
	<h3 style="color:red;margin-left:220px;">珠海气象预警信息发布系统</h3>
	<table id="tab" border="1" bordercolor="green" width="700" style="position: relative;">
		<tr>
			<th>选择</th><th>编号</th><th>预警级别</th><th>发布时间</th>
			<th>持续日期（天）</th><th>影响区域</th><th>气象描述</th>
		</tr>
		<tr id="last">
			<td colspan="7" align="center">
				<a href="addwarn.jsp">添加预警信息</a>
				<a href="javascript:doDelete()">删除预警信息</a>
			</td>
		</tr>
	</table>
	
	<script type="text/javascript">
		function loadd(){
			$.post("warnAction_findAllWarn","",function(date){
				$.each(date.warnList,function(i,obj){
					var tr="<tr>";
					tr+="<td><input name='selId' value='"+obj.wno+"' type='checkbox'></td>";
					tr+="<td>"+(i+1)+"</td>";
					tr+="<td>"+obj.wtype+"</td>";
					tr+="<td>"+obj.wdate+"</td>";
					tr+="<td>"+obj.wdays+"</td>";
					tr+="<td>"+obj.warea+"</td>";
					tr+="<td>"+obj.winfo+"</td>";
					tr+="</tr>";
					$("#last").before(tr);
				})
			},"json") ;
		}
		window.onload=loadd() ;
		
		function doDelete(){
			$("#aa").css("display","block");
		}
		function Close(){
			$("#aa").css("display","none");
		}
		
		function Delete(){
			$("#aa").css("display","none");
			//选中所有input框并且name为selId序列化(默认只会选着选中的单选框)
			var param=$("input[name=selId]").serialize();
			if(param==null||param==""){
				alert("请选择要删除的记录");
			}else{
				//跳转到action执行删除
				location.href="warnAction_deleteWarn?"+param;
			}
		}
		
	
	</script>
</body>
</html>