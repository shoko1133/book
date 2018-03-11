<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="../header.html" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="message" value="hello" />
<p>message : ${message}</p>

<c:set var="message2">welcome</c:set>
<p>message2 : ${message2}</p>

<c:set var="result" value="${1+2}" />
<p>result:${result}</p>





<%@include file="../footer.html" %>
