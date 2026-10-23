
<%@page import="logica.Cliente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Clientes</title>
    </head>
    <body>
        <h1>Lista de Clientes</h1>
        <%
            List<Cliente> listaClientes = (List) request.getSession().getAttribute("listaClientes");
            int cont = 1;
                for(Cliente cli : listaClientes){        
        %>
        <p><b>Cliente Nro. <%=cont%> </b></p>
        
        <p>Nombre: <%=cli.getNombre()%></p>
        <p>Apellido: <%=cli.getApellido()%></p>
        <p>Peso: <%=cli.getPeso()%></p>
        <p>Altura: <%=cli.getAltura()%></p>
        <p>IMC: <%=cli.getImc()%></p>
        <p>-------------------------------------</p>
        <%cont = cont + 1;%>
        
        <%}%>
        
    </body>
</html>
