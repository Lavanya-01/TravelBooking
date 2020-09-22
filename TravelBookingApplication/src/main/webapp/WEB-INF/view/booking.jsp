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
      
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Booking<span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="/register">Add Booking</a></li>
           <li><a href="/view">View Booking Details</a></li>
            
        </ul>
      </li>
      </ul>
  </div>
</nav>
<br><br>
<div align="center">
<h1>Booking</h1>
<form:form method="post" modelAttribute="bookingDetails"
			action="savebooking">
			<table cellpadding="5">
				<tr>
					<td>Select User:</td>
					<td><select name="userId">
							<c:forEach var="nameuser" items="${usersdata}">
								<option value="${nameuser.userId}">${nameuser.userId}-
									${nameuser.userName}</option>
							</c:forEach>
					</select></td>
				</tr>
				<tr>
					<td>Source:</td>
					<td><form:input path="bookingFrom" id="bookingFrom" /></td>
				</tr>
				<tr>
					<td></td>
					<td><span id="soucreError"
						style="color: red; font-weight: bold; font-family: sans-serif;"></span>
					</td>
				</tr>
				<tr>
					<td>Destination:</td>
					<td><form:input path="bookingDestination" id="bookingDestination" /></td>
				</tr>
				<tr>
					<td></td>
					<td><span id="destinationError"
						style="color: red; font-weight: bold; font-family: sans-serif;"></span>
					</td>
				</tr>
				<tr>
					<td>DOJ:</td>
					<td><form:input type="date" path="date" id="date" /></td>

				</tr>

				<tr>
					<td>Distance (KM):</td>
					<td><form:input path="distance" id="distance" /></td>

				</tr>
				<tr>
					<td></td>
					<td><span id="distanceError"
						style="color: red; font-weight: bold; font-family: sans-serif;"></span>
					</td>
				</tr>
			</table>
			<br>


			<table>
				<tr>
					<td>Food Preferences :</td>
					<td><br> <form:radiobutton path="preference"
							value="VEGETERIAN" id="radio"  required="required"/> &nbsp; VEGETERIAN <br> 
							<form:radiobutton
							path="preference" value="NON-VEGETERIAN" id="radio"  />&nbsp;&nbsp;NON-VEGETERIAN
					</td>
				</tr>
			</table>

			<br>
			<div>
				Travelling with:&nbsp;&nbsp;

				<form:checkbox path="travellingId" value="VISA" id="visa" />
				&nbsp;VISA &nbsp;&nbsp;&nbsp;
				<form:checkbox path="travellingId" value="PASSPORT" id="passport" />
				&nbsp;PASSPORT
			</div>

			<br>
			<br>

			<button type="submit" id="btn">Book</button>

		</form:form>

</div>

</body>






</html>