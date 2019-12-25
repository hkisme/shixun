<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css">
	<script type="text/javascript" src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
	<script type="text/javascript" src="https://cdn.bootcss.com/bootstrap/4.0.0/js/bootstrap.min.js"> </script>
	<script type="text/javascript"
		src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.0/dist/jquery.validate.min.js"></script>
	<title>用户登录</title>
	<style>
		.input-box {
			padding-top: 20px;
			padding-bottom: 20px;
			/* border: 1px solid red; */
		}

		.button-box {
			/* position: relative;
            top: 60px; */
			padding-top: 20px;
			padding-bottom: 20px;
			/* border: 1px solid red; */
		}

		.input {
			padding-top: 20px;
			padding-bottom: 20px;
		}

		.box {
			/* position: relative;
            margin: 50%; */
			margin-left: auto;
			margin-right: auto;
			padding: 20px;
			width: 400px;
			height: 450px;
			border: 1px solid blue;
			/* margin: 30px; */
		}

		.tip-box {
			height: 80px;
			padding-top: 20px;
			padding-bottom: 20px;
			/* border: 1px solid red; */
			font-size: 20px;
			text-align: center;
		}

		.tip-box2 {
			border: 5px solid red;
			background-color: brown;
			color: white;
		}

		.login-botton {
			width: 100%;
			height: 50px;
		}
	</style>
</head>

<body>
	<!-- <h1 style="text-align: center">登录</h1>
	<hr width="80%"> -->
	<div class="box">
		<form action="${pageContext.request.contextPath}/EmpServlet?cmd=login" method="POST">
			<div class="input-box">
				<div class="input-group mb-3 input">
					<input class="form-control" type="text" id="nickname" name="nickname" placeholder="用户名" />
				</div>
				<div class="input-group mb-3 input">
					<input class="form-control" type="password" id="password" name="password" placeholder="密码" />
				</div>
			</div>
			<!-- <div id="tip" class="tip-box"></div> -->
			<div class="button-box">
				<a href="${pageContext.request.contextPath}/register.jsp">注册</a>
				<button class="btn btn-primary login-botton" type="submit">登录</button>
			</div>
		</form>
	</div>

</body>

</html>