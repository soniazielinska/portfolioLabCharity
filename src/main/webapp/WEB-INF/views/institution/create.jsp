<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>form</h1>
<form:form modelAttribute="institution" method="post" action="/institution/create">
<table>
    <tr>
        <td>Name:</td>
        <td><form:input path="name"/></td>
    </tr>
    <tr>
        <td>Description:</td>
        <td><form:input path="description"/></td>
    </tr>
</table>
<input type="submit" value="add">
</form:form>
</body>
</html>
