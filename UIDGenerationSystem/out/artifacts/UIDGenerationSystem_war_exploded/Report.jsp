<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<link rel = "stylesheet" ahref = "cs/Stylesheet.css"/>
<H1>WELCOME TO THE UID GENERATION SYSTEM </H1>
<table border = "1">
<tr>
<td>
UID
<td/>
<td>
${requestScope.listOfReports.uid}
<td/>
<tr/>
<tr>
<td>
CONTACT_NO
<td/>
<td>
${requestScope.listOfReports.CONTACT_NO}
<td/>
<tr/>
<tr>
<td>
Name
<td/>
<td>
${requestScope.listOfReports.name}
<td/>
<tr/>
<tr>
<td>
look
<td/>
<td>
${requestScope.listOfReports.look}
<td/>
<tr/>
</table>
</body>
</html>