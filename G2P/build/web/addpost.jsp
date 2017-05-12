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
			 <div style="margin-left:130px; box-shadow:5px 5px 10px 10px rgba(0,0,0,0.3); padding:25px;width:450px; height:auto; width:1070px;">
			 
			
                                 <div class="container">
			<div class="row">
			<div class="col-md-10">
			<div class="col-md-offset-6">
			<font size="5" color="#9ACD32"><b>PUBLISH  POST</b></font>
			</div>
			</div>
			</div>
            <br><br>
			<div class="row">
			<div class="col-md-6 col-md-offset-2">
            <form role="form" class="form-horizontal" action="newshandler.jsp" method="post">
                <div class="form-group">
                    <label for="uname" class="control-label col-md-3" required><b>Headline</b></label>
                    <div class="col-md-9">
                       <input type="text" class="form-control" id="uname" name="head" maxlength="400" placeholder="Email/Adhar No"/>
                   </div>
                </div>
                 <div class="form-group">
                    <label for="uname" class="control-label col-md-3" required><b>Short Description:</b></label>
                    <div class="col-md-9">
                      
                        <textarea name="sd"  rows="5" cols="53"">
                            
                        </textarea>
                        
                   </div>
                </div>
                <div class="form-group">
                    <label for="uname" class="control-label col-md-3" required><b>Add Documents</b></label>
                    <div class="col-md-9">
                       <input type="file" class="form-control" id="uname" name="f1" maxlength="40" placeholder="Email/Adhar No"/>
                   </div>
                </div>
                <div class="form-group">
                    <label for="uname" class="control-label col-md-3" required><b>Add Pictures</b></label>
                    <div class="col-md-9">
                        <input type="file" class="form-control" id="uname" name="email" maxlength="40" placeholder="Email/Adhar No"/>
                   </div>
                </div>
                
		<div class="form-group">
				<label class="control-label col-md-3"><b>News Type</b></label>
				<div class="col-md-9">
                                    <select class="form-control" required  name="ntype">
                                        <option value="ent">Entertainment</option>
                                        <option value="pol">Politics</option>
                                        <option selected value="sports">Sports</option>
					</select>
                   </div>
                </div>
                <div class="form-group">
                    <div class="btn col-md-3 col-md-offset-6"  style="color:white;background-color:#9ACD32"><b><input type="submit" value="Login"></b></div>
                </div>
            </form>
            </div>
			</div><br><br>
		
			</div>
                             
			 
			  </div>
			 </div>
    </div>
    <br><br><br><br>
   <nav id="footer">
        <div class="container">
           
               <center> <p>ALL RIGHTS RESERVED. COPYRIGHT © 2016  </p>  </center>
            
			
        </div>
    </nav>
    
    
    
    
    
    </body>
</html>
