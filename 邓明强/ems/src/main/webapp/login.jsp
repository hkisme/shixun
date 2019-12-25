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
    
    <form style="text-align: center;" action="${pageContext.request.contextPath}/EmpServlet?cmd=login" method="post"> 
         <input id="nickname" name="nickname" placeholder="昵称"/>
         <br>
         <input type="password" id="password" name="password" placeholder="密码"/>
         <br>
         <input type="submit" value="登錄">
         
    </form>
</body>
</html>