<%-- 
    Document   : contactUs
    Created on : Nov 26, 2016, 3:23:50 PM
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
    
    <div class="row">
			 <div class="col-md-6 "><br><br><br>
			 <div style="margin-left:130px; box-shadow:5px 5px 10px 10px rgba(0,0,0,0.3); padding:25px;width:450px; height:auto; width:1070px; ">
			 
			 
                             
                             
<!-- Contact Section -->
<div id="contact" class="page">
<div class="container">
    <!-- Title Page -->
    <div class="row">
        <div class="span12">
            <div class="title-page">
              <center>  <h2 class="title">We appreciate your feedbacks</h2></center>
                 </div>
        </div>
    </div>
    <br><br>
    <!-- End Title Page -->
    
    <!-- Contact Form -->
     
    <div class="row">
    	<div class="span9">
        
            <form id="contact-form" class="contact-form" action="EmailServlet" method="post">
            	<p class="contact-name">
            		<input id="contact_name" type="text" placeholder="Full Name"  name="name" />
                </p>
                <p class="contact-email">
                	<input id="contact_email" type="text" placeholder="Email Address"  name="email" />
                </p>
                <p class="contact-message">
                	<textarea id="contact_message" placeholder="Your Message" name="message" rows="15" cols="40"></textarea>
                </p>
                <p class="contact-submit">
                    <input type="submit"  style="color:#DE5E60; "value="Send Your Message"/>
                </p>
                
                <div id="response">
                
                </div>
            </form>
         
        </div>
        
        <div class="span3" style="  ">
        	<div class="contact-details">
        		<h3>Contact Details</h3>
                <ul>
                    <li><a href="#">poddar833@gmail.com</a></li>
                    <li>(+91)9669870142</li>
                    <li>
                        G2P:Government to People System
                        <br>
                        Jaypee University of Engineering and Technology 
                        <br>
                        Madhya Pradesh , Guna
                    </li>
                </ul>
            </div>
        </div>
    </div>
    
    
    <!-- End Contact Form -->
                             
                             
                             
			 
			  </div>
			 </div>
    </div>
    <br><br><br><br>
   <nav id="footer">
        <div class="container">
           
               <center> <p>ALL RIGHTS RESERVED. COPYRIGHT © 2016.  </p>  </center>
            
			
        </div>
    </nav>
    
    
    
    
    
    </body>
</html>
