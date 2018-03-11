<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--101から200まで繰り返し--%>
<c:forEach var="i" begin="101" end="200">
    <c:choose>
        <%--条件分岐iを10で割った余りが１のとき（数値,　と表示--%>
        <c:when test="${i%10==1}">(${i},</c:when>
        <c:when test="${i%10==0}">${i})<br>,</c:when>
        <%--それ以外の時　数値,　と表示--%>
        <c:otherwise>${i},</c:otherwise></c:choose>
</c:forEach>


<%@include file="../footer.html" %>