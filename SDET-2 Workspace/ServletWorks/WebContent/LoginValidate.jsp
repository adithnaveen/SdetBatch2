<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	
	String uName = request.getParameter("uname");
	String password = request.getParameter("pass");

	
	if(uName.equals("root") && password.equals("fannie")){
%>
	<jsp:forward page="Home.jsp">
		<jsp:param value="Lenovo" name="laptop"/>
	</jsp:forward>	
<%		
	}else{
%>
	<h2 style="color: red;font-family: arial">Sorry Invalid Details... </h2>
	<%@ include file="LoginForm2.html" %>			
<%
	}
%>
</body>
</html>