<%-- 
    Document   : gallery
    Created on : Jun 2, 2014, 12:43:31 AM
    Author     : s
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
       <center>
        <h1>Please wait...</h1>
        <p>images are loading....</p>
        
        <style>
        div.img {
    margin: 5px;
    padding: 5px;
    
    height: auto;
    width: auto;
    float: left;
    text-align: center;
}	

div.img img {
    display: inline;
    margin: 5px;
    border: 1px solid #ffffff;
}

div.img a:hover img {
    border: 1px solid #0000ff;
}

div.desc {
  text-align: center;
  font-weight: normal;
  width: 120px;
  margin: 5px;
}
</style>

</head>

<body>

<div class="img">
 <a target="_blank" href="klematis1_big.htm"><img src="image/abc.jpg" alt="Klematis" width="110" height="90"></a>
 <div class="desc">Add a description of the image here</div>
</div>
<div class="img">
 <a target="_blank" href="klematis2_big.htm"><img src="image/ddd.jpg" alt="Klematis" width="110" height="90"></a>
 <div class="desc">Add a description of the image here</div>
</div>
<div class="img">
 <a target="_blank" href="klematis3_big.htm"><img src="image/gggg.jpg" alt="Klematis" width="110" height="90"></a>
 <div class="desc">Add a description of the image here</div>
</div>
<div class="img">
 <a target="_blank" href="klematis4_big.htm"><img src="image/hhh.jpg" alt="Klematis" width="110" height="90"></a>
 <div class="desc">Add a description of the image here</div>
</div>
        </center>
    </body>
</html>
