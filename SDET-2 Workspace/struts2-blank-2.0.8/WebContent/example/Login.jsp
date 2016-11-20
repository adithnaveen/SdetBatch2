<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Sign On</title>
</head>

<body>
<s:form action="Login">
    <s:textfield key="username" label="Enter User Name"/>
    <s:password key="password"  label="Enter paassword"/>
    <s:submit/>
</s:form>
</body>
</html>
