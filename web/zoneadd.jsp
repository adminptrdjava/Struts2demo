<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="s" uri="/struts-tags" %>

<s:property value="zmsg"/>

<s:form action="zoneaddo">

<s:textfield key="zpin" />
<s:textfield key="zname" />
<s:textfield key="zadd" />
<s:textfield  key="ztype"/>
<s:submit value="SUBMIT"/>
</s:form>