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
          <style>
  #myTable{
     font-family: 'helvetica neue',helvetica,arial,'lucida grande',sans-serif;
     border-collapse: collapse;
  }
  #myTable td{
     border: solid 1px #9dce2c;
     padding: 10px;
     font-size: 12px;
     text-align: center;
  }
  #myTable tr{
     background-color: #8cb82b;
     color: #ffffff;
  }
  #myTable tr:hover{
     background-color: #FFFFFF;
     color: #000000;
  }
  #myTable th{
     border: solid 1px #83c41a;
     padding: 10px;
     color: #689324;
     background-color: #c1ed9c;
     text-align: center;
     font-size: 12px;
  }
</style>
    </head>
    <body>
     <table   id="myTable" width="320" height="5" border="" align="center" cellpadding="" cellspacing="" bordercolor="#000000" bgcolor="#00FF66"  hspace="3" vspace="3">

          <tr ><th>Candidate Name</th>
       <th>User Name</th>
       <th>
            Party Name</th>
   

</tr>
            <%  Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onms_db","root","mukesh");
             Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("SELECT * FROM onms_db.caninfo;");
            while(rs.next())
            {
                %><tr>
                    <td><%=rs.getString(1)%></td>
                     <td><%=rs.getString(2)%></td>
                    <td><%=rs.getString(3)%></td></tr>
                <%
            }
                 stmt.close();
           con.close();
                
                %>
            
           
        </table>
    </body>
</html>
