<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:include page="../include/header.jsp"/>

<section id="registration-container">
    <h1>Register</h1>
</section>

<section>
    <div class="container">
        <!-- the action attribute on the form tag is the URL that the form will submit to when then user clicks the submit button -->
        <form method="get" action="/auth/registerSubmit">
            <input type="hidden" name="id" value="${form.id}">

            <div class="mt-3">
                <label for="email" class="form-label">Email</label>
                <input type="text" class="form-control" id="email" name="email" aria-describedby="emailHelp"
                       value="${form.email}">
            </div>

            <c:if test="${errors.hasFieldErrors('email')}">
                <div style="color:red">
                    <c:forEach items="${errors.getFieldErrors('email')}" var="error">
                        ${error.defaultMessage}<br>
                    </c:forEach>
                </div>
            </c:if>

            <div class="mt-3">
                <label for="password" class="form-label">Password</label>
                <input type="text" class="form-control" id="password" name="password" value="${form.password}">
            </div>

            <c:if test="${errors.hasFieldErrors('password')}">
                <div style="color:red">
                    <c:forEach items="${errors.getFieldErrors('password')}" var="error">
                        ${error.defaultMessage}<br>
                    </c:forEach>
                </div>
            </c:if>

            <div class="mt-3">
                <label for="confirmPassword" class="form-label">Confirm Password</label>
                <input type="text" class="form-control" id="confirmPassword" name="confirmPassword"
                       value="${form.confirmPassword}">
            </div>

            <c:if test="${errors.hasFieldErrors('confirmPassword')}">
                <div style="color:red">
                    <c:forEach items="${errors.getFieldErrors('confirmPassword')}" var="error">
                        ${error.defaultMessage}<br>
                    </c:forEach>
                </div>
            </c:if>

            <button type="submit" class="btn btn-primary mt-4">Submit</button>
        </form>
    </div>
</section>

<jsp:include page="../include/footer.jsp"/>