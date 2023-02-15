<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <%@page contentType="text/html; charset=UTF-8" isELIgnored="false" language="java" %>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">


    <title>
        数据 - AdminLTE2定制版 | Log in</title>


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
            <a href="/cgq&yjf/managerindex.jsp"><b>数据</b>后台管理系统</a>
        </div>

        <div class="register-box-body">
            <p class="login-box-msg">添加医护人员</p>

            <form action="/addStafinfo" method="get">
                <div class="form-group has-feedback">
                    <input type="text" name="stafname" class="form-control" placeholder="姓名（请填写真实姓名）">
                    <span class="glyphicon glyphicon-user form-control-feedback"></span>
                </div>
                <div class="form-group has-feedback">
                    <input type="text" name="username" class="form-control" placeholder="用户名">
                    <span class="glyphicon glyphicon-user form-control-feedback"></span>
                </div>
                <div class="form-group has-feedback">
                    <input type="email" name="email" class="form-control" placeholder="Email">
                    <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
                </div>
                <div class="form-group has-feedback">
                    <input type="phone" name="stafphone" class="form-control" placeholder="Phone">
                    <span class="glyphicon glyphicon-phone form-control-feedback"></span>
                </div>
                <div class="form-group has-feedback">
                    <input type="stafcard" name="stafcard" class="form-control" placeholder="Card">
                    <span class="glyphicon  form-control-feedback"></span>
                </div>
<%--                <div>科室--%>
<%--                   <select name="deptid">--%>
<%--                       <option value="0">请选择</option>--%>
<%--                       <c:forEach var="deptinfo" items="${deptinfos}">--%>
<%--                           <option  value="${deptinfo.deptid}">${deptinfo.deptname}</option>--%>
<%--                       </c:forEach>--%>
<%--                   </select>--%>
<%--                    岗位--%>
<%--                    <select name="postid">--%>
<%--                        <option value="0">请选择</option>--%>
<%--                        <c:forEach var="postinfo" items="${postinfos}">--%>
<%--                            <option value="${postinfo.postid}">${postinfo.postname}</option>--%>
<%--                        </c:forEach>--%>
<%--                    </select>--%>
<%--                </div>--%>
<%--                科室和岗位的二级联动--%>
                <tr>
                    <td >科室</td>
                    <td>
                        <select name="deptid" id="dept" onchange="selectPost()">
                            <option value="0">请选择</option>
                            <c:forEach items="${deptinfos}" var="deptinfo">
                                <c:if test="${deptinfo.deptid!=12}">
                                    <option value="${deptinfo.deptid}">${deptinfo.deptname}</option>
                                </c:if>
                            </c:forEach>
                        </select>
                    </td>
                </tr>
                <tr>
                    <td align="right">岗位</td>
                    <td>
                        <select id="postinfos" name="postid"></select>
                    </td>
                </tr>



                <div class="form-group has-feedback">
                    <input type="password" name="password1" class="form-control" placeholder="密码">
                    <span class="glyphicon glyphicon-lock form-control-feedback"></span>
                </div>
                <div class="form-group has-feedback">
                    <input type="password" name="password2" class="form-control" placeholder="确认密码">
                    <span class="glyphicon glyphicon-log-in form-control-feedback"></span>
                </div>
                <div class="row">
                    <div class="col-xs-8">
                        <div class="checkbox icheck">
                            <label>
              <input type="checkbox"> 我同意 <a href="#">协议</a>
            </label>
                        </div>
                    </div>
                    <!-- /.col -->
                    <div class="col-xs-4">
                        <button type="submit" class="btn btn-primary btn-block btn-flat" >注册</button>
                    </div>
                    <!-- /.col -->
                </div>
            </form>


            <div class="social-auth-links text-center">
                <p>- 或者 -</p>
                <a href="#" class="btn btn-block btn-social btn-facebook btn-flat"><i class="fa fa-qq"></i> 腾讯QQ用户登录</a>
                <a href="#" class="btn btn-block btn-social btn-google btn-flat"><i class="fa fa-weixin"></i> 微信用户登录</a>
            </div>

            <a href="sickerLogin.jsp" class="text-center">我有账号，现在就去登录</a>
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
    <script>
        function selectPost() {
            $.get("http://localhost:8080/getPostinfo","deptid="+$("#dept").val(),function (data){
                var jsonData=eval("("+data+")")
                var s = ''
                if (jsonData.length != 0) {
                    for (var i = 0; i < jsonData.length; i++) {
                        $("#postinfos").children().remove();
                        s += "<option value='" +
                            jsonData[i].postid +
                            "'>" +
                            jsonData[i].postname +
                            "</option>"
                    }
                    $("#postinfos").append(s)
                } else {
                    $("#postinfos").children().remove();
                }
            })
        }
    </script>
</body>

</html>