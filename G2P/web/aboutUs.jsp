<%-- 
    Document   : aboutUs
    Created on : Nov 26, 2016, 4:28:38 PM
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
			 <div style="margin-left:150px; box-shadow:5px 5px 10px 10px rgba(0,0,0,0.3); padding:25px; height:auto; width:1070px; "); >
	<font style="font-size:20px; color:blue">
			  
	  
   <b><center><p style="font-size:33px ;color:purple ">ABOUT US</p></b>
   <p style="font-size:18px ;color:black; color:purple ">What We Do</p></b><br>
   <font size="4" color="purple"><b>G2P : Goverment to People is a plateform that provide aa the information about government.It is provided by their respresentives itself.Apart from this it can also be used vote and the policies.
   </b></font>
   </center>
   <br><br>
   <div class="row">
			 <div class="col-md-6">
			 <div style="margin-left:30px;">
			  <img src="img/2.jpg" class="thumbnail" style="float:left; width:450px; height:370px;">
			  </div>
			 </div><br><br><br>
            
             <div class="col-md-6 ">				
                
					        <div class="col-md-12">
                                    <label style="font-size:20px; color:purple"><b>PROVIDE DETAILED POLICIES INFORMATIONS</b></label><br>
                            </div>
							
							<div class="col-md-12">
                                    <label style="font-size:20px; color:purple"><b>CAN VOTE AND GIVEN RATTINGS</b></label><br>
                            </div>
							
							<div class="col-md-12">
                                    <label style="font-size:20px; color:purple"><b>CAN DISCUSS OVER ANY POLITICAL MATTER</b></label><br>
                            </div>
							
							<div class="col-md-12">
                                    <label style="font-size:20px; color:purple"><b>CAN FORCE LEADERS TO GIVE ANSWERS</b></label><br>
                            </div>
        </div>
		</div>
   <br><br><br><br><br>

	
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
