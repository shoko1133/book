<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../header.html" %>
<% if(session.getAttribute("customer") == null){ %>
ログアウトするには、
<a href="../chapter24/login-in.jsp">ログイン</a>
 してください。
<% } else { %>

<p>${customer.login}さん、ログアウトしますか？</p>
<p><a href="Logout.action">ログアウト</a></p>
<% } %>

<%@include file="../footer.html" %>
