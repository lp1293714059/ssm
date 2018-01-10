<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>修改教师信息</title>
    <base href="<%=basePath%>">
  </head>
  <body>
  您已经选过这个课了！<a href="index1.jsp">返回</a>
  </body>
</html>