<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <form action="LogonService" method="post">
     
        <input type="text" name="correo"></input><br>
        <input type="password" name="password"></input><br>
        <button type="Submit"> Log in</button>       
        </form>
        
        <%out.println(request.getParameter("correo"));
        out.println(request.getParameter("password"));
        %>
</body>
</html>