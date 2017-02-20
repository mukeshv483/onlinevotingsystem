<%-- 
    Document   : A
    Created on : May 31, 2014, 7:42:29 AM
    Author     : s
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="p" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Voter Registration Page</title>
    </head>
    <body>
       <center> <h1> Voter Registration Page</h1>
           <p:form action="/upload" method="post" enctype="multipart/form-dat">
           <table width="70%" height="400" border="0">
    <tr>
        <td width="77"><div align="left">Voter Username: </div></td> 

      <td width="236"><label>
              <input type="text" name="voterusername" required="required field" />
          </label></td>
    
            
    </tr>
    <tr>
      <td>Voter Password: </td>
      <td><input type="password" name="voterpassword" required="required field"/></td>
    </tr>
    <tr>
      <td>Voter name: </td>
      <td><input type="text" name="votername" required="required field" /></td>
    </tr>
    <tr>
      <td>Voter Address:</td>
      <td><label>
        <textarea name="voteraddress" required="required field"></textarea>
        </label></td>
    </tr>
    <tr>
      <td height="23">Date of birth: </td>
      <td><input type="date"  name="dateofbirth" required="required field"/></td>
  </tr>
    <tr>
      <td width="77"><div align="left"> <p>Select a file to upload: </p><input type="file" name="file" size="50"><br/>
                     <input type="submit" value="upload file"></div></td> </tr>
    
     <tr>
       
      <td height="23">Select District: </td>
      <td><input type="hidden" name="district" required="required field" />
          <select name="district">select....
              <option>Lucknow  </option>
              <option>Hardoi</option>
              <option>Gorakhpur </option>
              <option>Kanpur </option>
      
          </select>
      
      
      </td>
    </tr>
    <tr>
       
      <td height="23">Select Constituency: </td>
      <td><input type="hidden" name="constituencyid" required="required field" />
          <select name="constituencyid">select....
              <option>Lucknow east </option>
              <option>Lucknow west </option>
              <option>Lucknow north </option>
              <option>Lucknow south </option>
      
          </select>
      
      
      </td>
    </tr>
     <tr>
      <td>Email:</td>
      <td><input type="email" name="emailid" required="required field"/></td>
    </tr>
    <tr>
      <td>Phone no.: </td>
      <td><input type="text" name="phno" required="required field" /></td>
    </tr>
    
   
    <tr>
      <td>Voter id: </td>
      <td><input type="text" name="voterid1" required="required field" /></td>
    </tr>
    <tr>
      <td>Gender:</td>
      <td><label>
        <input name="gender" type="radio" value="m" />
        Male<br />
        <input name="gender" type="radio" value="f" />
      Female</label></td>
    </tr>
    <tr>
      <td>Age: </td>
      <td><input type="number" name="age1" /></td>
    </tr>
    
    
    <tr>
        <td height="23" ><label>
        <div align="right">
          <input type="reset" name="reset" value="Reset" />
          </div>
      </label></td>
      <td height="23" ><label>
        <div align="left">
          <input type="submit" name="submit" value="Submit" />
          </div>
      </label></td>
      
      </tr>
           </table>
           </p:form>
       </center>
    </body>
</html>
