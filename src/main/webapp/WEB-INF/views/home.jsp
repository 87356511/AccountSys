<%--
  Created by IntelliJ IDEA.
  User: peter
  Date: 12/12/17
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Home Page</h1>

<form:form modelAttribute="account" action="login">
    卡号：  <form:input path="number"/><br/>
    密码：  <form:input path="pwd"/><br/>
    <input type="submit" value="登陆">
</form:form>

</body>
</html>
