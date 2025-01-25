<%@ include file="common/header.jsp" %>
<%@ include file="common/navbar.jsp" %>
<div class="container">
    <div class="text-center" style="margin: 30px">
        <h3>Employees System</h3>
    </div>
    <div class="table-responsive">
        <table class="table table-striped table-border table-bordered align-middle">
            <thead class="table-dark text-center">
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Name</th>
                    <th scope="col">Department</th>
                    <th scope="col">Salary</th>
                    <th scope="col">Actions</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="employee" items="${employees}">
                <tr>
                    <th scope="row">${employee.idEmployee}</th>
                    <td>${employee.name}</td>
                    <td>${employee.department}</td>
                    <td>
                        <fmt:setLocale value="en_US"/>
                        <fmt:formatNumber type="currency" value="${employee.salary}"/>
                    </td>
                    <td class="text-center">
                        <c:set var="urlEdit">
                            <c:url value="${application.contextPath}/edit-employee">
                                <c:param name="employeeId" value="${employee.idEmployee}"/>
                            </c:url>
                        </c:set>
                        <a href="${urlEdit}" class="btn btn-warning btn-sm">Edit</a>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<%@ include file="common/footer.jsp" %>