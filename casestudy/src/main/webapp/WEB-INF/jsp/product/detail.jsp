<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp"/>

<form class="wrapper">
    <div class="product-img">
        <img src="${product.imageUrl}" height="420" width="327">
    </div>
    <div class="product-info">
        <div class="product-text">
            <h1>${product.productName}</h1>
            <p>${product.productDescription}</p>
        </div>
        <div class="product-price-btn">
            <p>$<span>${product.productMSRP}</span></p>
            <button type="button">Add to Cart</button>
        </div>
    </div>
</form>

<jsp:include page="../include/footer.jsp"/>