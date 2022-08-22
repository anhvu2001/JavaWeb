<%-- 
    Document   : newsDetail
    Created on : Aug 5, 2022, 12:01:22 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="<c:url value ="/css/style.css"/>"/>

<h1 class="tieude1" >${detailnews.title}</h1>
<div style="width: 800px">
    <img src="${detailnews.image}" class="img-thumbnail" alt="Cinque Terre" style="width: 100%">
</div>

<div>
    <h2>${detailnews.name}</h2>
    <h6>${detailnews.describe}</h6>
</div>
 

<ul style="margin-top: 10px" id="commentnews" class="list-group"">

</ul>

<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.29.4/moment.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.29.4/moment-with-locales.min.js"></script>
<script src="<c:url value="/js/adminNews.js" />"></script>
<script>
     <c:url value="/api/news/${detailnews.id}/comments" var="u" />
    window.onload = function () {
        loadCommentsNews('${u}');
    }
</script>
