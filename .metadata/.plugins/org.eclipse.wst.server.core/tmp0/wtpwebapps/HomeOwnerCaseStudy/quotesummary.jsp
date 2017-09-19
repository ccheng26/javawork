<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.home.model.*"%>
<%@ page import="com.home.bo.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Quote Summary</title>
<link rel="stylesheet" href="./CSS/style.css">
</head>


<%
	int location_id = Integer.parseInt(session.getAttribute("locationId").toString());
	Users user = (Users) session.getAttribute("user");
	int user_id = user.getUserId();
	Homeowners homeowner = null;
	HomeownerBO homeownerBO = new HomeownerBO();
	homeowner = homeownerBO.getOneHomeOwner(user_id, location_id);

	PropertyDetails property = null;
	PropertyDetailBO propertyBO = new PropertyDetailBO();
	property = propertyBO.getOneLocationId(user_id, location_id);

	LocationAddress location = null;
	LocationAddressBO locationBO = new LocationAddressBO();
	location = locationBO.getOneLocationAddress(user_id, location_id);
	
	QuoteDetails quote = null;
	QuoteDetailBO quoteBO = new QuoteDetailBO();
	quote = quoteBO.getQuoteDetails(user_id);

%>
<body>
	user id<%=user_id%>
	location id
	<%=location_id%>
	<div class="wrapper">
		<center>
			<h1>Quote Summary</h1>
		</center>
		<h3>
			Monthly Premium <span class="asterisk">$<%=quote.getMonthlyPremium()%></span>
		</h3>
		<center>
			<form method="post">
				<input type="submit" name="Buy Quote" value="continue" />
			</form>
			<div class="logintxtsection">
				<h2>Location Details</h2>
				<table>
					<tr>
						<th>Quote Id</th>
						<td><%=location.getLocationId()%></td>
					</tr>
					<tr>
						<th>Residence Type</th>
						<td><%=location.getResidenceType()%></td>
					</tr>
					<tr>
						<th>Address Line 1</th>
						<td><%=location.getAddressLine1()%></td>
					</tr>
					<tr>
						<th>Address Line 2</th>
						<td><%=location.getAddressLine2()%></td>
					</tr>
					<tr>
						<th>City</th>
						<td><%=location.getCity()%></td>
					</tr>
					<tr>
						<th>State</th>
						<td><%=location.getState()%></td>
					</tr>
					<tr>
						<th>Zip</th>
						<td><%=location.getZip()%></td>
					</tr>
					<tr>
						<th>Residence Use</th>
						<td><%=location.getResidenceUse()%></td>
					</tr>
				</table>
				<hr />

				<h2>Property Details</h2>
				<table>
					<tr>
						<th>Market Value</th>
						<td>$<%=property.getMarketValue()%></td>
					</tr>
					<tr>
						<th>Year Built</th>
						<td><%=property.getYearBuilt()%></td>
					</tr>
					<tr>
						<th>Square Footage</th>
						<td><%=property.getSqft()%></td>
					</tr>
					<tr>
						<th>Dwelling Style</th>
						<td><%=property.getDwellStyle()%></td>
					</tr>
					<tr>
						<th>Roof Material</th>
						<td><%=property.getRoofMaterial()%></td>
					</tr>
					<tr>
						<th>Garage Type</th>
						<td><%=property.getGarageType()%></td>
					</tr>
					<tr>
						<th>Number of Full Baths 1</th>
						<td><%=property.getNumFullBath()%></td>
					</tr>
					<tr>
						<th>Number of Half Baths 1</th>
						<td><%=property.getNumHalfBath()%></td>
					</tr>
					<tr>
						<th>Has Swimming Pool?</th>
						<td><%=property.getHasPool()%></td>
					</tr>
				</table>
			</div>

			<div class="loginformsection">
				<h2>Homeowner Details</h2>
				<table>
					<tr>
						<th>First Name</th>
						<td><%=homeowner.getFirstName()%></td>
					</tr>
					<tr>
						<th>Last Name</th>
						<td><%=homeowner.getLastName()%></td>
					</tr>
					<tr>
						<th>Date of Birth</th>
						<td><%=homeowner.getDOB()%></td>
					</tr>
					<tr>
						<th>Is Retired?</th>
						<td><%=homeowner.getRetired()%></td>
					</tr>
					<tr>
						<th>Social Security Number</th>
						<td><%=homeowner.getSSN()%></td>
					</tr>
					<tr>
						<th>Email Address</th>
						<td><%=homeowner.getEmailId()%></td>
					</tr>
				</table>
				<hr />
				<h2>Coverage Details</h2>
				<table>
					<tr>
						<th>Monthly Premium</th>
						<td>$<%=quote.getMonthlyPremium()%></td>
					</tr>
					<tr>
						<th>Dwelling Coverage</th>
						<td>$<%=quote.getDwellingCoverage()%></td>
					</tr>
					<tr>
						<th>Detached Structure</th>
						<td>$<%=quote.getDetachedStructures()%></td>
					</tr>
					<tr>
						<th>Personal Property</th>
						<td>$<%=quote.getPersonalProperty()%></td>
					</tr>
					<tr>
						<th>Additional living expense</th>
						<td>$<%=quote.getLivingExpense()%></td>
					</tr>
					<tr>
						<th>Medical Expense</th>
						<td>$<%=quote.getMedExp()%></td>
					</tr>
					<tr>
						<th>Deductible</th>
						<td>$<%=quote.getDeductible()%></td>
					</tr>
				</table>
			</div>
	</div>
	<form method="post" action="">
		<input type="submit" name="Buy Quote" value="continue" />
	</form>

	</center>
</body>
</html>