<%-- http://localhost:8080/chap26/bonjour04bean.jsp?nom=FranckyBean --%>
<jsp:useBean id="objetNom" class="userclasses.Nom"/>
<html>
<head>
<title>JSP bonjour avec une classe Nom</title>
</head>
<body>
    <jsp:setProperty name="objetNom" property="nom" param="nom"/>
    Bonjour <jsp:getProperty name="objetNom" property="nom"/>
</body>
</html>
