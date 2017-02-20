<%-- 
    Document   : logout
    Created on : Jun 2, 2014, 2:29:21 AM
    Author     : s
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="p" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>logout</title>
    </head>
    <body>
        <center>
          
            
            
           <h1> Logout Succesfully !!!<br />
               Please Login Again!!! </h1>
            
              <%
            session.removeAttribute("username");
            session.removeAttribute("password");
          //  session.invalidate();
            
            %>
    
            <div bgcolor="green" align="center" style="text-decoration:underline">  <a href="index.jsp">Click To Login</a></div>
          
            </center>
    </body>
</html>
