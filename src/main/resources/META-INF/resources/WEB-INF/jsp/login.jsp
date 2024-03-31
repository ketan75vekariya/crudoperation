<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="Stylesheet">
    <title>Login Page</title>
  </head>

  <body>
  	<div class="container">
	    <h1>Login</h1>
	    <hr>
	    <pre>${errorMessage}</pre>
	    <div class = "row">
	    	<div class="col-4">
			    <form method="POST">
			    	Name: <input type="text" name="name" class="form-control" required="required"/>
			    	Password: <input type="Password" name="password" class="form-control" required="required"/>
					<input type="submit" class="btn btn-success mt-3">     
			    </form>
		    </div>
	    </div>
    </div>
    <script src= "webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
  </body>
</html>