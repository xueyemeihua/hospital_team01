<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <!-- 页面meta -->
  <meta charset="utf-8">
  <style type="text/css">
    #all_light { /*整个弹窗的页面*/
      width: 100%; /*宽度*/
      height: 0px; /*高度，不能百分百*/
      background: #000; /*背景色*/
      position: absolute;
      display: none; /*隐藏*/
    }

    #contes { /* 弹框的页面*/
      border-style: double;
      width: 300px; /*宽度*/
      height: 300px; /*高度*/
      background: #fff; /*背景色*/
      display: none; /*隐藏*/
      z-index: 2; /*覆盖*/
      position: absolute;
      top: 50px;
      left: 250px; /* 定位*/

    }

    input{

      margin-bottom: 10px;

    }

  </style>
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>药品信息</title>
  <meta name="description" content="药品信息">
  <meta name="keywords" content="药品信息">

  <!-- 告诉浏览器响应屏幕宽度 -->
  <meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">

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
      <span class="logo-mini"><b>医生</b></span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>医生</b>后台管理</span>
    </a>


    <!-- 标题导航栏：样式可以在Header.less中找到 -->
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
                      <i class="fa fa-warning text-yellow"></i> Very long description here that may not
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
                        <div class="progress-bar progress-bar-aqua" style="width: 20%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
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
                        <div class="progress-bar progress-bar-green" style="width: 40%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
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
                        <div class="progress-bar progress-bar-red" style="width: 60%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
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
                        <div class="progress-bar progress-bar-yellow" style="width: 80%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">
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
    <!-- 侧边栏：样式可以在sidebar.less中找到 -->
    <section class="sidebar">
      <!-- 侧边栏用户面板 -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="../img/user2-160x160.jpg" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>医生</p>
          <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
        </div>
      </div>

      <!-- 搜索表单 -->

      <!-- 侧边栏菜单：：style可以在sidebar.les中找到 -->
        <!-- 菜单 -->
        <jsp:include page="/cgq&yjf/manager_left_menu.jsp"/>
    </section>
    <!-- /.侧边栏 -->
  </aside>
  <!-- 导航侧栏 /-->

  <!-- 内容区域 -->
  <!-- @@master = admin-layout.html-->
  <!-- @@block = content -->

  <div class="content-wrapper">

    <!-- 内容头部 -->
    <section class="content-header">
      <h1>
        员工管理
        <small>员工列表</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
        <li><a href="#">员工管理</a></li>
        <li class="active">员工列表</li>
      </ol>
    </section>
    <!-- 内容头部 /-->

    <!-- 正文区域 -->
    <section class="content">

      <!-- .box-body -->
      <div class="box box-primary">
        <div class="box-header with-border">
          <h3 class="box-title">列表</h3>
        </div>

        <div class="box-body">

          <!-- 数据表格 -->
          <div class="table-box">

            <!--工具栏-->
            <div class="pull-left">
              <div class="form-group form-inline">
                <div class="btn-group">
                  <button type="button" class="btn btn-default" title="新建" id="add" ><i class="fa fa-file-o"></i> 新建</button>
                  <button type="button" class="btn btn-default" title="刷新"><i class="fa fa-refresh"></i> 刷新</button>
                </div>
              </div>
            </div>
            <div class="box-tools pull-right">
              <form action="/getStafinfoLikeDeptnameOrPostnameOrStafname">x
                科室名<input name="deptname">
                岗位名<input name="postname">
                员工姓名<input name="stafname">
                <input type="submit" value="查询">
              </form>
<%--              <div class="has-feedback">--%>
<%--                <input type="text" class="form-control input-sm" placeholder="输入药品名称">--%>
<%--                <span class="glyphicon glyphicon-search form-control-feedback"></span>--%>
<%--              </div>--%>
            </div>
            <!--工具栏/-->

            <!--数据列表-->
            <table id="dataList" class="table table-bordered table-striped table-hover dataTable" width="900px">

              <tr>
                <th>医院工作人员编号</th>
                <th>岗位名称</th>
                <th>科室名称</th>
                <th>身份证</th>
                <th>姓名</th>
                <th>职称</th>
                <th>职员状态</th>
                <th>手机号</th>
                <th>登录名</th>
                <th>邮箱</th>
                <th>
                    操作
                </th>
              </tr>


                <c:forEach items="${stafinfos}" var="stafinfo">
                    <tr >
                    <td>${stafinfo.stafid}</td>
                    <td>${stafinfo.postname}</td>
                    <td>${stafinfo.deptname}</td>
                    <td>${stafinfo.stafcard}</td>
                    <td>${stafinfo.stafname}</td>
                    <td>${stafinfo.rankname}</td>
                    <td>
                      <c:if test="${stafinfo.stafstate==1}">
                        在职
                      </c:if>
                      <c:if test="${stafinfo.stafstate==0}">
                        离职
                      </c:if>
                    </td>
                    <td>${stafinfo.stafphone}</td>
                    <td>${stafinfo.username}</td>
                    <td>${stafinfo.email}</td>
                      <td>
                        <button id="change" onclick="change()" >转岗</button>
                        <form >
                        <div id="contes" >
                          <div>
                            转岗
                            <hr>
                            岗位名称
                            <select name="postid" id="post" onchange="selectDept()">
                              <option value="0">请选择</option>
                              <c:forEach items="${postinfos}" var="postinfo">
                                <c:if test="${postinfo.postid!=12}">
                                  <option value="${postinfo.postid}">${postinfo.postname}</option>
                                </c:if>
                              </c:forEach>
                            </select><br>
                            所属科室
                            <select id="postinfos" name="postid"></select>
                          </div>
                        </div>
                        <div id="all_light"></div>
                        </form>
                        <input type="button" onclick="void fired(${stafinfo.stafid})" value="开除">
                      </td>


              </tr>
              </c:forEach>
              <a href="/getAllStafinfo">显示所有</a>

<%--              <a href="/deleteDrugInfoServlet?drugid=${druginfo.drugid}">删除</a>--%>
            </table>
            <!--数据列表/-->


          </div>
          <!-- 数据表格 /-->
        </div>
        <!-- /.box-body -->

        <!-- .box-footer-->
        <div class="box-footer">
          <div class="pull-left">
            <div class="form-group form-inline">
              总共2 页，共14 条数据。 每页
              <select class="form-control">
                <option>1</option>
                <option>2</option>
                <option>3</option>
                <option>4</option>
                <option>5</option>
              </select> 条
            </div>
          </div>

          <div class="box-tools pull-right">
            <ul class="pagination">
              <li>
                <a href="#" aria-label="Previous">首页</a>
              </li>
              <li><a href="#">上一页</a></li>
              <li><a href="#">1</a></li>
              <li><a href="#">2</a></li>
              <li><a href="#">3</a></li>
              <li><a href="#">4</a></li>
              <li><a href="#">5</a></li>
              <li><a href="#">下一页</a></li>
              <li>
                <a href="#" aria-label="Next">尾页</a>
              </li>
            </ul>
          </div>

        </div>
        <!-- /.box-footer-->

      </div>

    </section>
    <!-- 正文区域 /-->

  </div>
  <!-- @@close -->
  <!-- 内容区域 /-->

  <!-- 底部导航 -->
  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 1.0.8
    </div>
    <strong>Copyright &copy; 2014-2023 <a href="#">某某医院</a>.</strong> All rights reserved.
  </footer>
  <!-- 底部导航 /-->

</div>


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
  function fired(stafid){
    var flag = window.confirm("是否开除该员工？")
    if (flag){
      window.location='/firedStafinfo?stafid='+stafid
    }
  }

  function change() {
    document.getElementById('all_light').style.display = 'block';
    document.getElementById('contes').style.display = 'block';
  }



  document.getElementById("add").onclick=function () {
    location.href="cgq&yjf/addStafInfo.jsp";
  }

  $(document).ready(function() {
    // 选择框
    $(".select2").select2();

    // WYSIHTML5编辑器
    $(".textarea").wysihtml5({
      locale: 'zh-CN'
    });
  });
//ajax科室和岗位的二级联动
  function selectDept() {
    $.get("http://localhost:8080/getDeptinfoByPostid","postid="+$("#post").val(),function (data){
      var jsonData=eval("("+data+")")
      var s = ''
      if (jsonData.length != 0) {
        for (var i = 0; i < jsonData.length; i++) {
          $("#deptinfos").children().remove();
          s += "<option value='" +
                  jsonData[i].deptid +
                  "'>" +
                  jsonData[i].deptname +
                  "</option>"
        }
        $("#deptinfos").append(s)
      } else {
        $("#deptinfos").children().remove();
      }
    })
  }

  // 设置激活菜单
  function setSidebarActive(tagUri) {
    var liObj = $("#" + tagUri);
    if (liObj.length > 0) {
      liObj.parent().parent().addClass("active");
      liObj.addClass("active");
    }
  }


  $(document).ready(function() {

    // 激活导航位置
    setSidebarActive("admin-datalist");

    // 列表按钮
    $("#dataList td input[type='checkbox']").iCheck({
      checkboxClass: 'icheckbox_square-blue',
      increaseArea: '20%'
    });
    // 全选操作
    $("#selall").click(function() {
      var clicks = $(this).is(':checked');
      if (!clicks) {
        $("#dataList td input[type='checkbox']").iCheck("uncheck");
      } else {
        $("#dataList td input[type='checkbox']").iCheck("check");
      }
      $(this).data("clicks", !clicks);
    });
  });
</script>
</body>
</html>
