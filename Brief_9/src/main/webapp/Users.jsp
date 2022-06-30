<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Sign In</title>
	    <link rel="stylesheet" href="Users.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	</head>
	<body>
		<!-- Body of Form starts -->
  		<div class="container">
    		<form method="post" autocomplete="on" action='Users_Servlet'>
      		<!--ID-->
		    <div class="box">
		    	<label for="firstName" class="fl fontLabel"> First Name: </label>
		        <div class="new iconBox">
		        	<i class="fa fa-user" aria-hidden="true"></i>
		        </div>
		        <div class="fr">
		        	<input type="text" name="First_Name" placeholder="First Name" class="textBox" autofocus="on" required>
		        </div>
		        <div class="clr"></div>
			</div>
		    <!--ID-->

      		<!--title-->
      		<div class="box">
		        <label for="secondName" class="fl fontLabel"> Last Name: </label>
		        <div class="fl iconBox"><i class="fa fa-user" aria-hidden="true"></i></div>
		        <div class="fr">
		        	<input type="text" required name="Last_Name" placeholder="Last Name" class="textBox">
		        </div>
		        <div class="clr"></div>
	      </div>
	      <!--description-->
      		<!--Description-->
		    <div class="box">
		    	<label for="firstName" class="fl fontLabel"> Username: </label>
		        <div class="new iconBox">
		        	<i class="fa fa-user" aria-hidden="true"></i>
		        </div>
		        <div class="fr">
		        	<input type="text" name="User_Name" placeholder="Username" class="textBox" autofocus="on" required>
		        </div>
		        <div class="clr"></div>
			</div>
		    <!--Description-->
		    
      		<!--DeadLine-->
		    <div class="box">
		    	<label for="firstName" class="fl fontLabel"> PassWord : </label>
		        <div class="new iconBox">
		        	<i class="fa fa-key" aria-hidden="true"></i>
		        </div>
		        <div class="fr">
		        	<input type="text" name="User_PassWord" placeholder="PassWord" class="textBox" autofocus="on" required>
		        </div>
		        <div class="clr"></div>
			</div>
		    <!--DeadLine-->

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