<%-- 
    Document   : search
    Created on : 2018/02/18, 20:00:32
    Author     : shochan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>検索キーワードを入れてください</p>
        <form action="search" method="post">
            <input type="text" name="keyword">
            <input type="submit" value="検索">   
        </form>        
        
        
    </body>
</html>
