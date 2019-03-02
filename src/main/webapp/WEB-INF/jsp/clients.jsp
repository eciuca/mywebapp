<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="common/header.jspf" %>
<%@ include file="common/navbar.jspf" %>

<div class="container mt-5">
    <h1 class="hello-world-text">${companyName}'s clients are</h1>

    <ul>
        <c:forEach items="${clientsList}" var="client">
            <li>Client id: ${client.id} ${client.firstName} ${client.lastName}</li>
        </c:forEach>
    </ul>

    <div>
        <form:form method="post" modelAttribute="newClientForm" action="/clients/new">
            <div class="form-group">
                <form:label path="firstName" for="first-name">First Name</form:label>
                <form:input path="firstName" id="first-name" type="text" placeholder="First Name"/>
            </div>
            <div class="form-group">
                <form:label path="lastName" for="last-name">Last Name</form:label>
                <form:input path="lastName" id="last-name" type="text" placeholder="Last Name"/>
            </div>
            <form:button type="submit" class="btn btn-primary">Submit</form:button>
        </form:form>
    </div>
</div>

<%@ include file="common/footer.jspf" %>