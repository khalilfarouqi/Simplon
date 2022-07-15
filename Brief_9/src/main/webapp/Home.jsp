<!DOCTYPE html>
<%@page import="implimentation_DAO.Task_DAO"%>
<%@page import="models.Task"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Category</title>
	    <link rel="stylesheet" href="Home.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	</head>
	<body>
		<!-- Body of Form starts -->
  		<div class="container">
    		<form method="post" autocomplete="on" action='Home_Servlet'>
      			<table class="styled-table">
				    <thead>
				        <tr>
				            <th>ID</th>
				            <th>Title</th>
				            <th>Discription</th>
				            <th>Status</th>
				            <th>Deadline</th>
				            <th>Id Category</th>
				            <th>Edit</th>
				        </tr>
				    </thead>
				    <tbody>
					    <!--  <c:forEach var="task" items="${listTask}">
	
							<tr>
								<td><c:out value="${task.ID_task}" /></td>
								<td><c:out value="${task.Title}" /></td>
								<td><c:out value="${task.Description}" /></td>
								<td><c:out value="${task.Status}" /></td>
	                            <td><c:out value="${task.Deadline}" /></td>
	                            <td><c:out value="${task.ID_Category}" /></td>
								<td>
									<a href="Task.jsp">Edit</a>
									&nbsp;&nbsp;&nbsp;&nbsp; 
									<a href="Task.jsp">Delete</a>
								</td>
							</tr>
						</c:forEach>-->
				    	<!--<tr class="my-class">
						    <td th:text="${ID_Task}">ID</td>
						    <td th:text="${Title}">Title</td>
						    <td th:text="${Disc}">Discription</td>
						    <td th:text="${Status}">Status</td>
						    <td th:text="${DeadLine}">Deadline</td>
						    <td th:text="${ID_Cate}">Id Category</td>
						</tr>
				         and so on... -->
				         <tr class="my-class">
				         	<td>${ID_Task}</td>
				         	<td>${Title}</td>
				         	<td>${Disc}</td>
				         	<td>${Status}</td>
				         	<td>${DeadLine}</td>
				         	<td>${ID_Cate}</td>
				         	<td>
								<a href="Task.jsp">Edit</a>
									&nbsp;&nbsp;&nbsp;&nbsp; 
								<a href="Task.jsp">Delete</a>
							</td>
				         </tr>
				    </tbody>
				</table>
				
			    <!---Submit Button------>
			    <div class="box" style="background: #2d3e3f">
			    	<input type="Submit" name="Submit" class="submit" value="SUBMIT">
				</div>
				<!---Submit Button----->
	    	</form>
		</div>
		<!--Body of Form ends--->
	</body>
</html>