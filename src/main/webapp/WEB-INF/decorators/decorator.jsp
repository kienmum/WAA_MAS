<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <title><decorator:title default="SiteMesh Integration"/></title>
    <meta http-equiv="content-type" content="text/html; charset=utf-8"/>
    <decorator:head/>
    <link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="<spring:url value="/resources/css/style.css"/>">

</head>
<body>

    <div id="header">
    	<nav class="navbar navbar-inverse navbar-fixed-top">
  			<div class="container-fluid">
    			<div class="navbar-header">
      				<a class="navbar-brand" href="#">WAA Project- TM Management</a>
    			</div>
	    		<ul class="nav navbar-nav">
			      <li class="active"><a href="<%=request.getContextPath()%>">Home</a></li>
			      <li><a href="<%=request.getContextPath()%>/employees/list">Page 1</a></li>
			      <li><a href="<%=request.getContextPath()%>">Page 2</a></li>
	    		</ul>
		    	<form class="navbar-form navbar-left" action="/SearchStudent">
			      <div class="form-group">
			        <input type="text" class="form-control" placeholder="Search Student">
			      </div>
			       <button class="btn btn-default" type="submit">
			            <i class="glyphicon glyphicon-search"></i>
		          	</button>
			    </form>
  			</div>
		</nav>
    </div>

    <div id="content">
        <decorator:body/>
    </div>

    <div id="Footer">
        <h5>by Winter Soliders</h5>
    </div>

</body>
</html>