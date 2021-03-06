<%@ page language="java" contentType="text/html; charset=UTF-8"%> 
<%request.setCharacterEncoding("utf-8");%> 
<%response.setContentType("text/html; charset=utf-8"); %>
<%@ page import = "java.util.*" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>



<body>
	<h1>
		Gudi Cafeteria
	</h1>

	<h2>구내식당 리스트</h2>
	<table>
		<tr>
			<th>식당ID</th>
			<th>건물주소</th>
			<th>건물명</th>
			<th>식당명</th>
			<th>전화번호</th>
		</tr>
		<c:forEach var="cafe" items="${cafeList}">
			<tr>
				<td><a href="/cafeteria/getCafemenu.do?cafeid=${cafe.cafe_Id}&menudate="> ${cafe.cafe_Id} </a></td>
				<td>${cafe.build_Addr}</td>
				<td>${cafe.build_Nm}</td>
				<td>${cafe.build_Home}</td>
				<td>${cafe.build_Tel}</td>
			</tr>
		</c:forEach>
	</table>

<p></p>
</body>


</html>
