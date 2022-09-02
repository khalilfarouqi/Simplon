<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login</title>
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	</head>
	<body>
		<!-- Body of Form starts -->
  		<div class="container">
    		<form method="post" autocomplete="on" action='LoginServlet'>
    		<div>
    			<h1 style = "color: white; font-family: verdana;">Login</h1> 
    		</div>
      		<!--Username-->
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
		    <!--Username-->
		    
      		<!--PassWord-->
		    <div class="box">
		    	<label for="firstName" class="fl fontLabel"> PassWord : </label>
		        <div class="new iconBox">
		        	<i class="fa fa-key" aria-hidden="true"></i>
		        </div>
		        <div class="fr">
		        	<input type="password" name="User_PassWord" placeholder="PassWord" class="textBox" autofocus="on" required>
		        </div>
		        <div class="clr"></div>
			</div>
		    <!--PassWord-->
		    <!--Sign In-->
		     <div style="padding-top: 15px; font-family: verdana;">
		    	<a href="SignIn.jsp" style="color: white;">Sign In</a>
		    </div>
		    <!--Sign In-->

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
<style>
	* {
	  padding: 0;
	  margin: 0;
	}
	body {
	  background: url(http://wrbbradio.org/wp-content/uploads/2016/10/grey-background-07.jpg)
	    no-repeat center fixed;
	  background-size: cover;
	}
	
	.container {
	  background: #2d3e3f;
	  width: 350px;
	  height: 300px;
	  padding-bottom: 20px;
	  position: absolute;
	  top: 50%;
	  left: 50%;
	  transform: translate(-50%, -50%);
	  margin: auto;
	  padding: 70px 50px 20px 50px;
	}
	
	.fl {
	  float: left;
	  width: 110px;
	  line-height: 35px;
	}
	
	.fontLabel {
	  color: white;
	}
	
	.fr {
	  float: right;
	}
	
	.clr {
	  clear: both;
	}
	
	.box {
	  width: 360px;
	  height: 35px;
	  margin-top: 15px;
	  font-family: verdana;
	  font-size: 12px;
	}
	
	.textBox {
	  height: 35px;
	  width: 190px;
	  border: none;
	  padding-left: 20px;
	}
	
	.new {
	  float: left;
	}
	
	.iconBox {
	  height: 35px;
	  width: 40px;
	  line-height: 38px;
	  text-align: center;
	  background: #ff6600;
	}
	
	.radio {
	  color: white;
	  background: #2d3e3f;
	  line-height: 38px;
	}
	
	.terms {
	  line-height: 35px;
	  text-align: center;
	  background: #2d3e3f;
	  color: white;
	}
	
	.submit {
	  float: right;
	  border: none;
	  color: white;
	  width: 110px;
	  height: 35px;
	  background: #ff6600;
	  text-transform: uppercase;
	  cursor: pointer;
	}
</style>