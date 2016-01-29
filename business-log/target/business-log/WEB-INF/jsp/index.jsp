<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>后台设置</title>
<script type="text/javascript">
	function showChild(divId) {
		var div_obj = document.getElementById(divId);
		if (div_obj.style.display == '') {
			div_obj.style.display = "none";
		} else {
			div_obj.style.display = '';
		}
	}
	
	function loginOut(){
		window.location.href = "/cms/user/loginOut";
	}
</script>
<style type="text/css">
.headInfo {
	margin: 5px auto;
	width: 100%;
	background-color: #104E8B;
}

.leftInfo {
	width: 160px;
	height: 400px;
	float: left;
	position: absolute;
	left: 8px;
}

.leftInfo ul {
	padding: 1px;
	margin: 4px;
}

.leftInfo ul li {
	list-style-image: none;
	list-style-type: none;
	margin-bottom: 5px;
	text-align: center;
	padding: 5px;
	color: white;
	background-color: #104E8B;
}

.leftInfo ul div {
	background-color: white;
}

.leftInfo ul div ul li {
	list-style-image: none;
	list-style-type: none;
}

a {
	color: white;
	text-decoration: none;
}

a:hover {
	color: white
}

.rightInfo {
	float: left;
	margin-left: 170px;
	width: 1200px;
	height: 800px;
}

.child {
	background-color: #A4D3EE;;
}
</style>
</head>
<body>
	<div class="headInfo">
		<table width="100%">
			<tr>
				<td style="font-size: 22px; padding-left: 10px; color: white;">猎上网后台管理</td>
			</tr>
			<tr>
				<td style="text-align: right; padding-right: 10px; color: white;"><input type="button" value="退出" onclick="loginOut();"/></td>
			</tr>
		</table>
	</div>
	<div class="leftInfo">
		<ul>
			<li>
				<a href="javascript:showChild('account');">账户模块</a>
				<ul style="display: none;" id="account" class="child">
					<li style="background-color: #A4D3EE;"><a
						style="color: black;" href="/cms/account/user?operation=2"
						target="config">注销账号</a>
					</li>
					<li style="background-color: #A4D3EE;"><a
						style="color: black;" href="/cms/account/user?operation=1"
						target="config">重置密码</a>
					</li>	
				</ul>
			</li>
			<li>
				<a href="javascript:showChild('customer');">客户模块</a>
				<ul style="display: none;" id="customer" class="child">
					<li style="background-color: #A4D3EE;"><a
						style="color: black;" href="/cms/customer/enterprise/"
						target="config">修改招聘企业</a>
					</li>
					<li style="background-color: #A4D3EE;"><a
						style="color: black;" href="/cms/customer/company/"
						target="config">修改猎头公司</a>
					</li>
				</ul>
			</li>
			<li>
				<a href="javascript:showChild('placement');">成单模块</a>
				<ul style="display: none;" id="placement" class="child">
					<li style="background-color: #A4D3EE;"><a
						style="color: black;" href="/cms/placement/"
						target="config">成单信息</a>
					</li>
				</ul>
			</li>
			<li>
				<a href="javascript:showChild('configure');">参数设置</a>
				<ul style="display: none;" id="configure" class="child">
					<li style="background-color: #A4D3EE;"><a
						style="color: black;" href="/cms/configure/dispatch/"
						target="config">派单参数</a>
					</li>
					<li style="background-color: #A4D3EE;"><a
						style="color: black;" href="/cms/configure/positionRule/urgentRule"
						target="config">紧急职位参数</a>
					</li>
					<li style="background-color: #A4D3EE;"><a
						style="color: black;" href="/cms/configure/positionRule/pauseRule"
						target="config">暂停职位参数</a>
					</li>
					<li style="background-color: #A4D3EE;"><a
						style="color: black;" href="/cms/configure/candidateRule/limitRule"
						target="config">候选人限制参数</a>
					</li>
				</ul>
			</li>
			<!-- <li>
				<a href="javascript:showChild('operations');">运营配置</a>
				<ul style="display: none;" id="operations" class="child">
					<li style="background-color: #A4D3EE;"><a
						style="color: black;" href="/cms/hot/area"
						target="config">热门城市配置</a>
					</li>
					<li style="background-color: #A4D3EE;"><a
						style="color: black;" href="/cms/hot/industry"
						target="config">热门行业配置</a>
					</li>
					<li style="background-color: #A4D3EE;"><a
						style="color: black;" href="/cms/hot/search/"
						target="config">热门搜索配置</a>
					</li>
					<li style="background-color: #A4D3EE;"><a
						style="color: black;" href="/cms/image/"
						target="config">图片配置</a>
					</li>
					<li style="background-color: #A4D3EE;"><a
						style="color: black;" href="/cms/bar/"
						target="config">分类职位栏配置</a>
					</li>
				</ul>
			</li> -->
			<li>
				<a href="javascript:showChild('evaluation');">征信模块</a>
				<ul style="display: none;" id="evaluation" class="child">
					<li style="background-color: #A4D3EE;"><a
						style="color: black;" href="/cms/evaluation/option/"
						target="config">初始化数据</a>
					</li>
				</ul>
			</li>
		</ul>
	</div>
	<div class="rightInfo">
		<iframe frameborder="0" width="100%" name="config" height="3000">
		</iframe>
	</div>
</body>
</html>