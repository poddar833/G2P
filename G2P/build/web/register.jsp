<%-- 
    Document   : register
    Created on : Nov 24, 2016, 8:38:14 PM
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
        
         <jsp:include page="header.jsp">
            <jsp:param  name="A" value="A"/>
        </jsp:include>
        <br><br><br><br>
        <div class="col-md-10">
			<div class="col-md-offset-6">
			<label class="control-label col-md-3"style="font-family:ArialBlack"><font size="5" color="#9ACD32"><b>REGISTER</b></font></label>
			</div>
			</div><br><br><br>
			<div class="col-md-6 col-md-offset-2">
                            <form role="form" class="form-horizontal"  action="RegisterServlet" method="post">
                <div class="form-group">
                    <label for="uname" class="control-label col-md-3" required><b>Email Address:</b></label>
                    <div class="col-md-9">
                       <input type="text" class="form-control" id="uname" name="email" maxlength="40" placeholder="UserName"/>
                   </div>
                </div>
				 <div class="form-group">
                    <label for="an" class="control-label col-md-3" required><b>Adhar Card Number:</b></label>
                    <div class="col-md-9">
                       <input type="text" class="form-control" id="an" name="an" maxlength="16" placeholder="Adhar No"/>
                   </div>
                </div>
                <div class="form-group">
                    <label for="pwd" class="control-label col-md-3" required><b>Password:</b></label>
                    <div class="col-md-9">
                       <input type="password" class="form-control" id="pwd" name="pass" maxlength="40" placeholder="Password"/>
                   </div>
                </div>
			<div class="form-group">
				<label class="control-label col-md-3"><b>UserType</b></label>
				<div class="col-md-9">
                                    <select class="form-control" required name="type">
					<option value="people">People</option>
                                        <option value="admin">Admin</option>
                                        <option selected value="rep">Representative</option>
					</select>
                   </div>
                </div>
                <div class="form-group">
                        <div class="btn col-md-3 col-md-offset-6" style="color:white;background-color:#9ACD32;"><input type="submit" value="Register"></b></button></div>
                </div>
            </form>
            </div>
          <br><br><br><br><br><br><br><br><br><br><br>
   
       
       
    </body>
</html>
