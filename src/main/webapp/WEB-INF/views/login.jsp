<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/1/2
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form modelAttribute="account" action="update">
您的卡号是：${account.number}<br/>
您的卡号状态是：${account.status}<br/>
您的账户余额是：${account.money}<br/>
请选择取款金额： <input type="text"/><br/>
    <input type="submit" value="登陆">
</form:form>
</body>
</html>
