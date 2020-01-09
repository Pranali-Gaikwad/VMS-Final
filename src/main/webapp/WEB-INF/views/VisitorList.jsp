<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

<body>
	<h1 align="center">Visitors List</h1>
	<form:form class="form-horizontal">
		  <table align="center" border="2">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>MobileNo</th>
				<th>Address</th>
				<th>IdProof Type</th>
				<th>IdProof</th>
				<th>Visitor Type</th>
				<th>Reason For Visit</th>
				<th>Contact Person Name</th>
				<th>Contact Person Email</th>
				<th>Contact Person MobileNo</th>
				<th>Status</th>
				<th>Edit</th>
				<th>Delete</th> 
				
			</tr>

			<c:forEach var="visitor" items="${list}">
				<tr>
					<td>${visitor.id}</td>
					<td>${visitor.name}</td>
					<td>${visitor.email}</td>
					<td>${visitor.mobileNo}</td>
					<td>${visitor.address}</td>
					<td>${visitor.idProofType}</td>
					<td>${visitor.idProof}</td>
						<td>${visitor.visitorType}</td>
					<td>${visitor.reasonForVisit}</td>
					<td>${visitor.contactPersonName}</td>
					<td>${visitor.contactPersonEmail}</td>
					
					<td>${visitor.contactPersonMobileNo}</td>
					<td>${visitor.status}</td>
					 <td><a href="/editVisitor/${visitor.id}">Edit</a></td>  
                     <td><a href="/deleteVisitor/${visitor.id}">Delete</a></td>  
                     
                   
				</tr>
			</c:forEach>


		</table>
		<br />


	</form:form>
</body>
</html>