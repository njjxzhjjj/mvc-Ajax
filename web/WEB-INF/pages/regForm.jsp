<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/9/1
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>最最最最最最传统的from 表单传参</title>
</head>
<body>
     <div>
    <form action="/api/admin/regForm" method="post">
        用户名：<input type="text" name="adminName"><br>
        密码：<input type="text" name="adminPwd"><br>
        <input type="submit" value="注册">
    </form>
   </div>
</body>
</html>
