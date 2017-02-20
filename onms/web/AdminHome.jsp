<%-- 
    Document   : AdminHome
    Created on : Feb 5, 2017, 8:46:43 PM
    Author     : mk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <% 
         String username =(String)session.getAttribute("username");  
       String password=(String)session.getAttribute("password");
%>
Welcome UserName:<div> <%=username%> </div>    
    </body>
</html>
