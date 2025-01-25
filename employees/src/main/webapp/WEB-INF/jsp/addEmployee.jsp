<%@ include file="common/header.jsp" %>
<%@ include file="common/navbar.jsp" %>
<div class="container">
    <div class="text-center" style="margin: 30px">
        <h3>Adding a new Employees</h3>
    </div>
    <div class="container-fluid">
        <form action="${urlAdd}" modelAttribute="postEmployee" method="post">
            <div class="mb-3">
                <label for="exampleInputName" class="form-label">Name</label>
                <input type="text" class="form-control" id="exampleInputName" name="name" required>
            </div>
            <div class="mb-3">
                <label for="exampleInputDepartment" class="form-label">Department</label>
                <input type="text" class="form-control" id="exampleInputDepartment" name="department" required>
            </div>
            <div class="mb-3">
                <label for="exampleInputSalary" class="form-label">Salary</label>
                <input type="number" class="form-control" id="exampleInputSalary" name="salary" required>
            </div>
            <div class="text-center">
                <button type="submit" class="btn btn-warning">Add</button>
                <a href="/employees" class="btn btn-danger">Return</a>
            </div>
        </form>
    </div>
</div>
<%@ include file="common/footer.jsp" %>