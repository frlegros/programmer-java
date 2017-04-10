<%-- http://localhost:8080/chap26/bonjour.jsp?nom=Francky3 --%>
<html>
<head>
<title>JSP bonjour</title>
</head>
<body>
<%
String nom = request.getParameter("nom");
if(nom==null)
 out.println("Bonjour");
else
 out.println("Bonjour "+nom);
%>
</body>
</html>
