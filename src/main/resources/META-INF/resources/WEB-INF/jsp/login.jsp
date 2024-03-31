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
	    <form method="POST">
	    	Name: <input type="text" name="name"/>
	    	Password: <input type="Password" name="password"/>
			<input type="submit">    
	    </form>
    </div>
    <script src= "webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
  </body>
</html>