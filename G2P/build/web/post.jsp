<%-- 
    Document   : contactUs
    Created on : Nov 26, 2016, 3:23:50 PM
    Author     : Ankush
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="DatabaseConnectivity.*"%>
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
    Connection c = Connectivity.getConnection1();
    Statement st = c.createStatement();
    String sql   = "select * from post";
    ResultSet rs = st.executeQuery(sql);
    %>
    <div class="row">
			 <div class="col-md-6 "><br><br><br>
			 <div style="margin-left:130px; box-shadow:5px 5px 10px 10px rgba(0,0,0,0.3); padding:25px;width:auto; height:auto; width:1070px;">
			 <%
                         while(rs.next()){
                         %>
                         
                         <a href="http://localhost:8084/G2P/postDisplay.jsp?id=<%=rs.getInt(1)%>">  <b><%=rs.getString(2)%></b></a><br>
			 <%}%>
			 
			  </div>
			 </div>
    </div>
    <br><br><br><br>
  
    
    
    
    
    
    </body>
</html>
