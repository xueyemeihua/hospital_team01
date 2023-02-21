<!DOCTYPE html>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>

    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">


    <title>doctor</title>
    <meta name="description" content="AdminLTE2定制版">
    <meta name="keywords" content="AdminLTE2定制版">


    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.6 -->
    <!-- Font Awesome -->
    <!-- Ionicons -->
    <!-- iCheck -->
    <!-- Morris chart -->
    <!-- jvectormap -->
    <!-- Date Picker -->
    <!-- Daterange picker -->
    <!-- Bootstrap time Picker -->
    <!--<link rel="stylesheet" href="../../../plugins/timepicker/bootstrap-timepicker.min.css">-->
    <!-- bootstrap wysihtml5 - text editor -->
    <!--数据表格-->
    <!-- 表格树 -->
    <!-- select2 -->
    <!-- Bootstrap Color Picker -->
    <!-- bootstrap wysihtml5 - text editor -->
    <!--bootstrap-markdown-->
    <!-- Theme style -->
    <!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
    <!-- Ion Slider -->
    <!-- ion slider Nice -->
    <!-- bootstrap slider -->
    <!-- bootstrap-datetimepicker -->

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->


    <!-- jQuery 2.2.3 -->
    <!-- jQuery UI 1.11.4 -->
    <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
    <!-- Bootstrap 3.3.6 -->
    <!-- Morris.js charts -->
    <!-- Sparkline -->
    <!-- jvectormap -->
    <!-- jQuery Knob Chart -->
    <!-- daterangepicker -->
    <!-- datepicker -->
    <!-- Bootstrap WYSIHTML5 -->
    <!-- Slimscroll -->
    <!-- FastClick -->
    <!-- iCheck -->
    <!-- AdminLTE App -->
    <!-- 表格树 -->
    <!-- select2 -->
    <!-- bootstrap color picker -->
    <!-- bootstrap time picker -->
    <!--<script src="../../../plugins/timepicker/bootstrap-timepicker.min.js"></script>-->
    <!-- Bootstrap WYSIHTML5 -->
    <!--bootstrap-markdown-->
    <!-- CK Editor -->
    <!-- InputMask -->
    <!-- DataTables -->
    <!-- ChartJS 1.0.1 -->
    <!-- FLOT CHARTS -->
    <!-- FLOT RESIZE PLUGIN - allows the chart to redraw when the window is resized -->
    <!-- FLOT PIE PLUGIN - also used to draw donut charts -->
    <!-- FLOT CATEGORIES PLUGIN - Used to draw bar charts -->
    <!-- jQuery Knob -->
    <!-- Sparkline -->
    <!-- Morris.js charts -->
    <!-- Ion Slider -->
    <!-- Bootstrap slider -->
    <!-- bootstrap-datetimepicker -->
    <!-- 页面meta /-->

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

    <!-- 页面头部 -->
    <header class="main-header">


        <!-- Logo -->
        <a href="all-admin-index.html" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>数据</b></span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>医生</b></span>
        </a>

    </header>
    <!-- 页面头部 /-->

    <!-- 导航侧栏 -->
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="../img/user2-160x160.jpg" class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p>${loginUser.stafname}</p>
                </div>
            </div>

            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu">
                <li class="header">菜单</li>

                <li id="admin-index"><a href="all-admin-index.html"><i class="fa fa-dashboard"></i> <span>首页</span></a>
                </li>

                <!-- 菜单 -->

                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-folder"></i> <span>功能</span>
                        <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                    </a>
                    <ul class="treeview-menu">

                        <li id="admin-login">
                            <a href="/toDoctorManager">
                                <i class="fa fa-circle-o"></i> 病人列表
                            </a>
                        </li>

                        <li id="admin-register">
                            <a href="all-admin-register.html">
                                <i class="fa fa-circle-o"></i> 注册
                            </a>
                        </li>

                        <li id="admin-404">
                            <a href="all-admin-404.html">
                                <i class="fa fa-circle-o"></i> 404页
                            </a>
                        </li>

                        <li id="admin-500">
                            <a href="all-admin-500.html">
                                <i class="fa fa-circle-o"></i> 500页
                            </a>
                        </li>

                    </ul>
                </li>
            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>
    <!-- 导航侧栏 /-->

    <!-- 内容区域 -->
    <div class="content-wrapper">

        <!-- 内容头部 -->
        <section class="content-header">
            <h1>
                病人管理
                <small></small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="all-admin-index.html"><i class="fa fa-dashboard"></i> 首页</a></li>
            </ol>
        </section>
        <!-- 内容头部 /-->

        <!-- 正文区域 -->
        <section class="content">
            <div align="center">
                <h2>病人列表</h2>
            </div>
            <div align="center">
                <table border="1px" cellpadding="0px" cellspacing="0px">
                    <tr align="center">
                        <th align="center">挂号编号</th>
                        <th align="center" width="150px">挂号日期</th>
                        <th align="center">挂号等级</th>
                        <th align="center">挂号费</th>
                        <th align="center">病人编号</th>
                        <th align="center">病人姓名</th>
                        <th align="center" width="150px">病人电话</th>
                        <th align="center" width="150px">病人身份证</th>
                        <th align="center">病人账户名</th>
                        <th align="center" width="150px">邮箱</th>
                        <th align="center" width="150px">操作</th>
                    </tr>
                    <c:forEach items="${regResults}" var="srr">
                        <tr>
                            <td align="center">${srr.regid}</td>
                            <td align="center">${srr.date}</td>
                            <td align="center">${srr.regdesc}</td>
                            <td align="center">${srr.regfee}</td>
                            <td align="center">${srr.sickid}</td>
                            <td align="center">${srr.sickname}</td>
                            <td align="center">${srr.sickphone}</td>
                            <td align="center">${srr.sickcard}</td>
                            <td align="center">${srr.sickuname}</td>
                            <td align="center">${srr.sickemail}</td>
                            <td align="center">
                                <a href="javascript:void (0)"
                                   onclick="getCaseForDoctor(${srr.regid},${srr.sickid})"
                                >查看病例
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                </table>
            </div>

            <div align="center">
                <h2>病例列表</h2>
            </div>
            <div align="center">
                <table border="1px" cellpadding="0px" cellspacing="0px" id="casetb">

                </table>
                <p id="caseList"></p>
            </div>

            <div align="center" id="cureform" hidden="true">
                <h2>诊断信息填写</h2>
                <form action="/cure" method="get">
                    <input id="curecaseid" name="caseid"><br>
                    <input name='diagnosis' placeholder='诊断结果'><br>
                    <input name='curescheme' placeholder='治疗方案'><br>
                    <input type='submit' value='提交'>
                </form>
            </div>

            <div align="center" id='drugtb'>

            </div>
        </section>
        <!-- 正文区域 /-->
    </div>
    <!-- 内容区域 /-->
</div>

<script>

    /*根据病人编号,挂号编号和医生编号(登录信息中获取)查询该医生名下该病人的病例信息*/
    function getCaseForDoctor(regid, sickid) {
        $.get("http://localhost:8080/getCaSeByStafidAndSickidAndRegid", "regid=" + regid + "&sickid=" + sickid, function (data) {
            $("#cureform").attr("hidden",true)
            var jdata = JSON.parse(data)
            var s = ''
            if (jdata.length == 0) {
                $("#casetb").children().remove()
                $("#drugtb").children().remove()
                $("#caseList").html("没有数据")
            } else {
                $("#caseList").html("")
                $("#drugtb").children().remove()
                for (let i = 0; i < jdata.length; i++) {
                    $("#casetb").children().remove()
                    $("#casetb").append("<tr><th align='center' >病例编号</th><th align='center' width='150px'>诊断结果</th><th align='center' width='150px'>治疗方案</th><th align='center'>病例状态</th>" +
                        "<th align='center' width='150px'>诊断时间</th><th align='center' hidden>医生编号</th><th align='center' hidden>病人编号</th><th align='center' width='150px'>操作</th></tr>")

                    s += "<tr>" +
                        "<td align='center' >" + jdata[i].caseid + "</td>" +
                        "<td align='center' width='150px'>" + jdata[i].diagnosis + "</td>" +
                        "<td align='center' width='150px'>" + jdata[i].curescheme + "</td>" +
                        "<td align='center'>" + jdata[i].casestate + "</td>" +
                        "<td align='center' width='150px'>" + jdata[i].curetime + "</td>" +
                        "<td align='center' hidden>" + jdata[i].stafid + "</td>" +
                        "<td align='center' hidden>" + jdata[i].sickid + "</td>" +
                        "<td align='center' width='150px'>" +
                        "<a href='javascript:void (0)' onclick='cure(" + jdata[i].caseid+","+jdata[i].casestate +
                            ")'>诊断</a><br>" +
                        "<a href='javascript:void (0)' onclick='toPrescribe(" + jdata[i].caseid + ")'>开处方单</a><br>" +
                        "<a href='javascript:void (0)' onclick='showPresic(" + jdata[i].caseid + ")'>查看处方单</a>" +
                        "</td></tr>"
                }
                $("#casetb").append(s)
            }
        })
    }
</script>


<script>
    /*诊断信息填写*/
    function cure(caseid,casestate) {
        if (casestate==0){
            $("#drugtb").children().remove()
            $("#cureform").attr("hidden",false)
            $("#curecaseid").val(caseid)
            $("#curecaseid").attr("hidden",false)
        } else {
            alert("病例已诊断")
        }


    }
</script>

<script>
    /*开处方单*/
    function toPrescribe(caseid) {
        $.get("http://localhost:8080/getDrugs", "caseid=" + caseid, function (data) {
            $("#cureform").attr("hidden",true)
            var jdata = JSON.parse(data)
            var s = ''
            if (jdata.length == 0) {
                $("#drugtb").children().remove()

                $("#durgList").html("没有数据")
            } else {

                $("#drugList").html("")
                $("#drugtb").children().remove()

                s = "<div align='center'> <h2>药品表</h2> </div>" +
                    "<form action='/advsDrug'><div> <input name='drugname' placeholder='模糊药品名'><br><input name='drugfunc' placeholder='模糊药品功能'><br><input type='submit' value='查询'></div>" +
                    "<table border='1px' cellpadding='0px' cellspacing='0px'><tr><th align='center'>药品编号</th><th align='center' width='150px'>药品名称</th><th align='center' width='150px'>药品功能</th><th align='center'>药品规格</th><th align='center' width='150px'>操作</th></tr>"

                for (let i = 0; i < jdata.length; i++) {
                    var drugcout = 'dcout' + i
                    s +=
                        "<tr>" +
                        "<td align='center'>" + jdata[i].drugid + "</td>" +
                        "<td align='center' width='150px'>" + jdata[i].drugname + "</td>" +
                        "<td align='center' width='150px'>" + jdata[i].drugfunc + "</td>" +
                        "<td align='center' width='150px'>" + jdata[i].drugspeci + "</td>" +
                        "<td align='center' width='150px'>" +
                        "<input type='number' id='dcout" + i + "' name='dcout' placeholder='开药数量'><br>" +
                        "<a href='javascript:void (0)' onclick='addDrugToPresc(" + jdata[i].drugid + "," + caseid + "," + drugcout + ")'>开药</a><br>" +
                        "</td></tr>"
                }
                s += "</table><p id='drugList'></p>"
                $("#drugtb").append(s)
            }
        })
    }
</script>

<script>
    /*医生开药方*/
    function addDrugToPresc(drugid, caseid, drugcout) {

        $.get("http://localhost:8080/addDrugToPresc", "drugid=" + drugid + "&caseid=" + caseid + "&dcout=" + drugcout.value, function
            (data) {
            if (data == 1) {
                alert("开药成功")
            } else {
                alert("开药失败")
            }
        })
    }
</script>

<script>

    /*查看处方单*/
    function showPresic(caseid) {
        $.get("http://localhost:8080/showPresic", "caseid=" + caseid, function (data) {
            $("#cureform").attr("hidden",true)
            var jdata = JSON.parse(data)
            var s = ''
            if (jdata.length == 0) {

                $("#drugtb").children().remove()
                $("#durgList").html("没有数据")
            } else {

                $("#drugList").html("")
                $("#drugtb").children().remove()
                s = "<div align='center'> <h2>处方单</h2> </div>" +
                    "<table border='1px' cellpadding='0px' cellspacing='0px'>" +
                    "<tr><th align='center' hidden>病例编号</th><th align='center' hidden>处方单序号</th><th align='center'>药品名称</th><th align='center'>药品数量</th><th align='center'>药品价格</th><th align='center'>药品规格</th><th align='center'>抓药状态</th></tr>"

                for (let i = 0; i < jdata.length; i++) {
                    s += "<tr>" +
                        "<td align='center' hidden>" + jdata[i].caseid + "</td>" +
                        "<td align='center' hidden>" + jdata[i].prescid + "</td>" +
                        "<td align='center' width='150px'>" + jdata[i].drugname + "</td>" +
                        "<td align='center' width='150px'>" + jdata[i].drugcount + "</td>" +
                        "<td align='center' width='150px'>" + jdata[i].drugprice + "</td>" +
                        "<td align='center' width='150px'>" + jdata[i].drugspeci + "</td>" +
                        "<td align='center' width='150px'>" + jdata[i].prescstate + "</td>" +
                        "</td></tr>"
                }
                s += "</table>"
                $("#drugtb").append(s)
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


    $(document).ready(function () {
        // 激活导航位置
        setSidebarActive("admin-index");
    });
</script>
</body>

</html>
<!---->