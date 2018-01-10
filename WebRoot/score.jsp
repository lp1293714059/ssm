<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>分数信息</title>
  </head>
  <body>
  	<h3 align="center">分数信息列表<h3>
 	<hr>
  		<table border="1px" align="center" width="500px" height="200px">
  			<tr>
  				<td>课程编号</td>
  				<td>课程名称</td>
  				
  				
  		        <td>分数</td>
  		    </tr> 
  		   <c:forEach items="${score }" var="StudentScore">
			<tr>
 				<td>${StudentScore.courseid}</td>
				<td>${StudentScore.coursename}</td>	
				
				<td>${StudentScore.score}</td>
			</tr>
			</c:forEach>
  		</table>
  			<p align="center">
    		</p>
  </body>
</html>
