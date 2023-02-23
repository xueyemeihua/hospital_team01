<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>北大青鸟人民医院</title>
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
                <div><a href="#" class="btn btn-primary btn-sm">中文版</a> <a href="#" class="btn btn-primary btn-sm">English</a>
                </div>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-sm-7 col-md-7">
                <a href="hospital_main.jsp"><img src="src/picture/logo.jpg" class="logo" alt="企业通用模版网站"></a>
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
                    <p>000-0000xxxx</p>
                </div>
            </div>
        </div>
    </div>
    <!-- Fixed navbar -->
    <nav id="top_nav" class="navbar navbar-default navbar-src-top">
        <div class="container">
            <div class="navbar-header">

                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                        aria-expanded="false" aria-controls="navbar"><span class="sr-only">导航菜单</span><span
                        class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button>
                <span id="search_btn" class="glyphicon glyphicon-globe" aria-hidden="true"></span>
                <a class="navbar-brand" href="#">MENU</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
                <ul class="nav navbar-nav">
                    <li class=""><a href="hospital_main.jsp">首 页</a>
                </ul>
            </div>
        </div>
    </nav>
</header>
<div class="page_bg" style="background: url(src/image/1617070665.jpg) center top no-repeat;"></div>
<div class="container">
    <div class="row">
        <div class="col-xs-12 col-sm-8 col-md-9" style="float:right">
            <div class="right_head">
                <h2><span>病例展示</span></h2>
            </div>
            <div class="right_contents">
                <div>
                    <table align="center" border="1px" cellpadding="0px" cellspacing="0px">
                        <thead>
                        <th>病例编号</th>
                        <th>病人姓名</th>
                        <th>科室</th>
                        <th>医生</th>
                        <th>诊断结果</th>
                        <th>治疗方案</th>
                        <th>诊断时间</th>
                        <th>病例状态</th>
                        <th>挂号时间</th>
                        <th>挂号等级</th>
                        <th>挂号费</th>
                        <th>操作</th>
                        </thead>
                        <c:forEach var="cr" items="${caseResults}">
                            <tr>
                                <td>${cr.caseid}</td>
                                <td>${cr.sickname}</td>
                                <td>${cr.deptname}</td>
                                <td hidden>${cr.stafid}</td>
                                <td>${cr.stafname}</td>
                                <td>${cr.diagnosis}</td>
                                <td>${cr.curescheme}</td>
                                <td>${cr.curetime}</td>
                                <c:if test="${cr.casestate==1}">
                                    <td>已接诊</td>
                                </c:if>
                                <c:if test="${cr.casestate==0}">
                                    <td>未接诊</td>
                                </c:if>
                                <td>${cr.regdate}</td>
                                <td>${cr.regdesc}</td>
                                <td>${cr.regfee}</td>
                                <td>
                                    <a onclick="getPresicByCaseid(${cr.caseid})">查看药品详情</a>
                                    <a onclick="leaveWords(${cr.caseid})">评价</a></td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>

                <div class="right_head">
                    <h2><span>病例药品详情</span></h2>
                </div>
                <div>
                    <table id="showPresics" border="1px" cellpadding="0px" cellspacing="0px">
                        <tr>
                            <th>病例编号</th>
                            <th>药品名称</th>
                            <th>药品数量</th>
                            <th>药品规格</th>
                            <th>是否抓药</th>
                        </tr>
                    </table>
                </div>
                <script>
                    function getPresicByCaseid(caseid) {
                        $.get("http://localhost:8080/getPresicByCaseid", "caseid=" + caseid, function (data) {
                            let s = ''
                            let presics = eval("(" + data + ")")
                            if (presics.length != 0) {
                                $("#showPresics").children().remove()
                                $("#showPresics").append("<thead>" +
                                    "<th width='100px'>病例编号</th>" +
                                    "<th width='100px'>药品名称</th>" +
                                    "<th width='100px'>药品数量</th>" +
                                    "<th width='100px'>药品规格</th>" +
                                    "<th width='100px'>是否抓药</th>" +
                                    "</thead>")
                                for (let i = 0; i < presics.length; i++) {
                                    if(presics[i].prescstate == 1){
                                        s += "<tr>" +
                                            "<td>" + presics[i].caseid + "</td>" +
                                            "<td>" + presics[i].drugname + "</td>" +
                                            "<td>" + presics[i].drugcount + "</td>" +
                                            "<td>" + presics[i].drugspeci + "</td>" +
                                            "<td>已抓药</td>" +
                                            "</tr>"
                                    } else {
                                        s += "<tr>" +
                                            "<td>" + presics[i].caseid + "</td>" +
                                            "<td>" + presics[i].drugname + "</td>" +
                                            "<td>" + presics[i].drugcount + "</td>" +
                                            "<td>" + presics[i].drugspeci + "</td>" +
                                            "<td>未抓药</td>" +
                                            "</tr>"
                                    }
                                }
                                $("#showPresics").append(s)
                            }
                        })
                    }

                    function leaveWords(caseid) {
                        window.location = "http://localhost:8080/toLeaveword?caseid="+caseid
                    }

                </script>

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
        <span class="link_title">友情链接</span>
        <button id="link_btn" class="glyphicon glyphicon-plus" aria-hidden="true"></button>
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
