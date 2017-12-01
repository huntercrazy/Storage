<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath }/css/first.css" />
<style type="text/css">
.first{margin: 0 auto;}
.first .check{width: 400px;height: 350px;border: 2px solid #969292;margin: 0 auto;margin-top: 40px;font-family: '微软雅黑';font-size: 18px;}
.first .check .info{margin: 0 auto;}
</style>
</head>
<body style="background-color: white;">
 <div  >
    <!-- 
    <div class="adtip">
      <div class="tip">
      </div>
    </div> -->
    <div class="first">
    <div class="check">
    	<p>&nbsp;&nbsp;请确认登录身份：</p>
    	<div class="info">
    	<form action="" method="post">
    	<table width="100%">
    	<tr>
    		<td align="right">姓名:</td>
    		<td><input type="text" id="userName" name="userName" size="30" readonly="readonly" value="姓名"/></td>
    	</tr>
    	<tr>
    		<td align="right">工号:</td>
    		<td><input type="text" id="userId" name="userId" size="30" readonly="readonly" value="工号"/></td>
    	</tr>
    	<tr>
    		<td align="right">工种:</td>
    		<td><input type="text" id="userType" name="userType" size="30" readonly="readonly" value="工种"/></td>
    	</tr>
    	<tr>
    		<td colspan="2" align="center">
    			<input type="submit" value="确认身份"/>
    			<input type="button" value="身份有误" onclick="window.location.replace('login.html')"/>
    		</td>
    	</tr>
    	</table>
    	</form>
    	</div>
    	<p><span style="color: red">&nbsp;&nbsp;注意:</span>一旦确认身份，登录信息将记录在库，请仔细确认，不要冒用他人身份。</p>
    	<p style="color: red">&nbsp;&nbsp;如果发现自己的账号存在被冒用风险，请点击个人中心进行修改密码。</p>
    </div>
    
    </div>
    
  </div>
</body>
</html>