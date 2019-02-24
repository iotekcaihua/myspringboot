<%--
  Created by IntelliJ IDEA.
  User: CaihuA
  Date: 2019/2/16
  Time: 14:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table cellpadding="4px" cellspacing="0px" border="3px" >
    <tr>
        <td>部门名称</td>
        <td>部门代码</td>
        <td>部门地址</td>
    </tr>
    <tr>
        <td>${dept.dname}</td>
        <td>${dept.brachCode}</td>
        <td>${dept.addr}</td>
    </tr>
</table>
<table cellpadding="4px" cellspacing="0px" border="3px">
    <thead><h3>部门人员</h3></thead>
    <tr>
        <td>员工号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>年龄</td>
        <td>职位</td>
    </tr>
    <c:forEach items="${dept.emps}" var="emp">
        <tr>
            <td>${emp.eid}</td>
            <td>${emp.ename}</td>
            <td>${emp.egender}</td>
            <td>${emp.eage}</td>
            <td>${emp.position.pname}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
