<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Taks</title>
	    <link rel="stylesheet" href="Task.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	</head>
	<body>
		<!-- Body of Form starts -->
  		<div class="container">
    		<form method="post" autocomplete="on" action='Task_Servlet'>
      		<!--ID-->
		    <div class="box">
		    	<label for="firstName" class="fl fontLabel"> ID: </label>
		        <div class="new iconBox">
		        	<i class="fa fa-id-card" aria-hidden="true"></i>
		        </div>
		        <div class="fr">
		        	<input type="text" name="id" placeholder="ID" class="textBox" autofocus="on" required>
		        </div>
		        <div class="clr"></div>
			</div>
		    <!--ID-->

      		<!--title-->
      		<div class="box">
		        <label for="secondName" class="fl fontLabel"> Title: </label>
		        <div class="fl iconBox"><i class="fa fa-user" aria-hidden="true"></i></div>
		        <div class="fr">
		        	<input type="text" required name="title" placeholder="Title" class="textBox">
		        </div>
		        <div class="clr"></div>
	      </div>
	      <!--description-->
      		<!--Description-->
		    <div class="box">
		    	<label for="firstName" class="fl fontLabel"> Description: </label>
		        <div class="new iconBox">
		        	<i class="fa fa-file-text" aria-hidden="true"></i>
		        </div>
		        <div class="fr">
		        	<input type="text" name="Description" placeholder="Description" class="textBox" autofocus="on" required>
		        </div>
		        <div class="clr"></div>
			</div>
		    <!--Description-->

      		<!--Status-->
      		<div class="box">
		        <label for="secondName" class="fl fontLabel"> Status: </label>
		        <div class="fl iconBox"><i class="fa fa-list" aria-hidden="true"></i></div>
		        <div class="fr">
		        	<select name="Status" class="textBox">
					  <option value="Terminer">Pas encore</option>
					  <option value="PasEncore">En cours</option>
					  <option value="Encore">Terminée</option>
					</select>
		        </div>
		        
		        <div class="clr"></div>
	      </div>
	      <!--Status-->
      		<!--DeadLine-->
		    <div class="box">
		    	<label for="firstName" class="fl fontLabel"> DeadLine : </label>
		        <div class="new iconBox">
		        	<i class="fa fa-calendar" aria-hidden="true"></i>
		        </div>
		        <div class="fr">
		        	<input type="date" name="DeadLine" placeholder="DeadLine" class="textBox" autofocus="on" required>
		        </div>
		        <div class="clr"></div>
			</div>
		    <!--DeadLine-->

      		<!--category name-->
      		<div class="box">
		        <label for="secondName" class="fl fontLabel"> Category : </label>
		        <div class="fl iconBox"><i class="fa fa-id-card" aria-hidden="true"></i></div>
		        <div class="fr">
		        	<input type="text" required name="Categoryid" placeholder="Category ID" class="textBox">
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