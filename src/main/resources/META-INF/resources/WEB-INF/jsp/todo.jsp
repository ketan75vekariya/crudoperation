<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8">
    <title>Todo Page</title>
  </head>

  <body>
    <h1>Welcome to Todo Page ${name}</h1>
    <hr>
    <table>
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
    
  </body>
</html>