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
    <title>已选课程信息</title>
  </head>
  <body>
  	<h3 align="center">课程信息列表<h3>
 	<hr>
  		<table border="1px" align="center" width="500px" height="200px">
  			<tr>
  				<td>课程编号</td>
  				<td>课程名称</td>
  				
  				<td>
  					操作
  		        </td> 
  		        <td>任课教师</td>
  		    </tr> 
  		   <c:forEach items="${courseList1 }" var="course">
			<tr>
 				<td>${course.courseid}</td>
				<td>${course.coursename}</td>	
				<td><a href="${pageContext.request.contextPath}/selectcourse/deleteselectcourse.action?stuid=${user.getuser_name()}&courseid=${course.courseid}">删除该课程</a>
				
				</td> 
				<td>${course.teacher}</td>
			</tr>
			</c:forEach>
  		</table>
  			<p align="center">
    		</p>
  </body>
</html>
