<html>
<body>
<p1> After click page</p1>
<br>
<br>

<%@ page import="java.util.Date" %>
<%=
 new Date()
 %>
<br><br>
 <%
 String country = request.getAttribute("country").toString();
 out.println(country);
 %>

</body>
</html>
