
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            RequestDispatcher rd2 =request.getRequestDispatcher("post.jsp");
             rd2.forward(request, response);
        %>
        
    </body>
</html>
