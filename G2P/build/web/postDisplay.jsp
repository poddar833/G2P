<%-- 
    Document   : aboutUs
    Created on : Nov 26, 2016, 4:28:38 PM
    Author     : Ankush
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="DatabaseConnectivity.Connectivity"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
    
    
     <%
    String temp = request.getParameter("id");
    int id      = Integer.parseInt(temp);
    Connection c = Connectivity.getConnection1();
    String sql   = "select * from post where p_id=?";
    PreparedStatement pst = c.prepareStatement(sql);
    pst.setInt(1, id);
    ResultSet rs = pst.executeQuery();
    
    while(rs.next()){
    %>
    
  <div class="row">
			 <div class="col-md-6 "><br><br><br>
			 <div style="margin-left:150px; box-shadow:5px 5px 10px 10px rgba(0,0,0,0.3); padding:25px; height:auto; width:1070px; "); >
	<font style="font-size:20px; color:blue">
			  
	  
   <b><center><p style="font-size:33px ;color:purple ">News Details</p></b>
   <p style="font-size:18px ;color:black; color:purple "></p></b><br>
   <font size="4" color="purple"><b><%=rs.getString(2)%>
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
                
                 <div class="col-md-12" style=" width: auto ; height: auto ; overflow: scroll">
                                   <p> <%=rs.getString(3)%></p>
                                                </div>
							
				
        </div>
		</div>
                <%}%>
   <br><br>
   <center> WE WELOCOME YOUR FEEDBACKS FOR THE IMPROVEMENTS OF GOVERNANCE  </center>
   <div class="container">
			
            <br><br>
            
            
	<div class="row">
			<div class="col-md-6 col-md-offset-2">
            <form role="form" class="form-horizontal" action="loginServlet" method="post">
                <div class="form-group">
                    <label for="uname" class="control-label col-md-3" required><b>Email Address:</b></label>
                    <div class="col-md-9">
                       <input type="text" class="form-control" id="uname" name="email" maxlength="40" placeholder="Email/Adhar No"/>
                   </div>
                </div>
                
                <div class="form-group">
                    <label for="uname" class="control-label col-md-3" required><b>Comment:</b></label>
                    <div class="col-md-9">
                      
                        <textarea name="cmnts"  rows="5" cols="37"">
                            
                        </textarea>
                        
                   </div>
                </div>
                
               
				
                <div class="form-group">
                    <div class="btn col-md-3 col-md-offset-6"  style="color:white;background-color:#9ACD32"><b><input type="submit" value="Comment"></b></div>
                </div>
            </form>
            </div>
			</div><br><br>
		
			</div>
   
      
   <br><br><br><br><br>

	
	</b>
	</font>
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
