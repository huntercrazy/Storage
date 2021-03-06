<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>管理</title>
    <meta content="text/html; charset=UTF-8" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/manager/lib/bootstrap/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/manager/lib/bootstrap/css/bootstrap.min.css">
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

  <body> 
    
    <div class="navbar">
        <div class="navbar-inner">
            <div class="container-fluid">
                <ul class="nav pull-right">
                    
                    <li id="fat-menu" class="dropdown">
                        <a href="#" id="drop3" role="button" class="dropdown-toggle" data-toggle="dropdown">
                            <i class="icon-user"></i> Jack Smith
                            <i class="icon-caret-down"></i>
                        </a>

                        <ul class="dropdown-menu">
                            
                            <li><a tabindex="-1" href="sign-in.html">退出</a></li>
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
                  <div class="nav-header" data-toggle="collapse" data-target="#dashboard-menu"><i class="icon-dashboard"></i>业务</div>
                    <ul id="dashboard-menu" class="nav nav-list collapse in">
                        <li><a href="${pageContext.request.contextPath }/ruku/rukulist">入库单</a></li>
                        <li class="active"><a href="${pageContext.request.contextPath }/chuku/chukulist">出库单</a></li>
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
                  <li ><a href="${pageContext.request.contextPath }/goods/goodslist">商品</a></li>
                </ul>

            </div>
        </div>
        <div class="span9">
            <h1 class="page-title">详情</h1>
<div class="btn-toolbar">
    <button class="btn btn-primary"><i class="icon-save"></i> 返回</button>
  <div class="btn-group">
  </div>
</div>
<div class="well">
    <ul class="nav nav-tabs">
      <li class="active"><a href="#home" data-toggle="tab">Profile</a></li>
    </ul>
    <div id="myTabContent" class="tab-content">
      <div class="tab-pane active in" id="home">
    <form id="tab">
        <label>商品名称</label>
        <input type="text" id="goodsName" class="input-xlarge" value="${chuku.goodsName }" readonly="readonly">
        <label>操作员</label>
        <input type="text" id="userName" class="input-xlarge" value="${chuku.userName }" readonly="readonly">
        <label>价格</label>
        <input type="text" id="outPrice" class="input-xlarge" value="${chuku.outPrice }" readonly="readonly">
        <label>数量</label>
        <input type="text" id="outNum" class="input-xlarge" value="${chuku.outNum }" readonly="readonly">
        <label>客户</label>
        <input type="text" id="khName" class="input-xlarge" value="${chuku.khName }" readonly="readonly">
        <label>仓库</label>
        <input type="text" id="ckName" class="input-xlarge" value="${chuku.ckName }" readonly="readonly">
    	<label>状态</label>
        <input type="text" id="status" class="input-xlarge" value="${chuku.status}" readonly="readonly">
        <label>其余价格</label>
        <input type="text" id="otherPrice" class="input-xlarge" value="${chuku.otherPrice }" readonly="readonly">
        <label>备注</label>
        <input type="text" id="content" class="input-xlarge" value="${chuku.content }" readonly="readonly">
    </form>
      </div>
      <div class="tab-pane fade" id="profile">
    
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
  $(".btn-primary").on("click", function(){
	  window.location.href = '${pageContext.request.contextPath }/chuku/chukulist';
  });
  
  </script>
 <!--   <script type="text/javascript">
    	$(document).ready(function(){
    		
    		$.ajax({
    			url: '${pageContext.request.contextPath }/goods/gdName',
    			type: 'POST',
    			contentType: 'application/json; charset=utf-8',
    		//	dataType: 'jsonp', 
       			scriptCharset: 'utf-8',
    			dataType: "json",
    			success:function(data){
    				for(var i=0;i<data.goodsNameArray.length;i++){
    					var goodsName = data.goodsNameArray[i];
    					$(".goodsName").append("<option id='goodsName'>"+ goodsName.goodsName +"</option>");
    				}
    			}
    		});
    		
    		$.ajax({
    			url: '${pageContext.request.contextPath }/cangku/ckName',
    			type: 'POST',
    			contentType: 'application/json; charset=utf-8',
    		//	dataType: 'jsonp', 
       			scriptCharset: 'utf-8',
    			dataType: "json",
    			success:function(data){
    				for(var i=0;i<data.ckNameArray.length;i++){
    					var ckName = data.ckNameArray[i];
    					$(".ckName").append("<option id='ckName'>"+ ckName.ckName +"</option>");
    				}
    			}
    		});
    		
    		$.ajax({
    			url: '${pageContext.request.contextPath }/kehu/khName',
    			type: 'POST',
    			contentType: 'application/json; charset=utf-8',
    		//	dataType: 'jsonp', 
       			scriptCharset: 'utf-8',
    			dataType: "json",
    			success:function(data){
    				for(var i=0;i<data.khNameArray.length;i++){
    					var khName = data.khNameArray[i];
    					$(".khName").append("<option id='khName'>"+ khName.khName +"</option>");
    				}
    			}
    		});
    		
    		
    		
    	});
    	$(".btn-primary").on("click", function(){
    		
    		var goodsName = $(".goodsName").val();
    		var userName = $("#userName").val();
    		var outPrice = $("#outPrice").val();
    		var outNum = $("#outNum").val();
    		var khName = $(".khName").val();
    		var ckName = $(".ckName").val();
    		var status = $(".sta").val();
    		var otherPrice = $("#otherPrice").val();
    		var content = $("#content").val();
    		if(goodName==null || userName==null || outPrice==null || outNum==null || khName==null || ckName==null || status==null){
    			alert("数据不完整,请补充");
    		}else{
	    		$.ajax({
	    			url:'${pageContext.request.contextPath }/kucun/getOneCount?goodsName=' + goodsName + '&ckName=' + ckName,
	    			type: 'POST',
	    			contentType: 'application/json; charset=utf-8',
	    		//	dataType: 'jsonp', 
	       			scriptCharset: 'utf-8',
	    			dataType: "json",
	    			success:function(data){
	    				if(data.onecount<outNum){
	    					alert("仓库商品数量不足!最多可调拨:"+onecount);
	    				}else{
	    					window.location.href = '${pageContext.request.contextPath }' + "/chuku/saveChuKu?goodsName=" + goodsName + "&userName=" + userName + "&outPrice=" + outPrice + "&outNum=" + outNum + "&knName=" + khName + "&ckName=" + ckName + "&status=" + status + "&otherPrice=" + otherPrice + "&content=" + content;
	    				}
	    			}
	    		});
    		}
    	//	window.location.href = '${pageContext.request.contextPath }' + "/chuku/saveChuKu?goodsName=" + goodsName + "&userName=" + userName + "&outPrice=" + outPrice + "&outNum=" + outNum + "&knName=" + khName + "&ckName=" + ckName + "&status=" + status + "&otherPrice=" + otherPrice + "&content=" + content; 
    	});
    </script> --> 
</html>


