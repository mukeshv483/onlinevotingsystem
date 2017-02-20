<%-- 
    Document   : voterdetails
    Created on : Jun 7, 2014, 3:33:11 PM
    Author     : s
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="2">
            <%  Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onms_db","root","mukesh");
             Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from votereg");
            while(rs.next())
            {
                %><tr><td><%=rs.getString(1)%></td><td><%=rs.getString(2)%></td><td><%=rs.getString(3)%></td><td><%=rs.getString(4)%></td><td><%=rs.getString(5)%></td><td><%=rs.getString(6)%></td><td><%=rs.getString(7)%></td><td><%=rs.getString(8)%></td><td><%=rs.getString(9)%></td><td><%=rs.getString(10)%></td><td><%=rs.getString(11)%></td><td><%=rs.getString(12)%></td></tr><%
            }
                 stmt.close();
           con.close();
                
                %>
            
           
        </table>
    </body>
</html>
