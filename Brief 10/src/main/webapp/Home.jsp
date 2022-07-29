<!DOCTYPE html>
<%@page import="org.hibernate.internal.build.AllowSysOut"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Employe List</title>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
	</head>
	<body>
	
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark static-top">
	    <div class="container">
	        <a class="navbar-brand" href="/">Gestion Des Employes</a>
	        <button class="navbar-toggler" type="button" data-toggle="collapse"></button>         
	        <div class="collapse navbar-collapse" id="navbarResponsive">
	            <ul class="navbar-nav ml-auto">
	                <li class="nav-item active">
	                    <a class="nav-link" href="EmployeList.html">Home
	                        <span class="sr-only">(current)</span>
	                    </a>
	                </li>
	               
	                <li class="nav-item">
	                    <a class="nav-link" href="login.html">Sing out</a>
	                </li>
	            </ul>
	        </div>
	    </div>
	</nav>
	
	
	<h3 class="text-center">List Des Employes</h3>
	
	
	s
	<div class = "container my-2">
	<a href="<%=request.getContextPath()%>/Add.html" href ="Add.html" class="btn btn-primary btn-sm mb-3"> Add Employee </a>
	
	<form  action="Test">
		<div class = "row">
	    <table class = "table table-bordered table-striped table-hover">
	     <thead>
	      <tr>
		       <th class="text-center" scope="col">#</th>
		       <th class="text-center">Nom</th>
		       <th class="text-center">Prenom</th>
		       <th class="text-center">Salaire</th>
		       <th class="text-center">Post</th>
		       <th class="text-center">Type Contrat</th>
		       <th scope="col" class="text-center">Action</th>
	      </tr>
	     </thead>
	     
	     <tbody>
	     
	     <c:forEach var="Employe" items="${listEmploye}">

			<tr>
				<td><c:out value="${Employe.nom}" /></td>
				<td><c:out value="${Employe.prenom}" /></td>
				<td><c:out value="${Employe.salaire}" /></td>
				<td><c:out value="${Employe.post}" /></td>
				<td><c:out value="${Employe.typeCont}" /></td>
                            
 				<td>
 					<a href="update.html=<c:out value='${Employe.id}' />">Edit</a>
					&nbsp;&nbsp;&nbsp;&nbsp; 
  					<a href="delete?id=<c:out value='${Employe.id}'/>">Delete</a>
  				</td>

			</tr>
		</c:forEach>
	     
	    
	    </tbody>
	    </table>
	  </div>
	</form>
	  
	  </div>
	
	</body>
</html>