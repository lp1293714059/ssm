<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>修改信息</title>
    <base href="<%=basePath%>">
  </head>
  <body>
  <br>
  <p align="center">修改学生信息</p>
    	<form  method="post" action="${pageContext.request.contextPath}/selectcourse/editscore1.action" >
    		<table align="center" >
    		 <tr><td>学号id:</td><td><input type="text" name="stuid" value="${selectCourse2.stuid}"/></td></tr><br>
    		<tr><td>课程id:</td><td><input type="text" name="courseid" value="${selectCourse2.courseid}"/></td></tr><br>
    		<tr><td>分数:</td><td><input type="text" name="score" value="${selectCourse2.score}""/></td></tr><br> 
    		
    		<tr><td><input type="submit" value="确认修改"></td></tr>
    		</table>
    	</form>
  </body>
</html>
