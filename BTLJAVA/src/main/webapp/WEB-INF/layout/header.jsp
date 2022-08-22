<%-- 
    Document   : header
    Created on : Jul 31, 2022, 7:21:08 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<link
    rel="stylesheet"
    href="https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css"
    />
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
    <div class="container-fluid">
        <a  class="navbar-brand animate__animated animate__flipInX" href="<c:url value="/" />">Nguyen Duy Anh Vu </a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="mynavbar">
            <ul class="navbar-nav me-auto">
                <c:forEach var ="t" items="${listtypetour}">
                    <c:url value="/" var="typePath">
                        <c:param name="typetourid" value="${t.id}" />
                    </c:url>
                    <li class="nav-item">
                        <a class="nav-link" href="${typePath}"> ${t.name}</a>
                    </li>
                </c:forEach>
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value="/news" />" >Tin tức</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="">Giỏ hàng</a>
                </li>


                <c:choose>
                    <c:when test="${pageContext.request.userPrincipal.name == null}">
                        <li class="nav-item">
                            <a class="nav-link text-white" href="<c:url value="/login"  />" >Đăng Nhập</a>
                        </li>
                        <li>
                            <a class="nav-link text-white" href="<c:url value="/register" />">Đăng Kí</a>
                        </li>

                    </c:when>
                    <c:when test="${pageContext.request.userPrincipal.name != null}">
                        <li class="nav-item">
                           
                            <a class="nav-link text-danger" href="<c:url value="/" />" >${pageContext.request.userPrincipal.name}</a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link text-white" href="<c:url value="/logout" />" >Đăng Xuất</a>
                        </li>
                    </c:when>
                </c:choose>

            </ul>
            <c:url value="/" var="action" />
            <form class="d-flex" method="get" action="${action}" >
                <input class="form-control me-2" type="text" placeholder="Nhap tu khoa" name="kw" >
                <button class="btn btn-primary" type="button" type="submit" >Tim</button>
            </form>
        </div>
    </div>
</nav>