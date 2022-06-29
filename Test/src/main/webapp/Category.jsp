<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Category</title>
	    <link rel="stylesheet" href="Category.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	</head>
	<body>
		<!-- Body of Form starts -->
  		<div class="container">
    		<form method="post" autocomplete="on" action='CategoryServlet'>
      		<!--ID-->
		    <div class="box">
		    	<label for="firstName" class="fl fontLabel"> Category ID: </label>
		        <div class="new iconBox">
		        	<i class="fa fa-user" aria-hidden="true"></i>
		        </div>
		        <div class="fr">
		        	<input type="text" name="id" placeholder="Category ID" class="textBox" autofocus="on" required>
		        </div>
		        <div class="clr"></div>
			</div>
		    <!--ID-->

      		<!--category name-->
      		<div class="box">
		        <label for="secondName" class="fl fontLabel"> Category Name: </label>
		        <div class="fl iconBox"><i class="fa fa-user" aria-hidden="true"></i></div>
		        <div class="fr">
		        	<input type="text" required name="CategoryName" placeholder="Category Name" class="textBox">
		        </div>
		        <div class="clr"></div>
	      </div>
	      <!--category name-->

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