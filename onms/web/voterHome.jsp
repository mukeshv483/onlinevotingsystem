<%-- 
    Document   : voterHome
    Created on : Feb 1, 2017, 1:04:47 AM
    Author     : mk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Voter Home Page</title>
    </head>
    <body>
        <h1>
            
            
            
           
      <% 
         String username =(String)session.getAttribute("username");  
       String password=(String)session.getAttribute("password");
%>
Welcome UserName:<div> <%=username%> </div>      
        </h1>
    </body>
</html>
