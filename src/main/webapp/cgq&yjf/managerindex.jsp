<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>

    <%@page contentType="text/html; charset=UTF-8" isELIgnored="false" language="java" %>


    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">


    <title>超级管理员</title>
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
            <span class="logo-lg"><b>数据</b>后台管理</span>
        </a>


        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                <span class="sr-only">Toggle navigation</span>
            </a>

            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- Messages: style can be found in dropdown.less-->
                    <li class="dropdown messages-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="fa fa-envelope-o"></i>
                            <span class="label label-success">4</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="header">你有4个邮件</li>
                            <li>
                                <!-- inner menu: contains the actual data -->
                                <ul class="menu">
                                    <li>
                                        <!-- start message -->
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="../img/user2-160x160.jpg" class="img-circle" alt="User Image">
                                            </div>
                                            <h4>
                                                系统消息
                                                <small><i class="fa fa-clock-o"></i> 5 分钟前</small>
                                            </h4>
                                            <p>欢迎登录系统?</p>
                                        </a>
                                    </li>
                                    <!-- end message -->
                                    <li>
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="../img/user3-128x128.jpg" class="img-circle" alt="User Image">
                                            </div>
                                            <h4>
                                                团队消息
                                                <small><i class="fa fa-clock-o"></i> 2 小时前</small>
                                            </h4>
                                            <p>你有新的任务了</p>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="../img/user4-128x128.jpg" class="img-circle" alt="User Image">
                                            </div>
                                            <h4>
                                                Developers
                                                <small><i class="fa fa-clock-o"></i> Today</small>
                                            </h4>
                                            <p>Why not buy a new awesome theme?</p>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="../img/user3-128x128.jpg" class="img-circle" alt="User Image">
                                            </div>
                                            <h4>
                                                Sales Department
                                                <small><i class="fa fa-clock-o"></i> Yesterday</small>
                                            </h4>
                                            <p>Why not buy a new awesome theme?</p>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <div class="pull-left">
                                                <img src="../img/user4-128x128.jpg" class="img-circle" alt="User Image">
                                            </div>
                                            <h4>
                                                Reviewers
                                                <small><i class="fa fa-clock-o"></i> 2 days</small>
                                            </h4>
                                            <p>Why not buy a new awesome theme?</p>
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="footer"><a href="#">See All Messages</a></li>
                        </ul>
                    </li>
                    <!-- Notifications: style can be found in dropdown.less -->
                    <li class="dropdown notifications-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="fa fa-bell-o"></i>
                            <span class="label label-warning">10</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="header">你有10个新消息</li>
                            <li>
                                <!-- inner menu: contains the actual data -->
                                <ul class="menu">
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-users text-aqua"></i> 5 new members joined today
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-warning text-yellow"></i> Very long description here that
                                            may not
                                            fit into the page and may cause design problems
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-users text-red"></i> 5 new members joined
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-shopping-cart text-green"></i> 25 sales made
                                        </a>
                                    </li>
                                    <li>
                                        <a href="#">
                                            <i class="fa fa-user text-red"></i> You changed your username
                                        </a>
                                    </li>
                                </ul>
                            </li>
                            <li class="footer"><a href="#">View all</a></li>
                        </ul>
                    </li>
                    <!-- Tasks: style can be found in dropdown.less -->
                    <li class="dropdown tasks-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="fa fa-flag-o"></i>
                            <span class="label label-danger">9</span>
                        </a>
                        <ul class="dropdown-menu">
                            <li class="header">你有9个新任务</li>
                            <li>
                                <!-- inner menu: contains the actual data -->
                                <ul class="menu">
                                    <li>
                                        <!-- Task item -->
                                        <a href="#">
                                            <h3>
                                                Design some buttons
                                                <small class="pull-right">20%</small>
                                            </h3>
                                            <div class="progress xs">
                                                <div class="progress-bar progress-bar-aqua" style="width: 20%"
                                                     role="progressbar" aria-valuenow="20" aria-valuemin="0"
                                                     aria-valuemax="100">
                                                    <span class="sr-only">20% Complete</span>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <!-- end task item -->
                                    <li>
                                        <!-- Task item -->
                                        <a href="#">
                                            <h3>
                                                Create a nice theme
                                                <small class="pull-right">40%</small>
                                            </h3>
                                            <div class="progress xs">
                                                <div class="progress-bar progress-bar-green" style="width: 40%"
                                                     role="progressbar" aria-valuenow="20" aria-valuemin="0"
                                                     aria-valuemax="100">
                                                    <span class="sr-only">40% Complete</span>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <!-- end task item -->
                                    <li>
                                        <!-- Task item -->
                                        <a href="#">
                                            <h3>
                                                Some task I need to do
                                                <small class="pull-right">60%</small>
                                            </h3>
                                            <div class="progress xs">
                                                <div class="progress-bar progress-bar-red" style="width: 60%"
                                                     role="progressbar" aria-valuenow="20" aria-valuemin="0"
                                                     aria-valuemax="100">
                                                    <span class="sr-only">60% Complete</span>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <!-- end task item -->
                                    <li>
                                        <!-- Task item -->
                                        <a href="#">
                                            <h3>
                                                Make beautiful transitions
                                                <small class="pull-right">80%</small>
                                            </h3>
                                            <div class="progress xs">
                                                <div class="progress-bar progress-bar-yellow" style="width: 80%"
                                                     role="progressbar" aria-valuenow="20" aria-valuemin="0"
                                                     aria-valuemax="100">
                                                    <span class="sr-only">80% Complete</span>
                                                </div>
                                            </div>
                                        </a>
                                    </li>
                                    <!-- end task item -->
                                </ul>
                            </li>
                            <li class="footer">
                                <a href="#">View all tasks</a>
                            </li>
                        </ul>
                    </li>
                    <!-- User Account: style can be found in dropdown.less -->
                    <li class="dropdown user user-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img src="../img/user2-160x160.jpg" class="user-image" alt="User Image">
                            <span class="hidden-xs">张猿猿</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- User image -->
                            <li class="user-header">
                                <img src="../img/user2-160x160.jpg" class="img-circle" alt="User Image">

                                <p>
                                    张猿猿 - 数据管理员
                                    <small>最后登录 11:20AM</small>
                                </p>
                            </li>
                            <!-- Menu Body
                    <li class="user-body">
                        <div class="row">
                            <div class="col-xs-4 text-center">
                                <a href="#">Followers</a>
                            </div>
                            <div class="col-xs-4 text-center">
                                <a href="#">Sales</a>
                            </div>
                            <div class="col-xs-4 text-center">
                                <a href="#">Friends</a>
                            </div>
                        </div>
                    </li>-->
                            <!-- Menu Footer-->
                            <li class="user-footer">
                                <div class="pull-left">
                                    <a href="#" class="btn btn-default btn-flat">修改密码</a>
                                </div>
                                <div class="pull-right">
                                    <a href="#" class="btn btn-default btn-flat">注销</a>
                                </div>
                            </li>
                        </ul>
                    </li>

                </ul>
            </div>
        </nav>
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
                    <p>张猿猿</p>
                    <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
                </div>
            </div>
            <!-- search form -->
            <!--<form action="#" method="get" class="sidebar-form">
        <div class="input-group">
            <input type="text" name="q" class="form-control" placeholder="搜索...">
            <span class="input-group-btn">
            <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
            </button>
          </span>
        </div>
      </form>-->
            <!-- /.search form -->


            <!-- sidebar menu: : style can be found in sidebar.less -->

            <%--引入菜单管理页面--%>
            <jsp:include page="/cgq&yjf/manager_left_menu.jsp"/>

        </section>
        <!-- /.sidebar -->
    </aside>
    <!-- 导航侧栏 /-->

    <!-- 内容区域 -->
    <!-- @@master = admin-layout.html-->
    <!-- @@block = content -->

    <%--  <div class="content-wrapper">--%>

    <!-- 内容头部 -->
    <%--    <section class="content-header">--%>
    <%--&lt;%&ndash;      <h1>&ndash;%&gt;--%>
    <%--&lt;%&ndash;        数据管理&ndash;%&gt;--%>
    <%--&lt;%&ndash;        <small>数据列表</small>&ndash;%&gt;--%>
    <%--&lt;%&ndash;      </h1>&ndash;%&gt;--%>
    <%--&lt;%&ndash;      <ol class="breadcrumb">&ndash;%&gt;--%>
    <%--&lt;%&ndash;        <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>&ndash;%&gt;--%>
    <%--&lt;%&ndash;        <li><a href="#">数据管理</a></li>&ndash;%&gt;--%>
    <%--&lt;%&ndash;        <li class="active">数据列表</li>&ndash;%&gt;--%>
    <%--&lt;%&ndash;      </ol>&ndash;%&gt;--%>
    <%--    </section>--%>
    <!-- 内容头部 /-->

    <!-- 正文区域 -->
    <section class="content">

        <div class="wrapper">

            <!-- 页面头部 -->

            <!-- 页面头部 /-->


            <!-- 导航侧栏 /-->

            <!-- 内容区域 -->
            <!-- Content Wrapper. Contains page content -->
            <div class="content-wrapper">
                <!-- Content Header (Page header) -->
                <section class="content-header">
                    <h1>
                        ChartJS
                        <small>Preview sample</small>
                    </h1>
                    <ol class="breadcrumb">
                        <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                        <li><a href="#">Charts</a></li>
                        <li class="active">ChartJS</li>
                    </ol>
                </section>

                <!-- Main content -->
                <section class="content">
                    <div class="row">

                        <%--热销的8大药品--%>
                        <div class="col-md-6">
                            <div class="box box-danger">
                                <div class="box-header with-border">
                                    <h3 class="box-title">热销的8大药品</h3>

                                    <div class="box-tools pull-right">
                                        <button type="button" class="btn btn-box-tool" data-widget="collapse"><i
                                                class="fa fa-minus"></i>
                                        </button>
                                        <button type="button" class="btn btn-box-tool" data-widget="remove"><i
                                                class="fa fa-times"></i></button>
                                    </div>
                                </div>
                                <div class="box-body">
                                    <canvas id="pieChart" style="height:250px"></canvas>
                                </div>
                                <!-- /.box-body -->
                            </div>
                        </div>


                        <%--接诊最多的8各部门--%>
                        <div class="col-md-6">
                            <div class="box box-danger">
                                <div class="box-header with-border">
                                    <h3 class="box-title">接诊最多的8个部门</h3>

                                    <div class="box-tools pull-right">
                                        <button type="button" class="btn btn-box-tool" data-widget="collapse"><i
                                                class="fa fa-minus"></i>
                                        </button>
                                        <button type="button" class="btn btn-box-tool" data-widget="remove"><i
                                                class="fa fa-times"></i></button>
                                    </div>
                                </div>
                                <div class="box-body">
                                    <canvas id="pieChart2" style="height:250px"></canvas>
                                </div>
                                <!-- /.box-body -->
                            </div>
                        </div>

                        <%--接诊最多的8个医生--%>
<%--                        <div class="col-md-6">--%>
<%--                            <div class="box box-danger">--%>
<%--                                <div class="box-header with-border">--%>
<%--                                    <h3 class="box-title">接诊最多的8个医生(按部门分组)</h3>--%>

<%--                                    <div class="box-tools pull-right">--%>
<%--                                        <button type="button" class="btn btn-box-tool" data-widget="collapse"><i--%>
<%--                                                class="fa fa-minus"></i>--%>
<%--                                        </button>--%>
<%--                                        <button type="button" class="btn btn-box-tool" data-widget="remove"><i--%>
<%--                                                class="fa fa-times"></i></button>--%>
<%--                                    </div>--%>
<%--                                </div>--%>
<%--                                <div class="box-body">--%>
<%--                                    <canvas id="pieChart3" style="height:250px"></canvas>--%>
<%--                                </div>--%>
<%--                                <!-- /.box-body -->--%>
<%--                            </div>--%>
<%--                        </div>--%>

                    </div>
                    <!-- /.row -->

                </section>
                <!-- /.content -->
            </div>
            <!-- /.content-wrapper -->


            <!-- page script -->
            <!-- 内容区域 /-->

        </div>

    </section>
    <!-- 正文区域 /-->

    <%--  </div>--%>
    <!-- @@close -->
    <!-- 内容区域 /-->


</div>

<%--热销8种药品--%>
<div hidden>
    <c:forEach items="${hotDrug}" var="hd">
        <div id="name${hd.index}">${hd.drugname}</div>
        <div id="num${hd.index}">${hd.drugnum}</div>
    </c:forEach>
</div>


<%--接诊病例最高的8个部门--%>
<div hidden>
    <c:forEach items="${mostcasenumbydept}" var="mcd">
        <div id="mcdname${mcd.index}">${mcd.deptname}</div>
        <div id="mcdnum${mcd.index}">${mcd.casenum}</div>
    </c:forEach>
</div>

<%--接诊病例最高的8个医生--%>
<%--<div hidden>--%>
<%--    <c:forEach items="${mostCase}" var="mcndd">--%>
<%--        <div id="mcdn${mcndd.index}">${mcndd.mcdn}</div>--%>
<%--        <div id="mccn${mcndd.index}">${mcndd.mccn}</div>--%>
<%--    </c:forEach>--%>
<%--</div>--%>


<%--每个科室的医生人数--%>
<%--<div hidden>--%>
<%--  <c:forEach items="${doctorNumByDept}" var="dnbd">--%>
<%--    <div id="name${dnbd.mostcasenur}">${dnbd.stafname}</div>--%>
<%--    <div id="num${dnbd.mostcasenur}">${dnbd.stafname}</div>--%>
<%--  </c:forEach>--%>
<%--</div>--%>


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
        setSidebarActive("admin-datalist");

        // 列表按钮
        $("#dataList td input[type='checkbox']").iCheck({
            checkboxClass: 'icheckbox_square-blue',
            increaseArea: '20%'
        });
        // 全选操作
        $("#selall").click(function () {
            var clicks = $(this).is(':checked');
            if (!clicks) {
                $("#dataList td input[type='checkbox']").iCheck("uncheck");
            } else {
                $("#dataList td input[type='checkbox']").iCheck("check");
            }
            $(this).data("clicks", !clicks);
        });
    });

    $(function () {
        /* ChartJS
         * -------
         * Here we will create a few charts using ChartJS
         */


        //-------------
        //- PIE CHART (饼图)-
        //-------------
        // Get context with jQuery - using jQuery's .get() method.
        var pieChartCanvas = $("#pieChart").get(0).getContext("2d");
        var pieChart = new Chart(pieChartCanvas);
        var PieData = [{
            value: $("#num0").text(),
            color: "#f56954",
            highlight: "#f56954",
            label: $("#name0").text()
        },
            {
                value: $("#num1").text(),
                color: "#00a65a",
                highlight: "#00a65a",
                label: $("#name1").text()
            },
            {
                value: $("#num2").text(),
                color: "#f39c12",
                highlight: "#f39c12",
                label: $("#name2").text()
            },
            {
                value: $("#num3").text(),
                color: "#00c0ef",
                highlight: "#00c0ef",
                label: $("#name3").text()
            },
            {
                value: $("#num4").text(),
                color: "#3c8dbc",
                highlight: "#3c8dbc",
                label: $("#name4").text()
            },
            {
                value: $("#num5").text(),
                color: "#d2d6de",
                highlight: "#d2d6de",
                label: $("#name5").text()
            },
            {
                value: $("#num6").text(),
                color: "#a0c69d",
                highlight: "#a0c69d",
                label: $("#name6").text()
            },
            {
                value: $("#num7").text(),
                color: "#bcc45c",
                highlight: "#bcc45c",
                label: $("#name7").text()
            }
        ];
        var pieOptions = {
            //Boolean - Whether we should show a stroke on each segment
            segmentShowStroke: true,
            //String - The colour of each segment stroke
            segmentStrokeColor: "#fff",
            //Number - The width of each segment stroke
            segmentStrokeWidth: 2,
            //Number - The percentage of the chart that we cut out of the middle
            percentageInnerCutout: 50, // This is 0 for Pie charts
            //Number - Amount of animation steps
            animationSteps: 100,
            //String - Animation easing effect
            animationEasing: "easeOutBounce",
            //Boolean - Whether we animate the rotation of the Doughnut
            animateRotate: true,
            //Boolean - Whether we animate scaling the Doughnut from the centre
            animateScale: false,
            //Boolean - whether to make the chart responsive to window resizing
            responsive: true,
            // Boolean - whether to maintain the starting aspect ratio or not when responsive, if set to false, will take up entire container
            maintainAspectRatio: true,
            //String - A legend template
            <%--legendTemplate: "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<segments.length; i++){%><li><span style=\"background-color:<%=segments[i].fillColor%>\"></span><%if(segments[i].label){%><%=segments[i].label%><%}%></li><%}%></ul>"--%>
        };
        //Create pie or douhnut chart
        // You can switch between pie and douhnut using the method below.
        pieChart.Doughnut(PieData, pieOptions);
    })



    var pieChartCanvas2 = $("#pieChart2").get(0).getContext("2d");
    var pieChart2 = new Chart(pieChartCanvas2);
    var PieData = [{
        value: $("#mcdnum0").text(),
        color: "#f56954",
        highlight: "#f56954",
        label: $("#mcdname0").text()
    },
        {
            value: $("#mcdnum1").text(),
            color: "#00a65a",
            highlight: "#00a65a",
            label: $("#mcdname1").text()
        },
        {
            value: $("#mcdnum2").text(),
            color: "#f39c12",
            highlight: "#f39c12",
            label: $("#mcdname2").text()
        },
        {
            value: $("#mcdnum3").text(),
            color: "#00c0ef",
            highlight: "#00c0ef",
            label: $("#mcdname3").text()
        },
        {
            value: $("#mcdnum4").text(),
            color: "#3c8dbc",
            highlight: "#3c8dbc",
            label: $("#mcdname4").text()
        },
        {
            value: $("#mcdnum5").text(),
            color: "#d2d6de",
            highlight: "#d2d6de",
            label: $("#mcdname5").text()
        },
        {
            value: $("#mcdnum6").text(),
            color: "#a0c69d",
            highlight: "#a0c69d",
            label: $("#mcdname6").text()
        },
        {
            value: $("#mcdnum7").text(),
            color: "#bcc45c",
            highlight: "#bcc45c",
            label: $("#mcdname7").text()
        }
    ];
    var pieOptions2 = {
        //Boolean - Whether we should show a stroke on each segment
        segmentShowStroke: true,
        //String - The colour of each segment stroke
        segmentStrokeColor: "#fff",
        //Number - The width of each segment stroke
        segmentStrokeWidth: 2,
        //Number - The percentage of the chart that we cut out of the middle
        percentageInnerCutout: 50, // This is 0 for Pie charts
        //Number - Amount of animation steps
        animationSteps: 100,
        //String - Animation easing effect
        animationEasing: "easeOutBounce",
        //Boolean - Whether we animate the rotation of the Doughnut
        animateRotate: true,
        //Boolean - Whether we animate scaling the Doughnut from the centre
        animateScale: false,
        //Boolean - whether to make the chart responsive to window resizing
        responsive: true,
        // Boolean - whether to maintain the starting aspect ratio or not when responsive, if set to false, will take up entire container
        maintainAspectRatio: true,
        //String - A legend template
        <%--legendTemplate: "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<segments.length; i++){%><li><span style=\"background-color:<%=segments[i].fillColor%>\"></span><%if(segments[i].label){%><%=segments[i].label%><%}%></li><%}%></ul>"--%>
    };
    //Create pie or douhnut chart
    // You can switch between pie and douhnut using the method below.
    pieChart2.Doughnut(PieData, pieOptions2);




    <%--var pieChartCanvas3 = $("#pieChart3").get(0).getContext("2d");--%>
    <%--var pieChart3 = new Chart(pieChartCanvas3);--%>
    <%--var PieData = [{--%>
    <%--    value: $("#mccn0").text(),--%>
    <%--    color: "#f56954",--%>
    <%--    highlight: "#f56954",--%>
    <%--    label: $("#mcdn0").text()--%>
    <%--},--%>
    <%--    {--%>
    <%--        value: $("#mccn1").text(),--%>
    <%--        color: "#00a65a",--%>
    <%--        highlight: "#00a65a",--%>
    <%--        label: $("#mcdn1").text()--%>
    <%--    },--%>
    <%--    {--%>
    <%--        value: $("#mccn2").text(),--%>
    <%--        color: "#f39c12",--%>
    <%--        highlight: "#f39c12",--%>
    <%--        label: $("#mcdn2").text()--%>
    <%--    },--%>
    <%--    {--%>
    <%--        value: $("#mccn3").text(),--%>
    <%--        color: "#00c0ef",--%>
    <%--        highlight: "#00c0ef",--%>
    <%--        label: $("#mcdn3").text()--%>
    <%--    },--%>
    <%--    {--%>
    <%--        value: $("#mccn4").text(),--%>
    <%--        color: "#3c8dbc",--%>
    <%--        highlight: "#3c8dbc",--%>
    <%--        label: $("#mcdn4").text()--%>
    <%--    },--%>
    <%--    {--%>
    <%--        value: $("#mccn5").text(),--%>
    <%--        color: "#d2d6de",--%>
    <%--        highlight: "#d2d6de",--%>
    <%--        label: $("#mcdn5").text()--%>
    <%--    },--%>
    <%--    {--%>
    <%--        value: $("#mccn6").text(),--%>
    <%--        color: "#a0c69d",--%>
    <%--        highlight: "#a0c69d",--%>
    <%--        label: $("#mcdn6").text()--%>
    <%--    },--%>
    <%--    {--%>
    <%--        value: $("#mccn7").text(),--%>
    <%--        color: "#bcc45c",--%>
    <%--        highlight: "#bcc45c",--%>
    <%--        label: $("#mcdn7").text()--%>
    <%--    }--%>
    <%--];--%>
    <%--var pieOptions3 = {--%>
    <%--    //Boolean - Whether we should show a stroke on each segment--%>
    <%--    segmentShowStroke: true,--%>
    <%--    //String - The colour of each segment stroke--%>
    <%--    segmentStrokeColor: "#fff",--%>
    <%--    //Number - The width of each segment stroke--%>
    <%--    segmentStrokeWidth: 2,--%>
    <%--    //Number - The percentage of the chart that we cut out of the middle--%>
    <%--    percentageInnerCutout: 50, // This is 0 for Pie charts--%>
    <%--    //Number - Amount of animation steps--%>
    <%--    animationSteps: 100,--%>
    <%--    //String - Animation easing effect--%>
    <%--    animationEasing: "easeOutBounce",--%>
    <%--    //Boolean - Whether we animate the rotation of the Doughnut--%>
    <%--    animateRotate: true,--%>
    <%--    //Boolean - Whether we animate scaling the Doughnut from the centre--%>
    <%--    animateScale: false,--%>
    <%--    //Boolean - whether to make the chart responsive to window resizing--%>
    <%--    responsive: true,--%>
    <%--    // Boolean - whether to maintain the starting aspect ratio or not when responsive, if set to false, will take up entire container--%>
    <%--    maintainAspectRatio: true,--%>
    <%--    //String - A legend template--%>
    <%--    &lt;%&ndash;legendTemplate: "<ul class=\"<%=name.toLowerCase()%>-legend\"><% for (var i=0; i<segments.length; i++){%><li><span style=\"background-color:<%=segments[i].fillColor%>\"></span><%if(segments[i].label){%><%=segments[i].label%><%}%></li><%}%></ul>"&ndash;%&gt;--%>
    <%--};--%>
    <%--//Create pie or douhnut chart--%>
    <%--// You can switch between pie and douhnut using the method below.--%>
    <%--pieChart3.Doughnut(PieData, pieOptions3);--%>






</script>
</body>

</html>