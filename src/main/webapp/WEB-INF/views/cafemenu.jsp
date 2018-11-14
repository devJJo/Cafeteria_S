<%@ page language="java" contentType="text/html; charset=UTF-8"%> 
<%request.setCharacterEncoding("utf-8");%> 
<%response.setContentType("text/html; charset=utf-8"); %>
<%@ page import = "java.util.*" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Menu List</title>
</head>

<body>
	<h1>
		Gudi Cafeteria
	</h1>

	<h2>[${cafeid}] : ${buildname} ${buildhome} </h2>


		<div>
			<form method="post" action="insertUser.do"  >
				<table  class="table table-bordered table table-hover">
					<tr>
						<td>밥</td>
						<td>:</td>
						<td><input type="text" name="userId" value="쌀밥"/></td>
					</tr>
					<tr>
						<td>국 </td>
						<td>:</td>
						<td><input type="text" name="name" value="된장국"/></td>
					</tr>

					<tr>
					<td colspan="2"  class="text-center">
						<input type="submit" value="등록" /></td>
					</tr>
					
					<tr>					
						<td colspan="2" class="text-center"><a href="getUserList.do">사용자 목록보기</a></td>
					</tr>
				</table>
			</form>
		</div>
	
	

<p></p>
</body>


</html>
