<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="Stylesheet">
    <title>Add new todo Page</title>
  </head>

  <body>
  	<div class="container">
	    <h1>Add New Todo</h1>
	    <hr>
	    <pre>${errorMessage}</pre>
	    <div class = "row">
	    	<div class="col-4">
			    <form:form method="POST" modelAttribute = "todo">
			    	Description <form:input type="text" path="description" class="form-control" required="required"/>
			    	<form:errors path="description" cssClass="text-warning" />
			    	<br/>
			    	<form:input type="hidden" path="id"/>
			    	<form:input type="hidden" path="done"/>
			    	<input type="submit" class="btn btn-success mt-3">    
			    </form:form>
		    </div>
	    </div>
    </div>
    <script src= "webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
  </body>
</html>