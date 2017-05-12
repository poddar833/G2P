<%-- 
    Document   : header
    Created on : Nov 24, 2016, 8:05:05 PM
    Author     : Ankush
--%>

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
	
  </head>
  <body>
 <nav id="tf-menu" class="navbar navbar-default navbar-fixed-top" style="background-color:#9ACD32">
	

      <div class="container">
        <!-- Brand and toggle get grouped for better mobile display -->
        
        <!-- Collect the nav links, forms, and other content for toggling --><style>.paging{background-color:grey; color:black;}</style>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

          <ul class="nav navbar-nav navbar-right">


            <li class="paging"><a href="index.jsp" class="page-scroll">Home</a></li>          
            <li><a href="aboutUs.jsp" class="page-scroll">About Us</a></li>
            <li><a href="news.jsp" class="page-scroll">News</a></li>           
            <li><a href="services.jsp" class="page-scroll">Services</a></li>
			<li><a href="login.jsp" class="page-scroll">Login</a></li>
			<li><a href="register.jsp" class="page-scroll">Register</a></li>
			<li><a href="contactUs.jsp" class="page-scroll">Contact</a></li>
                        <li><a href="suggestionPage.jsp" class="page-scroll">Suggest Us</a></li>
                        
                        <li><a href="accountDetails.jsp" class="page-scroll"> <b style="font-family: cursive; color: #761c19">Welcome  ${param.user}  </b></a></li>
                        <%
                            String user = (String)session.getAttribute("user");
                             if(user!=null){
                        %>
                        <li><a href="logout.jsp" class="page-scroll"> <b style="font-family: cursive; color: #761c19">logout</b></a></li>
                         <% }%>
	</ul>           
        </div>         
      </div>
    </nav>
    <br><br><br><br>
</body>
</html>  
