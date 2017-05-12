<%@page import="java.util.HashMap"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
   
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>G2P</title>    
    <!-- Bootstrap -->
    <link rel="stylesheet" type="text/css"  href="css/bootstrap.css">
	<link rel="stylesheet" type="text/css"  href="css/bootstrap-min.css">
    <link rel="stylesheet" type="text/css" href="css/font-awesome.css">
    <!-- Stylesheet
    ================================================== -->
    <link rel="stylesheet" type="text/css"  href="css/stylee.css">
    <link rel="stylesheet" type="text/css" href="css/responsive.css">	
	<script src="script/bootstrap.min.js" type="text/javascript"></script>
	<script src="script/bootstrap.js" type="text/javascript"></script>
	<script src="script/jquery.js" type="text/javascript"></script>
	<script src="script/jquery.min.js" type="text/javascript"></script>
	<style>
			body
				{
					background-image: url('img/24.jpg');
					background-attachment: fixed;
					background-size: 100% 100%;
					font-size:30px;
					font-color:black;
					margin-top:60px;
					text-align:center;
					
				}
				
				
		</style>
  </head>
  <body>
    <!-- Navigation
    ==========================================-->
    
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
   <b><center><p style="font-size:40px ;color:black ">New to G2P?</p></b></center>
  
   <br>
   <div class="row">
   
   <div class="btn btn-danger col-md-2 " style="color:black; margin-left:570px; background-color:#9ACD32"><b><a href="register.jsp" style="color:black;">Register Now </a></b></div>
   </div>
   <br><br><br><br> <br><br><br>
   <b><center><p style="font-size:35px ;color:black ">OUR SERVICES</p></b>
   <p style="font-size:18px ;color:black ">What We Do With Love</p></b></center>
   <br><br>
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
  
   <br><br><br><br>
   <b><center><p style="font-size:33px ;color:black ">ABOUT US</p></b>
   <p style="font-size:18px ;color:black ">What We Do</p></b><br>
   <font size="4" color="black"><b>G2P : Goverment to People is a plateform that provide aa the information about government.It is provided by their respresentives itself.Apart from this it can also be used vote and the policies.
   </b></font>
   </center>
   <br><br>
   <div class="row">
			 <div class="col-md-6">
			 <div style="margin-left:90px;">
			  <img src="img/2.jpg" class="thumbnail" style="float:left; width:450px; height:370px;">
			  </div>
			 </div><br><br><br>
            
             <div class="col-md-6 ">				
                
					        <div class="col-md-12">
                                    <label style="font-size:20px; color:black"><b>PROVIDE DETAILED POLICIES INFORMATIONS</b></label><br>
                            </div>
							
							<div class="col-md-12">
                                    <label style="font-size:20px; color:black"><b>CAN VOTE AND GIVEN RATTINGS</b></label><br>
                            </div>
							
							<div class="col-md-12">
                                    <label style="font-size:20px; color:black"><b>CAN DISCUSS OVER ANY POLITICAL MATTER</b></label><br>
                            </div>
							
							<div class="col-md-12">
                                    <label style="font-size:20px; color:black"><b>CAN FORCE LEADERS TO GIVE ANSWERS</b></label><br>
                            </div>
        </div>
		</div>
   <br><br><br><br><br>
   
   
    <nav id="footer">
        <div class="container">
                <center><p>ALL RIGHTS RESERVED. COPYRIGHT © 2016.</p> </center>
        </div>
    </nav>
  </body>
</html>
