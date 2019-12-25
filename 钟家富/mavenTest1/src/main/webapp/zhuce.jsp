<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
	<
	<!-- main -->
	<div class="w3layouts-main">
		<h1>注册</h1>
		<div class="agilesign-form">
			<div class="agileits-top">
				<form action="${pageContext.request.contextPath }/loginServlet?cmd=zhuce" method="post">
					<div class="styled-input w3ls-text">
						<input type="text" name="zcusername" required="" /> <label>用户名</label>
						<span></span>
					</div>
					<div class="styled-input w3ls-text">
						<input type="password" name="zcpassword" required="" id="p1"> <label>密码</label>
						<span></span>
					</div>
					<div class="styled-input w3ls-text">
						<input type="password" name="zcpassword1" required="" onchange="mima()" id="p2"> <label>确认密码</label>
						<span></span>
					</div>
					<div class="styled-input w3ls-text">
						<input type="text" name="zcsex" required="" /> <label>性别</label>
						<span></span>
					</div>
					<div class="styled-input w3ls-text">
						<input type="text" name="zcsalary" required=""> <label>薪资</label>
						<span></span>
					</div>
					<div style="text-align: center">
						<font color="#FF7F50"> 
					   <%
 	                  if (request.getAttribute("message10") != null) {
 		                  out.print(request.getAttribute("message10"));
 	                      }
                       %>
						</font>
					</div>
					<div class="agileits-bottom">
						<input type="submit" value="注册" id="zhuce">
					</div>
				</form>
			</div>
			<div class="w3agile-btm">
				<p>
					已经有账号 ? <a href="login.jsp"> 登录</a>
				</p>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		function mima(){
			var p1=document.getElementById("p1").value;
			var p2=document.getElementById("p2").value;
			if(p1!=p2){
				alert("两次密码不一致，请修改");
				zhuce.setAttribute("disable",true);	
			}else{
				zhuce.removeAttribute("disable");
			}
		}
	</script>
	<!-- //main -->
</body>
</html>