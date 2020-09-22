<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <p class="navbar-text">Travel Booking Application</p>
    <ul class="nav navbar-nav">
       <li class="active"><a href="/">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Booking<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="/booking">Booking</a></li>
          
          
        </ul>
      </li>
   
      </ul>
    
  </div>
</nav>




<div align="center" class="box"
		style=" width: 50%; margin: 5% auto; padding: 3%; border-radius: 5%">
		<h2>User Registration</h2>
		
		<br>
		<form:form method="post" modelAttribute="user" action="saveUser">
			<table cellpadding=7%>
				<tr>
					<td>User Name :</td>
					<td><form:input path="userName" placeholder="Enter your name"
							id="userName" /></td>
				</tr>
				<tr>
					<td></td>
					<td><span id="error1"
						style="color: red; font-weight: bold; font-family: sans-serif;"></span>
					</td>
				</tr>
				<tr>
					<td>User Age :</td>
					<td><form:input path="age" placeholder="Enter your age"
							id="userAge" /></td>
				</tr>
				<tr>
					<td></td>
					<td><span id="error2"
						style="color: red; font-weight: bold; font-family: sans-serif;"></span>
					</td>
				</tr>
			</table>
			<br>
			<button type="submit" onclick="return myUserPage()">Register</button>
		</form:form>

	</div>
	<script>
	
	
	function myUserPage() {

		console.log("Function hitted");
		var name = document.getElementById("userName").value;
		var age = document.getElementById("userAge").value;
		  var radios = document.getElementsByTagName("radio");

		var regex = /^[a-zA-Z ]*$/;

		if (name.trim() == "") {
			document.getElementById("error1").innerHTML = "*Name Can Not Be Empty !";
			return false;

		} else if (!(name.charAt(0) >= 'A' && name.charAt(0) <= 'Z')) {
			document.getElementById("error1").innerHTML = "*First Letter Must be UpperCase !";
			return false;

		} else if (!(regex.test(name))) {

			document.getElementById("error1").innerHTML = "*Name Can Not Contain Numbers !";
			return false;
		} else {
			if (age < 18) {
				document.getElementById("error2").innerHTML = "*Minimum Age Should Be 18 !";
				return false;
			}
		}

	}
	
	
	
	
	</script>







</body>
</html>