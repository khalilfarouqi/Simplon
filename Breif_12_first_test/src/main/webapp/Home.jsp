<html lang="en" xmlns:th="http://www.thymeleaf.org">
	
	<head>
		<title>List Employees</title>
		
		<link rel="stylesheet" 
			type="text/css" 
			href="https://cdn.datatables.net/v/bs4/dt-1.10.25/datatables.min.css" />
		<link rel="stylesheet" 
			href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" 
			integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" 
			crossorigin="anonymous" />
	</head>
	
	<body>
		
		<div class="container">
		
			<h3>List Employees</h3>
			
			<hr/>
			<a th:href="@{/addEmployeeForm}" class="btn btn-primary">Add Employee</a>
			<br/><br/>
			<table class="table table-bordered table-striped" id="employeeTable">
			
				<thead>
					<tr>
						<th>Name</th>
						<th>Email</th>
						<th>Department</th>
						<th>Actions</th>
					</tr>
				</thead>
				<tbody>
					<tr th:each="employee: ${employees}">
						<td th:text="${employee.name}" />
						<td th:text="${employee.email}" />
						<td th:text="${employee.department}" />
						<td>
							<a th:href="@{/showUpdateForm(employeeId=${employee.id})}" class="btn btn-info">Update</a>
							
							<a th:href="@{/deleteEmployee(employeeId=${employee.id})}" class="btn btn-danger ml-2">Delete</a>
						</td>
					</tr>
				</tbody>
				
			</table>
		</div>
		
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
		<script type="text/javascript" src="https://cdn.datatables.net/v/bs4/dt-1.10.25/datatables.min.js"></script>
		<script>
			$(document).ready(function() {
				$("#employeeTable").DataTable({
						'aoColumnDefs': [{
        				'bSortable': false,
        				'aTargets': [-1] /* 1st one, start by the right */
    				}]
				});
			})
		</script>
	</body>
	
</html>