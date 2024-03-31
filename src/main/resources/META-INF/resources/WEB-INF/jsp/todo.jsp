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
		    		<th>Id</th>
		    		<th>Descriptions</th>
		    		<th>Target Date</th>
		    		<th>Status</th>
		    	</tr>
		    	
		    </thead>
	    	<tbody>
	    		<c:forEach items="${todos}" var="todo">
	    		<tr>
	    			<td>${todo.id}</td>
	    			<td>${todo.description}</td>
	    			<td>${todo.targetDate}</td>
	    			<td>${todo.done}</td>
	    		</tr>
	    		</c:forEach>
	    	</tbody>
	    </table>
	  </div>
    <script src= "webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
    <script src="webjars/jquery/3.6.0/jquery.min.js"></script>
  </body>
</html>