<%-- 
    Document   : Voterupdateinfo
    Created on : Feb 2, 2017, 12:39:56 AM
    Author     : mk
--%>

<%@page import="java.sql.*"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="p"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Voter Details Update</title>
        <link rel="stylesheet" type="text/css" href="cssandjavascript/button.css">
       <link rel="stylesheet" type="text/css" href="cssandjavascript/textbox.css"> 
       
    </head>
    <body>
        
        
         <%
           String username =(String)session.getAttribute("username");
          
          Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onms_db","root","mukesh");
             Statement stmt=con.createStatement();
                    ResultSet rs= stmt.executeQuery("select * from votereg where username='"+username+"'");

          rs.next();
            
                %>
        <p:form action="/update" method="post">
                     
   
            <table  width="320" height="5" border="" align="center" cellpadding="" cellspacing="" bordercolor="#000000" bgcolor="#00FF66"  hspace="3" vspace="3">
  
            
          
           
  <tr>
    <th width="170" bgcolor="#009966" scope="col"> User details</th>
    <th width="144" bgcolor="#009966" scope="col"> Values</th>
  </tr>
 
  <tr>
  
  <td align="center">User Name</td>
  <td>
      <input name="username" class="textbox"   type="text" id="username" value="<%=rs.getString(1)%>" readonly/>
  </td>
  </tr>
  <tr>
    <td align="center">Name</td>
    <td><input name="name"  type="text"  class="textbox" id="name" value="<%=rs.getString(3)%>" /></td>
  </tr>
  <tr>
    <td align="center">Address</td>
    <td><input name="address" type="text" class="textbox"  id="address" value="<%=rs.getString(4)%>"/></td>
  </tr>
  <tr>
    <td align="center">District</td>
    <td><input name="distt" type="text" id="dob"  class="textbox" value="<%=rs.getString(6)%>" /></td>
  </tr>
  <tr>
    <td align="center"> Date Of Birth</td>
    <td><input name="dob" type="text" id="dist" class="textbox"  value="<%=rs.getString(5)%>" placeholder="yyyy-mm-dd"/></td>
  </tr>
  <tr>
    <td align="center">Consituency</td>
    <td align="center">
        <input name="constuency" type="text" id="constuency" class="textbox"  value="<%=rs.getString(7)%>"  placeholder="India"/>
        
       </td>
  </tr>
  <tr>
    <td align="center">Email</td>
    <td><input name="email" type="text" class="textbox" id="email"  value="<%=rs.getString(8)%>"/></td>
  </tr>
  <tr>
    <td align="center">Phone Number </td>
    <td><input name="phno" type="text" id="phno"  class="textbox"  value="<%=rs.getString(9)%>"/></td>
  </tr>
  <tr>
    <td align="center">VoterId</td>
    <td><input name="voterid" type="text" id="voterid"  class="textbox" value="<%=rs.getString(10)%>" readonly /></td>
  </tr>
  <tr>
    <td align="center">Gender </td>
    <td><input name="gender" type="text" id="gender" class="textbox"  value="<%=rs.getString(11)%>"/></td>
  </tr>
  <tr> 
    <td align="center">Age</td>
    <td><input name="age" type="text" id="age"  class="textbox" value="<%=rs.getString(12)%>" /></td>
  </tr>
   <tr> 
       <td colspan="2" align="center"> 
           <% // <input name="submit" type="submit" class="myButton" id="submit" value="Update" onclick="return confirm('Do you really want to submit the form?');" />
           %>
        <input name="submit" type="submit" class="myButton" id="submit" value="Update" onclick="return confirm('Do you really want to submit the form?');" />
              
       </td>
   
            
   </tr>
</table>
          
             
            <% 
           stmt.close();
           con.close();
           %>  
            </p:form>
    </body>
</html>
