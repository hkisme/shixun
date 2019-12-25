<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<style type="text/css">
			* {
				margin: 0px;
			}
			#content {
				margin: 150px auto;
				width: 60%;
				height: 460px;
				border: 1px transparent solid;
				background-color: transparent;
				background-image: linear-gradient(transparent, transparent, transparent);
				background-image: -webkit-linear-gradient(transparent, transparent, transparent);
				background-image: -moz-linear-gradient(transparent, transparent, transparent);
				background-image: -o-linear-gradient(transparent, transparent, transparent);
			}

			#box {
				margin: 50px auto;
				width: 60%;
				height: 360px;
				background-color: transparent;
				text-align: center;
				border-radius: 15px;
				border: 2px #fff solid;
				box-shadow: 10px 10px 5px #000000;
		
			}

			.title {
				line-height: 58px;
				margin-top: 20px;
				font-size: 36px;
				color: #000;
				height: 58px;
			}

			#box:hover {
				border: 2px #fff solid;
			}

			.input {
				margin-top: 20px;
			}

			input {
				margin-top: 5px;
				outline-style: none;
				border: 1px solid #ccc;
				border-radius: 3px;
				padding: 13px 14px;
				width: 70%;
				font-size: 14px;
				font-weight: 700;
				font-family: "Microsoft soft";
			}

			button {
				margin-top: 20px;
				border: none;
				color: #000;
				padding: 15px 32px;
				text-align: center;
				text-decoration: none;
				display: inline-block;
				font-size: 16px;
				border-radius: 15px;
				background-color: #CCCCCC;
			}
			button:hover{
				background-color: #B721FF;
				color: #fff;
			}
		</style>
	</head>
 <body background=two.jpg>
<form style="text-align: center;" action="${pageContext.request.contextPath }/EmpServlet?cmd=login" method="post">
		<div id="content" >
			<div id="box">
				<div class="title">登录界面</div>
				<div class="input">
					<input id="nickname" name="nickname" placeholder="昵称" />
					<br>
					<input type="password" id="password" name="password" placeholder="密码"  />
					<br>
					<input type="submit" value="登录">
				<input type=button onclick="window.location.href('http://localhost:8080/ems/Register.jsp')" value="注册">
				</div>
			</div>
		</div>
</form>
	</body>
</html>
</html>
