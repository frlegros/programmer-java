<%-- http://localhost:8080/chap26/bonjour03.jsp?nom=Francky3 --%>
<%@ page import="userclasses.Nom" %>
<html>
<head>
<title>JSP bonjour avec une classe Nom</title>
</head>
<body>
<%
Nom newNom = new Nom();
String nom = request.getParameter("nom");
if(nom!=null)
 newNom.setNom(nom);
%>
Bonjour <%=newNom.getNom()%>
</body>
</html>
