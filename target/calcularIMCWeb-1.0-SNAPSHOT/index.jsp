<%-- 
    Document   : index
    Created on : 26 mar 2026, 20:53:11
    Author     : Arturo Lock
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calcular IMC</title>
    </head>
    <body>
        <h1>Datos del cliente</h1>
        <form action="SvImc" method="POST">
            <p><label>Nombre: </label> <input type="text" name="nombre"></p>
            <p><label>Apellido: </label> <input type="text" name="apellido"></p>
            <p><label>Peso: </label> <input type="double" name="peso"></p>
            <p><label>Altura: </label> <input type="double" name="altura"></p>
            <button type="submit" >Calcular IMC</button>
        </form>
        
        <h1>Ver lista de clientes</h1>
        <p>Para ver los datos de los clientes cargados haga click en el siguiente botón</p>
        <form action="SvImc" method="GET">
            <button type="submit"> Mostrar Clientes </button>
            
        </form>
        
    </body>
</html>
