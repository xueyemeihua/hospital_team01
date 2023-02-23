<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://"
+ request.getServerName() + ":" + request.getServerPort()
+ path + "/";
%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>简历申请表</title>
		<script src="js/jquery1.12.4.js"></script>
		<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>



	</head>



	<body background="https://ts1.cn.mm.bing.net/th/id/R-C.f903e479e8df3594d7f714617a69297f?rik=TJpNC70uGV1JqA&riu=http%3a%2f%2fwww.wendangwang.com%2fpic%2f567facce48908060f0cb1563%2f3-810-jpg_6-1080-0-0-1080.jpg&ehk=tLyT%2b5fizPy7mUTZGc3hxxaO6dpKOO4wI%2fpM9eZ1yK8%3d&risl=&pid=ImgRaw&r=0">
	<center>
		<form action="/addApplicant" target="_blank" method="get" >
			<table border="0" cellspacing="" cellpadding="">
				<tr>
					<td><label for="name">名字:</label></td>
					<td><input type="text" name="name" id="name" required="required" onblur="blur()"/><span id="span3"></span></td>
				</tr>
				<tr>
					<td><label for="carid">身份证:</label></td>
					<td><input type="text" name="carid" id="carid" required="required" onblur="blur()"/><span id="span1"></span></td>
				</tr>
				<tr>
					<td><label for="phone">手机号:</label></td>
					<td><input type="text" name="phone" required="required" id="phone" value="" onblur="blur()"/><span id="span2"></span></td>
				</tr>
				<tr>

				<tr>
					<td><label for="myEmail">电子邮箱:</label></td>
					<td><input type="email" name="myEmail" id="myEmail" onblur="blur()"/><span id="span" required="required"></span></td>
				</tr>
				<tr>
					<td><label>性别:</label></td>
					<td>
						<input type="radio" name="sex" id="man" value="男" />男
						<input type="radio" name="sex" id="woman" value="女" />女
					</td>
				</tr>

				<tr>
					<td> <label>科室:</label></td>
					<td>
						<select name="deptid" id="dept" onchange="getPost()" required="required">
							<option value="0">请选择</option>
							<c:forEach items="${deptinfos}" var="deptinfo">
								<c:if test="${deptinfo.deptid!=12}">
									<option value="${deptinfo.deptid}">${deptinfo.deptname}</option>
								</c:if>
							</c:forEach>
						</select>
				<tr>
					<td align="right">岗位:</td>
					<td>
						<select id="postinfos" name="postid" required="required"></select>
					</td>
				</tr>
					</td>
				</tr>
				<tr>
					<td>期望薪资:</td>
					<td><input type="number" maxlength="5" name="salary" required="required"/></td>
				</tr>

				<tr>
					<td>自我介绍:</td>
					<td><textarea cols="40" rows="10" name="myself" required="required"></textarea></td>
				</tr>

				<tr>
					<td>工作经历:</td>
					<td><textarea cols="40" rows="10" name="agowork" required="required"></textarea></td>
				</tr>

			</table>
			<input type="submit" id="stamp" value="提交" disabled="disabled"/>
			<button onclick="reset();return false;" >重填</button>
		</form>
	</center>

	<script>
		youemail = 0;
		youphone = 0;
		youcarid = 0;
		youname = 0;
		//document.getElementById("stamp").setAttribute("disabled", true);

		// $("#submit").focus(function () {
		// 	// var stamp = document.getElementById("submit");
		// 	// stamp.disabled=true
		//
		// 	if (youname == 1){
		// 		if (youcarid == 1){
		// 			if (youphone == 1) {
		// 				if (youemail == 1){
		// 					document.getElementById("stamp").setAttribute("disabled", false);
		// 					alert("可以注册")
		// 				} else{
		// 					alert("检查邮箱是否规范")
		// 				}
		// 			}else{
		// 				alert("检查手机号是否规范")
		// 			}
		// 		}else{
		// 			alert("检查身份证是否规范")
		// 		}
		// 	}else {
		// 		alert("检查姓名是否规范")
		// 	}
		// })





		function getPost() {
			$.get("http://localhost:8080/getPostinfo","deptid="+$("#dept").val(),function (data){
				var jsonData=eval("("+data+")")
				var s = ''
				if (jsonData.length != 0) {
					for (var i = 0; i < jsonData.length; i++) {
						$("#postinfos").children().remove();
						s += "<option value='" +
								jsonData[i].postid +
								"'>" +
								jsonData[i].postname +
								"</option>"
					}
					$("#postinfos").append(s)
				} else {
					$("#postinfos").children().remove();
				}
			})
		}


		$("#name").blur(function () {
			var name = $("#name").val();
			var namee = /^[\u4e00-\u9fa5]{2,4}$/;
			var nameee = namee.test(name)
			if (nameee){
				//可以
				youname = 1;

				$("#span3").text("姓名可用")
				$("#span3").attr("color", "greenyellow")

				return youname;
			} else{
				//不可以
				$("#span3").text("姓名不可以")
				$("#span3").attr("color", "red")

				return false;
			}
		})




		$("#myEmail").blur(function() {
			var str = "123456789"
			var str1 = /^ [a-zA-Z0-9_-]+@ [a-zA-Z0-9_-]+ (. [a-zA-Z0-9_-]+)+$/
			var flag = 1
			//获得用户输入的邮箱内容
			var email = $("#myEmail").val()

			// for(var i = 0; i < email.length; i++) {
			// 	if(str1.indexOf(email.charAt(i)) == -1) {
			// 		flag = 0
			// 		break
			// 	}
			// }
			if(flag == 1 && str.indexOf(email.substring(0, 1)) != -1 && email.substring(email.length - 4) == ".com"  && email.indexOf(".") == email.lastIndexOf(".") && email.indexOf("@") == email.lastIndexOf("@") && email.indexOf("@") != -1) {
				$("#span").html("<font color='greenyellow'>输入合理√</font>")
				youemail = 1;
				eflag = true
			} else {
				$("#span").html("<font color='red'>输入不合理×</font>")
				eflag = false

			}
		})



		$("#carid").blur(function () {
			var reg = /^[1-9]\d{5}(19|20)\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/;
			var carid = $("#carid").val();
			var caridd = reg.test(carid)
			if (caridd){
				//可以
				//判定该身份证号码是否已经被申请,保证数据唯一性,
				$.get("http://localhost:8080/selectCarid","applicantCarid="+$("#carid").val(),function (i) {
					if (i != 0) {
						//有了,不能使用
						$("#span1").text("该身份信息重复提交")
						$("#span1").attr("color", "red")
					} else {
						youcarid = 1;
						//可以使用
						$("#span1").text("身份证可用")
						$("#span1").attr("color", "greenyellow")
						return youcarid;
					}
				})
			} else{
				//不可以
				$("#span1").text("身份证不合理")
				$("#span1").attr("color", "red")

			}
		})


		$("#phone").blur(function () {
			var phone = $("#phone").val();
			var phonee = /^1(3[0-9]|4[01456879]|5[0-35-9]|6[2567]|7[0-8]|8[0-9]|9[0-35-9])\d{8}$/;
			var phoneee = phonee.test(phone)
			if (phoneee){
				//可以
				youphone = 1;

				$("#span2").text("手机号可用")
				$("#span2").attr("color", "greenyellow")

				return youphone;
			} else{
				//不可以
				$("#span2").text("手机号不可以")
				$("#span2").attr("color", "red")

				return false;
			}
		})





	</script>

	</body>
</html>
