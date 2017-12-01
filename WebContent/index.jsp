<%@ page  contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
<link type="text/css" rel="stylesheet" href="css/css.css" />
<link  type="text/css" rel="stylesheet" href="css/calendar.css">
 <script type="text/javascript" src="js/jquery-1.7.min.js"></script>
 <script type="text/javascript" src="js/calendar.js"></script>
</head>
<body>
<div class="header">
  <div class="top">
    <ul class="nav">
      <li class="seleli"><a href="first.jsp" target="ifram">首页</a></li>
      <li ><a href="center.jsp " target="ifram">个人中心</a></li>
      <li ><a href="leave.jsp" target="ifram">请假申请</a></li>
      <li ><a href="advice/queryById.action?id=${sessionemployee.id} " target="ifram">意见管理</a></li>
      <li ><a href="salary/queryById.action?id=${sessionemployee.id}" target="ifram">我的薪资</a></li>
      <li ><a href="report/querymyreport.action" target="ifram">我的考勤</a></li>
      
       
    </ul>
    
  </div>

  <div align="right" style="margin-top: 20px;" >
  <ul style="float: none;font-size: 16px;
	padding: 10px 40px;" >
  <li >
    <a href="login/frontloginout.action" > <span  style="font-size: 25px; color: white;">注销</span></a>
 	</li>
  </ul>
   </div>
  </div>

<div class="container" style="float: left; width: 25%;">
  
    <div class="lm01"> <img class="peptx" src="images/0.jpg" />
    </div>
    <div class="pepdet">
        <p>姓名</p>
        <p>工号</p>
        <p>工种</p>
    </div>
  </div>


<div>
		<iframe src="first.jsp" name="ifram" style="position:absolute;width: 75%;height: 100%;"></iframe>
</div>
<div class="footer"></div>
</body>
</html>