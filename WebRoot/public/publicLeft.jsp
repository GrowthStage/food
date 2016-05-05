<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'publicLeft.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/public.css">
<script type="text/javascript">
	function InChangeStyle(c) {
		c.style.backgroundColor = "#00A600";
		c.childNodes.item(0).style.color = "#FFF";
	}
	function OutChangeStyle(c) {
		c.style.backgroundColor = "#F0F0F0";
		c.childNodes.item(0).style.color = "#6C6C6C";
	}
</script>
</head>

<body>
    <div class="leftNav">
        <input type="button" value="查询" disabled>
        <ul>
            <li onmouseover="InChangeStyle(this);" onmouseout="OutChangeStyle(this);"><a href="javascript:">未审核</a></li>
            <li onmouseover="InChangeStyle(this);"onmouseout="OutChangeStyle(this);"><a href="javascript:">已审核</a></li>
        </ul>
    </div>
</body>
</html>
