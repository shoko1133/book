<%-- 
    Document   : hello3
    Created on : 2018/02/06, 14:07:21
    Author     : shochan
--%>
<%@page import="java.util.Calendar;"%>
<%@page import="java.text.SimpleDateFormat;"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 3.2 Final//EN">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%out.println(new java.util.Date());%>
         <%//現在日時を取得する
        Calendar c = Calendar.getInstance();

        //フォーマットパターンを指定して表示する
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 E曜日");
        out.println(sdf.format(c.getTime()));%>
    </body>
</html>
