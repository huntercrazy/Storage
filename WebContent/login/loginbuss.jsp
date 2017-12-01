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
	alert(userName)
	var password = $("#password").val().trim();
	alert(password)
	var userType = $(".usertype").val().trim();
	alert(userType)
	if(userName == null || password == null){
		alert("用户名或密码不能为空!");
	}else{
		window.location.href = '${pageContext.request.contextPath }/user/login?userName='+ userName +"&password="+ password +"&userType="+ userType;
	}
}
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
							商户:<select style="width: 100px; height: 30px; margin-left: 100px" class="usertype">
								<option class="type" value="经销商">经销商</option>
								<option class="type" value="分销商">分销商</option>
							</select>
							<a href="${pageContext.request.contextPath }/login/login.jsp">我是员工</a>
						</p>
						<!--<p class="links">
							<a href="javascript:void(0);">忘记登陆密码</a> 
							<a href="register.jsp">免费注册</a>
						</p>
						-->
						<p>
							<input type=button value="登    录 " class="btn" onclick="userlogin()" />
						</p>
					</div>
				</form>
			</li>
			<!-- <li>
				<form action="addUserServlet" method="post">
					<div class="login" >
						<p>
							<input type="text" name = "user"
							class=" text user" placeholder="请输入用户名……" 
							onblur="loginSuggest(this)"
							/>
							<span id="suser"></span>
						</p>
						<p>
							<input type="password" name = "password" class=" text pwd" 
							placeholder="请输入密码……" maxlength = "16"
							onblur="vertionpwd(this)"
							/>
							<span id="spwd"></span>
						</p>
						<p>
							<input type="submit" value="注     册" class="but" />
						</p>
					</div>
				</form>
			</li> -->
		</ul>
	</div>
	<!-- end box -->
</body>
</html>