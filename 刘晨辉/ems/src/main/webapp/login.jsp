<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
<title>登录页面</title>
<style>
* {
	margin: 0;
	padding: 0;
}

html {
	height: 100%;
}

body {
	background-image: url(image/bg1.jpg); /*图片地址*/
	background-origin: content; /*从content区域开始显示背景*/
	background-position: 50% 50%; /*图片上下左右居中  */
	background-size: contain; /*保持图像本身的宽高比例，将图片缩放到宽度或高度正好适应定义背景的区域  */
	background-size:cover;/*覆盖填充，将图片缩放到宽度或高度正好适应定义背景的区域  */
	background-repeat: no-repeat; /*         图像不重复显示  */
}

.dowebok {
	position: absolute;
	left: 50%;
	top: 50%;
	width: 430px;
	height: 550px;
	margin: -300px 0 0 -215px;
	border: 1px solid #FFF;
	border-radius: 20px;
	overflow: hidden;
}

.logo {
	width: 104px;
	height: 104px;
	margin: 50px auto 80px;
	background: url(images/bg3.png) 0 0 no-repeat;
}

.form-item {
	position: relative;
	width: 360px;
	margin: 0 auto;
	padding-bottom: 30px;
}

.form-item input {
	width: 288px;
	height: 48px;
	padding-left: 70px;
	border: 1px solid #FFF;
	border-radius: 25px;
	font-size: 18px;
	color: #FFF;
	background-color: transparent;
	outline: none;
}

.form-item button {
	width: 360px;
	height: 50px;
	border: 0;
	border-radius: 25px;
	font-size: 18px;
	color: #1F6F4a;
	outline: none;
	cursor: pointer;
	background-color: #FFF;
}

#username {
	background: url(images/bg2.png) 20px 14px no-repeat;
}

#password {
	background: url(images/bg2.png) 23px 11px no-repeat;
}

.tip {
	display: none;
	position: absolute;
	left: 20px;
	top: 52px;
	font-size: 14px;
	color: #F50;
}

.reg-bar {
	width: 360px;
	margin: 20px auto 0;
	font-size: 14px;
	overflow: hidden;
}

.reg-bar a {
	color: #FFF;
	text-decoration: none;
}

.reg-bar a:hover {
	text-decoration: underline;
}

.reg-bar .reg {
	float: left;
}

.reg-bar .forget {
	float: right;
}

.dowebok ::-webkit-input-placeholder {
	font-size: 18px;
	line-height: 1.4;
	color: #fff;
}

.dowebok :-moz-placeholder {
	font-size: 18px;
	line-height: 1.4;
	color: #fff;
}

.dowebok ::-moz-placeholder {
	font-size: 18px;
	line-height: 1.4;
	color: #fff;
}

.dowebok :-ms-input-placeholder {
	font-size: 18px;
	line-height: 1.4;
	color: #fff;
}

@media screen and (max-width: 500px) {
	* {
		box-sizing: border-box;
	}
	.dowebok {
		position: static;
		width: auto;
		height: auto;
		margin: 0 30px;
		border: 0;
		border-radius: 0;
	}
	.logo {
		margin: 50px auto;
	}
	.form-item {
		width: auto;
	}
	.form-item input, .form-item button, .reg-bar {
		width: 100%;
	}
}
</style>
</head>
<body >
	<form style="text-align: center;"
		action="${pageContext.request.contextPath }/EmpServlet?cmd=login"
		method="post">
		<div class="dowebok">
			<div class="logo"></div>
			<div class="form-item">
				<input id="nickname" type="text" autocomplete="off"
					placeholder="nickname" name="nickname">
				<p class="tip">请输入昵称</p>
			</div>
			<div class="form-item">
				<input id="password" type="password" autocomplete="off"
					placeholder="password" name="password">
			</div>
			<div class="form-item">
				<button id="submit">登 录</button>
			</div>
			<div class="reg-bar">
				<a class="reg" href="register.jsp">立即注册</a> <a class="forget"
					href="javascript:">忘记密码</a>
			</div>
		</div>
	</form>

</body>
</html>