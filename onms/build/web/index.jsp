<%@taglib uri="http://struts.apache.org/tags-html"  prefix="p"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
      
    </head>
    <body bgcolor="#108080">
        <center>
            
             <br/> <br/>
           <h1>Login here </h1>
        <p:form method="post" action="/log5"><br>
           Enter name:
           <input type="text" name="username" required /><br/>
           Enter Pass : <input type="password" name="password" required/><br/>
           
            <p:submit   value="login"> 
            </p:submit> <br><br>
            <p:link action="/log"><h2>Click For Registration</h2>
            </p:link>
            
            </p:form>
        </center>
        
       
    </body>
</html>