
<!DOCTYPE html>
<html lang="es">
<head>
  <%@ page contentType="text/html; charset=UTF-8" %>
  <title>Servlet-JSP</title>
</head>
<body>


<h1>¡Hola mundo!</h1>
<p>Si quieres ver la otra página, escribe tu nombre</p>
<form action= "myServlet2">

  <label>Nombre</label><br>
  <input type= "text" required id="nombre" name="nombre" autofocus/> <br>
  <label>Apellidos</label><br>
  <input type="text" required id="apellidos" name="apellidos"/> <br>
  <input type="submit" value="¡Vamos!" id= "boton1" />
  <input type="reset" value="Limpiar" campos id="boton2" />

</form>

</body>
</html>