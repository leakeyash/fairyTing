<%--
  Created by IntelliJ IDEA.
  User: Henry
  Date: 2018/3/24
  Time: 23:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" import="java.util.*"
         isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="addProduct" method="post">
    产品名称 ：<input type="text" name="name" value=""><br/>
    产品价格： <input type="text" name="price" value=""><br/>

    <input type="submit" value="增加商品">
</form>

<form action="addCatrgory">
    策略名称 ：<input type="text" name="name" value=""><br/>
    策略价格： <input type="text" name="sb" value=""><br/>

    <input type="submit" value="增加策略">
</form>

<form action="uploadImage" method="post" enctype="multipart/form-data">
    选择图片:<input type="file" name="image" accept="image/*"/><br/>
    <input type="submit" value="上传">
</form>
</body>
</html>
