<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

        <p>追加する情報を入力してください</p>
        <form action="Insert.action" method="post">
            <input type="text" name="name">
            <input type="text" name="price">
            <input type="submit" value="追加">   
        </form>        
        
<%@include file="../footer.html" %>
    