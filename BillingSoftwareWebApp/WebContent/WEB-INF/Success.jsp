<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="billingsoftwareproject.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bill Details</title>
</head>
<body>
<form action="MakePaymentServlet" method="post">
<table align="center" bgcolor="#AAAAAA" border="1" width="70%">
    <tr>
        <td colspan="4" align="center">Bill Details </td>
    </tr>
	
	<%	String amount = (String)request.getAttribute("BillAmount"); %>
	
    <tr style="height: 34px; width: 451px">
    	<td align="center" style="height: 34px; width: 225px"> Total Amount </td>
    	<td align="center" style="height: 34px; width: 225px"><%=amount%></td>
    </tr>
        
    <tr>
        <td colspan="2" align="center"><input type="submit" value="Make Payment"></td>
    </tr>
</table>
</form>
</body>
</html>