package Servlet;

import Controlador.ControladorWeb;
import Modelo.Instrucciones;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

@WebServlet("/consultarInstruccionesSRV")
public class consultarInstruccionesSRV extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int codIns = Integer.parseInt(request.getParameter("txtCodIns"));

        PrintWriter out = response.getWriter();

        response.setContentType("text/html");
        out.print("<html><body>");

        if (codIns != 0) {

            out.print("<h2>CODIGO INSTRUCCIÓN: " + codIns + "</h2>");

            Instrucciones instruccion = ControladorWeb.seleccionarInstruccion(codIns);

            if (instruccion == null) {

                out.print("<h2>Instrucción inexistente: " + codIns + "</h2>");

            } else {

                out.print("Código instrucción: " + codIns + "<br>");

                request.getSession().setAttribute("descripcion", String.valueOf(instruccion.getDescripcionInstruccion()));
                request.getSession().setAttribute("cantidadNecesaria", String.valueOf(instruccion.getCantidadNecesaria()));
                request.getSession().setAttribute("codMatPrima", (instruccion.getMateria().getCodigoMateriaPrima()));

                request.getRequestDispatcher("actualizarInstruccionesSRV.jsp").forward(request, response);
            }
        }
        out.print("</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
