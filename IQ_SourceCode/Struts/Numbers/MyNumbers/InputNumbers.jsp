<%@ page language="java" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>

<html>
<head><title>Numbers to Words</title></head>
<body>

<h3>Koirala's Number to Words</h3>


<html:form action="/NumberToWords">
Enter Numbers: <html:text property="intNumber"/><br>
In Words: <html:text size="80" property="strNumber"/><br>
<html:submit/>
</html:form>

</body>
</html>
