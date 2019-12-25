<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>注册</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <script type="text/javascript" src="https://cdn.jsdelivr.net/npm/vue"></script>
<%--    <script src="https://unpkg.com/axios/dist/axios.min.js"></script>--%>
    <style>
        .register {
            width: 350px;
            /* border: 1px solid red; */
        }

        input {
            /* padding: 20px; */
            margin-top: 20px;
            margin-bottom: 20px;
        }

        .bitian {}

        .pw>img {
            float: left;
            margin-top: 20px;
            margin-bottom: 20px;
            border: 1px solid red;
        }

        .pw>input {
            float: right;
            width: 300px;
        }

        .pw {
            /* display: inline; */
            /* border: 1px solid red; */
            width: 350px;
        }

        .msg {
            border: 2px solid red;
            /* padding: 20px; */
            margin: 20px;
            text-align: center;
        }
    </style>
</head>

<body>
    <div class="container">
        <div id="reg" class="register">
            <form @submit.prevent="onSubmit" ref="export" action="${pageContext.request.contextPath}/EmpServlet?cmd=register" method="POST">
                <div>
                    <input v-on:blur="test(1)" class="form-control" v-model="user_name" type="text" name="name"
                        placeholder="请输入用户名" />
                </div>
                <div>
                    <input v-on:blur="test(2)" class="form-control" v-model="user_pw" type="text" name="name"
                        placeholder="请输入密码" />
                </div>
                <div>
                    <input v-on:blur="test(4)" class="form-control" v-model="user_pw2" type="text" name="name"
                        placeholder="请确认密码" />
                </div>
                <div v-if="msg_show" class="msg">
                    <span>{{msg}}</span>
                </div>
                <button v-bind:disabled="button_disabled" class="btn btn-primary" type="submit">注册</button>
                <button class="btn btn-primary" type="reset">重置</button>
            </form>
        </div>
    </div>
    <script>
        var vm = new Vue({
            el: '#reg',

            data: {
                user_name: '',
                user_pw: '',
                user_pw2: '',
                msg: '',
                msg_show: false,
                button_disabled: true,
                num: 0
            },

            methods: {
                onSubmit: function () {
                    // if(!this.check()){
                    // }else{
                    //     this.$refs.export.submit();
                    // }
                    // console.log(this.isPass(this.user_name))
                    // this.msg = 'dfas'
                    // this.msg_show = true
                },

                isPass: function (str) {
                    return /^[a-zA-Z0-9]+$/.test(str)
                },

                check: function (str) {
                    if (this.user_name == '' || this.user_pw == '' || this.user_pw2 == '') {
                        console.log(1)
                        // alert("输入不能为空");
                        return false
                    } else if (!(this.isPass(this.user_name) && this.isPass(this.user_pw) && this.isPass(this.user_pw2))) {
                        console.log(2)
                        alert("输入不规范");
                        return false
                    } else if (this.user_name.length >= 16 || this.user_pw.length >= 16 || this.user_pw2.length >= 16) {
                        console.log(3)
                        alert("输入长度过长");
                        return false
                    } else if (this.user_pw != this.user_pw2) {
                        console.log(4)
                        alert("两次密码不一致");
                        return false
                    } else {
                        console.log(5)
                        return true
                    }
                },

                setMeg: function (info, show) {
                    this.msg = info
                    this.msg_show = show
                },

                test: function (n) {
                    // console.log(n)
                },

                listen: function () {
                    this.button_disabled = !this.check()
                    // this.check();
                }
            },

            watch: {
                user_name: function () {
                    this.listen()
                },

                user_pw: function () {
                    this.listen()
                },

                user_pw2: function () {
                    this.listen()
                },
            }
        });
    </script>
</body>

</html>