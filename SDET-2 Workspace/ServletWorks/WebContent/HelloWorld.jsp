
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fannie</title>
</head>
<body bgcolor="<%=application.getInitParameter("color") %>">
	<h2>Company name <%=application.getInitParameter("company") %></h2>
	<h2>Welcome to JSP</h2>
	<%
	// we can have java content here 
	// this is service method 
	
	Date date = new Date();
	out.print("This is inside Scriplet" );
	out.println("Today's Date is " + date);
%>

<a href="http://google.com">Google</a>
</body>
</html>