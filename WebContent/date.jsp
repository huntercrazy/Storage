<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/front/plugins/layui/css/layui.css" media="all" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/front/css/global.css" media="all">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/front/plugins/font-awesome/css/font-awesome.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath }/front/css/table.css" />
		<style type="text/css">
			 form{margin:0px;display: inline}
		</style>
</head>
<body>

  <div class="admin-main">
	
			
			<fieldset class="layui-elem-field">
			
				<legend>我的上月考勤记录</legend>
				<div class="layui-field-box">
					<table class="site-table table-hover">
						<thead align="center">
							<tr style="text-align: center;">
								<td width="12.5%">序号</td>
								<td width="12.5%">姓名</td>
								<td width="12.5%">年份</td>
								<td width="12.5%">月份</td>
								<td width="12.5%">迟到</td>
								<td width="12.5%">早退</td>
								<td width="12.5%">旷工</td>
								<td width="12.5%">出勤</td>
								
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${leavelist}" var="leave" varStatus="status">
								<tr >
									<td>${status.count}</td>
						            <td>${report.employee.name}</td>
						            <td>${report.year}</td>
						            <td>${report.month}</td>
						            <td>${report.late}</td>
						            <td>${report.leave_early}</td>
						            <td>${report.neglect_work}</td>
						            <td>${report.attend}</td>
								</tr>
							</c:forEach>
					</table>
				</div>
			</fieldset>
		<script type="text/javascript" src="${pageContext.request.contextPath }/front/plugins/layui/layui.js"></script>
		<script>

				//设置点击后表格的颜色
				$('.site-table tbody tr').on('click', function(event) {
					var $this = $(this);
					var $input = $this.children('td').eq(0).find('input');
					$input.on('ifChecked', function(e) {
						$this.css('background-color', '#EEEEEE');
					});
					$input.on('ifUnchecked', function(e) {
						$this.removeAttr('style');
					});
					$input.iCheck('toggle');
				}).find('input').each(function() {
					var $this = $(this);
					$this.on('ifChecked', function(e) {
						$this.parents('tr').css('background-color', '#EEEEEE');
					});
					$this.on('ifUnchecked', function(e) {
						$this.parents('tr').removeAttr('style');
					});
				});
				$('#selected-all').on('ifChanged', function(event) {
					var $input = $('.site-table tbody tr td').find('input');
					$input.iCheck(event.currentTarget.checked ? 'check' : 'uncheck');
				});
			});
      </script>
</body>
</html>