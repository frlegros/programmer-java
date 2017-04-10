<%-- Methode de calcul de factorielle --%>
<%-- http://localhost:8080/chap26/factorielle.jsp?debut=4&fin=8 --%>
<%! int fact(int n)
    {
        int fac = 1;
        for(int i=1;i<=n;i++)
            fac *= i;
        return fac;
    }
%>
<%
    String sDeb = request.getParameter("debut");
    String sFin = request.getParameter("fin");
    
    int debut, fin;
    
    if(sDeb==null)
        debut=1;
    else
        debut = Integer.parseInt(sDeb);

    if(sFin==null)
        fin=4;
    else
        fin = Integer.parseInt(sFin);
%>
<html>
<head>
<title>Servlet calcul de Factorielle</title>
</head>
<body>
<font size=+2>factorielles de  <%=debut%> à <%=fin%></font><br>
<%
for (int i=debut;i<=fin;i++){
%>
    <%=i%> ! = <%=fact(i)%> <br>
<%
}
%>
</body>
</html>
