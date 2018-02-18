<%-- 
    Document   : total-out
    Created on : 2018/02/06, 21:48:02
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
        <%@page errorPage="total-error.jsp"%>
        <%
        request.setCharacterEncoding("UTF-8");
        int price=Integer.parseInt(request.getParameter("price"));
        int count=Integer.parseInt(request.getParameter("count"));
        
        %>
        <%=price %>円×<%=count %>個=<%=price*count %>円
    </body>
</html>
