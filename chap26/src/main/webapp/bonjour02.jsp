<%-- Code Java de determination du nom et de comptage des appels --%>
<%-- http://localhost:8080/chap26/bonjour02.jsp?nom=Francky3 --%>
<%! int compte = 0; // Nombre d'appels %>
<%
String nom = request.getParameter("nom");
if(nom==null) nom = "";
compte++;
%>
<html>
<head>
<title>JSP bonjour</title>
</head>
<body>
Bonjour <%=nom%>
<br><br>
Appel numéro: <%=compte%>
</body>
</html>
