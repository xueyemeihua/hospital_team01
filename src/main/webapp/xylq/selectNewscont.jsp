<%--
  Created by IntelliJ IDEA.
  User: 96942
  Date: 2023/2/7
  Time: 16:27
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
                    <li class=""><a href="index.html">首 页</a>
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
                    <li><a href="article.html">招贤纳士</a></li>
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
                <h2><span>公司新闻</span></h2>
            </div>
            <div class="right_contents">
                <div class="right_contents_h1">
                    <h1>${news.newstitle}</h1>
                    <span>发布时间：${news.newsdate} 发布机构：深圳市人民医院</span>
                </div>
                <p>
                    ${news.newscont}
                </p>
<%--                <p>--%>
<%--                    2021年8月18日，国家自然科学基金委员会公布了2021年度国家自然科学基金集中申请受理期项目评审结果。深圳市人民医院共获批31项，其中面上项目13项，青年基金项目18项，资助经费达1172万元。在深圳市卫生系统中获得了立项数、资助经费、面上项目立项数的“三个”第一。获批资助经费创历史新高，较2020年度增长10.3%。面上项目立项数更是取得突破，近三年立项数由2项（2019年）、9项（2020年）到今年达到13项。--%>
<%--                    <br>--%>
<%--                    此次成绩是深圳市人民医院高水平医院建设、学科人才队伍培养工作取得阶段性成果的重要体现，也为进一步推动该院在科技创新与成果转化、加强重点学科建设等方面起到了重要的支撑作用。--%>
<%--                    <br>--%>
<%--                    <b>加强队伍建设，营造科研氛围</b>--%>
<%--                    <br>--%>
<%--                    据悉，国家自然科学基金作为我国支持基础科学研究的主要渠道之一，是衡量一个单位科学研究实力和创新水平的重要标志。深圳市人民医院领导班子一直高度重视国家自然科学基金的申报工作。--%>

<%--                    近年来，该院在医疗、科研与教学等方面的全方位发展，积极开展临床重点学科建设工作，提高医疗技术服务水平，打造了一批高质量、有特色的优势重点学科；同时丰富医院人才储备，坚持外引内培，加强学科队伍建设，为申报国家自然科学基金营造了良好的科研条件和科研氛围。--%>
<%--                    <br>--%>
<%--                    <b>凝聚优势力量，全员攻坚克难</b>--%>
<%--                    <br>--%>
<%--                    在国家自然科学基金准备及申报阶段，在院领导的大力支持下，该院科研科积极组织部署相关前期准备及申报工作，为助力国家自然科学基金申报工作顺利进行采取了一系列举措：邀请专家进行国基金申报培训；根据各个科室的实际情况，采取线上与线下、集中与分散等形式灵活多元的申请书指导、修改工作；多次邀请国基金评审专家为该院进行多对一提纲修改以及一对一精细化润色，修改人次150余人；麻醉科、临床医学研究中心、超声科等各个临床医技科室针对各自的领域与专业有针对性地邀请专家对科室项目申请书进行润色修改。为避免形式审查问题的出现，该院科研科组织人员在国基金集中申报期间，对全院申报书进行多轮形式的审查工作。--%>

<%--                    从内容到形式形成层层论证、专家导师全程负责的机制，围绕国家自然科学基金的学科布局，凝聚优势力量，提前谋划，攻坚克难；完善顶层设计、制度保障、统筹资源、加强科研平台搭建和人才队伍培育、提升科研服务水平。这些措施在帮助科研人员立足前沿、确定研究主题的同时，也有效提高了国家自然科学基金申报书的质量。--%>
<%--                </p>--%>
            </div>
            <div class="point">
                <span class="to_next col-xs-12 col-sm-6 col-md-6">上一个：<a href=""></a></span>
                <span class="to_next col-xs-12 col-sm-6 col-md-6">下一个：<a href=""></a></span>
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