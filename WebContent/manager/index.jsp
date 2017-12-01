<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <title>管理</title>
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/manager/lib/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/manager/lib/bootstrap/css/bootstrap-responsive.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/manager/stylesheets/theme.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/manager/lib/font-awesome/css/font-awesome.css">

    <script src="${pageContext.request.contextPath }/manager/lib/jquery-1.8.1.min.js" type="text/javascript"></script>

    <!-- Demo page code -->
    
    <style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .brand { font-family: georgia, serif; }
        .brand .first {
            color: #ccc;
            font-style: italic;
        }
        .brand .second {
            color: #fff;
            font-weight: bold;
        }
        #information{
        	height: 300px;
        	width: 60%;
        	margin: 0 auto;
        }
        #commit{
        	margin-left: 100px;
        	margin-top: 30px;
        }
        .inputty{
        	margin-top: 20px;
        }
    </style>

    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="../assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
  </head>

  <body> 
    <div class="navbar">
        <div class="navbar-inner">
            <div class="container-fluid">
                <ul class="nav pull-right">
                    
                    <li id="fat-menu" class="dropdown">
                        <a href="#" id="drop3" role="button" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-user"></i> ${sessionScope.user.userName }
                            <i class="icon-caret-down"></i>
                        </a>

                        <ul class="dropdown-menu">
                            <li><a tabindex="-1" href="sign-in.html">Logout</a></li>
                        </ul>
                    </li>
                    
                </ul>
                <a class="brand"><span class="first">Your</span> <span class="second">Company</span></a>
            </div>
        </div>
    </div>
    
    <div class="container-fluid">
        
        <div class="row-fluid">
            <div class="span3" style="display: none;">
                <div class="sidebar-nav">
                  <div class="nav-header" data-toggle="collapse" data-target="#dashboard-menu"><i class="icon-dashboard"></i>业务</div>
                    <ul id="dashboard-menu" class="nav nav-list collapse in">
                        <li><a href="${pageContext.request.contextPath }/ruku/rukulist">入库单</a></li>
                        <li ><a href="${pageContext.request.contextPath }/chuku/chukulist">出库单</a></li>
                        <li ><a href="${pageContext.request.contextPath }/shunhuai/shunhuailist">损坏单</a></li>
                        <li ><a href="${pageContext.request.contextPath }/diaobo/diaobolist">调拨单</a></li>
                    </ul>
                <div class="nav-header" data-toggle="collapse" data-target="#accounts-menu"><i class="icon-briefcase"></i>关系</div>
                <ul id="accounts-menu" class="nav nav-list collapse in">
                  <li ><a href="${pageContext.request.contextPath }/kehu/kehulist">客户</a></li>
                  <li ><a href="${pageContext.request.contextPath }/gongying/gongyinglist">供应商</a></li>
                </ul>

                <div class="nav-header" data-toggle="collapse" data-target="#settings-menu"><i class="icon-exclamation-sign"></i>仓库</div>
                <ul id="settings-menu" class="nav nav-list collapse in">
                  <li ><a href="${pageContext.request.contextPath }/cangku/cangkulist">仓库</a></li>
                  <li><a href="${pageContext.request.contextPath }/goods/goodslist">商品</a></li>
                </ul>

            </div>
        </div>
        <div class="span9">
            <script type="text/javascript" src="lib/jqplot/jquery.jqplot.min.js"></script>
<script type="text/javascript" charset="utf-8" src="javascripts/graphDemo.js"></script>

<h1 class="page-title">首页</h1>

<div class="row-fluid">
    <div class="block">
        <p class="block-heading" data-toggle="collapse" data-target="#chart-container">Performance Chart</p>
        <div id="chart-container" class="block-body collapse in">
            <div id="information">
            	<div id="message">
            		<c:set var="now" value="<%=new java.util.Date() %>"></c:set>
            		工号:<input type="text" readonly="readonly" value="${sessionScope.user.userId }" class="inputty" id="userId"/><br>
            		姓名:<input type="text" readonly="readonly" value="${sessionScope.user.userName }" class="inputty" id="userName"/><br>
            		工种:<input type="text" readonly="readonly" value="${sessionScope.user.userType }" class="inputty" id="userType"/><br>
            		时间:<span class="inputty" id="worktime"><fmt:formatDate value="${now }" type="both"/></span><br>
            	</div>
            	<button id="commit" type="submit">身份确认</button>
            
            </div>
        </div>
    </div>
</div>

        </div>
    </div>

    </div>

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${pageContext.request.contextPath }/manager/lib/bootstrap/js/bootstrap.js"></script>
  

  </body>
  <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.2.min.js"></script>
  <script type="text/javascript">
  	$("#commit").on("click", function(){
  		var userId = $("#userId").val().trim();
  	  	var userName = $("#userName").val().trim();
  	  	var userType = $("#userType").val().trim();
  	  	var workTime = $("#worktime").val().trim();
  	  	if(userId == null || userName == null || userType == null){
  	  		window.location.href = '${pageContext.request.contextPath }/login/login.jsp'
  	  	}else{
  	  		$.ajax({
  	  			url: "${pageContext.request.contextPath }/user/addWorkTime?userId="+ userId +"&userName="+ userName +"&userType="+ userType +"&workTime="+workTime,
  		  		type: 'POST',
  				contentType: 'application/json; charset=utf-8',
  				//	dataType: 'jsonp', 
  				scriptCharset: 'utf-8',
  				dataType: "json",
  				success:function(data){
  					if(data.count==1){
  						alert(userName+":身份确认");
  						window.location.href = '${pageContext.request.contextPath }/manager/ruku.jsp';
  					}else{
  						alert("请重新登录!");
  						window.location.href = '${pageContext.request.contextPath }/login/login.jsp';
  					}
  				},
  				error:function(err){
  					alert("请重新登录!");
  					window.location.href = '${pageContext.request.contextPath }/login/login.jsp';
  				},
  	  		});
  	  	}
  	})
  	
  </script>
</html>