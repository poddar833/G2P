<%-- 
    Document   : services
    Created on : Nov 26, 2016, 3:50:03 PM
    Author     : Ankush
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String n = (String)session.getAttribute("user");
            if(n==null){
               
        %>
    <jsp:include page="header.jsp">
            <jsp:param  name="user" value="Guest"/>
        </jsp:include>
    <%
    }
else{
    String user = (String)session.getAttribute("user");
    %>
    
     <jsp:include page="header.jsp">
         <jsp:param  name="user" value= " ${sessionScope.user}"/>
     </jsp:include>
    <%} %>
    <br><br><br><br>
  
    
    <br><br><br>
     
	 <div class="container">
   <div class="row">
   <div class="col-md-6 col-md-offset-1">
   <div class="col-md-2">
     <img src="img/14.jpg" class="thumbnail" style="height:100px; padding-top:20px;">
   </div>
	 <div class="col-md-7" style="padding-top:20px;">
             <label style="font-family:Arial Black; font-size:20px;color:black"><a href="underProcess.jsp" style="color:Black" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Groups</a></label>
   </div>
   </div>
   
   <div class="col-md-5">
   <div class="col-md-3">
     <img src="img/21.png" class="thumbnail" style="height:100px; padding-top:20px;">
    </div>
	 <div class="col-md-7" style="padding-top:20px;">
	 <label style="font-family:Arial Black; font-size:20px;color:black"><a href="discussion.jsp" style="color:Black">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Discuss</a></label>
   </div>
   </div>
   </div>
   <br>
   <div class="row">
   <div class="col-md-6 col-md-offset-1">
   <div class="col-md-2">
     <img src="img/20.jpg" class="thumbnail" style="height:100px; padding-top:20px;">
   </div>
	 <div class="col-md-7" style="padding-top:20px;">
             <label style="font-family:Arial Black; font-size:20px;color:black"><a href="underProcess.jsp" style="color:Black">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Pole Servey</a></label>
	</div>
   </div>
   
   <div class="col-md-5">
   <div class="col-md-3">
     <img src="img/16.jpg" class="thumbnail" style="height:100px; padding-top:20px;">
    </div>
	 <div class="col-md-7" style="padding-top:20px;">
             <label style="font-family:Arial Black; font-size:20px;color:black"><a href="underProcess.jsp" style="color:Black">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Blog</a></label>
   </div>
   </div>
   </div>
   <br>
   
   <div class="row">
   <div class="col-md-6 col-md-offset-1">
   <div class="col-md-2">
     <img src="img/12.jpg" class="thumbnail" style="height:100px; padding-top:20px;">
   </div>
	 <div class="col-md-7" style="padding-top:20px;">
             <label style="font-family:Arial Black; font-size:20px;color:black"><a href="underProcess.jsp" style="color:Black">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Talk</a></label>
   </div>
   </div>
   
   <div class="col-md-5">
   <div class="col-md-3">
     <img src="img/15.jpg" class="thumbnail" style="height:100px; padding-top:20px;">
    </div>
	 <div class="col-md-7" style="padding-top:20px;">
             <label style="font-family:Arial Black; font-size:20px;color:black"><a href="underProcess.jsp" style="color:Black">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Do</a></label>
   </div>
   </div>
   
   </div>
	
   <br><br><br>
   
   
   
   
        
    </body>
</html>
