<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <title>Document</title>
    <link rel="stylesheet" href="/resources/css/style.css" />
</head>
<body>
<%@include file="header.jsp"%>

<section class="login-page">
    <h2>Załóż konto</h2>
<%--    <form:form modelAttribute="user" action="/register" method="post">--%>
<%--        <div class="form-group">--%>
<%--            <form:input path="name" placeholder="Imię" />--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <form:input path="surname" placeholder="Nazwisko" />--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <form:input path="email" placeholder="Email" />--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <form:input path="password" type="password" placeholder="Hasło" />--%>
<%--        </div>--%>
<%--        <div class="form-group">--%>
<%--            <input name="password2" type="password" placeholder="Powtórz hasło" />--%>
<%--        </div>--%>

<%--        <div class="form-group form-group--buttons">--%>
<%--            <a href="/user/login" class="btn btn--without-border">Zaloguj się</a>--%>
<%--            <button class="btn" type="submit">Załóż konto</button>--%>
<%--        </div>--%>
<%--    </form:form>--%>
</section>

<%@include file="footer.jsp"%>
</body>
</html>

