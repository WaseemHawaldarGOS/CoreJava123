<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src = "js/ValidateEnroll.js"></script>
</head> 
<body>
<link rel = "stylesheet" ahref = "cs/Stylesheet.css"/>
<form action = "/UIDDeliverySystem/enroll.action" onsubmit return  = "ValidateContent(this);">
<table>
<tr>
<td>
UID
<td/>
<td>
<input type = "text" name = "uid"/>
<td/>
<tr/>
<tr>

<td>
Name
<td/>
<td>
<input type = "text" name = "name"/>
<td/>
<tr/>
<tr>
<td>
Contact No:
<td/>
<td>
<input type = "text" name = "contactNo"/>
<td/>
<tr/>
<tr>
<td>
Look
<td/>
<td>
<input type = "text" name = "look"/>
<td/>
<tr/>
</table>
<input type = "submit" value = "Click to enroll"/>
</form>
<form action = "/UIDDeliverySystem/HomePage.action" >
<input type = "submit" value = "Cancel" />
</form>
</body>
</html>