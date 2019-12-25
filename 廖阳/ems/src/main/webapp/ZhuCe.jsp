<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <script src="js\jquery-3.4.1.min.js"></script>
    <link rel="stylesheet" href="css\bootstrap.min.css">
    <script src="js\bootstrap.min.js"></script>
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

</head>

<body>
    <nav class="navbar navbar-default navbar-inverse">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Brand</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li class="active"><a href="#"><span class="glyphicon glyphicon-home"></span> 首页 <span
                                class="sr-only">(current)</span></a></li>
                    <li><a href="login.jsp">登录</a></li>
                </ul>
                <form class="navbar-form navbar-right">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="请输入">
                    </div>
                    <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"
                            aria-hidden="true"></span></button>
                </form>
            </div><!-- /.navbar-collapse -->
        </div><!-- /.container-fluid -->
    </nav>

    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <h3>用户注册</h3>
                <hr>
                <form class="form-horizontal" action="${pageContext.request.contextPath }/EmpServlet?cmd=register" method="post">
                    <div class="form-group">
                        <label for="inputEmail3" class="col-sm-2 control-label">账号</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="username" id="username" placeholder="请输入">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" name="password1" id="password1" placeholder="请输入">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputPassword6" class="col-sm-2 control-label">确认密码</label>
                        <div class="col-sm-10">
                            <input type="password" class="form-control" name="password2" id="password2" placeholder="请输入" onchange="huoqu()">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputEmail4" class="col-sm-2 control-label">性别</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="gender" id="gender" placeholder="请输入">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="inputEmail5" class="col-sm-2 control-label">工资</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" name="salary" id="salary" placeholder="请输入">
                        </div>
                    </div>
                    
                    <div style="color:red">
                    	${request}
                    </div>
                    
                    <div class="form-group">
                        <div class="col-sm-12">
                            <button type="submit" class="btn btn-info btn-block" id="zhuce">注册</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
    
<!--     <script>
    	$(document)
    </script>--> 
    
    <script type="text/javascript">
    	function huoqu(){
    		var a=document.getElementById("password1").value;
    		var b=document.getElementById("password2").value;
    		var zhuce=document.getElementById("zhuce");
    		console.log(a);
    		console.log(b);
    		if(a!=b){
    			alert("前后两次密码不一致！");
    			zhuce.setAttribute("disabled", true);
    		}
    		else{
    			zhuce.removeAttribute("disabled");
    		}
    	}
    </script>
</body>

</html>