<%-- 
    Document   : blogs
    Created on : 4 Dec, 2016, 11:36:51 AM
    Author     : Abhishek
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
       String temp = request.getParameter("id");
       int id      = Integer.parseInt(temp);
       out.print(id);
       %>
       
    </body>
</html>
