<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
    <style type="text/css">
        img {
            width: 420px;
            height: 580px;
        }

        .sdiv {
            width: 420px;
            height: 580px;
            position: absolute;
            left: 0;
            top: 0;
            right: 0;
            bottom: 0;
            margin: auto;
            transform-style: preserve-3d;
            transition: all 12s;
            background: url(../img/img2.jpg);
            background-size: 100% 100%;
        }

        .sdiv img {
            position: absolute;
        }

        .sdiv img:nth-child(1) {
            transform: translateZ(500px);
        }

        .sdiv img:nth-child(2) {
            transform: rotateY(60deg) translateZ(500px);
        }

        .sdiv img:nth-child(3) {
            transform: rotateY(120deg) translateZ(500px);
        }

        .sdiv img:nth-child(4) {
            transform: rotateY(180deg) translateZ(500px);
        }

        .sdiv img:nth-child(5) {
            transform: rotateY(240deg) translateZ(500px);
        }

        .sdiv img:nth-child(6) {
            transform: rotateY(300deg) translateZ(500px);
        }

        .sdiv:hover {
            transform: rotateY(720deg) rotateX(45deg);
        }
    </style>

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
                    <li><a href="ZhuCe.jsp">注册</a></li>
                </ul>
                <form class="navbar-form navbar-right">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="请输入">
                    </div>
                    <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search"
                            aria-hidden="true"></span></button>
                </form>
            </div>
        </div>
    </nav>
    <div class="sdiv">
        <img src="IMG_20190623_191505.jpg" alt="" />
        <img src="QQ图片20190227195047.gif" alt="" />
        <img src="u=3560685013,682382687&fm=26&gp=0.jpg" alt="" />
        <img src="2a7866a497591a72646442912a8f6c26.jpg" alt="" />
        <img src="9ed3a3e7e7b5f47630f0052ab7de4b3c.jpg" alt="" />
        <img src="timg (1).jpg" alt="" />
    </div>
    <audio src="../img/gaobaiqiqiu.mp3" autoplay="autoplay" loop="loop"></audio>
</body>

</html>