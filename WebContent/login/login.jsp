<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta>
<meta name="Keywords" content="">
<meta name="Description" content="">
<title>登录</title>

<link rel="stylesheet" href="${pageContext.request.contextPath }/login/css/login.css" type='text/css'>
<script type="text/javascript" src="${pageContext.request.contextPath }/login/js/jquery.min.js"></script>
<script type="text/javascript">
	function userlogin(){
		var userName = $("#name").val().trim();
		var password = $("#password").val().trim();
		var userType = $(".usertype").val().trim();
		if(userName == null || password == null){
			alert("用户名或密码不能为空!");
		}else{
			window.location.href = '${pageContext.request.contextPath }/user/login?userName='+ userName +"&password="+ password +"&userType="+userType;
		}
	}
//	$(function(){
//		$(":submit").click(function(){
//			//取得用户信息
//			var name = $("#name").val().trim();
//			var password = $("#password").val().trim();
//			//向服务器发送请求
//			var url = "login.customer";
//			var params = {"name":name,"password":password,"time":new Date()}
//			$.post(url,params,function(data){
//				$("span").text(data.msg)
//			},"json");
//			return true;
//		})
//	})
//	$(".btn").on("click", function() {
//		$.ajax({
//			url: "${pageContext.request.contextPath }/user/login",
//			type: "POST",
//			contentType: 'application/json; charset=utf-8',
    		//	dataType: 'jsonp', 
//       		scriptCharset: 'utf-8',
//    		dataType: "json",
//		});
//	});
</script>
</head>
<body>
	<!-- start box -->
	<div class="box">
		<!-- <p class="pt" id="pt">
			<a href="javascript:void(0);">您好,请登录</a>
		</p> -->
		<p class="pt" id="pt">您好,请登录</p> 
		<ul id="uls">
			<li class="curr">
				<form>
					<div class="login">
						<p>
							<input type="text" id = "name" name = "name"class=" text user" placeholder="请输入用户名……"/>
							<span></span>
						</p>
						<p>
							<input type="password" id = "password" name = "password" class=" text pwd" placeholder="请输入密码……" maxlength = "16"/>
						</p>
						<p>
							工种:<select style="width: 100px; height: 30px; margin-left: 100px" class="usertype">
								<option class="type" value="仓库保管员">仓库保管员</option>
								<option class="type" value="货物办理员">货物办理员</option>
							</select>
							<a href="${pageContext.request.contextPath }/login/loginbuss.jsp">我是商户</a>
						</p>
						<!--<p class="links">
							<a href="javascript:void(0);">忘记登陆密码</a> 
							<a href="register.jsp">免费注册</a>
						</p>
						-->
						<p>
							<input type="submit" value="登    录 " class="btn" onclick="userlogin()"/>
						</p>
					</div>
				</form>
			</li>
			
		</ul>
	</div>
	<!-- end box -->
</body>
</html>