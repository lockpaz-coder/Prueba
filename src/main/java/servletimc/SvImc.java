/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servletimc;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import logica.Cliente;


@WebServlet(name = "SvImc", urlPatterns = {"/SvImc"})
public class SvImc extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
        List<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(new Cliente("Arturo","Lock", "80.00","1.75","26.12"));
        listaClientes.add(new Cliente("Fatima","Farromeque","56.00","1.60","21.88"));
        listaClientes.add(new Cliente("Rudy","Paz","65.00","1,58","26.04"));
        
        HttpSession misesion = request.getSession();
        misesion.setAttribute("listaClientes", listaClientes);
        
        response.sendRedirect("mostrarClientes.jsp");
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        double peso = Double.parseDouble(request.getParameter("peso"));
        double altura = Double.parseDouble(request.getParameter("altura"));
        
        double imc = peso / (altura * altura);
        
        String imcFormateado = String.format("%.2f", imc);
        
        System.out.println("Nombre es: " + nombre);
        System.out.println("Apellido es: " + apellido);
        System.out.println("El peso es: " + peso);
        System.out.println("La altura es: " + altura);
        System.out.println("El IMC es: " + imcFormateado);
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
