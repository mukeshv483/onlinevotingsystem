<%-- 
    Document   : Menu
    Created on : May 30, 2014, 3:11:19 PM
    Author     : s
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="p"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css" >
            
   
a {
  display: block; 
  text-decoration: none;
  width: 100%;
  height: 100%;
  color: #999;
}

a:hover { color: #777; }

/* NAVIGATION */
.navigation {
  list-style: none;
  padding: 0;
  width: 250px; 
  height: 40px;
  margin: 20px auto;
  background: #95C11F;
  position: relative; 
  z-index: 100;

}

.navigation, .navigation a.main {
  border-radius: 4px;
  -webkit-border-radius: 4px;
  -moz-border-radius: 4px;
}

.navigation:hover, .navigation:hover a.main {
  border-radius: 4px 4px 0 0;
  -webkit-border-radius: 4px 4px 0 0;
  -moz-border-radius: 4px 4px 0 0;
}

.navigation a.main {
  display: block; 
  height: 40px;
  font: bold 15px/40px arial, sans-serif; 
  text-align: center; 
  text-decoration: none; 
  color: #FFF;  
  -webkit-transition: 0.2s ease-in-out;
  -o-transition: 0.2s ease-in-out;
  transition: 0.2s ease-in-out;
  position: relative;
  z-index: 100;
}

.navigation:hover a.main {
  color: rgba(255,255,255,0.6);
  background: rgba(0,0,0,0.04);
}

.navigation li { 
  width: 250px; 
  height: 40px;
  background: #F7F7F7;
  font: normal 12px/40px arial, sans-serif !important; 
  color: #999;
  text-align: center;
  margin: 0;
  -webkit-transform-origin: 50% 0%;
  -o-transform-origin: 50% 0%;
  transform-origin: 50% 0%;
  -webkit-transform: perspective(350px) rotateX(-90deg);
  -o-transform: perspective(350px) rotateX(-90deg);
  transform: perspective(350px) rotateX(-90deg);
  box-shadow: 0px 2px 10px rgba(0,0,0,0.05);
  -webkit-box-shadow: 0px 2px 10px rgba(0,0,0,0.05);
  -moz-box-shadow: 0px 2px 10px rgba(0,0,0,0.05);
}

.navigation li:nth-child(even) { background: #F5F5F5; }
.navigation li:nth-child(odd) { background: #EFEFEF; }

.navigation li.n1 { 
  -webkit-transition: 0.2s linear 0.8s;
  -o-transition: 0.2s linear 0.8s;
  transition: 0.2s linear 0.8s;
}
.navigation li.n2 {
  -webkit-transition: 0.2s linear 0.6s;
  -o-transition: 0.2s linear 0.6s;
  transition: 0.2s linear 0.6s;
}
.navigation li.n3 {
  -webkit-transition: 0.2s linear 0.4s;
  -o-transition: 0.2s linear 0.4s;
  transition: 0.2s linear 0.4s;
}
.navigation li.n4 { 
  -webkit-transition:0.2s linear 0.2s;
  -o-transition:0.2s linear 0.2s;
  transition:0.2s linear 0.2s;
}
.navigation li.n5 {
  border-radius: 0px 0px 4px 4px;
  -webkit-transition: 0.2s linear 0s;
  -o-transition: 0.2s linear 0s;
  transition: 0.2s linear 0s;
}

.navigation:hover li {
  -webkit-transform: perspective(350px) rotateX(0deg);
  -o-transform: perspective(350px) rotateX(0deg);
  transform: perspective(350px) rotateX(0deg);
  -webkit-transition:0.2s linear 0s;
  -o-transition:0.2s linear 0s;
  transition:0.2s linear 0s;
}
.navigation:hover .n2 {
  -webkit-transition-delay: 0.2s;
  -o-transition-delay: 0.2s;
  transition-delay: 0.2s;
}
.navigation:hover .n3 {
  -webkit-transition-delay: 0.4s;
  -o-transition-delay: 0.4s;
  transition-delay: 0.4s;
}
.navigation:hover .n4 {
  transition-delay: 0.6s;
  -o-transition-delay: 0.6s;
  transition-delay: 0.6s;
}
.navigation:hover .n5 {
  -webkit-transition-delay: 0.8s;
  -o-transition-delay: 0.8s;
  transition-delay: 0.8s;
}
            
            
            
            
        </style>
    </head>
    <body>
     <table width="100%" height="10" border="0" valign="top" bgcolor="green">
            <tr >
              
                <td >
                    
                           <ul class="navigation">
                             <a href="#" class="main" >Home</a></li>  
                          <li>   <a href="#" class="main" >Home</a></li>
                          <li><p:link action="/log">Home Page</p:link></li>
                    
                   </td>
                    <td>
                     
               <ul class="navigation">
               <a class="main" href="#url">Voter</a>
        <li>  <a class="main" href="#url">Voter</a></li>
  
        <li>      <p:link action="/log9">Registration</p:link></li>
	<li class="n2"><a href="#">Update Information</a></li>
	<li class="n3"><a href="#">Ask Question?</a></li>
	<li class="n4"><a href="#">Change Password</a></li>
	
          </ul>
                     
                    </td>
                   
                    
                  
                      <td>
                           
          <ul class="navigation">
             <a class="main" href="#">Candidate</a>
 <li> <a class="main" href="#">Candidate</a></li>
  <li><p:link action="/log10">Registration</p:link></li>
	<li class="n2"><a href="#">Update Information</a></li>
	<li class="n3"><a href="#">Answer Question?</a></li>
	<li class="n4"><a href="#">Change Password</a></li>
	
                      </ul>
                     
</td>
<td>  
    <ul class="navigation">
        <a class="main" href="#">Gallery</a>
        <li>  <a class="main" href="#">Gallery</a></li>
         <li><p:link action="/log11">Images</p:link>  </li></ul></td>
 
                    
                    
<td>
   
    <ul class="navigation">
        <a class="main" href="#">Contact Us</a>
        <li> <a class="main" href="#">Contact Us</a></li>
  <li><p:link action="/log13">@Admin</p:link></li>
    </td>
                 
                   
       </tr>               
                   
            
            
        </table>
    </body>
</html>
