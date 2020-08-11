<%--
  Created by IntelliJ IDEA.
  User: Reisen
  Date: 2020/7/29
  Time: 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" %>

<!DOCTYPE html>
<script src="Front/js/jquery/2.0.0/jquery.min.js"></script>
<link href="Front/css/bootstrap/3.3.6/bootstrap.min.css" rel="stylesheet">
<script src="Front/js/bootstrap/3.3.6/bootstrap.min.js"></script>

<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Hero</title>
</head>
<script>
    $(function(){
        $("a").addClass("btn btn-default btn-xs");

    });

</script>
<table style="width:500px; margin:44px auto" class="table table-striped table-bordered table-hover  table-condensed"
       align='center' border='2' cellspacing='0'>

    <tr class="info">
        <td>Id</td>
        <td>Name</td>
        <td>Hp</td>
        <td>Damage</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>

    <c:forEach items="${heroes}" var="hero" varStatus="st">
        <tr>
            <td>${hero.id}</td>
            <td>${hero.name}</td>
            <td>${hero.hp}</td>
            <td>${hero.damage}</td>
            <td><a href="editHero?id=${hero.id}">编辑</a></td>
            <td><a href="deleteHero?id=${hero.id}" class="btn btn-danger">删除</a></td>
        </tr>
    </c:forEach>

</table>
<nav>
    <ul class="pager">

        <li><a href="?start=0">首  页</a></li>
        <li><a href="?start=${pre}">上一页</a></li>
        <li><a href="?start=${next}">下一页</a></li>
        <li><a href="?start=${last}">末  页</a></li>
        <li><a href="addHero.jsp"  style="background: #5cb85c; color:floralwhite">增加</a></li>
    </ul>
</nav>