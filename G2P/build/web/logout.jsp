<%-- 
    Document   : logout
    Created on : Nov 26, 2016, 3:00:52 PM
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
       session.setAttribute("user", null);
       session.invalidate();
       response.sendRedirect("index.jsp");
       %>
    </body>
</html>
