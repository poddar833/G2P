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
        <script src="script/jquery-3.1.1.js"></script>
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
        <br><br>
        <div class="row">
			<div class="col-md-10">
			<div class="col-md-offset-6">
			<font size="5" color="#9ACD32"><b>Personalize your account</b></font>
			</div>
			</div>
	</div>
        
        <div class="container">
	
	<div class="row">
			 <div class="col-md-6 "><br><br><br>
			 <div style="margin-left:50px; box-shadow:5px 5px 10px 10px rgba(0,0,0,0.3); padding:25px;width:450px; height:auto; width:1070px;">
	<font style="font-size:20px; color:blue">
			  
         <div class="form-group">
             
             <%
                 String user =(String)session.getAttribute("user");
                if(user=="Admin")
                response.sendRedirect("adminOptions.jsp");
             else{
                
             %>
             
              <script type="text/javascript">
$(document).ready(function(){
	$('#div1').click(function(){
	$('#div2').show();
	
	
	});
});
</script>
              <script type="text/javascript">
$(document).ready(function(){
	$('#div1a').click(function(){
	$('#div2a').show();
	
	
	});
});
</script>
              <script type="text/javascript">
$(document).ready(function(){
	$('#div1b').click(function(){
	$('#div2b').show();
	
	
	});
});
</script>
              <script type="text/javascript">
$(document).ready(function(){
	$('#div1c').click(function(){
	$('#div2c').show();
	
	
	});
});
</script>
             
             
                    <label for="uname" class="control-label col-md-3" required><b>Email Address/Adhar Card No:</b></label>
                    <label for="uname" class="control-label col-md-3" required><b> <a href="#"> ${sessionScope.user} </a></b></label>
                    

                    
                    <br>
                    
                    
                    
                    
                     
                    
                    <label for="uname" class="control-label col-md-3" required><b>  city :</b></label>
                    <label for="uname" class="control-label col-md-3" required><b> <a href="#"> null </a></b></label>
                    
                <input id="div2a" type="text"   style=" display:none"/>

                <input id="div1a" type="button" value="Edit" />
                    <br>
                    
                    <label for="uname" class="control-label col-md-3" required><b>  News Preference : </b></label>
                    <label for="uname" class="control-label col-md-3" required><b> <a href="#"> null </a></b></label>
                    
                <input id="div2b" type="text"   style=" display:none"/>

                <input id="div1b" type="button" value="Edit" />
                    <br>
                    
                                        

                    <label for="uname" class="control-label col-md-3" required><b>  Location : </b></label>
                    <label for="uname" class="control-label col-md-3" required><b> <a href="#"> null </a></b></label>
                    
                    
                <input id="div2c" type="text"   style=" display:none"/>

                <input id="div1c" type="button" value="Edit" />
                    <br>
                    


                  
                    
                    
         </div>
                    <%}%>
	
	
	
	</b>
	</font>
        <center><input  id="divabc" type="submit" value="Submit" ></center> 
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
