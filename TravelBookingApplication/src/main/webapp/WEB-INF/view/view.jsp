<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center"
		style=" width: 70%; margin: 5% auto; padding: 3%; border-radius: 5%">
		<h2>Booking Details</h2>
		
		<br>
		<form:form action="getdetails">
			Select User :				
			<select name="userId">
				<c:forEach var="nameuser" items="${usersdata}">
					<option value="${nameuser.userId}">${nameuser.userId}-
						${nameuser.userName}</option>
				</c:forEach>
			</select>
			<br>
			<br>

			<button type="submit" onclick="openTable()">GET BOOKING</button>
			<br>
			<br>
		</form:form>
		
			<table border="2" width=80% cellpadding="5" id="myTable">
				<!-- style="display: none;">
 -->
				<tr align="center">
					<th>Booking ID</th>
					<th>User Name</th>
					<th>Traveling To</th>
					<th>Traveling From</th>
					<th>Traveling Date</th>
					<th>Price</th>
					
				</tr>


				<c:forEach var="booking" items="${bookingDetailsOfUserById}">
					<tr align="center">
						<td><c:out value="${booking.bookingId}" /></td>
						<td><c:out value="${booking.user.userName}" /></td>
						<td><c:out value="${booking.bookingFrom}" /></td>
						<td><c:out value="${booking.bookingDestination}" /></td>
						<td><c:out value="${booking.date}" /></td>
						<td><c:out value="${booking.price}"></c:out></td>
					</tr>
				</c:forEach>

			</table>

			<br> <br> <a href="/"><button type="button">Home
					Page</button></a>
		</div>
		<script type="text/javascript">
			function openTable1() {
				document.getElementById("myTable").style.display = "block";
			}
		</script>
</body>
</html>