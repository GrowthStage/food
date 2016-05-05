<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@  taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>美食天下-登录首页</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/index.css">
<script type="text/javascript">
	function checkInput() {
		var name = document.getElementById("name");
		var password = document.getElementById("passwd");
		if (name.value == "" || password.value == "") {
			alert("用户名或密码不能为空!");
			return false;
		} else

			return true;
	}	
</script>
</head>

<body>
    <jsp:include page="public/publicHead.jsp" flush="true"></jsp:include>
	<div class="contentBox" style="background-image:Url(images/bg.jpg);">
		<div class="loginBox">
			<form action="javascript:" method="post">
				<ul>
					<li>账号<input id="name" name="name" type="text" size="20"></li>
					<li>密码<input id="passwd" name="passwd" type="password" size="20"></li>
				</ul>
			</form>
			<input class="submit" type="submit" value="登录" onclick="return checkInput()">
		</div>
	</div>
</body>
</html>
