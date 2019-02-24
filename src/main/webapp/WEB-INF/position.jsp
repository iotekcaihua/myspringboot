<%--
  Created by IntelliJ IDEA.
  User: CaihuA
  Date: 2019/2/16
  Time: 14:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table cellpadding="4px" cellspacing="0px" border="3px">
    <tr>
        <td>职位名称</td>
        <td>职位等级</td>
    </tr>
    <tr>
        <td>${position.pname}</td>
        <td>${position.plevel}</td>
    </tr>
</table>
</body>
</html>
