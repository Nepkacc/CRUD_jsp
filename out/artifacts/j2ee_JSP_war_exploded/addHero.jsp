<%--
  Created by IntelliJ IDEA.
  User: Reisen
  Date: 2020/7/30
  Time: 10:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="Front/js/jquery/2.0.0/jquery.min.js"></script>
<link href="Front/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
<script src="Front/js/bootstrap/3.3.6/bootstrap.min.js"></script>
<html>
<head>
    <title>Add</title>
</head>
<body>
<form action="addHero" method="post">
    <br>
    名字：<input type="text" class="form-control" name="name">
    <br>
    血量：<input type="text" class="form-control" name="hp">
    <br>
    伤害：<input type="text" class="form-control" name="damage">
    <br>
    <input type='submit' class="btn btn-primary" value="增加">
</form>
</body>
</html>
