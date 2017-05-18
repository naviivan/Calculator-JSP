<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calcolatrice</title>
</head>
<body>
	<h1>Calcolatrice</h1>
	<form action="CalcServlet">
		<input type="text" name="num1">
		<input type="text" name="num2">
		
		<p>
			Somma <input type="radio" name="opp" value="somma" checked="checked">
			Sottrazione <input type="radio" name="opp" value="sott"> 	
			Moltiplicazione <input type="radio" name="opp" value="molt"> 	
			Divisione <input type="radio" name="opp" value="div"> 				
		</p>
		
		<input type="submit" value="Calcola">
	</form>
	<h3><%= request.getAttribute("result") %></h3>
</body>
</html>