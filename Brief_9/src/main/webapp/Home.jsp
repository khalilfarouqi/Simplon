<!DOCTYPE html>
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
				        </tr>
				    </thead>
				    <tbody>
				        <tr>
				            <td>${Name}</td>
				            <td>6000</td>
				            <td>Dom</td>
				            <td>6000</td>
				            <td>Dom</td>
				            <td>6000</td>
				        </tr>
				        <tr class="active-row">
				            <td>Melissa</td>
				            <td>5150</td>
				            <td>Melissa</td>
				            <td>5150</td>
				            <td>Melissa</td>
				            <td>5150</td>
				        </tr>
				        <!-- and so on... -->
				    </tbody>
				</table>
	    	</form>
		</div>
		<!--Body of Form ends--->
	</body>
</html>