<%-- 
    Document   : admin
    Created on : Nov 24, 2016, 8:41:23 PM
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
        <br><br><br><br>
        <div class="col-md-10">
			<div class="col-md-offset-6">
			<label class="control-label col-md-3"style="font-family:ArialBlack"><font size="5" color="#9ACD32">Add News</font></label>
			</div>
			</div><br><br><br>
			<div class="col-md-6 col-md-offset-2">
                            <form role="form" class="form-horizontal" action="Uploadpdf" method="post"   >
                <div class="form-group">
                    <label for="uname" class="control-label col-md-3" required><b>Headline:</b></label>
                    <div class="col-md-9">
                       <input type="text" class="form-control" id="uname"  name="news"  placeholder="headline"/>
                   </div>
                </div>
                  <div class="form-group">
                    <label for="uname" class="control-label col-md-3" required><b>Upload File:</b></label>
                    <div class="col-md-9">
                        <input type="file" class="form-control" id="uname" name="uname"/>
                   </div>
                </div>
				 
                
			<div class="form-group">
				<label class="control-label col-md-3"><b>Headline Number:</b></label>
				<div class="col-md-9">
                                    <select class="form-control"  name="headline">
                                        <option value="1">1</option>
                                        <option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
					<option value="6">6</option>
					<option value="7">7</option>
					<option value="8">8</option>
                                        <option value="9">9</option>
					<option value="10">10</option>
                                        <option selected>Headine number</option>
                    </select>
                   </div>
                </div>
                <div class="form-group">
                        <div class="btn col-md-3 col-md-offset-6" style="color:white;background-color:#9ACD32;"><button type="submit"><b>Flash News</b></button></div>
                </div>
            </form>
            </div>
               
        
       
   
        
    </body>
</html>
