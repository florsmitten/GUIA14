package Modelo.DAO;

import Controlador.Conexion;
import Modelo.MateriasPrimas;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

public class MateriasPrimasDB {

    protected int codMatPrima;

    public static int spCantidadStock(int codMatPrima) {

        int stock = 0;

        try {
            Connection conn = Conexion.getConnection();
            CallableStatement stmt = conn.prepareCall("{call spCantidadStock (?, ?)}");
            stmt.setInt(1, codMatPrima);
            stmt.registerOutParameter(2, Types.INTEGER);
            stmt.execute();

            stock = stmt.getInt(2);
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stock;
    }

    public static MateriasPrimas consultaMateriaP(int codMatPrima) {

        MateriasPrimas matprim = new MateriasPrimas();

        return matprim;
    }
}
