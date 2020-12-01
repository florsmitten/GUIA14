package Servlet;

import Controlador.ControladorWeb;
import Modelo.MateriasPrimas;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

@WebServlet("/consultaStockSRV")
public class consultaStockSRV extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int codMatPrima = Integer.parseInt(request.getParameter("codMatPrima"));
        PrintWriter out = response.getWriter();

        response.setContentType("text/html");
        out.print("<html><body>");
        out.print("<h2>Código Materia Prima: " + codMatPrima + "</h2>");

        if (codMatPrima != 0) {
            int stock = -1;
            stock = ControladorWeb.consultaMateriaPrima(codMatPrima);

            if (stock == -1) {
                out.print("<h2>Materia prima inexistente: " + codMatPrima + "</h2>");
            } else {
                out.print("Stock: " + stock + "<br>");
            }
        }
        out.print("</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
