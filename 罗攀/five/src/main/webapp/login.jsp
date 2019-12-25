<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1 style="text-align: center;">登录</h1>
    <hr width="80%">
    
    <form style="text-align: center;" action="${pageContext.request.contextPath }/EmpServlet?cmd=login" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <input name="nickname" type="text" class="input-block-level" placeholder="nickname">
        <br>
        <input name="password" type="password" class="input-block-level" placeholder="Password">
        <br>
        <label class="checkbox">
          <input type="checkbox" value="remember-me"> Remember me
        </label>
        <br>
        <button class="btn btn-large btn-primary" type="submit">Sign in</button>
    </form>
</body>
</html>