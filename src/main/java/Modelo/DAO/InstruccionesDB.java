package Modelo.DAO;

import Controlador.Conexion;
import Modelo.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;

public class InstruccionesDB {

    public static Instrucciones seleccionarInstruccion(int codIns) {

        Instrucciones ins = new Instrucciones();
        MateriasPrimas matPrima = new MateriasPrimas();

        try{
            Connection conn = Conexion.getConnection();
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT codigoInstruccion, descripcion, cantidadNecesaria, codigoMatPrima FROM Instrucciones");

            while (rs.next()) {

                matPrima= selectMatPrima(rs.getInt("codigoMatPrima"));

                ins.setCodigoInstruccion(rs.getInt("codigoInstruccion"));
                ins.setDescripcionInstruccion(rs.getString("descripcion"));
                ins.setCantidadNecesaria(rs.getInt("cantidadNecesaria"));
                ins.setMateria(matPrima);
            }
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ins;
    }

    private static MateriasPrimas selectMatPrima(int codigoMatPrima) {

        MateriasPrimas matPrima = new MateriasPrimas();

        return matPrima;
    }

    public static void borrarInstruccion(int codIns) {

        try {
            Connection conn = Conexion.getConnection();
            Statement stmt = conn.createStatement();
            int codInsAux = codIns;

            stmt.executeUpdate("DELETE FROM Instrucciones WHERE codigoInstruccion=" + codIns);
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateInstrucciones(String descripcion, String cantNecesaria, String codMatPrima, String codIns) {

        try{

            int idcantNecesaria = Integer.parseInt(cantNecesaria);
            int idcodMatPrima = Integer.parseInt(codMatPrima);
            int idcodIns = Integer.parseInt(codIns);

            Connection conn = Conexion.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("UPDATE Instrucciones SET " + ", cantidadNecesaria=" + idcantNecesaria
                    + ", descripcion='" + descripcion + "', codigoMatPrima=" + idcodMatPrima + " WHERE codigoInstruccion=" + idcodIns);

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
