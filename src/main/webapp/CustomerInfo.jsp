<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Customer Management Application</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

<style>
	.footer {
		position: absolute;
		bottom: 0;
		width: 100%;
		height: 60px;
		background-color: #f5f5f5;
	}
</style>
</head>

<body>

	<nav class="navbar navbar-default">

		<a href="/" class="navbar-brand">Brand</a>

		<ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>
		</ul>

		<ul class="nav navbar-nav navbar-right">
			<li><a href="/login.html">Login</a></li>
		</ul>

	</nav>
<div class="container">
		<div class="jumbotron">
			<h1>Customer Creation Module</h1>
		</div>
	<div class="container">
		<form action="/Servlets/loginServlet" method="post">
		<table class="table table-striped">
			<tr>
				<td><label>First Name</label></td>
				<td><input type="text" name="firstName"></td>
			</tr>
			<tr>
				<td><label>Last Name</label></td>
				<td><input type="text" name="lastName"></td>
			</tr>
			<tr>
				<td><label>dob</label></td>
				<td><input type="date" name="dob"></td>
			</tr>

			<tr>
				<td><label>Company</label></td>
				<td><input type="text" name="company"></td>
			</tr>
			<tr>
				<td><label>email</label></td>
				<td><input type="email" name="email"></td>
			</tr>
			<tr>
				<td colspan="1"><a class="btn btn-sucess"> </a><input class="btn btn-sucess" type="submit" value="Submit"></td>
			</tr>
		</table>
	</form>
	</div>
</div>

	<footer class="footer">
		<p>Contact us @support@gmail.com</p>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>