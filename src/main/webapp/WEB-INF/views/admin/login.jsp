<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <link rel="stylesheet" href="css/style.css" />
</head>
<body>
<%@include file="header.jsp"%>

<section class="login-page">
    <h2>Zaloguj się</h2>
<%--    <form:form modelAttribute="user" action="/user/login" method="post">--%>
<%--        <div class="form-group">--%>
<%--            <form:input path="email" placeholder="Email" />--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <form:input path="password" placeholder="Hasło" />--%>
<%--            <a href="#" class="btn btn--small btn--without-border reset-password">Przypomnij hasło</a>--%>
<%--        </div>--%>

<%--        <div class="form-group form-group--buttons">--%>
<%--            <a href="#" class="btn btn--without-border">Załóż konto</a>--%>
<%--            <button class="btn" type="submit">Zaloguj się</button>--%>
<%--        </div>--%>
<%--    </form:form>--%>
</section>

<%@include file="footer.jsp"%>
</body>
</html>
