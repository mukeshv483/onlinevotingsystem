<%-- 
    Document   : Layout
    Created on : May 30, 2014, 3:14:25 PM
    Author     : s
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-tiles" prefix="p"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-position: fixed">
        <table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0" style="background-color:#00ffcc ">
            <tr>
                <td width="30" colspan="3" valign="top">
                <p:insert attribute="HEADER"></p:insert>
                </td>
                 </tr>
                    <tr height="10">
                        <td width="100%" height="5">
                            <p:insert attribute="MENU"></p:insert>
                            
                           
                        </td>
            </tr>
            <tr>
                        <td width="30" height="400"  valign="top">
                            <p:insert attribute="BODY"></p:insert>
                            
                            
                        </td>
                            </tr>
                        <tr>
                    <td width="30" colspan="3" align="top">
                            <p:insert attribute="FOOTER"></p:insert>
                            
                            
                        </td>
                           
               
            </tr>
        </table>
    </body>
</html>
