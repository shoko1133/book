<%-- 
    Document   : variable
    Created on : 2018/02/06, 14:22:33
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
       
       <%! int countA=0; %>
       
       <%
       int countB =0;
       countA++;
       countB++;
       %>
       
       <p>宣言による変数countAは<%=countA%></p>
       <p>スクリプトレットによる変数countBは<%=countB%></p>
       
    </body>
</html>
