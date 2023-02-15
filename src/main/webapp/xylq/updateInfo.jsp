<%@page contentType="text/html; charset=UTF-8" isELIgnored="false" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>个人信息修改 | Update UserInfo</title>


    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <!-- Font Awesome -->
    <!-- Ionicons -->
    <!-- Theme style -->
    <!-- iCheck -->
    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

    <link rel="stylesheet" href="../plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="../plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="../plugins/iCheck/square/blue.css">
</head>

<body class="hold-transition register-page">
    <div class="register-box">
        <div class="register-logo">


            <a href="all-admin-index.html"><b>个人信息</b>修改</a>


        </div>

        <div class="register-box-body">
            <p class="login-box-msg">要修改的项</p>

            <form action="/updateSickInfo" method="get">
                <div class="form-group has-feedback">
                    <input type="text" class="form-control" placeholder="用户名" name="sickuname">
                    <span class="glyphicon glyphicon-user form-control-feedback"></span>
                </div>
                <div class="form-group has-feedback">
                    <input type="text" class="form-control" placeholder="手机" name="sickphone">
                    <span class="glyphicon glyphicon-earphone form-control-feedback"></span>
                </div>
                <div class="form-group has-feedback">
                    <input type="email" class="form-control" placeholder="Email" name="sickemail">
                    <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
                </div>
                <div class="form-group has-feedback">
                    <input type="password" class="form-control" placeholder="密码" name="pwd">
                    <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                </div>
                <div class="form-group has-feedback">
                    <input type="password" class="form-control" placeholder="确认密码" name="pwd1">
                    <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                </div>
                <script>
                    <%--这个位置编写数据校验代码:
                    假如该选项用户输入了，则进行一下判断
                    1.判断手机号是否是数字并且是否是11位；
                    2.判断两次密码是否一致
                    --%>

                </script>
                <div class="row">
                    <div class="col-xs-4">
                        <div class="checkbox icheck">
                            <label>
              <!--<input type="checkbox"> 我同意 <a href="#">协议</a>-->
            </label>
                        </div>
                    </div>
                     <!--/.col--> 
                    <div class="col-xs-4">
                        <button type="submit" class="btn btn-primary btn-block btn-flat">修改</button>
                    </div>
                    <!-- /.col -->
                </div>
                <div align="center">
                    <p style="color: red">${updateMsg}</p>
                </div>
            </form>

        </div>
        <!-- /.form-box -->
    </div>
    <!-- /.register-box -->

    <!-- jQuery 2.2.3 -->
    <!-- Bootstrap 3.3.6 -->
    <!-- iCheck -->
    <script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
    <script src="../plugins/bootstrap/js/bootstrap.min.js"></script>
    <script src="../plugins/iCheck/icheck.min.js"></script>
    <script>
        $(function() {
            $('input').iCheck({
                checkboxClass: 'icheckbox_square-blue',
                radioClass: 'iradio_square-blue',
                increaseArea: '20%' // optional
            });
        });
    </script>
</body>

</html>