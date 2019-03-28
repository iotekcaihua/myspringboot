<%--
  Created by IntelliJ IDEA.
  User: CaihuA
  Date: 2019/2/16
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/css/bootstrap.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script>
        $(function () {
            /*添加模块*/
            $("#lookDept").click(function () {
                $("#dname").val("${employee.dept.dname}");
                $("#code").val("${employee.dept.brachCode}");
                $("#addr").val("${employee.dept.addr}");
                $("#myModalLabelt").text("部门信息");
                $('#myModalt').modal();
                return false;
            });
            $("#lookPosition").click(function () {
                $("#pname").val("${employee.position.pname}");
                $("#plevel").val("${employee.position.plevel}");
                $("#myModalLabelt2").text("职位信息");
                $('#myModalt2').modal();
                return false;
            })
        })
    </script>
</head>
<body>
    <table cellpadding="4px" cellspacing="0px" border="3px" >
        <tr>
            <td>员工号</td>
            <td>姓名</td>
            <td>性别</td>
            <td>年龄</td>
            <td>所属部门</td>
            <td>职位</td>
        </tr>
        <tr>
            <td>${employee.eid}</td>
            <td>${employee.ename}</td>
            <td>${employee.egender}</td>
            <td>${employee.eage}</td>
            <td><a id="lookDept" href="#">${employee.dept.dname}</a></td>
            <td><a id="lookPosition" href="#">${employee.position.pname}</a></td>
        </tr>
    </table>

    <div class="modal fade" id="myModalt" tabindex="-1" role="dialog" aria-labelledby="myModalLabelt">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title" id="myModalLabel">部门信息</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label for="dname">部门名称</label>
                        <input type="text" name="dname" class="form-control" id="dname" maxlength="12"
                               required="required">
                    </div>
                    <div class="form-group">
                        <label for="code">部门代码</label>
                        <input type="number" min="1" max="6" name="code" class="form-control" id="code" maxlength="1"
                               required="required">
                    </div>
                    <div class="form-group">
                        <label for="addr">部门地址</label>
                        <input type="text" min="1" max="6" name="addr" class="form-control" id="addr" maxlength="1"
                               required="required">
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal"><span
                            class="glyphicon glyphicon-remove" aria-hidden="true"></span>关闭
                    </button>
              <%--      <button type="button" id="btn_submit" class="btn btn-primary" data-dismiss="modal"
                            disabled="disabled"><span
                            class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span>创建
                    </button>--%>
                </div>
            </div>
        </div>
    </div>

    <div class="modal fade" id="myModalt2" tabindex="-1" role="dialog" aria-labelledby="myModalLabelt">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title" id="myModalLabel2">职位信息</h4>
                </div>
                <div class="modal-body">
                    <div class="form-group">
                        <label for="pname">职位名称</label>
                        <input type="text" name="pname" class="form-control" id="pname" maxlength="12"
                               required="required">
                    </div>
                    <div class="form-group">
                        <label for="plevel">职位等级</label>
                        <input type="number" min="1" max="6" name="plevel" class="form-control" id="plevel" maxlength="1"
                               required="required">
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal"><span
                            class="glyphicon glyphicon-remove" aria-hidden="true"></span>关闭
                    </button>
                    <%--      <button type="button" id="btn_submit" class="btn btn-primary" data-dismiss="modal"
                                  disabled="disabled"><span
                                  class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span>创建
                          </button>--%>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
