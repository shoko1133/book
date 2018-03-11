<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="../header.html" %>
<%@include file="menu.jsp"%>


<p>${cart.size()}種類の商品があります。</p>
<hr>

<%! int total = 0; %>

<table style="border-collapse:separate;border-spacing:10px;">
    <c:forEach var="item" items="${cart}">
        <tr>
            <td>商品${item.product.id}</td>
            <td><img src="/book/images/${item.product.id}.jpg" height="96"></td>
            <td>${item.product.name}</td>
            <td>${item.product.price}円</td>
            <td>${item.count}個</td>
            <td><a href="CartRemove.action?id=${item.product.id}カートから削除"></a></td>
        </tr>
        <c:set var="total" value="${total + item.product.price * item.count}" />
    </c:forEach>
</table>
<p>合計: ${total}円</p>
<hr>

<script src="https://ajaxzip3.github.io/ajaxzip3.js" charset="UTF-8"></script>
<form action="PrePurchase.action" method="post">
    <p>お名前<input type="text" name="name"></p>
    <p>郵便番号<input type="text" name="zip11" size="10" maxlength="8" onKeyUp="AjaxZip3.zip2addr(this,'','address','address');"></p>
    <p>ご住所<input type="text" name="address"></p>
    <p><input type="submit" value="購入を確定">
</form>

<%@include file="../footer.html" %>
