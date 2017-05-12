<%-- 
    Document   : news
    Created on : Nov 24, 2016, 9:24:35 PM
    Author     : Ankush
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashMap"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:include page="header.jsp">
            <jsp:param  name="A" value="A"/>
        </jsp:include>
        <br><br>
        
        <%
        
        HashMap hm = (HashMap)application.getAttribute("news");

        %>
        
        
        <div class="row">
			<div class="col-md-10">
			<div class="col-md-offset-6">
			<font size="5" color="#9ACD32"><b>Headlines of the day</b></font>
			</div>
			</div>
	</div>
        
        <div class="container">
	
	<div class="row">
			 <div class="col-md-6 "><br><br><br>
			 <div style="margin-left:70px; box-shadow:5px 5px 10px 10px rgba(0,0,0,0.3); padding:25px;width:450px; height:auto; width:1070px;">
	<font style="font-size:20px; color:blue">
	
                
        <a href="http://localhost:8084/G2P/HandleNews?file=1.pdf">1. <%=hm.get(1) %></a><br><br>

	<a href="http://localhost:8084/G2P/HandleNews?file=2.pdf">2. <%=hm.get(2) %></a><br><br>
	
	<a href="http://localhost:8084/G2P/HandleNews?file=3.pdf">3. <%=hm.get(3) %></a><br><br>
	
	<a href="http://localhost:8084/G2P/HandleNews?file=4.pdf">4. <%=hm.get(4) %></a><br><br>
	
	<a href="http://localhost:8084/G2P/HandleNews?file=5.pdf">5. <%=hm.get(5) %></a><br><br>
	
	<a href="http://localhost:8084/G2P/HandleNews?file=6.pdf">6. <%=hm.get(6) %></a><br><br>
    
	<a href="http://localhost:8084/G2P/HandleNews?file=7.pdf">7. <%=hm.get(7) %></a><br><br>

	<a href="http://localhost:8084/G2P/HandleNews?file=8.pdf">8. <%=hm.get(8) %></a><br><br>

	<a href="http://localhost:8084/G2P/HandleNews?file=9.pdf">9. <%=hm.get(9) %></a><br><br>
        
        <a href="http://localhost:8084/G2P/HandleNews?file=10.pdf">10. <%=hm.get(10) %></a><br><br>
        
        
        
        
	</b>
	</font>
	</div>
	</div>
    </div>
    </div>
	
	<br><br>
    <nav id="footer">
        <div class="container">
               <center> <p>ALL RIGHTS RESERVED. COPYRIGHT © 2016.  </p> </center>
        </div>
    </nav>
    </body>
</html>
