<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<title>Registration</title>
</head>

<body>

<form:form action="http://localhost:8888/student/processForm" modelAttribute="student">

  First name: <form:input path="firstName" /><br><br>
  Last name: <form:input path="lastName" /><br><br>
  Country:

        <form:select path="country">

        <form:options items="${student.countriesOptions}" />
        </form:select>
        <br>
        <br>

   Favorite language:

        Java <form:radiobutton path="favoriteLanguage" value="Java"/>
        C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
        C# <form:radiobutton path="favoriteLanguage" value="C#"/>
        PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
        <br><br>

  Operating systems:

  MS Windows <form:checkbox path="operatingSystems" value="MS Windows"/>
  Linux <form:checkbox path="operatingSystems" value="Linux"/>
  Mac OS <form:checkbox path="operatingSystems" value="Mac OS"/>

<br><br>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>