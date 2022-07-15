<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login</title>
	    <link rel="stylesheet" href="SignIn.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	</head>
	<body>
		<!-- Body of Form starts -->
  		<div class="container">
    		<form method="post" autocomplete="on" action='SignIn_Servlet'>
      		<!--ID-->
		    <div class="box">
		    	<label for="firstName" class="fl fontLabel"> User ID: </label>
		        <div class="new iconBox">
		        	<i class="fa fa-user" aria-hidden="true"></i>
		        </div>
		        <div class="fr">
		        	<input type="text" name="id" placeholder="User ID" class="textBox" autofocus="on" required>
		        </div>
		        <div class="clr"></div>
			</div>
		    <!--ID-->

      		<!--F name-->
      		<div class="box">
		        <label for="secondName" class="fl fontLabel"> First Name: </label>
		        <div class="fl iconBox"><i class="fa fa-user" aria-hidden="true"></i></div>
		        <div class="fr">
		        	<input type="text" required name="FirstName" placeholder="First Name" class="textBox">
		        </div>
		        <div class="clr"></div>
	      	</div>
	      	<!--F name-->
	      	
      		<!--L Name-->
		    <div class="box">
		    	<label for="firstName" class="fl fontLabel"> Last Name: </label>
		        <div class="new iconBox">
		        	<i class="fa fa-user" aria-hidden="true"></i>
		        </div>
		        <div class="fr">
		        	<input type="text" name="LastName" placeholder="Last Name" class="textBox" autofocus="on" required>
		        </div>
		        <div class="clr"></div>
			</div>
		    <!--L Name-->
		    
      		<!--user-->
		    <div class="box">
		    	<label for="firstName" class="fl fontLabel"> user Name: </label>
		        <div class="new iconBox">
		        	<i class="fa fa-user" aria-hidden="true"></i>
		        </div>
		        <div class="fr">
		        	<input type="text" name="user" placeholder="user" class="textBox" autofocus="on" required>
		        </div>
		        <div class="clr"></div>
			</div>
		    <!--user-->
		    
      		<!--Password-->
		    <div class="box">
		    	<label for="firstName" class="fl fontLabel"> Password: </label>
		        <div class="new iconBox">
		        	<i class="fa fa-user" aria-hidden="true"></i>
		        </div>
		        <div class="fr">
		        	<input type="Password" name="Password" placeholder="Password" class="textBox" autofocus="on" required>
		        </div>
		        <div class="clr"></div>
			</div>
		    <!--Password-->

	      <!---Submit Button------>
	      <div class="box" style="background: #2d3e3f">
	        <input type="Submit" name="Submit" class="submit" value="SUBMIT">
	      </div>
	      <!---Submit Button----->
	    </form>
	  </div>
	  <!--Body of Form ends--->
	</body>
</html>>