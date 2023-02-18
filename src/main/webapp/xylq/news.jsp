
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="zh-CN">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>北大青鸟人民医院</title>
    <meta name="keywords" content="北大青鸟人民医院">
    <meta name="description" content="北大青鸟人民医院">
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
<%--                    <a href="#" class="btn btn-primary btn-sm">中文版</a> <a href="#" class="btn btn-primary btn-sm">English</a>--%>
                </div>
            </div>
            <div class="col-xs-12 col-sm-2 col-md-3 tel_box2">
                <div class="top_tel">
                    <img src="src/picture/tel.jpg" alt="服务热线">
                    <span>全国服务热线：</span>
                    <p>000-0000xxxx</p>
                </div>
            </div>
        </div>
    </div>
    <!-- Fixed navbar -->
    <nav id="top_nav" class="navbar navbar-default navbar-src-top">
        <div class="container">
            <div class="navbar-header">

                <button type="button" class="navbar-toggle collapsed"
                        data-toggle="collapse" data-target="#navbar"
                        aria-expanded="false" aria-controls="navbar">
                    <span class="sr-only">导航菜单</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span></button>
                <span id="search_btn" class="glyphicon glyphicon-globe" aria-hidden="true"></span>
                <a class="navbar-brand" href="#">MENU</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class=""><a href="hospital_main.jsp">首 页</a></li>
                    <li><a href="/toSickView">个人中心</a><li>
                    <li><a href="/selectNews" >新闻资讯</a></li>
                    <li><a href="article.jsp">招贤纳士</a></li>
                    <li><a href="contact.html">联系我们</a></li>
                    <li><a href="/getLeaveWord">留言反馈</a></li>
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
                    <span>您的位置：</span>
                    <a href="/">首 页</a> &gt; <a href="">新闻资讯</a>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="container">
    <div class="row">
        <div class="col-xs-12 col-sm-8 col-md-9" style="float: left">
            <div class="right_head">
                <h2 class="left_h3">新闻资讯</h2>
            </div>
            <ul class="right_new">
                <c:forEach items="${newss}" var="news">
                    <li><a href="/selectNewsCont?newsid=${news.newsid}"
                           title="${news.newstitle}">${news.newstitle}</a>
                        <span class="news_time">${news.newsdate}</span></li>
                </c:forEach>
            </ul>
            <div class="page">
                <a href="#">&laquo;</a>
                <a href="#">1</a>
                <a href="#">2</a>
                <a class="current" href="#">3</a>
                <a href="#">&raquo;</a>
            </div>
        </div>

    </div>
</div>

<footer style="background-image: url()">
    <div class="container">
        <div class="row">

            <div class="col-xs-12 col-sm-5 col-md-5 footer_contact">
                <p>主办：北大青鸟人民医院</p>
                <p>电话：0000-00000000</p>
                <p>传真：0000-00000000</p>
                <p>地址：XX市XX区XX路XXXX号</p>
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
                 <a href="javascript:;" target="_self">某某有限公司</a>
                <a href="javascript:;" target="_self">某某有限公司</a>
                <a href="javascript:;" target="_self">某某有限公司</a>
                <a href="javascript:;" target="_self">某某有限公司</a>
                <a href="javascript:;" target="_self">某某有限公司</a>
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
