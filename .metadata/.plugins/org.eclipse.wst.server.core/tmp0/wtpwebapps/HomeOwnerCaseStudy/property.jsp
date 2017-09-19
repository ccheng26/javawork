<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.home.model.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="./CSS/style.css">
<title>Property Details</title>
</head>
<body>

<%
Users user = (Users)session.getAttribute("user");
String location_id = session.getAttribute("locationId").toString();
%>
<form action="PropertyServlet?action=save" method="post">
  		
  		<input type="hidden" name="location_id" value="<%=location_id%>"/>
        <input type="hidden" name="user_id" value="<%=user.getUserId()%>"/>
		
		<label>What is the market value of your home?</label><br/>
		$<input type="text" name="market_value"><br/>
		
		<label>What year was your home originally built?</label><br/>
		<input type="text" name="year_built"><br/>
		
		<label>Square footage</label><br/>
		<input type="text" name="sqft">sqft<br/>
		
		<label>Dwelling Style</label><br/>
		<select name="dwell_style">
		  <option value="1">1 Story</option>
		  <option value="1.5">1.5 Story</option>
		  <option value="2">2 Story</option>
		  <option value="2.5">2.5 Story</option>
		  <option value="2.5">3 Story</option>
		</select><br/>
		
        <label>Roof Material</label><br/>
		<select name="roof_material">
		  <option value="Concrete">Concrete</option>
		  <option value="Clay">Clay</option>
		  <option value="Rubber">Rubber</option>
		  <option value="Steel">Steel</option>
		  <option value="Tin">Tin</option>
		  <option value="Wood">Wood</option>
		</select><br/>
		
		<label>Type of Garage</label><br/>
		<select name="garage_type">
		  <option value="Attached">Attached</option>
		  <option value="Detached">Detached</option>
		  <option value="Basement">Basement</option>
		  <option value="Built-In">Built-In</option>
		  <option value="None">None</option><br/>
		</select><br/>
		
		<label>Full Baths</label><br/>
		<select name="num_full_bath">
		  <option value="0">0</option>
		  <option value="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="more">More</option>
		</select><br/>
		
		<label>Half-Baths</label><br/>
		<select name="num_half_bath">
		  <option value="0">0</option>
		  <option value="1">1</option>
		  <option value="2">2</option>
		  <option value="3">3</option>
		  <option value="more">More</option>
		</select><br/>
		<label>Do you have a pool</label><br/>
		<input type="radio" name="has_pool" value="Yes">Yes<br>
        <input type="radio" name="has_pool" value="No">No<br>
        
        <input type="submit" name="submit" value="Continue"><br>
		
</form>
</body>
</html>