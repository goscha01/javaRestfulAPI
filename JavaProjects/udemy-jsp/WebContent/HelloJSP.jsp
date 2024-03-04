<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>
<h1>JSP java page</h1>

<%! public int x=22; %>
<%= x %> 
<br/>
<%= new Integer(22) %>
<br/>

<%= new String("Georgre") %>
<br/>
<%= new java.util.Date() %>
<br/>
<%= 25*4 %>
<br/>
<%= 25>4 %>
<br/>

<%
int x=25;
out.println(x);
// comment
%>
<!-- COMMENT -->
<%! String message(){
		return "Hey";
}%>

<%= message() %>

<!-- <%-- response.sendRedirect("http://studyeasy.org"); --%> -->



}

</body>
</html>