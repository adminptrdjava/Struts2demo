<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags" %>

<table width="200" border="1" cellspacing="1" cellpadding="1">
<th>ZONE ID </th>
<th>ZONE NAME </th>
<th>PIN CODE </th>
<th>ZONE ADDRESS </th>
<th>ZONE TYPE </th>
<s:iterator value="allz">
  <tr>
    <td><s:property value="zid"/></td>
    <td><s:property value="zname"/></td>
    <td><s:property value="zpin"/></td>
    <td><s:property value="zadd"/></td>
    <td><s:property value="ztype"/></td>
  </tr>
  </s:iterator>
</table>






