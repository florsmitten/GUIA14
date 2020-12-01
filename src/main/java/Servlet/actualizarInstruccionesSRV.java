package Servlet;

import Controlador.ControladorWeb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/actualizarInstruccionesSRV")
public class actualizarInstruccionesSRV extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String descripcion = request.getParameter("txtDescripcion");
        String cantNecesaria = request.getParameter("txtCantidadNecesaria");
        String codMatPrima = request.getParameter("txtCodMatPrima");
        String codIns = request.getParameter("txtCodIns");

        if (codIns == null) {
            codIns = request.getSession().getAttribute("txtCodIns").toString();
        }

        boolean borrar = request.getParameterMap().containsKey("btnBorrar");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html>");
        out.print("<head><title>Servelts de actualizacion</title></head>");
        out.print("<body>");

        if (borrar) {
            out.print("<h2>Datos Ingresados a Borrar</h2>");
            out.print("Código Instrucción: " + codIns);

            ControladorWeb.borrarInstruccion(Integer.parseInt(codIns));

        } else {
            out.print("<h2>Datos Ingresados a Modificar</h2>");
            if (codIns != null) {

                String descripcionAux = request.getParameter("txtDescripcion");
                String cantNecesariaAux = request.getParameter("txtCantidadNecesaria");
                String codMatPrimaAux = request.getParameter("txtCodMatPrima");
                String codInsAux = request.getParameter("txtCodIns");

                out.print("Descripcion: " + descripcion + "<br>");
                out.print("Cantidad Necesaria: " + cantNecesaria + "<br>");
                out.print("Codigo Materia Prima: " + codMatPrima + "<br>");
                out.print("Codigo Inscripcion: " + codIns + "<br>");

                ControladorWeb.updateInstrucciones(descripcion, cantNecesaria, codMatPrima, codIns);

            } else {
                out.print("Patente en null ");
            }
        }
        out.print("<h3><a href=\"index.jsp\">Volver</a></h3>");
        out.println("</html></body>");
        request.getSession().setAttribute("descripcion", "");
        request.getSession().setAttribute("cantidadNecesaria", "");
        request.getSession().setAttribute("codMatPrima", "");

    }
}
