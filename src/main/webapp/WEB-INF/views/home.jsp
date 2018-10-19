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
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<%
    int listCount;

	List<HashMap<String, Object>> resultTableList = new ArrayList<HashMap<String, Object>>();
	resultTableList = (ArrayList<HashMap<String, Object>>)request.getAttribute("selectTableList");
	listCount = resultTableList.size();
%>
<p></p>
<p></p>

<form action="">
	<div id="testTable">

		<table border="1" bordercolor="1313EE" >

			<tbody>

				<tr>

					<td width="33%" align="center">

						<label>tbCode</label>

					</td>

					<td width="33%" align="center">

						<label>tableName</label>

					</td>
			

				</tr>

				<%

					if(listCount > 0){

						for(int i=0; i<listCount; i++){

							HashMap<String, Object> tableListMap = resultTableList.get(i);

				%>

				<tr>

					<td width="33%" align="center">

						<label><%= tableListMap.get("ID").toString() %></label>

					</td>

					<td width="33%" align="center">

						<label><%= tableListMap.get("NAME").toString() %></label>

					</td>


				</tr>
				<%
						}
					}
				%>
			</tbody>
		</table>
	</div>
</form>	
</body>


</html>
