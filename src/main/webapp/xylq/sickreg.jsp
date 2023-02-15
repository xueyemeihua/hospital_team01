<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>用户挂号</title>
    <meta name="description" content="AdminLTE2定制版">
    <meta name="keywords" content="AdminLTE2定制版">
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" href="../plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="../plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet" href="../plugins/iCheck/square/blue.css">
    <link rel="stylesheet" href="../plugins/morris/morris.css">
    <link rel="stylesheet" href="../plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet" href="../plugins/datepicker/datepicker3.css">
    <link rel="stylesheet" href="../plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet" href="../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet" href="../plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet" href="../plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet" href="../plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet" href="../plugins/select2/select2.css">
    <link rel="stylesheet" href="../plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet" href="../plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet" href="../plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet" href="../plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet" href="../plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet" href="../plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet" href="../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
</head>

<body class="hold-transition skin-purple sidebar-mini">

<div class="wrapper">

    <div align="center">
        <h2 style="color: white">用户挂号</h2>
    </div>
    <!-- 内容区域 -->
    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper" align="center">

        <!-- Main content -->
        <section class="content">
            <div class="row">
                <!-- left column -->
                <div class="col-md-6">
                    <!-- general form elements -->
                    <div align="center">
                        <form action="/sickReg" method="get">
                            <table>
                                <tr>
                                    <td align="right">姓名*</td>
                                    <td><input type="text" name="sickname"></td>
                                </tr>
                                <tr>
                                    <td align="right">身份证*</td>
                                    <td><input type="text" name="sickcard"></td>
                                </tr>
                                <tr>
                                    <td align="right">电话*</td>
                                    <td><input type="text" name="sickphone"></td>
                                </tr>
                                <tr>
                                    <td align="right">邮箱</td>
                                    <td><input type="text" name="sickemail"></td>
                                </tr>
                                <tr>
                                    <td align="right">密码</td>
                                    <td><input type="text" name="sickpwd"></td>
                                </tr>
                                <tr>
                                    <td align="right">再次输入密码</td>
                                    <td><input type="text" name="sickpwd1"></td>
                                </tr>
                                <tr>
                                    <td align="right">日期</td>
                                    <td>
                                        <select name="weeknum" id="weeknum" onchange="selectDoctor()">
                                            <option value="1">周一</option>
                                            <option value="2">周二</option>
                                            <option value="3">周三</option>
                                            <option value="4">周四</option>
                                            <option value="5">周五</option>
                                            <option value="6">周六</option>
                                            <option value="7">周日</option>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="right">科室</td>
                                    <td>
                                        <select name="deptid" id="dept" onchange="selectDoctor()">
                                            <option value="0">请选择</option>
                                            <c:forEach items="${depts}" var="dept">
                                                <c:if test="${dept.deptid!=12}">
                                                    <option value="${dept.deptid}">${dept.deptname}</option>
                                                </c:if>
                                            </c:forEach>
                                        </select>
                                    </td>
                                </tr>
                                <tr>
                                    <td align="right">医生</td>
                                    <td>
                                        <select id="doctors" name="stafid"></select>
                                    </td>
                                </tr>
                            </table>
                            <input type="submit" value="提交">
                        </form>
                    </div>

                    <script>
                        function selectDoctor() {
                            $.get("http://localhost:8080/selectDoctor", "deptid=" + $("#dept").val()+"&weeknum="+$("#weeknum").val(), function (data) {
                                var jsonData = eval("(" + data + ")")
                                var s = ''
                                if (jsonData.length != 0) {
                                    for (let i = 0; i < jsonData.length; i++) {
                                        $("#doctors").children().remove();
                                        s += "<option value='" +
                                            jsonData[i].stafid +
                                            "'>" +
                                            jsonData[i].stafname +
                                            "</option>"
                                    }
                                    $("#doctors").append(s)
                                } else {
                                    $("#doctors").children().remove();
                                }
                            })
                        }
                    </script>

                    <script src="../plugins/jQuery/jquery-2.2.3.min.js"></script>
                    <script src="../plugins/jQueryUI/jquery-ui.min.js"></script>
                    <script>
                        $.widget.bridge('uibutton', $.ui.button);
                    </script>
                    <script src="../plugins/bootstrap/js/bootstrap.min.js"></script>
                    <script src="../plugins/raphael/raphael-min.js"></script>
                    <script src="../plugins/morris/morris.min.js"></script>
                    <script src="../plugins/sparkline/jquery.sparkline.min.js"></script>
                    <script src="../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
                    <script src="../plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
                    <script src="../plugins/knob/jquery.knob.js"></script>
                    <script src="../plugins/daterangepicker/moment.min.js"></script>
                    <script src="../plugins/daterangepicker/daterangepicker.js"></script>
                    <script src="../plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
                    <script src="../plugins/datepicker/bootstrap-datepicker.js"></script>
                    <script src="../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
                    <script src="../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
                    <script src="../plugins/slimScroll/jquery.slimscroll.min.js"></script>
                    <script src="../plugins/fastclick/fastclick.js"></script>
                    <script src="../plugins/iCheck/icheck.min.js"></script>
                    <script src="../plugins/adminLTE/js/app.min.js"></script>
                    <script src="../plugins/treeTable/jquery.treetable.js"></script>
                    <script src="../plugins/select2/select2.full.min.js"></script>
                    <script src="../plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
                    <script src="../plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
                    <script src="../plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
                    <script src="../plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
                    <script src="../plugins/bootstrap-markdown/js/markdown.js"></script>
                    <script src="../plugins/bootstrap-markdown/js/to-markdown.js"></script>
                    <script src="../plugins/ckeditor/ckeditor.js"></script>
                    <script src="../plugins/input-mask/jquery.inputmask.js"></script>
                    <script src="../plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
                    <script src="../plugins/input-mask/jquery.inputmask.extensions.js"></script>
                    <script src="../plugins/datatables/jquery.dataTables.min.js"></script>
                    <script src="../plugins/datatables/dataTables.bootstrap.min.js"></script>
                    <script src="../plugins/chartjs/Chart.min.js"></script>
                    <script src="../plugins/flot/jquery.flot.min.js"></script>
                    <script src="../plugins/flot/jquery.flot.resize.min.js"></script>
                    <script src="../plugins/flot/jquery.flot.pie.min.js"></script>
                    <script src="../plugins/flot/jquery.flot.categories.min.js"></script>
                    <script src="../plugins/ionslider/ion.rangeSlider.min.js"></script>
                    <script src="../plugins/bootstrap-slider/bootstrap-slider.js"></script>
                    <script src="../plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
                    <script src="../plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>
                    <script>
                        $(document).ready(function () {
                            // 选择框
                            $(".select2").select2();

                            // WYSIHTML5编辑器
                            $(".textarea").wysihtml5({
                                locale: 'zh-CN'
                            });
                        });


                        // 设置激活菜单
                        function setSidebarActive(tagUri) {
                            var liObj = $("#" + tagUri);
                            if (liObj.length > 0) {
                                liObj.parent().parent().addClass("active");
                                liObj.addClass("active");
                            }
                        }


                        // 激活导航位置
                        setSidebarActive("form-general");
                    </script>
                </div>
            </div>
        </section>
    </div>
</div>

</body>

</html>