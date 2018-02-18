<%-- 
    Document   : checkbox
    Created on : 2018/02/05, 19:38:21
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
        <p>お買い得情報を受け取るジャンルをお選びください。</p>
        <form action="checkbox" method="post">
            <p><input type="checkbox" name="genre" value="家電">家電</p>
            <p><input type="checkbox" name="genre" value="時計">時計</p>
            <p><input type="checkbox" name="genre" value="書籍">書籍</p>
            <p><input type="submit" value="確定"></p>
            
        </form>
    </body>
</html>
