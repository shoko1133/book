<%-- 
    Document   : transaction
    Created on : 2018/02/18, 22:42:14
    Author     : shochan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <p>追加する情報を入力してください</p>
        <form action="transaction" method="post">
            <input type="text" name="name">
            <input type="text" name="price">
            <input type="submit" value="追加">   
        </form>        
    </body>
</html>
