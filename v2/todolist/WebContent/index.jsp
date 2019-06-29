<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>todolist</title>
<link href="css/bootstrap.min.css" rel="stylesheet"> 
</head>
<body>
<div class='container'>
<h1 class='alert-info text-center'>TodoList App</h1>
<form action="todo" method="post">
<div class='form-group'>

<label>Id</label>
<input name="id" class='form-control' type='text' placeholder='Type Task Name'>
</div>
<div class='form-group'>
<label>Name</label>
<input name="name" class='form-control' type='text' placeholder='Type Task Name'>
</div>
<div class='form-group'>
<label>Desc</label>
<textarea name="desc" class='form-control'  placeholder='Type Task Desc' rows='10' cols='30'>
</textarea>
</div>
<div class='form-group'>
<label>EndDate</label>
<input name="enddate" class='form-control' type='date'>

</div>
<div class='form-group'>
<button type='submit' class='btn btn-primary'>Add</button>
<button class='btn btn-danger'>Delete</button>
<button class='btn btn-info'>Search</button>
<button class='btn btn-warning'>Update</button>
<button class='btn btn-success'>Sort</button>
<button class='btn btn-dark'>Finish</button>
<button class='btn btn-secondary'>Pending</button>
</div>
<h1>Data is <%=request.getAttribute("mydata") %></h1>
</form>
</div>

</body>
</html>