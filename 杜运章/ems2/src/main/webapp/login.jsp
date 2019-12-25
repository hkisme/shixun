<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1 >登录</h1>
	<body background="img/1.png "
      style=" background-repeat:no-repeat ;
         background-size:100% 100%;
       background-attachment: fixed;">
	<img src="img/user.png" width="120" height="120" alt=""/>
	
        
     	<form class="form-horizontal" action="${pageContext.request.contextPath}/EmpServlet?cmd=register"
		method="post">
			<div class="form-group">
				<label for="inputEmail3" class="col-sm-2 control-label">昵称</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="nickname"
						placeholder="nickname" name="nickname" onclick="nMsg()">
				</div>
				<span id="nicknameSpan"></span>
			</div>
			
			<div class="form-group">
				<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
				<div class="col-sm-10">
					<input type="password" class="form-control" id="password1"
						placeholder="Password" name="password">
				</div>
			</div>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> 记住密码
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
      </form>

</body>
</html>