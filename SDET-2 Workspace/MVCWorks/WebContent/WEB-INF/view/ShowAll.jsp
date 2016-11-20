<%@page import="java.util.List"%>
<%@page import="com.fannie.beans.Account"%>
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
		List<Account> list = (List<Account>) request.getAttribute("ACCS");
	%>
	<table border="1">
		<%
			for(Account temp : list){
				%>
					<tr>
						<td><%=temp.getAccId() %></td>
						<td><%=temp.getAccType() %></td>
						<td><%=temp.getBalance() %></td>
					</tr>
				<%
			}
		%>
	</table>
</body>
</html>