package Servlet;

import Controlador.ControladorWeb;
import Modelo.MateriasPrimas;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/crearFormularioSRV")
public class crearFormularioSRV extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int idPed = Integer.parseInt(request.getParameter("idPed"));
        int codMatPrima = Integer.parseInt(request.getParameter("codMatPrima"));
        int cantReq = Integer.parseInt(request.getParameter("cantReq"));
        String depositos = request.getParameter("depositos");

        MateriasPrimas matPrim = ControladorWeb.consultaMateriaP(codMatPrima);
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        if (matPrim == null) {

            out.print("<h2>Materia prima inexistente: " + codMatPrima + "</h2>");

        } else {

            ControladorWeb.generarJson(idPed, matPrim, cantReq, depositos);
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/crearFormulario.jsp");
            dispatcher.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
