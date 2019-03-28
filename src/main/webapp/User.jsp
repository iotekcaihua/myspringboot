<%--
  Created by IntelliJ IDEA.
  User: CaihuA
  Date: 2019/3/27
  Time: 20:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form type="post" action="${pageContext.request.contextPath}/user/addUser">
        <input type="text" maxlength="10" name="name"><p/>
        <input type="number" min="1" max="100" step="1" name="age"><p/>
        <input type="date" name="birth"><p/>
        <input type="submit" value="提交">
    </form>
</body>
</html>
