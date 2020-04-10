<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>Confirmation of Registration</title>
</head>

<body>

Your first name is: ${student.firstName}
<br>
Your last name is: ${student.lastName}
<br>
<br>
Country is:   ${student.country}
<br>
<br>
Favorite language is: ${student.favoriteLanguage}
<br>
<br>
Operating systems:

<ul>
<c:forEach var="num" items="${student.operatingSystems}">
   <li> ${num}  </li>
</c:forEach>
</ul>


</body>
</html>