<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="${pageContext.request.contextPath}/js/jquery-1.7.2.js" type="text/javascript"></script>
    <script>
        $(function () {
            $("#find").click(function () {
               $.ajax({
                   type: "get",
                   jsonp:"jsonpcallback",
                   url: "http://192.168.43.214:80/emp/find?eid=10001",
                   dataType: "jsonp",
                   success: function (data) { alert(data.ename); },
                    error: function () { alert('fail'); } })
            })
        })
    </script>
</head>
<body>
<center>
    <button id="find">获取数据</button>
    <form action="${pageContext.request.contextPath}/user/findByName">
        请输入学生名：<input type="text" name="name">
        <input type="submit" value="提交">
    </form>
    <form action="${pageContext.request.contextPath}/user/findById">
        请输入学生id：<input type="number" name="id">
        <input type="submit" value="提交">
    </form>
    请输入班级名称：<input type="text" name="cname">
    <input type="submit" value="提交">
    </form>
</center>
</body>
</html>
