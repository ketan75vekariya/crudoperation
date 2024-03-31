<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="Stylesheet">
   
    
    <title>Todo Page</title>
  </head>

  <body>
	  <div class="container">
	    <h1>Welcome ${name}</h1>
	    <hr>
	    <table class="table">
		    <thead>
		    	<tr>
		    		<th>Descriptions</th>
		    		<th>Target Date</th>
		    		<th>Status</th>
		    		<th></th>
		    		<th></th>
		    	</tr>
		    	
		    </thead>
	    	<tbody>
	    		<c:forEach items="${todos}" var="todo">
	    		<tr>
	    			<td>${todo.description}</td>
	    			<td>${todo.targetDate}</td>
	    			<td>${todo.done}</td>
	    			<td><a href="delete-todo?id=${todo.id}" class = "btn btn-danger">Delete</a></td>
	    			<td><a href="update-todo?id=${todo.id}" class = "btn btn-warning">Update</a></td>
	    		</tr>
	    		</c:forEach>
	    	</tbody>
	    </table>
	    <a href="add-todo" class="btn btn-success mt-3">Add Todo</a>
	  </div>
    <script src= "webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
    
    
  </body>
</html>