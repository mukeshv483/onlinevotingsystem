<%-- 
    Document   : CandidateHome
    Created on : Feb 5, 2017, 2:16:25 AM
    Author     : mk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Candidate Home</title>
    </head>
    <body>
        <h1>
            <% 
         String username =(String)session.getAttribute("username");  
       String password=(String)session.getAttribute("password");
%>
Welcome User:<div> <%=username%> </div> 
        </h1>
    </body>
</html>
