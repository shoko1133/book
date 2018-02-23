<%-- 
    Document   : attribute
    Created on : 2018/02/23, 10:21:21
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

        <%@page import = "bean.Product" %>
        <%Product p = (Product) request.getAttribute("product");%>
        <%=p.getId()%>:<%=p.getName()%>:<%=p.getPrice()%><br>

    </body>
</html>
