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
    		<form method="post" autocomplete="on" action='CategoryServlet'>
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
		        <div class="fl iconBox"><i class="fa-solid fa-list-check" aria-hidden="true"></i></div>
		        <div class="fr">
		        	<select name="cStatusars" class="textBox">
					  <option value="Terminer">Terminer</option>
					  <option value="PasEncore">Pas Encore</option>
					  <option value="Encore">Encour</option>
					</select>
		        </div>
		        
		        <div class="clr"></div>
	      </div>
	      <!--Status-->
	      <!--description-->
      		<!--DeadLine-->
		    <div class="box">
		    	<label for="firstName" class="fl fontLabel"> DeadLine : </label>
		        <div class="new iconBox">
		        	<i class="fa fa-user" aria-hidden="true"></i>
		        </div>
		        <div class="fr">
		        	<input type="date" name="id" placeholder="Description" class="textBox" autofocus="on" required>
		        </div>
		        <div class="clr"></div>
			</div>
		    <!--DeadLine-->

      		<!--category name-->
      		<div class="box">
		        <label for="secondName" class="fl fontLabel"> Category : </label>
		        <div class="fl iconBox"><i class="fa fa-calendar-times" aria-hidden="true"></i></div>
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