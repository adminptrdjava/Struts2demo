<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table style="border: 1px;">
<th>UID</th>
<th>PASS</th>
<s:iterator value="all" >
<tr>
<td>
<s:property value="uid"/>
</td>
<td><s:property value="pass"/>
</tr>
</s:iterator>


</table>
</body>
</html>