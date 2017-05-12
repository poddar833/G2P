<%-- 
    Document   : newshandler
    Created on : 4 Dec, 2016, 11:59:28 PM
    Author     : Abhishek
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="DatabaseConnectivity.Connectivity"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! static int count =0 ;%>
        <%
     
     count = count + 1;
     String head = request.getParameter("head");
     String sd = request.getParameter("sd");
     
     
    
    Connection c = Connectivity.getConnection1();
    String sql   = "insert into post values(?,?,?)";
    PreparedStatement pst = c.prepareStatement(sql);
    pst.setInt(1, count);
    pst.setString(2, head);
    pst.setString(3, sd);
    int flag = pst.executeUpdate();
    response.sendRedirect("post.jsp");
    %>
    </body>
</html>
