<%@ page import="java.util.Date, org.udemy.servlet.UserDefined" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Demo</title>
</head>
<body>
<%
		out.println("VAlue 1: " + request.getParameter("getValue1"));
		out.println("VAlue 1: " + request.getParameter("getValue2"));
%>
	
<%@ include file="file1.txt" %>
<br/>
<jsp:include page="file2.txt" />
		
<br/>
			
<% out.print(new java.util.Date()); %>
					
<br/>
						

			
<%= new Date()%>

<br/>
<%-- page import="org.udemy.servlet.UserDefined" --%>


<% out.println(new UserDefined().Demo()); %>

<br/>
It's from original page

<%--  <jsp:forward page="udemyForward.jsp"></jsp:forward> --%>

<%
	// request.getRequestDispatcher("udemyForward.jsp").forward(request, response);
response.sendRedirect("udemyRedirect.jsp");
%>

			

</body>
</html>