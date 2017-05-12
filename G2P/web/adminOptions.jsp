<%-- 
    Document   : adminOptions
    Created on : Nov 26, 2016, 12:45:25 PM
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
                response.sendRedirect("login.jsp");
            }
            else{
        %>
         <jsp:include page="header.jsp">
             <jsp:param  name="user" value="admin" />
        </jsp:include>
         <% } %>
        <br><br>
        <div class="row">
			<div class="col-md-10">
			<div class="col-md-offset-6">
			<font size="5" color="#9ACD32"><b>Welcome to Admin panel</b></font>
			</div>
			</div>
	</div>
        
        <div class="container">
	
	<div class="row">
			 <div class="col-md-6 "><br><br><br>
			 <div style="margin-left:50px; box-shadow:5px 5px 10px 10px rgba(0,0,0,0.3); padding:25px;width:450px; height:200px; width:1070px;">
	<font style="font-size:20px; color:blue">
			  
        <a href="addNews.jsp">1. Add headlines  </a><br><br>
	
	 <a href="peopleDetails.jsp">2.See the Number of Registered User </a><br><br>

	 <a href="repDetails.jsp">3. See the Number of Registered Representatives  </a>
	
	
	
	</b>
	</font>
	</div>
	
	</div>
    </div>
    </div>
        <br><br><br><br><br><br>
        
    <nav id="footer">
        <div class="container">
               <center> <p>ALL RIGHTS RESERVED. COPYRIGHT © 2016.  </p> </center>
        </div>
    </nav>
    </body>
</html>
