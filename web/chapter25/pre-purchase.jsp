<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.html" %>
<%@include file="menu.jsp"%>

<%! int total = 0; %>

<table style="border-collapse:separate;border-spacing:10px;">
    <c:forEach var="item" items="${cart}">
        <tr>
        <td>${item.product.name}</td>
        <td>${item.product.price}円</td>
        <td>${item.count}個</td>
        </tr>
        <c:set var="total" value="${total + item.product.price * item.count}" />
    </c:forEach>
</table>
<p>合計: ${total}円</p>
<hr>

<p>購入者: ${name}さん</p>
<p>お届け先: ${address}</p>

<form action="Purchase.action" method="post">
    <p><input type="submit" value="購入確定">
</form>

<%@include file="../footer.html" %>
