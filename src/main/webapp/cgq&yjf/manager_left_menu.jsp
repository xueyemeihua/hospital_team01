<%--
  Created by IntelliJ IDEA.
  User: ly
  Date: 2023/2/1
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%--菜单管理页面--%>
<head>
    <title>Title</title>
</head>
<body>

<!-- 菜单 -->
<ul class="sidebar-menu">
    <li class="header">菜单</li>

    <li id="admin-index"><a href="index.jsp"><i class="fa fa-dashboard"></i> <span>首页</span></a></li>


    <li class="treeview">

            <li id="charts-chartjs">
                <a href="/getDeptinfoAndForward">
                    <i class="fa fa-circle-o"></i> 科室管理
                </a>
            </li>

            <li id="charts-morris">
                <a href="/getPostinfoAndForward">
                    <i class="fa fa-circle-o"></i> 岗位管理
                </a>
            </li>

            <li id="charts-flot">
                <a href="/getStafinfo">
                    <i class="fa fa-circle-o"></i> 医生管理
                </a>
            </li>

            <li id="charts-inline">
                <a href="/cgq&yjf/paiban.jsp">
                    <i class="fa fa-circle-o"></i> 排班管理
                </a>
            </li>

<%--        </ul>--%>
    </li>


<%--    <li class="treeview">--%>
<%--        <a href="#">--%>
<%--            <i class="fa fa-laptop"></i> <span>UI界面元素</span>--%>
<%--            <span class="pull-right-container">--%>
<%--                        <i class="fa fa-angle-left pull-right"></i>--%>
<%--                    </span>--%>
<%--        </a>--%>
<%--        <ul class="treeview-menu">--%>

<%--            <li id="elements-general">--%>
<%--                <a href="all-elements-general.html">--%>
<%--                    <i class="fa fa-circle-o"></i> 标准 General--%>
<%--                </a>--%>
<%--            </li>--%>

<%--            <li id="elements-icons">--%>
<%--                <a href="all-elements-icons.html">--%>
<%--                    <i class="fa fa-circle-o"></i> 图标 Icons--%>
<%--                </a>--%>
<%--            </li>--%>

<%--            <li id="elements-buttons">--%>
<%--                <a href="all-elements-buttons.html">--%>
<%--                    <i class="fa fa-circle-o"></i> 按钮 Buttons--%>
<%--                </a>--%>
<%--            </li>--%>

<%--            <li id="elements-sliders">--%>
<%--                <a href="all-elements-sliders.html">--%>
<%--                    <i class="fa fa-circle-o"></i> 滑块 Sliders--%>
<%--                </a>--%>
<%--            </li>--%>

<%--            <li id="elements-timeline">--%>
<%--                <a href="all-elements-timeline.html">--%>
<%--                    <i class="fa fa-circle-o"></i> 时间线 Timeline--%>
<%--                </a>--%>
<%--            </li>--%>

<%--            <li id="elements-modals">--%>
<%--                <a href="all-elements-modals.html">--%>
<%--                    <i class="fa fa-circle-o"></i> 对话框样式 Modals--%>
<%--                </a>--%>
<%--            </li>--%>

<%--            <li id="elements-widgets">--%>
<%--                <a href="all-elements-widgets.html">--%>
<%--                    <i class="fa fa-circle-o"></i> 窗体小部件 widgets--%>
<%--                </a>--%>
<%--            </li>--%>

<%--        </ul>--%>
<%--    </li>--%>


<%--    <li class="treeview">--%>
<%--        <a href="#">--%>
<%--            <i class="fa fa-edit"></i> <span>表单 Forms</span>--%>
<%--            <span class="pull-right-container">--%>
<%--                        <i class="fa fa-angle-left pull-right"></i>--%>
<%--                    </span>--%>
<%--        </a>--%>
<%--        <ul class="treeview-menu">--%>

<%--            <li id="form-general">--%>
<%--                <a href="all-form-general.html">--%>
<%--                    <i class="fa fa-circle-o"></i> 基础表单元素--%>
<%--                </a>--%>
<%--            </li>--%>

<%--            <li id="form-advanced">--%>
<%--                <a href="all-form-advanced.html">--%>
<%--                    <i class="fa fa-circle-o"></i> 高级表单元素--%>
<%--                </a>--%>
<%--            </li>--%>

<%--            <li id="form-editors">--%>
<%--                <a href="all-form-editors.html">--%>
<%--                    <i class="fa fa-circle-o"></i> 编辑器--%>
<%--                </a>--%>
<%--            </li>--%>

<%--        </ul>--%>
<%--    </li>--%>


<%--    <li class="treeview">--%>
<%--        <a href="#">--%>
<%--            <i class="fa fa-table"></i> <span>表格 tables</span>--%>
<%--            <span class="pull-right-container">--%>
<%--                        <i class="fa fa-angle-left pull-right"></i>--%>
<%--                    </span>--%>
<%--        </a>--%>
<%--        <ul class="treeview-menu">--%>

<%--            <li id="tables-simple">--%>
<%--                <a href="all-tables-simple.html">--%>
<%--                    <i class="fa fa-circle-o"></i> 简单表格--%>
<%--                </a>--%>
<%--            </li>--%>

<%--            <li id="tables-data">--%>
<%--                <a href="all-tables-data.html">--%>
<%--                    <i class="fa fa-circle-o"></i> 数据表格--%>
<%--                </a>--%>
<%--            </li>--%>

<%--        </ul>--%>
<%--    </li>--%>


<%--    <li class="treeview">--%>
<%--        <a href="#">--%>
<%--            <i class="fa fa-cube"></i> <span>样例-订单管理</span>--%>
<%--            <span class="pull-right-container">--%>
<%--                        <i class="fa fa-angle-left pull-right"></i>--%>
<%--                    </span>--%>
<%--        </a>--%>
<%--        <ul class="treeview-menu">--%>

<%--            <li id="order-manage">--%>
<%--                <a href="all-order-manage-list.html">--%>
<%--                    <i class="fa fa-circle-o"></i> 全部订单--%>
<%--                </a>--%>
<%--            </li>--%>

<%--            <li id="order-cancel">--%>
<%--                <a href="all-order-cancel-list.html">--%>
<%--                    <i class="fa fa-circle-o"></i> 退款--%>
<%--                </a>--%>
<%--            </li>--%>

<%--        </ul>--%>
<%--    </li>--%>


<%--    <li class="treeview">--%>
<%--        <a href="#">--%>
<%--            <i class="fa fa-book"></i> <span>样例-游记管理</span>--%>
<%--            <span class="pull-right-container">--%>
<%--                        <i class="fa fa-angle-left pull-right"></i>--%>
<%--                    </span>--%>
<%--        </a>--%>
<%--        <ul class="treeview-menu">--%>

<%--            <li id="travellog-manage">--%>
<%--                <a href="all-travellog-manage-list.html">--%>
<%--                    <i class="fa fa-circle-o"></i> 游记列表--%>
<%--                </a>--%>
<%--            </li>--%>

<%--            <li id="travellog-review">--%>
<%--                <a href="all-travellog-review-list.html">--%>
<%--                    <i class="fa fa-circle-o"></i> 游记点评--%>
<%--                </a>--%>
<%--            </li>--%>

<%--            <li id="travellog-setting">--%>
<%--                <a href="all-travellog-setting-edit.html">--%>
<%--                    <i class="fa fa-circle-o"></i> 游记设置--%>
<%--                </a>--%>
<%--            </li>--%>

<%--        </ul>--%>
<%--    </li>--%>


<%--    <li class="treeview">--%>
<%--        <a href="#">--%>
<%--            <i class="fa fa-cogs"></i> <span>样例-系统管理</span>--%>
<%--            <span class="pull-right-container">--%>
<%--                        <i class="fa fa-angle-left pull-right"></i>--%>
<%--                    </span>--%>
<%--        </a>--%>
<%--        <ul class="treeview-menu">--%>

<%--            <li id="system-setting">--%>
<%--                <a href="all-system-setting-edit.html">--%>
<%--                    <i class="fa fa-circle-o"></i> 系统设置--%>
<%--                </a>--%>
<%--            </li>--%>

<%--        </ul>--%>
<%--    </li>--%>

<%--    <li id="admin-documentation"><a href="/pages/documentation.html" target="_blank"><i class="fa fa-book"></i> <span>AdminLTE汉化文档</span></a>--%>
<%--    </li>--%>

    <!-- 菜单 /-->

</ul>
</body>
</html>
