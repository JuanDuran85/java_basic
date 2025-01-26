<%@ include file="common/header.jsp" %>
<%@ include file="common/navbar.jsp" %>
<div class="container">
    <div class="text-center" style="margin: 30px">
        <h3>Editing an Employee</h3>
    </div>
    <div class="container-fluid">
        <form action="${urlEdit}" modelAttribute="postEmployee" method="post">
            <input type="hidden" name="idEmployee" value="${employee.idEmployee}">
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Name</label>
                <input type="text" class="form-control" id="exampleInputName" name="name" required value="${employee.name}">
            </div>
            <div class="mb-3">
                <label for="exampleInputDepartment" class="form-label">Department</label>
                <input type="text" class="form-control" id="exampleInputDepartment" name="department" required value="${employee.department}">
            </div>
            <div class="mb-3">
                <label for="exampleInputSalary" class="form-label">Salary</label>
                <input type="number" class="form-control" id="exampleInputSalary" name="salary" required value="${employee.salary}">
            </div>
            <div class="text-center">
                <button type="submit" class="btn btn-warning">Edit</button>
                <a href="${urlInit}" class="btn btn-danger">Return</a>
            </div>
        </form>
    </div>
</div>
<%@ include file="common/footer.jsp" %>