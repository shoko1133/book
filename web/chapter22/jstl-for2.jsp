<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<p>購入数を選択してください</p>
　<form action="/book/chapter6/select" method="post">
    <select name="count">   

        <c:forEach var="i" begin="1" end="9">
            <option value="${i}">${i}</option>
        </c:forEach>

    </select>

     <p><input type="submit" value="ok"></p>
 </form>


<%@include file="../footer.html" %>