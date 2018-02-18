<%-- 
    Document   : hello4
    Created on : 2018/02/06, 14:16:17
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
       <%!
       int add (int a, int b){
           return a+b;
       } 
       %>
       
       <p>1+2=<%=add(1,2)%></p>
       
    </body>
</html>
