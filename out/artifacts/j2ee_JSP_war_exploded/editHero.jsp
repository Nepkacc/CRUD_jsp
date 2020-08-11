<%--
  Created by IntelliJ IDEA.
  User: Reisen
  Date: 2020/7/29
  Time: 16:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="Front/js/jquery/2.0.0/jquery.min.js"></script>
<link href="Front/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
<script src="Front/js/bootstrap/3.3.6/bootstrap.min.js"></script>

<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit</title>
</head>
<body>
    <form action="updateHero" method="post">
        <br>
        名字：<input type="text" class="form-control" name="name" value="${hero.name}">
        <br>
        血量：<input type="text" class="form-control" name="hp" value="${hero.hp}">
        <br>
        伤害：<input type="text" class="form-control" name="damage" value="${hero.damage}">
        <br>
        <input type="hidden" name="id" value="${hero.id}">
        <input type='submit' class="btn btn-primary" value='更新'>
    </form>
</body>
</html>
