<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>

<s:property value="mesg" />
<p>
<s:label>INSERT YOUR DETAILS</s:label>
<s:form action="userregdo">
<s:textfield  key="uid" label="UID:"></s:textfield>
<s:password key="pass" label="PASSWORD:"> </s:password>
<s:password key="pass2" label="CONFERM PASSWORD:"> </s:password>
<s:submit value="SUBMIT"/>
</s:form>
