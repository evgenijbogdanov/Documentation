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
 String country = request.getAttribute("choosedCountry").toString();
 out.println(country);
 %>
<br><br>
AdminEmail:
<%
 String ademail = request.getAttribute("admail").toString();
 out.println(ademail);
 %>
 <br>
 <br>
My name is
<%
out.println(request.getAttribute("myName").toString());
%>

</body>
</html>
