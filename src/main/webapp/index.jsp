<%--
  Created by IntelliJ IDEA.
  User: CaihuA
  Date: 2019/2/16
  Time: 16:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <style>
        .conn {
            float: right;
            background: yellow;
        }
    </style>
    <script src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
    <script>
        $(function () {
            setInterval(x, 5000);

            function x() {
                $.ajax({
                        url: "${pageContext.request.contextPath}/login/getConnCount",
                        type: "get",
                        dataType: "JSON",
                        success: function (a) {
                             $("#conn").text(a);
                        }
                    }
                )
            }
        })
    </script>
</head>
<body>
<span class="conn">在线人数：<label
        id="conn">${pageContext.request.session.servletContext.getAttribute("conn")}</label>人</span>
<form action="${pageContext.request.contextPath}/dept/findDeptByName">
    部门名称： <input name="dname" type="text">
    <p/>
    <input type="submit" value="查询">
</form>
<form action="${pageContext.request.contextPath}/emp/findEmp">
    员工号： <input name="eid" type="number">
    <p/>
    <input type="submit" value="查询">
</form>
</body>
</html>
