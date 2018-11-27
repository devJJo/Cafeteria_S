<%@ page language="java" contentType="text/html; charset=UTF-8"%> 
<%request.setCharacterEncoding("utf-8");%> 
<%response.setContentType("text/html; charset=utf-8"); %>
<%@ page import = "java.util.*" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Menu List</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
	<link rel="stylesheet" href="/resources/demos/style.css">
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
	<script>
	$( function() {
	  $( "#datepicker" ).datepicker({
		changeMonth: true, 
		changeYear: true,
		nextText: '다음 달',
		prevText: '이전 달',
		dateFormat: "yymmdd"
	  });
	} );
	</script>
</head>

<body>
	<h1>
		Gudi Cafeteria
	</h1>

	<h2>[${cafeid}] : ${cafe.build_Nm} ${cafe.build_Home} </h2>
	<form method="get" action="getCafemenu.do"  >
		<p>날짜 : <input type="text" name="menudate" value=${menudate} id="datepicker"> </br>
		Cafe ID : <input type="text" name="cafeid" value=${cafeid}> <input type="submit" value="조회" /> </p>
	</form>

	
		<div>
			<form method="post" action="insertMenu.do"  >
				<p> 점 심  </p>
				<table  class="table table-bordered table table-hover">
					<tr>
						<td>밥</td>
						<td><input type="text" name="rice" value=${menuListL.rice}></td>
					</tr>
					<tr>
						<td>국 </td>
						<td><input type="text" name="soup" value=${menuListL.soup}></td>
					</tr>
					<tr>
						<td>반찬1</td>
						<td><input type="text" name="side_Dish1" value=${menuListL.side_Dish1}></td>
					</tr>
					<tr>
						<td>반찬2</td>
						<td><input type="text" name="name" value=${menuListL.side_Dish2}></td>
					</tr>
					<tr>
						<td>반찬3</td>
						<td><input type="text" name="name" value=${menuListL.side_Dish3}></td>
					</tr>
					<tr>
						<td>반찬4</td>
						<td><input type="text" name="name" value=${menuListL.side_Dish4}></td>
					</tr>
					<tr>
						<td>반찬5</td>
						<td><input type="text" name="name" value=${menuListL.side_Dish5}></td>
					</tr>
					<tr>
						<td>반찬6</td>
						<td><input type="text" name="name" value=${menuListL.side_Dish6}></td>
					</tr>
					<tr>
						<td>반찬7</td>
						<td><input type="text" name="name" value=${menuListL.side_Dish7}></td>
					</tr>
					<tr>
						<td>반찬8</td>
						<td><input type="text" name="name" value=${menuListL.side_Dish8}></td>
					</tr>
					<tr>
						<td>디저트1</td>
						<td><input type="text" name="name" value=${menuListL.dessert1}></td>
					</tr>
					<tr>
						<td>디저트1</td>
						<td><input type="text" name="name" value=${menuListL.dessert2}></td>
					</tr>
				</table>
				
				
				<p> 저 녁  </p>
				<table  class="table table-bordered table table-hover">
					<tr>
						<td>밥</td>
						<td><input type="text" name="userId" value=${menuListD.rice}></td>
					</tr>
					<tr>
						<td>국 </td>
						<td><input type="text" name="name" value=${menuListD.soup}></td>
					</tr>
					<tr>
						<td>반찬1</td>
						<td><input type="text" name="name" value=${menuListD.side_Dish1}></td>
					</tr>
					<tr>
						<td>반찬2</td>
						<td><input type="text" name="name" value=${menuListD.side_Dish2}></td>
					</tr>
					<tr>
						<td>반찬3</td>
						<td><input type="text" name="name" value=${menuListD.side_Dish3}></td>
					</tr>
					<tr>
						<td>반찬4</td>
						<td><input type="text" name="name" value=${menuListD.side_Dish4}></td>
					</tr>
					<tr>
						<td>반찬5</td>
						<td><input type="text" name="name" value=${menuListD.side_Dish5}></td>
					</tr>
					<tr>
						<td>반찬6</td>
						<td><input type="text" name="name" value=${menuListD.side_Dish6}></td>
					</tr>
					<tr>
						<td>반찬7</td>
						<td><input type="text" name="name" value=${menuListD.side_Dish7}></td>
					</tr>
					<tr>
						<td>반찬8</td>
						<td><input type="text" name="name" value=${menuListD.side_Dish8}></td>
					</tr>
					<tr>
						<td>디저트1</td>
						<td><input type="text" name="name" value=${menuListD.dessert1}></td>
					</tr>
					<tr>
						<td>디저트1</td>
						<td><input type="text" name="name" value=${menuListD.dessert2}></td>
					</tr>
				</table>
				
				
				
				
				</br>
				</br>
				
				
				<input type="submit" value="등록" />

				
				
				</br>
				</br>
				<a href="getCafeList.do">식당 목록보기</a>
	
				
			</form>
		</div>
	
	

<p></p>
</body>


</html>
