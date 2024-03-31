<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="Stylesheet">
     <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.min.css" rel="Stylesheet">
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
			    <fieldset class="mb-3">
			    	<form:label path = "description">Description</form:label>
			    	<form:input type="text" path="description" class="form-control" required="required"/>
			    	<form:errors path="description" cssClass="text-warning" />
			    </fieldset>
			    <fieldset class="mb-3">
			    	<form:label path = "targetDate">Target Date</form:label>
			    	<form:input type="text" path="targetDate" class="form-control" required="required"/>
			    	<form:errors path="targetDate" cssClass="text-warning" />
			    </fieldset>
			    	<br/>
			    <fieldset>
			    	<form:input type="hidden" path="id"/>
			    </fieldset>
			    <fieldset>
			    	<form:input type="hidden" path="done"/>
			    </fieldset>
			    	<input type="submit" class="btn btn-success">    
			    </form:form>
		    </div>
	    </div>
    </div>
    <script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    <script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>
    <script type="text/javascript">
	    $('#targetDate').datepicker({
	        format: 'yyyy-mm-dd',
	        startDate: '-3d'
	    });
    </script>
  </body>
</html>