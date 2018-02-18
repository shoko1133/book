<%-- 
    Document   : total-in
    Created on : 2018/02/06, 21:47:49
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
        <form action="total-out.jsp" method="post">
            <input type="text" name="price">
            円×
            <input type="text" name="count">
            個=
            <input type="submit" value="計算">
            
        </form>
    </body>
</html>
