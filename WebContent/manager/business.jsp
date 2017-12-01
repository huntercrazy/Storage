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
        a{ text-decoration:none; color: inherit;}
    </style>

    <!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Le fav and touch icons -->
    <link rel="shortcut icon" href="../assets/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="../assets/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="../assets/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="../assets/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="../assets/ico/apple-touch-icon-57-precomposed.png">
  </head>

  <!--[if lt IE 7 ]> <body class="ie ie6"> <![endif]-->
  <!--[if IE 7 ]> <body class="ie ie7"> <![endif]-->
  <!--[if IE 8 ]> <body class="ie ie8"> <![endif]-->
  <!--[if IE 9 ]> <body class="ie ie9"> <![endif]-->
  <!--[if (gt IE 9)|!(IE)]><!--> 
  <body> 
  <!--<![endif]-->
    
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
            <div class="span3">
                <div class="sidebar-nav">
                  <div id="myallcangku" class="nav-header" data-toggle="collapse" data-target="#dashboard-menu"><i class="icon-dashboard"></i>我的仓库</div>
     				<ul id="dashboard-menu" class="nav nav-list collapse in">
                        <li class="myck"><a href="#" class="mycangku">一号仓库</a></li>
                        <li class="myck"><a href="#" class="mycangku">二号仓库</a></li>
                        <li class="myck"><a href="#" class="mycangku">三号仓库</a></li>
                        <li class="myck"><a href="#" class="mycangku">四号仓库</a></li>
                        <li class="myck"><a href="#" class="mycangku">五号仓库</a></li>
                        <li class="myck"><a href="#" class="mycangku">六号仓库</a></li>
                    </ul>
                  
            </div>
        </div>
        <div class="span9">
            <h1 class="page-title">我的仓库</h1>
<div class="btn-toolbar">
    <button class="btn btn-primary" style="display: none;"><i class="icon-plus"></i><a href="${pageContext.request.contextPath }/manager/newcangku.jsp"> 新仓库</a></button>
  <div class="btn-group">
  </div>
</div>
<div class="well">
	<ul class="nav nav-tabs">
      <li class="active"><a href="#home" data-toggle="tab">出库单据</a></li>
    </ul>
    <table class="table">
      <thead>
        <tr>
          <th>序号</th>
          <th>商品名</th>
          <th>操作员</th>
          <th>出库时间</th>
          <th>出库价格</th>
          <th>出库数量</th>
          <th>客户</th>
          <th>仓库</th>
        </tr>
      </thead>
      <tbody>
      	<c:forEach items="${cangkuList }" var="cangku" varStatus="status">
	        <tr>
	          <td>${status.count }<input type="hidden" value="${chuku.id }"/></td>
	          <td>${chuku.goodsName }</td>
	          <td>${chuku.userName }</td>
	          <td>${chuku.outTime }</td>
	          <td>${chuku.outPrice }</td>
	          <td>${chuku.outNum }</td>
	          <td>${chuku.khName }</td>
	          <td>${chuku.ckName }</td>
	        </tr>
        </c:forEach>
      </tbody>
    </table>
</div>

<div class="well">
	<ul class="nav nav-tabs">
      <li class="active"><a href="#home" data-toggle="tab">入库单据</a></li>
    </ul>
    <table class="table">
      <thead>
        <tr>
          <th>序号</th>
          <th>商品名</th>
          <th>操作员</th>
          <th>入库时间</th>
          <th>入库价格</th>
          <th>入库数量</th>
          <th>供应商</th>
          <th>仓库</th>
        </tr>
      </thead>
      <tbody>
      	<c:forEach items="${cangkuList }" var="cangku" varStatus="status">
	        <tr>
	          <td>${status.count }<input type="hidden" value="${ruku.id }"/></td>
	          <td>${ruku.goodsName }</td>
	          <td>${ruku.userName }</td>
	          <td>${ruku.inTime }</td>
	          <td>${ruku.inPrice }</td>
	          <td>${ruku.inNum }</td>
	          <td>${ruku.gyName }</td>
	          <td>${ruku.ckName }</td>
	        </tr>
        </c:forEach>
      </tbody>
    </table>
</div>
<div class="well">
	<ul class="nav nav-tabs">
      <li class="active"><a href="#home" data-toggle="tab">调拨单据</a></li>
    </ul>
    <table class="table">
      <thead>
        <tr>
          <th>序号</th>
          <th>商品名</th>
          <th>操作员</th>
          <th>调拨时间</th>
          <th>调拨数量</th>
          <th>原仓库</th>
          <th>新仓库</th>
        </tr>
      </thead>
      <tbody>
      	<c:forEach items="${cangkuList }" var="cangku" varStatus="status">
	        <tr>
	          <td>${status.count }<input type="hidden" value="${diaobo.id }"/></td>
	          <td>${diaobo.goodsName }</td>
	          <td>${diaobo.userName }</td>
	          <td>${diaobo.dbTime }</td>
	          <td>${diaobo.dbNum }</td>
	          <td>${diaobo.oldCkName }</td>
	          <td>${diaobo.newCkName }</td>
	        </tr>
        </c:forEach>
      </tbody>
    </table>
</div>
<div class="well">
	<ul class="nav nav-tabs">
      <li class="active"><a href="#home" data-toggle="tab">损坏单据</a></li>
    </ul>
    <table class="table">
      <thead>
        <tr>
          <th>序号</th>
          <th>商品名</th>
          <th>操作员</th>
          <th>损坏数量</th>
          <th>所在仓库</th>
        </tr>
      </thead>
      <tbody>
      	<c:forEach items="${cangkuList }" var="cangku" varStatus="status">
	        <tr>
	          <td>${status.count }<input type="hidden" value="${shunhuai.id }"/></td>
	          <td>${shunhuai.goodsName }</td>
	          <td>${shunhuai.userName }</td>
	          <td>${shunhuai.breakNum }</td>
	          <td>${shunhuai.ckName }</td>
	        </tr>
        </c:forEach>
      </tbody>
    </table>
</div>
<!-- 
<div class="modal small hide fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
        <h3 id="myModalLabel">删除提示</h3>
    </div>
    <div class="modal-body">
        <p class="error-text"><i class="icon-warning-sign modal-icon"></i>对不起,已存在仓库不可以删除!</p>
    </div>
    <div class="modal-footer">
        <button class="btn" data-dismiss="modal" aria-hidden="true">取消</button>
        <button class="btn btn-danger" data-dismiss="modal">确定</button>
    </div>
</div>
 -->
        </div>
    </div>
    

    </div>

    

    <!-- Le javascript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="${pageContext.request.contextPath }/manager/lib/bootstrap/js/bootstrap.js"></script>
    
    <script src="${pageContext.request.contextPath }/manager/lib/jquery-1.8.1.min.js" type="text/javascript"></script>
    <script type="text/javascript">
    	$(".mycangku").on("click", function(){
    		var ckName = $(this).text();
  //  		alert(ckName);
    		window.location.href = '${pageContext.request.contextPath }/cangku/mycangku?ckName=' + ckName;
    	});
    </script>
    
    
    
    
    
    
    
    
    

  </body>
</html>


