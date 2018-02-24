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
			<h1>Customer Management Application</h1>
		</div>
	<div class="container">
		<table class="table table-bordered">
			<tr>
				<th>Index</th>
				<th>Name</th>
				<th>Action</th>
			</tr>
			<tr>
				<td>1</td>
				<td>Get Customer Information</td>
				<td><a href="/Servlets/getCustomerInfo.html"><button type="button" class="btn btn-default">Get Customer Info</button></a></td>
			</tr>
			<tr>
				<td>2</td>
				<td>Create Customer</td>
				<td><a href="/Servlets/CustomerInfo.jsp"><button type="button" class="btn btn-default">Create Customer</button></a></td>
			</tr>
		</table>
	</div>
</div>
	<footer class="footer">
		<p>footer content</p>
	</footer>

	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>

</body>

</html>