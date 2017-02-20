<%-- 
    Document   : Body
    Created on : May 30, 2014, 3:13:44 PM
    Author     : s
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="p"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
.typing_text {
     color: #FFFFFF;
     border: solid 3px #FFFFFF;
     font-size: 15px;
     height: 34px;
     padding: 5px 5px 5px 5px;
     width: 100%;
     box-sizing: border-box;
     -webkit-box-sizing: border-box;
     -moz-box-sizing: border-box;
     text-align: left;
     font-weight: bold;
     box-shadow: 0px 0px 6px 2px #B5B5B5;
     text-shadow: 1px 1px 0px #FF0000;
     font-family: Arial, Helvetica, sans-serif;
     background-color: #00FF00;
     outline: none;
     resize: none;
     overflow: auto;
 }
</style>

<script language="JavaScript">

    var MsgSeperator = '#';
        CharacterPos = 0; 
        MsgBuffer = "";
        TypeDelay = 100; 
        NxtMsgDelay = 1000;
        MsgIndex = 0; 
        MsgArray = Array("Welcome to online voting portal #","online national polling system#","Your vote is precious ,Please vote #")

   function StartTyping(CharacterPos) { 
       if (MsgArray[MsgIndex].charAt(CharacterPos) != MsgSeperator) { 
             MsgBuffer    = MsgBuffer + MsgArray[MsgIndex].charAt(CharacterPos)
             document.getElementById('TypingText').value = MsgBuffer 
             delay = TypeDelay 
       } 
       else { 
            delay = NxtMsgDelay 
            MsgBuffer   = "" 
            CharacterPos = -1 
       if (MsgIndex!=MsgArray.length-1){
            MsgIndex++ 
       } 
       else {MsgIndex = 0 } 
       } 
       CharacterPos++ 
       setTimeout("StartTyping('"+CharacterPos+"')",delay) 
  } 
</script>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>online national polling system</title>
    </head>
    
    <body>
        <center>
            <form method="post" action="/log7">
        <table width="100%" border="1" cellpadding="0" cellspacing="0">
            
            <tr>
                <td width="10%"  height="" valign="top">
                  
        <div style="background-color: white"  > 
           <center> <div style="background-color: red"><h4  color="red">   
                       <a href="sss.jsp">NEWS AND EVENTS</a></h4>
               </div>
           </center>
            
                    
         <marquee direction="up" scrollamount="6" onmouseover="this.stop()" onmouseout="this.start()">
                              
            <b>Important dates <a href="sssss.jsp"><img width="33" height="16" border="0" alt="" src="image/new_red.gif" />Click</a></b><br> 
                  
                  <b>Related Information <a href="sssss.jsp"><img width="33" height="16" border="0" alt="" src="image/new_red.gif" /></>Click</a></b> 
                  <b>view old results <a href="sssss.jsp"><img width="33" height="16" border="0" alt="" src="image/new_red.gif" /></>Click</a></b> 
                  <b>Important numbers<a href="sssss.jsp"><img width="33" height="16" border="0" alt="" src="image/new_red.gif" /></>Click</a></b> 
                  <b>see Instruction <a href="sssss.jsp"><img width="33" height="16" border="0" alt="" src="image/new_red.gif" /></>Click</a></b> 
                  <b>Download Broucher <a href="sssss.jsp"><img width="33" height="16" border="0" alt="" src="image/new_red.gif" />Click</a></b> 
                  
              
         </marquee> 
             </div>
                   </td>
                  
              
   <td colspan="4" width="90%">

    <img width="100%" height="475" border="0" usemap="#Map" alt="" src="image/eci_06F5.jpg" />

</td>
      

<map name="Map">
 <area target="_blank" href="#" coords="740,131,1014,293" shape="rect"></area>
    <area target="_blank" href=" #" coords="733,390,1019,445" shape="rect"></area>
    <area target="_blank" href="http://electoralsearch.in/" coords="735,315,1019,372" shape="rect"></area>
   
</map>

                
            </tr>
            <tr align="center"><div align="center"><textarea id="TypingText" class="typing_text" readonly /> </textarea></div>
<script>StartTyping(0);</script>
                </tr>
        </table>
            </form>
        </center>
    </body>
</html>
