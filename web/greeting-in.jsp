<%-- 
    Document   : greeting-in
    Created on : 2018/02/06, 21:31:21
    Author     : shochan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>name</p>
        <form action="greeting-out.jsp" method="post">
            <input type="text" name="user">
            <input type="submit" value="ok">
            
        </form>
    </body>
</html>
