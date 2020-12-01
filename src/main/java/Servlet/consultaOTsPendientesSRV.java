package Servlet;

import Controlador.ControladorWeb;
import Modelo.OrdenesDeTrabajo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;

@WebServlet("/consultaOTsPendientesSRV")
public class consultaOTsPendientesSRV extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();

        response.setContentType("text/html");
        out.print("<html><body>");

        ArrayList<OrdenesDeTrabajo> listaOT = ControladorWeb.selectOTsSinAsignacion();

        out.print("<h2> OT </h2>");
        out.print("<table border=\"1\" cellpadding=\"2\"> <tr> <td> codigoOT </td>");
        out.print("<td> fechaRegistracion </td>");
        out.print("<td> codigoProducto </td>");
        out.print("<td> cantidadRequerida </td>");
        out.print("<td> responsables </td>");
        out.print("<td> nombreSupervisor </td> </tr>");

        listaOT.stream().sorted((o1, o2) -> o1.getSupervisor().getNombreApellidoSupervisor().compareTo(o2.getSupervisor().getNombreApellidoSupervisor()))
                .forEach( (p)  ->
                {
                    out.print("<tr> <td>" + p.getCodigoOT() + "</td>");
                    out.print("<td>" + p.getFechaRegistracion().get(Calendar.DAY_OF_MONTH) + "/" +
                    (p.getFechaRegistracion().get(Calendar.MONTH)+1) + "/" + p.getFechaRegistracion().get(Calendar.YEAR) + "</td>");
                    out.print("<td>" + p.getProducto().getNombreProducto() + "</td>");
                    out.print("<td>" + p.getCantidadRequeridaProductos() + "</td>");
                    out.print("<td>" + p.getNombresResponsables() + "</td>");
                    out.print("<td>" + p.getSupervisor().getNombreApellidoSupervisor() + "</td> </tr>");
                });
        out.print("</table>");


        out.print("</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { }
}
