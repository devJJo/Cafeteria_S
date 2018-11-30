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
	<!-- <script src="/js/jquery.form.min.js" type="text/javascript"></script> -->
	
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
			<form id="MenuSearch" name="MenuSearch" method="post" >
				<p> 점 심  </p>
				<table  class="table table-bordered table table-hover">
					<tr>
						<td>밥</td>
						<td><input type="text" name="Lrice" value=${menuListL.rice}></td>
					</tr>
					<tr>
						<td>국 </td>
						<td><input type="text" name="Lsoup" value=${menuListL.soup}></td>
					</tr>
					<tr>
						<td>반찬1</td>
						<td><input type="text" name="Lside_Dish1" value=${menuListL.side_Dish1}></td>
					</tr>
					<tr>
						<td>반찬2</td>
						<td><input type="text" name="Lside_Dish2" value=${menuListL.side_Dish2}></td>
					</tr>
					<tr>
						<td>반찬3</td>
						<td><input type="text" name="Lside_Dish3" value=${menuListL.side_Dish3}></td>
					</tr>
					<tr>
						<td>반찬4</td>
						<td><input type="text" name="Lside_Dish4" value=${menuListL.side_Dish4}></td>
					</tr>
					<tr>
						<td>반찬5</td>
						<td><input type="text" name="Lside_Dish5" value=${menuListL.side_Dish5}></td>
					</tr>
					<tr>
						<td>반찬6</td>
						<td><input type="text" name="Lside_Dish6" value=${menuListL.side_Dish6}></td>
					</tr>
					<tr>
						<td>반찬7</td>
						<td><input type="text" name="Lside_Dish7" value=${menuListL.side_Dish7}></td>
					</tr>
					<tr>
						<td>반찬8</td>
						<td><input type="text" name="Lside_Dish8" value=${menuListL.side_Dish8}></td>
					</tr>
					<tr>
						<td>디저트1</td>
						<td><input type="text" name="Ldessert1" value=${menuListL.dessert1}></td>
					</tr>
					<tr>
						<td>디저트1</td>
						<td><input type="text" name="Ldessert2" value=${menuListL.dessert2}></td>
					</tr>
				</table>
				
				
				<p> 저 녁  </p>
				<table  class="table table-bordered table table-hover">
					<tr>
						<td>밥</td>
						<td><input type="text" name="Drice" value=${menuListD.rice}></td>
					</tr>
					<tr>
						<td>국 </td>
						<td><input type="text" name="Dsoup" value=${menuListD.soup}></td>
					</tr>
					<tr>
						<td>반찬1</td>
						<td><input type="text" name="Dside_Dish1" value=${menuListD.side_Dish1}></td>
					</tr>
					<tr>
						<td>반찬2</td>
						<td><input type="text" name="Dside_Dish2" value=${menuListD.side_Dish2}></td>
					</tr>
					<tr>
						<td>반찬3</td>
						<td><input type="text" name="Dside_Dish3" value=${menuListD.side_Dish3}></td>
					</tr>
					<tr>
						<td>반찬4</td>
						<td><input type="text" name="Dside_Dish4" value=${menuListD.side_Dish4}></td>
					</tr>
					<tr>
						<td>반찬5</td>
						<td><input type="text" name="Dside_Dish5" value=${menuListD.side_Dish5}></td>
					</tr>
					<tr>
						<td>반찬6</td>
						<td><input type="text" name="Dside_Dish6" value=${menuListD.side_Dish6}></td>
					</tr>
					<tr>
						<td>반찬7</td>
						<td><input type="text" name="Dside_Dish7" value=${menuListD.side_Dish7}></td>
					</tr>
					<tr>
						<td>반찬8</td>
						<td><input type="text" name="Dside_Dish8" value=${menuListD.side_Dish8}></td>
					</tr>
					<tr>
						<td>디저트1</td>
						<td><input type="text" name="Ddessert1" value=${menuListD.dessert1}></td>
					</tr>
					<tr>
						<td>디저트1</td>
						<td><input type="text" name="Ddessert2" value=${menuListD.dessert2}></td>
					</tr>
				</table>
				
				
				
				
				</br>
				</br>

				<button type="button" id="btn_Save" > 등록 </button>
				
				
				</br>
				</br>
				<a href="getCafeList.do">식당 목록보기</a>
	
				
			</form>
		</div>
	
	

<p></p>


<script type="text/javascript">

//search
$("#btn_Save").click(function(){
    fn_Search();
});

function fn_Search(){
	
	var oSrch = new Object();

	oSrch.CAFEID = $("input[name=cafeid]").val();
	oSrch.MENUDATE = $("input[name=menudate]").val();
	
	oSrch.LRICE = $("input[name=Lrice]").val();
	oSrch.LSOUP = $("input[name=Lsoup]").val();
	oSrch.LSIDE1 = $("input[name=Lside_Dish1]").val();
	oSrch.LSIDE2 = $("input[name=Lside_Dish2]").val();
	oSrch.LSIDE3 = $("input[name=Lside_Dish3]").val();
	oSrch.LSIDE4 = $("input[name=Lside_Dish4]").val();
	oSrch.LSIDE5 = $("input[name=Lside_Dish5]").val();
	oSrch.LSIDE6 = $("input[name=Lside_Dish6]").val();
	oSrch.LSIDE7 = $("input[name=Lside_Dish7]").val();
	oSrch.LSIDE8 = $("input[name=Lside_Dish8]").val();
	oSrch.LDESSERT1 = $("input[name=Ldessert1]").val();
	oSrch.LDESSERT2 = $("input[name=Ldessert2]").val();

	oSrch.DRICE = $("input[name=Drice]").val();
	oSrch.DSOUP = $("input[name=Dsoup]").val();
	oSrch.DSIDE1 = $("input[name=Dside_Dish1]").val();
	oSrch.DSIDE2 = $("input[name=Dside_Dish2]").val();
	oSrch.DSIDE3 = $("input[name=Dside_Dish3]").val();
	oSrch.DSIDE4 = $("input[name=Dside_Dish4]").val();
	oSrch.DSIDE5 = $("input[name=Dside_Dish5]").val();
	oSrch.DSIDE6 = $("input[name=Dside_Dish6]").val();
	oSrch.DSIDE7 = $("input[name=Dside_Dish7]").val();
	oSrch.DSIDE8 = $("input[name=Dside_Dish8]").val();
	oSrch.DDESSERT1 = $("input[name=Ddessert1]").val();
	oSrch.DDESSERT2 = $("input[name=Ddessert2]").val();

	var srchJSON = JSON.stringify(oSrch);
	
	console.log(srchJSON)
	
	$.ajax({
		type:"POST",
		url:"insertMenu.do",
 		data:srchJSON, 
		dataType: "json",
		contentType:"application/json;charset=UTF-8",
		async:true,
		beforeSend:function(){
			/* $('html,body').css('cursor','wait'); */
		},
		success: function(data){
			alert("저장 성공");
		},
		complete:function() {
		},
		error:function(){
			alert("저장 실패");
		}
	}); 
}

</script>

</body>


</html>
