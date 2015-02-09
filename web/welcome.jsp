<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
  
<head>
<title>Struts 2 - Tiles example Application</title>
</head>
<body>
    <h2>Welcome, <s:property value="uid" />!</h2>
    
    
     <table width="327" border="1" cellspacing="1" cellpadding="1">
  <tr>
    <td width="152"><a href="zonemng.action">ZONE</a></td>
    <td width="162">REPORT</td>
  </tr>
  <tr>
    <td>PRODUCT</td>
    <td>HR MNG</td>
  </tr>
  <tr>
    <td>QUESTION</td>
    <td><a href="Udtls.action">ADMIN LIST</a></lb></td>
  </tr>
  <tr>
    <td>PRODUCT</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>SERVAYER</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>USER DETAILS</td>
    <td>&nbsp;</td>
  </tr>
</table>

    <lb><a href="Udtls.action">USERDTLS</a></lb>
</body>
</html>