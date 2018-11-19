<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<div class="caption">
		<h3>First Name - ${employee.firstName}</h3>
		<h3>Last Name - ${employee.lastName}</h3>
		<p>Age - ${employee.age}</p>
		<p>Title - ${employee.title}</p>
		<p>NUMBER - ${employee.employeeNumber}</p>
		<p>Street - ${employee.address.street}</p>
		<p>City - ${employee.address.city}</p>
		<p>State - ${employee.address.state}</p>
		<p>Zip Code - ${employee.address.zipCode}</p>
		
		<p>
			<a
				href=" <spring:url value="/employees" />"
				class="btn btn-primary"> <span
				class="glyphicon-info-sign glyphicon" /></span> Go to community
			</a>
		</p>

	</div>
</body>
</html>