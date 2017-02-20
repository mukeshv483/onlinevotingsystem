<%-- 
    Document   : B
    Created on : May 30, 2014, 3:51:15 PM
    Author     : s
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="p"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Candidate Registration Page</title>
    </head>
    <body>
   
    <center> <h1>Candidate Registration Page</h1>
         <p:form action="/regcandidate" method="post" enctype="multipart/form-dat">
    
       
             <table width="70%" height="400" border="0">
    <tr>
      <td width="77"><div align="left">Candidate username: </div></td>
      <td width="236"><label>
              <input type="text" name="cuser" required="required field" />
      </label></td>
    
             <td width="77"><div align="left"> <p>Select a file to upload: </p><input type="file" name="file" size="50"><br/>
                     <input type="submit" value="upload file"></div></td>
    </tr> 
    <tr>
      <td>Candidate password: </td>
      <td><input type="password" name="cpass" /></td>
    </tr>
    <tr>
      <td>Candidate name</td>
      <td><input type="text" name="cname" /></td>
    </tr>
    <tr>
      <td>Address</td>
      <td>
        <textarea name="caddress" id="caddress"></textarea>
        </td>
    </tr>
    <tr>
      <td>Gender:</td>
      <td><label>
        <input name="cgender" type="radio" value="m" />
        Male<br />
        <input name="cgender" type="radio" value="f"/>
      Female</label></td>
    </tr><br/>
    
    <tr>
      <td>Date of birth:</td>
      <td><label>
        <input type="date" name="cdob"/>
        </label></td>
    </tr>
    <tr>
      <td height="23">Party Name: </td>
      <td>
          <select name="pname">
    <option>select...</option>
    <option>BJP</option>
     <option>BSP</option>
      <option>SP</option>
       <option>RLD</option>
        <option>NCP</option>
        <option>Others.></option>
          </select>
      
      
      
      </td>
    </tr>
    <tr>
       
      <td height="23">Select Constituency: </td>
      <td>
          <select name="constituencyid" >select....
              <option>Lucknow east </option>
              <option>Lucknow west </option>
              <option>Lucknow north </option>
              <option>Lucknow south </option>
      
          </select>
      
      
      </td>
    </tr>
    
     
    <tr>
      <td>Phone no.: </td>
      <td><input type="text" name="cphno" required="required field" /></td>
    </tr>
    <tr>
      <td>Email:</td>
      <td><input type="email" name="cemailid" required="required field"/></td>
    </tr>
     <tr>
      <td>Candidate description</td>
      <td><label>
        <textarea name="cdescription"></textarea>
        </label></td>
    </tr>
    
    
    
     <tr>
        <td height="23" ><label>
        <div align="right">
          <input type="reset" name="reset" value="Reset" />
          </div>
      </label></td>
      <td height="23" ><label>
        <div align="left">
          <input type="submit" name="submit" value="Add" />
          </div>
      </label></td>
      
      </tr>
   
   
           </table>
               
       </p:form>
             </center>

    </body>
</html>
