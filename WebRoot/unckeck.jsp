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
<title>美食天下-未审核</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css" href="css/uncheck.css">
<link rel="stylesheet" type="text/css" href="css/public.css">
</head>

<body>
    <div></div>
    <jsp:include page="public/publicHead.jsp"></jsp:include>
    <div class="contentBox">
        <jsp:include page="public/publicLeft.jsp"></jsp:include>
        <div class="rightBox">
            <div class="uncheckBox">
                <img src="#">
                <div class="content"></div>
                <div class="opBtns">
                     <a href="javascript:"><img src="images/1.png"></a>
                     <a href="javascript:"><img src="images/2.png"></a>
                </div>
            </div>
        </div>
    </div>
    <jsp:include page="public/publicFoot.jsp"></jsp:include>
</body>
</html>
