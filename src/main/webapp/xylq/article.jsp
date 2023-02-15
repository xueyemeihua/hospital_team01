<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
+ request.getServerName() + ":" + request.getServerPort()
+ path + "/";
%>

<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <meta charset="utf-8">

    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>深圳市人民医院</title>
    <meta name="keywords" content="深圳市人民医院">
    <meta name="description" content="深圳市人民医院">
    <meta name="applicable-device" content="pc,mobile">
    <link href="src/css/bootstrap.css" rel="stylesheet">
    <link href="src/css/bxslider.css" rel="stylesheet">
    <link href="src/css/style.css" rel="stylesheet">
    <link rel="stylesheet" href="src/css/slick.css">
    <link rel="stylesheet" href="src/css/banner.css">
    <script src="src/js/jquery.min.js"></script>
</head>

<body>
    <header>
        <div class="top_bg">
            <div class="container">
                <div class="col-xs-12 col-sm-9 col-md-9">
                    <span class="top_welcome">欢迎光临~</span>
                </div>
                <div class="col-xs-12 col-sm-3 col-md-3">
                    <div><a href="#" class="btn btn-primary btn-sm">中文版</a> <a href="#" class="btn btn-primary btn-sm">English</a></div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-sm-7 col-md-7">
                    <a href="#"><img src="src/picture/logo.jpg" class="logo" alt="企业通用模版网站"></a>
                </div>
                <div class="col-xs-12 col-sm-3 col-md-2 tel_box">
                    <div class="top_tel">
                        <a href="#" class="btn btn-primary btn-sm">中文版</a> <a href="#" class="btn btn-primary btn-sm">English</a>
                    </div>
                </div>
                <div class="col-xs-12 col-sm-2 col-md-3 tel_box2">
                    <div class="top_tel">
                        <img src="src/picture/tel.jpg" alt="服务热线">
                        <span>全国服务热线：</span>
                        <p>021-5747xxxx</p>
                    </div>
                </div>
            </div>
        </div>
        <!-- Fixed navbar -->
        <nav id="top_nav" class="navbar navbar-default navbar-src-top">
            <div class="container">
                <div class="navbar-header">

                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar"><span class="sr-only">导航菜单</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                    <span id="search_btn" class="glyphicon glyphicon-globe" aria-hidden="true"></span>
                    <a class="navbar-brand" href="#">MENU</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class=""><a href="hospital_main.jsp">首 页</a>
                        <li class="dropdown "><a href="aboutus.html">关于我们</a>
                            <a href="#" id="app_menudown" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><span class="glyphicon glyphicon-menu-down btn-xs"></span></a>
                            <ul class='dropdown-menu nav_small' role='menu'>

                                <li><a href="aboutus.html">公司简介</a></li>

                                <li><a href="contact.html">联系我们</a></li>

                                <!--<li><a href="detail1.html">终端页面</a></li>
                                <li><a href="category-2.html">两栏图文</a></li>
                                <li><a href="category-4.html">四列图文</a></li>-->
                            </ul>
                        </li>
                        <li><a href="category-3.html">产品展示</a></li>
                        <li><a href="news.html">新闻资讯</a></li>
                        <li><a href="category-4.html">案例展示</a></li>
                        <li><a href="article.jsp">招贤纳士</a></li>
                        <li><a href="contact.html">联系我们</a></li>
                        <li><a href="feedback.html">留言反馈</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>
    <div class="page_bg" style="background: url(src/image/1617070665.jpg) center top no-repeat;"></div>
    <div class="bread_bg">
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-sm-12 col-md-12">
                    <div class="bread_nav">
                        <span>您的位置：</span><a href="/">首 页</a> &gt; <a href="">关于我们</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">

            <div class="col-xs-12 col-sm-8 col-md-9" style="float:right">
                <div class="right_head">
                    <h2><span>人才招聘</span></h2>
                </div>
                <div>
                    <h3>这里有适合你的,=></h3>

                    &nbsp;  &nbsp;  &nbsp;  &nbsp; <p>薪资3500-100000</p> &nbsp;  &nbsp;  &nbsp;  &nbsp;最低学历: 本科
                    &nbsp;  &nbsp;  &nbsp;  &nbsp; &nbsp;  &nbsp;  &nbsp;  &nbsp;
                    <a href="/getDeptInfoServletForwardStafentry">立即申请</a>

                </div>
                <div>
                    <h2>管理员功能:查询所有应聘者</h2>
                    <a href="/selectApplicants">查询</a>
                </div>
                <div>
                    <h3>下拉框查询需求科室对应的应聘人</h3>
                    -----------------------------------
                    <a href="/getDeptApplicant">下拉框查询需求科室对应的应聘人</a>
                    <br>

                </div>
            </div>

            <div class="col-xs-12 col-sm-4 col-md-3">
                <h3 class="left_h3"><span>导航栏目</span></h3>
                <div class="left_column">

                    <ul class="left_nav_ul" id="firstpane">

                        <li><a class="biglink" href="aboutus.html">公司简介</a>
                            <ul class="left_snav_ul menu_body"></ul>
                        </li>

                        <li><a class="biglink" href="contact.html">联系我们</a>
                            <ul class="left_snav_ul menu_body"></ul>
                        </li>

                        <li><a class="biglink" href="feedback.html">留言反馈</a>
                            <ul class="left_snav_ul menu_body"></ul>
                        </li>

                    </ul>
                </div>
                <div class="left_news">
                    <h3 class="left_h3"><span>通知公告</span></h3>

                    <ul class="left_news">

                        <li><a href="detail1.html" title="新版护理进修报到通知">新版护理进修报到通知</a></li>

                        <li><a href="detail1.html" title="新版护理进修申请鉴定表">新版护理进修申请鉴定表</a></li>

                        <li><a href="detail1.html" title="深圳市人民医院院周会请假登记表">深圳市人民医院院周会请假登记表</a></li>

                        <li><a href="detail1.html" title="进修人员申请鉴定表">进修人员申请鉴定表</a></li>

                        <li><a href="detail1.html" title="深圳市人民医院医师医技人员进修须知">深圳市人民医院医师医技人员进修须知</a></li>

                    </ul>

                </div>

                <div class="left_news">
                    <h3 class="left_h3"><span>医院动态</span></h3>

                    <ul class="left_news">

                        <li><a href="detail1.html" title="新版护理进修报到通知">新版护理进修报到通知</a></li>

                        <li><a href="detail1.html" title="新版护理进修申请鉴定表">新版护理进修申请鉴定表</a></li>

                        <li><a href="detail1.html" title="深圳市人民医院院周会请假登记表">深圳市人民医院院周会请假登记表</a></li>

                        <li><a href="detail1.html" title="进修人员申请鉴定表">进修人员申请鉴定表</a></li>

                        <li><a href="detail1.html" title="深圳市人民医院医师医技人员进修须知">深圳市人民医院医师医技人员进修须知</a></li>

                    </ul>

                </div>
            </div>
        </div>
    </div>
    <footer style="background-image: url()">
        <div class="container">
            <div class="row">

                <div class="col-xs-12 col-sm-5 col-md-5 footer_contact">
                    <p>主办：深圳市人民医院</p>
                    <p>电话：0755-2553xxxx</p>
                    <p>传真：0755-2553xxxx</p>
                    <p>地址：深圳市罗湖区东门北路1017号</p>
                </div>

                <div class="col-xs-12 col-sm-3 col-md-5">

                </div>

                <div class="col-xs-12 col-sm-4 col-md-2">
                    <p><a href="#"><img class="footer_qrcode" src="src/picture/weacht.png" alt="二维码图片"></a></p>
                </div>
            </div>
        </div>
    </footer>
    <div class="link_box" style="background-image: url()">
        <div class="container">
            <span class="link_title">友情链接</span><button id="link_btn" class="glyphicon glyphicon-plus" aria-hidden="true"></button>
            <span class="link_list">
                <a href="javascript:;" target="_self">济南邦哲雕塑艺术有限公司</a>
                <a href="javascript:;" target="_self">武汉贝升科技有限公司</a>
                <a href="javascript:;" target="_self">蚂蚁搬家运输有限公司昆明分公司</a>
                <a href="javascript:;" target="_self">朝阳钢材市场洪源保温材料加工厂</a>
                <a href="javascript:;" target="_self">芜湖艾尚新材料科技有限公司</a>
            </span>
        </div>
    </div>
    <script src="src/js/common.js"></script>
    <script src="src/js/bootstrap.js"></script>
    <script src="src/js/countUp.min.js"></script>
    <script src="src/js/banner_slick.js"></script>
    <script src="src/js/banner.js"></script>

    <script src="src/js/jquery.smoove.min.js"></script>
    <script>


        $('.product_head,.product_img,.left_nav,.case_head,.case_img,.advantage_head,.advantage_right,.advantage_left,.advantage_col,.news_head,.news_index,.news_ul,.answer_ul,.about_head,.js_about_left,.js_about_right,.cooperation_head,.cooperation_img').smoove({
            offset: '10%'
        });
    </script>
</body>

</html>