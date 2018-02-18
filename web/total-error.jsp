<%-- 
    Document   : total-error
    Created on : 2018/02/06, 21:59:03
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
        <%@page isErrorPage="true" %>
        <p>数値を入力してください</p>
        <p><%=exception %></p>
    </body>
</html>
