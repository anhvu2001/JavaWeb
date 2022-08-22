<%-- 
    Document   : tourDetail
    Created on : Aug 3, 2022, 5:30:22 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="<c:url value ="/css/style.css"/>" />

<div class="row">
    <div class="col-md-6 "style="padding:10px" >
        <div class="card" style="width:650px">
            <img class="card-img-top" id ="main" src="${tour.iamge}" alt="Card image">
        </div>
    </div>
    <div class="col-md-6" style="padding:25px" >
        <h3>  ${tour.name}</h3>
        <p class="card-title">Ngày Khởi Hành: ${tour.daystart}</p>
        <p class="card-title">Thời gian: ${tour.numbersofday} ngày</p>
        <button type="button" class="btn btn-success">Đặt Ngay</button>    
    </div>
</div>


<script>
    function changeImage(obj) {
        var path = obj.src;
        var img = document.getElementById("main");
        img.setAttribute("src", path);
    }
</script>


<div class="thumail" >
    <c:forEach items="${image}" var="c">
        <div class="items">
            <image src="${c.link}" alt="anhvu" style="width:100%; height: 107px" onclick="changeImage(this)" />
        </div>
    </c:forEach>
</div>


 <c:url value="/api/tours/${tour.id}/comments" var="u" />
<div class="form-group">
    <textarea class="form-control" placeholder="Nhập nội dung" id="contentId"></textarea>
</div>
<button class="btn btn-danger" onclick="addComment('${u}', ${tour.id})">Thêm bình luận</button>



<ul style="margin-top: 10px" id="comments" class="list-group"">

</ul>

<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.29.4/moment.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.29.4/moment-with-locales.min.js"></script>
<script src="<c:url value="/js/adminTour.js" />"></script>
<script>
     <c:url value="/api/tours/${tour.id}/comments" var="u" />
    window.onload = function () {
        loadComments('${u}');
    }
</script>