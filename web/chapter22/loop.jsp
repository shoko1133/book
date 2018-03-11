<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="i" begin="1" end="9">
    ${i}×${i}=${i*i}<br>
</c:forEach>



<%@include file="../footer.html" %>
