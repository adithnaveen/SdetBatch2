<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<table border="4">
	<tr>
		<td><%@ include file="MultiplicationForm.html" %></td>
		<td><%@ include file="HelloWorld.jsp" %></td>
	</tr>
</table>



<table border="5" bgcolor="cyan">
	<%
	try{
		int val = Integer.parseInt(request.getParameter("val"));
		for(int i=1; i<=10; i++){
			// 10 x 1 = 10 
%>
	<tr>
		<td><%=val %> X <%= i %> = <%=val * i %></td>
	</tr>
<%
		}
	}catch(NumberFormatException nfe){

		%>
		
		<h3 style="color: red">Sorry No Chars.. / spl chars... </h3>
		
		<%
	}

	%>
	
	</table>
</body>
</html>