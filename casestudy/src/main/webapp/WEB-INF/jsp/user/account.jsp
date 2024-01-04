<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="../include/header.jsp"/>

<section id="account-page-container">
    <h1>Email: <span>${user.email}</span></h1>
    <h1>First Name: <span>${user.firstName}</span></h1>
    <h1>Last Name: <span>${user.lastName}</span></h1>
    <h1>Address: <span>${user.address} ${user.city}, ${user.state} ${user.zipCode}</span></h1>

</section>

<jsp:include page="../include/footer.jsp"/>