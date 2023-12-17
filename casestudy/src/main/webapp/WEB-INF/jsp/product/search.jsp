<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp"/>

<section>
    <h1>Search Page</h1>

    <c:choose>
        <c:when test="${not empty products}">
            <c:forEach items="${products}" var="product">
                <div class="product">
                    <h2>${product.productName}</h2>
                    <p>${product.productDescription}</p>
                    <p>${product.productMSRP}</p>
                    <p>${product.imageUrl}</p>
                    <p>${product.productCategory}</p>
                </div>
            </c:forEach>
        </c:when>
        <c:otherwise>
            <p>No products found</p>
        </c:otherwise>
    </c:choose>

</section>


<jsp:include page="../include/footer.jsp"/>