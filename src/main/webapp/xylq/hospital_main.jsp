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
                    </div>
                </div>
                <div class="col-xs-12 col-sm-2 col-md-3 tel_box2">
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


<%--    <div class="mb-30">--%>
<%--        <div class="container">--%>
<%--            <div class="row">--%>
<%--                <div class="product_head" data-move-y="-40px">--%>
<%--                    <h2>科室导航</h2>--%>
<%--                    <p>DEPARTMENT NAVIGATION</p>--%>
<%--                </div>--%>
<%--                <div class="col-xs-12 col-sm-12 col-md-12">--%>
<%--                    <div class="product_list">--%>
<%--                        <div class="col-sm-3 col-md-2 col-mm-6 advantage_col" data-move-y="120px">--%>
<%--                            <a href="#"><img src="src/picture/耳鼻咽喉科.png" alt="专注品质"></a>--%>
<%--                            <a href="detail1.html" target="_blank">耳鼻咽喉科</a>--%>
<%--                            <p>Otolaryngology department</p>--%>
<%--                        </div>--%>

<%--                        <div class="col-sm-3 col-md-2 col-mm-6 advantage_col" data-move-y="120px">--%>
<%--                            <a href="#"><img src="src/picture/肝胆胰外科.png" alt="持续创新"></a>--%>
<%--                            <a href="detail1.html" target="_blank">肝胆胰外科</a>--%>
<%--                            <p>GanDanYi surgical</p>--%>
<%--                        </div>--%>

<%--                        <div class="col-sm-3 col-md-2 col-mm-6 advantage_col" data-move-y="120px">--%>
<%--                            <a href="#"><img src="src/picture/计划生育科.png" alt="应用广泛"></a>--%>
<%--                            <a href="detail1.html" target="_blank">计划生育科</a>--%>
<%--                            <p>Family planning department</p>--%>
<%--                        </div>--%>
<%--                        <div class="col-sm-3 col-md-2 col-mm-6 advantage_col" data-move-y="120px">--%>
<%--                            <a href="#"><img src="src/picture/健康管理科.png" alt="恒于心 专与质"></a>--%>
<%--                            <a href="detail1.html" target="_blank">健康管理科</a>--%>
<%--                            <p>Health management division</p>--%>
<%--                        </div>--%>
<%--                        <div class="col-sm-3 col-md-2 col-mm-6 advantage_col" data-move-y="120px">--%>
<%--                            <a href="#"><img src="src/picture/肿瘤放疗科.png" alt="应用广泛"></a>--%>
<%--                            <a href="detail1.html" target="_blank">肿瘤放疗科</a>--%>
<%--                            <p>Radiation oncology division</p>--%>
<%--                        </div>--%>

<%--                        <div class="col-sm-3 col-md-2 col-mm-6 advantage_col" data-move-y="120px">--%>
<%--                            <a href="#"><img src="src/picture/肿瘤内科.png" alt="恒于心 专与质"></a>--%>
<%--                            <a href="detail1.html" target="_blank">肿瘤内科</a>--%>
<%--                            <p>Oncology</p>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>

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

<%--    <div class="shuzi" style="background-image: url()">--%>
<%--        <div class="container">--%>
<%--            <div class="row">--%>
<%--                <div class="number">--%>
<%--                    <div class="roll auto clear">--%>

<%--                        <div class="col-sm-4 col-md-3 col-mm-6 scolling">--%>
<%--                            <div>--%>
<%--                                <h3 class="counter">150</h3>--%>
<%--                            </div>--%>
<%--                            <div class="title_text">编制病床150张</div>--%>
<%--                        </div>--%>
<%--                        <div class="col-sm-4 col-md-3 col-mm-6 scolling">--%>
<%--                            <div>--%>
<%--                                <h3 class="counter">1000</h3>--%>
<%--                            </div>--%>
<%--                            <div class="title_text">为全国培训1000多名医生</div>--%>
<%--                        </div>--%>
<%--                        <div class="col-sm-4 col-md-3 col-mm-6 scolling">--%>
<%--                            <div>--%>
<%--                                <h3 class="counter">30</h3>--%>
<%--                            </div>--%>
<%--                            <div class="title_text">从事临床30余年</div>--%>
<%--                        </div>--%>
<%--                        <div class="col-sm-4 col-md-3 col-mm-6 scolling">--%>
<%--                            <div>--%>
<%--                                <h3 class="counter">55</h3>--%>
<%--                            </div>--%>
<%--                            <div class="title_text">疑难杂症治疗55年</div>--%>
<%--                        </div>--%>
<%--                    </div>--%>
<%--                </div>--%>
<%--                <script src="src/js/countUp.min.js"></script>--%>
<%--                <script>--%>
<%--                    // 数字滚动--%>
<%--                    $(function () {--%>
<%--                        $('.counter').countUp();--%>

<%--                    });--%>
<%--                </script>--%>

<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>

<%--    <div class="container">--%>
<%--        <div class="row">--%>
<%--            <div class="col-xs-12 col-sm-12 col-md-12">--%>
<%--                <div class="news_head" data-move-y="-40px">--%>
<%--                    <h2>新闻资讯</h2>--%>
<%--                    <p>NEWS INFORMATION</p>--%>
<%--                </div>--%>

<%--                <ul class="news_index" data-move-y="200px">--%>

<%--                    <div class="col-sm-6 col-md-6 news_col">--%>
<%--                        <li><a href="detail1.html"--%>
<%--                                title="深圳市人民医院市级医疗质量控制中心年度总结和培训研讨会顺利召开">市级医疗质量控制中心年度总结和培训研讨会顺利召开</a><span--%>
<%--                                class='news_time2'><strong>25</strong><i>2021-12</i></span><br><em class='news_time2'>--%>
<%--                                2021年12月25日下午，深圳市人民医院召开挂靠市级质控中心2021年度工作总结和培训研讨会议。</em></li>--%>
<%--                    </div>--%>

<%--                    <div class="col-sm-6 col-md-6 news_col">--%>
<%--                        <li><a href="detail1.html" title="第三届粤港澳大湾区近视防控高峰论坛在深医召开">第三届粤港澳大湾区近视防控高峰论坛在深医召开</a><span--%>
<%--                                class='news_time2'><strong>21</strong><i>2021-12</i></span><br><em class='news_time2'>--%>
<%--                                来自全国的 40 多名眼科专家汇聚一堂，采取线上线下联动的形式，共同分享近视防控和视网膜手术的新技术、新进展。</em>--%>
<%--                        </li>--%>
<%--                    </div>--%>

<%--                    <div class="col-sm-6 col-md-6 news_col">--%>
<%--                        <li><a href="detail1.html" title="深圳市人民医院第二届显微外科技术培训班圆满结束">深圳市人民医院第二届显微外科技术培训班圆满结束</a><span--%>
<%--                                class='news_time2'><strong>28</strong><i>2021-11</i></span><br><em class='news_time2'>--%>
<%--                                为提高住培学员的显微外科操作技术，深圳市人民医院骨科基地于11月15日-20日举办第二期显微外科技术培训班，共有29名骨科专业学员报名参加培训。</em>--%>
<%--                        </li>--%>
<%--                    </div>--%>

<%--                    <div class="col-sm-6 col-md-6 news_col">--%>
<%--                        <li><a href="detail1.html" title="深医获得“老年护理与照护教育实践基地”授牌">深医获得“老年护理与照护教育实践基地”授牌</a><span--%>
<%--                                class='news_time2'><strong>23</strong><i>2021-11</i></span><br><em class='news_time2'>--%>
<%--                                10月20-22日，第四届中国老年学和老年医学学会护理和照护分会、第二届中国心理卫生协会护理心理专委会学术年会暨2021国家继续教育项目“老年护理与照护能力提升班”在深圳市卫健能教中心成功举办。</em>--%>
<%--                        </li>--%>
<%--                    </div>--%>
<%--                    <div class="col-sm-6 col-md-6 news_col">--%>
<%--                        <li><a href="detail1.html"--%>
<%--                                title="深圳市人民医院市级医疗质量控制中心年度总结和培训研讨会顺利召开">深圳市人民医院市级医疗质量控制中心年度总结顺利召开</a><span--%>
<%--                                class='news_time2'><strong>19</strong><i>2021-10</i></span><br><em class='news_time2'>--%>
<%--                                2021年12月25日下午，深圳市人民医院召开挂靠市级质控中心2021年度工作总结和培训研讨会议。</em></li>--%>
<%--                    </div>--%>

<%--                    <div class="col-sm-6 col-md-6 news_col">--%>
<%--                        <li><a href="detail1.html" title="第三届粤港澳大湾区近视防控高峰论坛在深医召开">第三届粤港澳大湾区近视防控高峰论坛在深医召开</a><span--%>
<%--                                class='news_time2'><strong>18</strong><i>2021-10</i></span><br><em class='news_time2'>--%>
<%--                                来自全国的 40 多名眼科专家汇聚一堂，采取线上线下联动的形式，共同分享近视防控和视网膜手术的新技术、新进展。</em>--%>
<%--                        </li>--%>
<%--                    </div>--%>
<%--                </ul>--%>

<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--    <div class="case_bg" style="background:url(src/picture/product.jpg)">--%>
<%--        <div class="container">--%>
<%--            <div class="row">--%>
<%--                <div class="col-xs-12 col-sm-12 col-md-12">--%>
<%--                    <div class="case_head" data-move-y="-40px">--%>
<%--                        <h2>重点项目</h2>--%>
<%--                        <p><span>————————————</span>   携手同行，与您一起塑造未来   <span>————————————</span></p>--%>
<%--                    </div>--%>
<%--                    <div class="case_list">--%>

<%--                        <div class="col-sm-4 col-md-4 col-mm-12 case_img" data-move-y="50px">--%>
<%--                            <div class="thumbnail">--%>
<%--                                <a href="detail1.html"><img src="src/picture/化妆品原材料.jpg" class="opacity_img2"--%>
<%--                                        alt="客户案例"></a>--%>
<%--                                <h4 class="case_title"><a href="detail1.html">国家重点学科及重点培育专科</a></h4>--%>
<%--                                <p class="case_des">满足精细化工行业，纳米新材料行业，环保行业，新能源行业等分散研磨需求</p>--%>
<%--                            </div>--%>
<%--                        </div>--%>

<%--                        <div class="col-sm-4 col-md-4 col-mm-12 case_img" data-move-y="50px">--%>
<%--                            <div class="thumbnail">--%>
<%--                                <a href="detail1.html"><img src="src/picture/化妆品原材料.jpg" class="opacity_img2"--%>
<%--                                        alt="客户案例"></a>--%>
<%--                                <h4 class="case_title"><a href="detail1.html">国家卫生健康委临床重点专科</a></h4>--%>
<%--                                <p class="case_des">满足精细化工行业，纳米新材料行业，环保行业，新能源行业等分散研磨需求</p>--%>
<%--                            </div>--%>
<%--                        </div>--%>

<%--                        <div class="col-sm-4 col-md-4 col-mm-12 case_img" data-move-y="50px">--%>
<%--                            <div class="thumbnail">--%>
<%--                                <a href="detail1.html"><img src="src/picture/化妆品原材料.jpg" class="opacity_img2"--%>
<%--                                        alt="客户案例"></a>--%>
<%--                                <h4 class="case_title"><a href="detail1.html">国家级省部级质控中心</a></h4>--%>
<%--                                <p class="case_des">满足精细化工行业，纳米新材料行业，环保行业，新能源行业等分散研磨需求</p>--%>
<%--                            </div>--%>
<%--                        </div>--%>

<%--                    </div>--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>
<%--    <div class="container">--%>
<%--        <div class="row">--%>
<%--            <div class="product_head" data-move-y="-40px">--%>
<%--                <h2>特色科室</h2>--%>
<%--                <p>APPLICATION AREA</p>--%>
<%--            </div>--%>
<%--            <div class="col-xs-12 col-sm-12 col-md-12">--%>
<%--                <div class="product_list">--%>


<%--                    <div class="col-sm-4 col-md-4 col-mm-6 product_img" data-move-y="50px">--%>
<%--                        <a href="detail1.html">--%>
<%--                            <img src="src/picture/国家重点学科及重点培育专科.jpg" class="img-thumbnail" alt="贴标机">--%>
<%--                        </a>--%>
<%--                        <p class="product_title"><a href="detail1.html" title="贴标机">国家级省部级质控中心</a></p>--%>
<%--                    </div>--%>

<%--                    <div class="col-sm-4 col-md-4 col-mm-6 product_img" data-move-y="50px">--%>
<%--                        <a href="detail1.html">--%>
<%--                            <img src="src/picture/国家卫生健康委临床重点专科.jpg" class="img-thumbnail" alt="贴标机">--%>
<%--                        </a>--%>
<%--                        <p class="product_title"><a href="detail1.html" title="贴标机">国家卫生健康委临床重点专科</a></p>--%>
<%--                    </div>--%>

<%--                    <div class="col-sm-4 col-md-4 col-mm-6 product_img" data-move-y="50px">--%>
<%--                        <a href="detail1.html">--%>
<%--                            <img src="src/picture/国家级省部级质控中心.jpg" class="img-thumbnail" alt="贴标机">--%>
<%--                        </a>--%>
<%--                        <p class="product_title"><a href="detail1.html" title="贴标机">国家重点学科及重点培育专科</a></p>--%>
<%--                    </div>--%>

<%--                    <div class="col-sm-4 col-md-4 col-mm-6 product_img" data-move-y="50px">--%>
<%--                        <a href="detail1.html">--%>
<%--                            <img src="src/picture/国家重点学科及重点培育专科.jpg" class="img-thumbnail" alt="贴标机">--%>
<%--                        </a>--%>
<%--                        <p class="product_title"><a href="detail1.html" title="贴标机">国家级省部级质控中心</a></p>--%>
<%--                    </div>--%>

<%--                    <div class="col-sm-4 col-md-4 col-mm-6 product_img" data-move-y="50px">--%>
<%--                        <a href="detail1.html">--%>
<%--                            <img src="src/picture/国家卫生健康委临床重点专科.jpg" class="img-thumbnail" alt="贴标机">--%>
<%--                        </a>--%>
<%--                        <p class="product_title"><a href="detail1.html" title="贴标机">国家卫生健康委临床重点专科</a></p>--%>
<%--                    </div>--%>

<%--                    <div class="col-sm-4 col-md-4 col-mm-6 product_img" data-move-y="50px">--%>
<%--                        <a href="detail1.html">--%>
<%--                            <img src="src/picture/国家级省部级质控中心.jpg" class="img-thumbnail" alt="贴标机">--%>
<%--                        </a>--%>
<%--                        <p class="product_title"><a href="detail1.html" title="贴标机">国家重点学科及重点培育专科</a></p>--%>
<%--                    </div>--%>


<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--    </div>--%>

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


