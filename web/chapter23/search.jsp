<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../header.html" %>


        <p>検索キーワードを入れてください</p>
        <form action="Search.action" method="post">
            <input type="text" name="keyword">
            <input type="submit" value="検索">   
        </form>        
        
<%@include file="../footer.html" %>