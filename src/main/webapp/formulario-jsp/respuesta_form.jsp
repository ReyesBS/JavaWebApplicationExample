<!DOCTYPE html>

<html lang="es">
<head>
  <%@ page contentType="text/html; charset=UTF-8" %>
  <title>Servlet-JSP</title>
</head>
<body>
		<%String name = request.getParameter("nombre"); %>
		<%String last_name = request.getParameter("apellidos"); %>

<h1>¡Hola <%=name %> <%=last_name %>!</h1>


</body>
</html>