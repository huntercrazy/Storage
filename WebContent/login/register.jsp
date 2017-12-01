<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta>
<meta name="Keywords" content="">
<meta name="Description" content="">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>

<link rel="stylesheet" href="${pageContext.request.contextPath }/login/css/register.css" type='text/css'>
<script type="text/javascript" src="${pageContext.request.contextPath }/login/js/jquery.min.js"></script>
<script type="text/javascript">


$(function(){
	
//	var $name = $(":text[name='name']");
	 
//	$($name).focusout(function(){
//		var url = "validateName.customer";
//		var params = {"name":$(this).val().trim(),"time":new Date()};
//		$.post(url,params,function(data){
//			//后台返回回来一个json数据
//			if(data.exist){
//				$("span:eq(0)").text($name.val().trim()+"已被占用")
//			}else if(!data.exist&&$name.val().trim().length!=0){
//				$("span:eq(0)").text($name.val().trim()+"可以使用")
//				return false;
//			}
//		},"json")
//	})
	
	
})
function validateName(){
	var nameTag = document.getElementById("name");
	var nameMsgSpan = document.getElementById("nameMsgSpan");
	if(nameTag.value.trim()==""){
		nameMsgSpan.style.display="block";
		nameTag.focus();
	}else{
		nameMsgSpan.style.display="none";
	}
}

function validate(){
	var nameTag = document.getElementById("name");
	if(nameTag.value.trim()==""){
		document.getElementById("nameMsgSpan").style.display="block";
		nameTag.focus();
		return false;
	}
	
	var passwordTag = document.getElementById("password");
	if(passwordTag.value.trim()==""){
		document.getElementById("pwdMsgSpan").style.display="block";
		passwordTag.focus();
		return false;
	}
	
	var repasswordTag = document.getElementById("repassword");
	if(passwordTag.value.trim()!=repasswordTag.value.trim()){
		document.getElementById("repwdMsgSpan").style.display="block";
		passwordTag.value = "";
		repasswordTag.value = "";
		passwordTag.focus();
		return false;
	}
	
//	var phoneTag = document.getElementById("phone");
//	var phonePatrn=/^[+]{0,1}(\d){1,3}[ ]?([-]?((\d)|[ ]){1,12})+$/;
//	var phoneValue = phoneTag.value.trim();
//	if(phoneValue!="" && !phonePatrn.exec(phoneValue)){
//		document.getElementById("phoneMsgSpan").style.display="block";
//		phoneTag.value = "";
//		phoneTag.focus();
//		return false;
//	}
	
	
	return true;
}
</script>
</head>
<body>
	<!-- start box -->
	<div class="box">
		<!-- <p class="pt" id="pt">
			<a href="javascript:void(0);">您好,请登录</a>
		</p> -->
		<p class="pt" id="pt">您好,请注册</p> 
		<ul id="uls">
			<li class="curr">
				<form method="post" onsubmit="return validate()">
					<div class="register">
						<p>
							<input type="text" id = "name" name = "name" class = "text user" placeholder="请输入用户名……" onblur="validateName()"/><br/>
							<span></span>
							<span id="nameMsgSpan" class="msgSpan">*姓名不能为空</span>
							
						</p>
						<p>
							<input type="password" id = "password" name = "password" class = "text pwd" placeholder="请输入密码……"/><br/>
							<span id="pwdMsgSpan" class="msgSpan">*密码不能为空</span>
						</p>
						<p>
							<input type="password" id = "repassword" name = "repassword" class = "text pwd" placeholder="请确认密码……"/><br/>
							<span id="repwdMsgSpan" class="msgSpan">*两次密码不一致</span>
						</p>
				<!-- 		<p>
							<input type="text" id = "phone" name = "phone" class = "text phone" placeholder="请输入联系方式……" maxlength = "11"/><br/>
							<span id="phoneMsgSpan" class="msgSpan">*手机号码格式不正确</span>
						</p> -->
						<p>
							<select style="width: 100px; height: 30px; margin-left: 100px" id="userType">
								<option class="type" value="仓库保管员">仓库保管员</option>
								<option class="type" value="货物办理员">货物办理员</option>
								<option class="type" value="经销商">经销商</option>
								<option class="type" value="分销商">分销商</option>
							</select>
						</p>
						<p class="links">
							<!-- <a href="javascript:void(0);">忘记登陆密码</a> -->
							<a href="login.jsp">已有账号？请登录</a>
						</p>
						<p>
							<input type="submit" value="注    册 " class="btn" id="bton"/>
						</p>
					</div>
				</form>
			</li>
			
		</ul>
	</div>
	<!-- end box -->
</body>
<script type="text/javascript" src="${pageContext.request.contextPath }/login/js/jquery.min.js"></script>
<script type="text/javascript">

$(".register").on("click", "#bton", function(){
	var userName = $("#name").val();
	var password = $("#password").val();
	var userType = $('#userType').val();
	window.location.href = '${pageContext.request.contextPath }/user/saveUser?userName='+ userName +"&password="+ password +"&userType="+ userType;
});
</script>
</html>
