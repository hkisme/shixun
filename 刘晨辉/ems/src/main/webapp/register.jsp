<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>


<script src="jquery-1.10.2.min.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>


</head>

<body>

	<nav class="navbar navbar-default navbar-fixed-top navbar-inverse">
		<a class="navbar-brand" href="#"> <img alt="Brand"
			src="untitled.png" width=25px height=25px>
		</a>
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="login.jsp">主页</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li class="active"><a href="login.jsp">登陆 <span
							class="sr-only">(current)</span></a></li>
					<li><a href="register.jsp">注册</a></li>
				</ul>
				<form class="navbar-form navbar-right">
					<div class="form-group">
						<input type="text" class="form-control" placeholder="请输入">
					</div>
					<button type="submit" class="btn btn-default">
						<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
					</button>
				</form>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>


	<div class="jumbotron">
		<div class="container">
			<h1>hello bro</h1>
			<p>欢迎登陆此网页</p>
			<p>您可以在网站上传自己的文章并和其他人互相学习</p>
			<p>
				<a class="btn btn-primary btn-lg" href="https://www.baidu.com"
					role="button">Learn more</a>
			</p>
		</div>
	</div>
	
	
	<div class="container">

		<h1 style="text-align: lift;"> 注册 </h1>
		<br> <br>


		<form class="form-horizontal"
			action="${pageContext.request.contextPath}/EmpServlet?cmd=register"
			method="post">
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">Nickname</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="nickname"
						placeholder="nickname" name="nickname" onclick="nMsg()">
				</div>
				<span id="nicknameSpan"></span>
			</div>

			<div class="form-group">
				<label for="inputPassword3" class="col-sm-2 control-label">Password</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="password1"
						placeholder="Password" name="password">
				</div>
			</div>

			<div class="form-group">
				<label for="inputPassword3" class="col-sm-2 control-label">pwdagain</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="password2"
						placeholder="Password">
				</div>
			</div>

			<div class="form-group">
				<label for="inputPassword3" class="col-sm-2 control-label">Gender</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="gender"
						placeholder="Gender" name="gender">
				</div>
			</div>

			<div class="form-group">
				<label for="inputPassword3" class="col-sm-2 control-label">Salary</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="salary"
						placeholder="Salary" name="salary">
				</div>
			</div>

			<!-- 显示请求域中的信息 -->
			<div style="color: red">${requestScope.nicknameMsg }</div>

			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10">
					<button type="submit" class="btn btn-primary">注册</button>
					&emsp;&emsp;
					<button type="reset" class="btn btn-warning">重置</button>
				</div>
			</div>

		</form>

	</div>
	<!-- /container -->




	<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
	<script
		src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
	<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/js/bootstrap.min.js"></script>
</body>

<script type="text/javascript">
	$("#hideP").click(function(){
		$("#p1").hide();
	});
	
	$("#showP").click(function(){
		$("#p1").show();
	});

	// -------------------
	
	/* 当光标放入到nickname的输入框中, 则提示输入信息 */
	function nMsg(){
		// alert("点击了nickname输入框");
		
		// 获取对应的span标签, 
		var nSpan = document.getElementById("nicknameSpan");
		
		// 在span标签中显示提示内容
		nSpan.innerHTML = "<font color='red' style='text-align: center;'>请输入8到16位的昵称</font>";
	}
</script>
</body>
</html>