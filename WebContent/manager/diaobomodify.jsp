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
                        <li ><a href="${pageContext.request.contextPath }/chuku/chukulist">出库单</a></li>
                        <li ><a href="${pageContext.request.contextPath }/shunhuai/shunhuailist">损坏单</a></li>
                        <li class="active"><a href="${pageContext.request.contextPath }/diaobo/diaobolist">调拨单</a></li>
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
        <input type="text" id="goodsName" class="input-xlarge" value="${diaobo.goodsName }" readonly="readonly">
        <label>操作员</label>
        <input type="text" id="userName" class="input-xlarge" value="${diaobo.userName }" readonly="readonly">
        <label>数量</label>
        <input type="text" id="dbNum" class="input-xlarge" value="${diaobo.dbNum }" readonly="readonly">
        <label>原仓库</label>
        <input type="text" id="oldCkName" class="input-xlarge" value="${diaobo.oldCkName }" readonly="readonly">
        <label>新仓库</label>
        <input type="text" id="newCkName" class="input-xlarge" value="${diaobo.newCkName }" readonly="readonly">
        <label>其余价格</label>
        <input type="text" id="otherPrice" class="input-xlarge" value="${diaobo.otherPrice }" readonly="readonly">
        <label>备注</label>
        <input type="text" id="content" class="input-xlarge" value="${diaobo.content }" readonly="readonly">
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
  
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.min.js"></script>
  	<script type="text/javascript">
  	$(".btn-primary").on("click", function(){
  		window.location.href = '${pageContext.request.contextPath }/diaobo/diaobolist';
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
    					$(".oldckName").append("<option id='oldckName'>"+ ckName.ckName +"</option>");
    					$(".newckName").append("<option id='newckName'>"+ ckName.ckName +"</option>");
    				}
    			}
    		});
    		
    		
    		
    	});
    	$(".btn-primary").on("click", function(){
    		
    		var goodsName = $(".goodsName").val();
    	//	alert(goodsName);
    		var userName = $("#userName").val();
    		var dbNum = $("#dbNum").val();
    		var oldckName = $(".oldckName").val();
    		var newckName = $(".newckName").val();
    		var otherPrice = $("#otherPrice").val();
    		var content = $("#content").val();
    		if(oldckName == newckName){
    			alert("调拨前后的仓库不能相同！")
    		}else if(goodsNam==null || userName==null|| dbNum==null || oldckName==null || newckName==null){
    			alert("数据不完整,请补充")
    		}else{
    			$.ajax({
        			url:'${pageContext.request.contextPath }/kucun/getOneCount?goodsName=' + goodsName + '&ckName=' + oldckName,
        			type: 'POST',
        			contentType: 'application/json; charset=utf-8',
        		//	dataType: 'jsonp', 
           			scriptCharset: 'utf-8',
        			dataType: "json",
        			success:function(data){
        				if(data.onecount<dbNum){
        					alert("原仓库商品数量不足!做多可调拨:"+onecount);
        				}else{
        					window.location.href = '${pageContext.request.contextPath }' + "/kucun/modifyoldCK?goodsName=" + goodsName + "&userName=" + userName + "&dbNum=" + dbNum + "&oldCkName=" + oldckName + "&newCkName=" + newckName + "&otherPrice=" + otherPrice + "&content=" + content + "&ckName=" + oldckName;
        				}
        			}
        		});
    		}
    		
    		
    		
    	//	else{
    	//		window.location.href = '${pageContext.request.contextPath }'
    	 //   		+ "/diaobo/saveDiaoBo?goodsName=" + goodsName + "&userName=" + userName + "&dbNum=" + dbNum + "&oldCkName=" + oldckName + "&newCkName=" + newckName + "&otherPrice=" + otherPrice + "&content=" + content;
    	//	}
    		 
    		
    	});
    </script>
    --> 
</html>


