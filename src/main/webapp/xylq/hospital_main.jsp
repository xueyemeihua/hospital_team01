<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <%@page contentType="text/html; charset=UTF-8" isELIgnored="false" language="java" %>
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
                    <div><a href="#" class="btn btn-primary btn-sm">中文版</a> <a href="#"
                            class="btn btn-primary btn-sm">English</a></div>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-sm-7 col-md-7">
                    <a href="hospital_main.jsp"><img src="src/picture/logo.jpg" class="logo" alt="企业通用模版网站"></a>
                </div>
                <!--<div class="col-xs-12 col-sm-3 col-md-2 tel_box">
                    <div class="top_tel">
                        <a href="#" class="btn btn-primary btn-sm">中文版</a> <a href="#"
                            class="btn btn-primary btn-sm">English</a>
                    </div>
                </div>-->
                <div class="col-xs-12 col-sm-2 col-md-3 tel_box2">
                    <div class="top_tel">
                        <img src="src/picture/tel.jpg" alt="服务热线">
                        <span>全国服务热线：</span>
                        <p>000-00008888</p>
                        <br>

                    </div><p>${loginSicker.sickname}</p>
                </div>
                <div class="col-xs-12 col-sm-2 col-md-3 tel_box2" align="right">
                    <a href="/cgq&yjf/stafLogin.jsp">工作人员登录</a>
                </div>
            </div>
        </div>

        <!-- Fixed navbar -->
        <nav id="top_nav" class="navbar navbar-default navbar-src-top">
            <div class="container">
                <div class="navbar-header">

                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                        aria-expanded="false" aria-controls="navbar"><span class="sr-only">导航菜单</span><span
                            class="icon-bar"></span><span class="icon-bar"></span><span
                            class="icon-bar"></span></button>
                    <span id="search_btn" class="glyphicon glyphicon-globe" aria-hidden="true"></span>
                    <a class="navbar-brand" href="#">MENU</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class=""><a href="hospital_main.jsp">首 页</a></li>
                        <c:if test="${loginSicker!=null}">
                          <li><a href="/toSickView?sickid=${loginSicker.sickid}">个人中心</a><li>
                        </c:if>
                        <li><a href="/selectNews" >新闻资讯</a></li>
                        <li><a href="article.jsp">招贤纳士</a></li>
                        <li><a href="contact.html">联系我们</a></li>
                        <li><a href="/getLeaveWord">留言反馈</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </header>

    <div id="index_main" class="index_main">
        <div class="section section1">
            <div class="index_banner">

                <div class="item">

                    <div class="items" style="background-image: url(src/picture/banner.jpg);"></div>
                    <div class="inner">
                        <div class="block_txt">
                            <h2>青鸟大学医学院第一附属医院</h2>
                            <h4>First Affiliated Hospital of Qingniao University Medical College</h4>
                            <p><a href="aboutus.html" class="btn btn-primary btn-lg">了解更多</a></p>
                        </div>
                    </div>

                </div>

                <div class="item">

                    <div class="items" style="background-image: url(src/picture/banner.jpg);"></div>
                    <div class="inner">
                        <div class="block_txt">
                            <h2>青鸟大学医学院第一附属医院</h2>
                            <h4>First Affiliated Hospital of Qingniao University Medical College</h4>
                            <p><a href="aboutus.html" class="btn btn-primary btn-lg">了解更多</a></p>
                        </div>
                    </div>

                </div>
                <div class="item">

                    <div class="items" style="background-image: url(src/picture/banner.jpg);"></div>
                    <div class="inner">
                        <div class="block_txt">
                            <h2>青鸟大学医学院第一附属医院</h2>
                            <h4>First Affiliated Hospital of Qingniao University Medical College</h4>
                            <p><a href="aboutus.html" class="btn btn-primary btn-lg">了解更多</a></p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="left slick_txt">
                <div class="prev slick_arrow"></div>
            </div>
            <div class="right slick_txt">
                <div class="next slick_arrow"></div>
            </div>
        </div>
    </div>


    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-sm-12 col-md-12">
                <div class="about_head" data-move-y="-40px">
                    <h2></h2>
                    <p></p>
                </div>
                <div class="col-xs-12 col-sm-5 col-md-5 js_about_right" data-move-y="40px">
                    <a href="detail1.html"><img src="src/picture/about-01.jpg" border="0" width="100%"></a>
                </div>
                <div class="col-xs-12 col-sm-7 col-md-7 js_about_left" data-move-y="40px">
                    <h3 class="about_h3">北大青鸟人民医院</h3>
                    <p class="about_p">BEIDA QINGNIAO PEOPLE’S HOSPITAL</p>
                    <div class="about_content">
                        北大青鸟人民医院始建于1946年，前身系宝安县卫生院，解放后更名为宝安县人民医院，亦称“留医部”，1979年更名为深圳市人民医院。1994年被评为深圳首家“三级甲等”医院，1996年经国务院侨办批准成为暨南大学医学院第二附属医院，2005年升格为暨南大学第二临床医学院，2018年挂牌南方科技大学第一附属医院。医院共有院本部、龙华分院、坂田院区、一门诊“四个院区”和一个科研基地，现已发展成为一个功能齐全、设备先进、人才结构合理、技术力量雄厚，集医疗、科研、教学、住院医师规培、保健为一体的深圳市最大的现代化综合性医院。<br>
                        <br>
                        医院占地面积167708平方米，建筑面积353041平方米，开放床位3043张，在岗员工5110人，其中具有高级职称971余人，中级职称1384人，博士生导师28人，硕士生导师162人。2020年出院病人10.9万人次，诊疗人次308.9万人次。
                    </div>

                    <div class="row">
                        <div class="col-sm-4 col-md-4 col-mm-6">
                            <a href="/toSickReg" class="about_btn">预约挂号</a>
                        </div>
                        <div class="col-sm-4 col-md-4 col-mm-6">
                            <a href="/getCaseinfo" class="about_btn">报告查询</a>
                        </div>
                        <div class="col-sm-4 col-md-4 col-mm-6">
                            <a href="detail1.html" class="about_btn">就医指南</a>
                        </div>
                        <div class="col-sm-4 col-md-4 col-mm-6">
                            <a href="/getDoctorPaiban" class="about_btn">门诊排班</a>
                        </div>
                        <div class="col-sm-4 col-md-4 col-mm-6">
                            <a href="detail1.html" class="about_btn">患者服务</a>
                        </div>
                        <div class="col-sm-4 col-md-4 col-mm-6">
                            <a href="detail1.html" class="about_btn">健康科普</a>
                        </div>
                    </div>
                </div>

            </div>
        </div>
    </div>



    <nav class="navbar navbar-default navbar-fixed-bottom mfoot_box">
        <div class="mfoot_nav"><a href=""><span class="glyphicon glyphicon-home btn-lg" aria-hidden="true"></span>首页</a>
        </div>
        <div class="mfoot_nav">
            <a href="tel:021-5747xxxx">
                <span class="glyphicon glyphicon-phone btn-lg" aria-hidden="true"></span>手机
            </a>
        </div>
        <div class="mfoot_nav" aria-hidden="true" data-toggle="collapse" data-target="#navbar" aria-expanded="false"
            aria-controls="navbar">
            <span class="glyphicon glyphicon-th-list btn-lg"></span>分类
        </div>
        <div class="mfoot_nav">
            <a id="gototop" href="#">
                <span class="glyphicon glyphicon-circle-arrow-up btn-lg" aria-hidden="true"></span>顶部
            </a>
        </div>
    </nav>
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
            <span class="link_title">友情链接</span><button id="link_btn" class="glyphicon glyphicon-plus"
                aria-hidden="true"></button>
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


