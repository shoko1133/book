<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../header.html" %>
<%@include file="../chapter25/menu.jsp" %>

<% if(session.getAttribute("customer") == null){ %>
<form action="Login.action" method="post">
<p>ログイン名<input type="text" name="login"></p>
<p>パスワード<input type="text" name="password"></p>
<p><input type="submit" value="ログイン"></p>
</form>
<% } else { %>
<p>${customer.login}さん、ログイン済みです</p>
<% } %>

<%@include file="../footer.html" %>
