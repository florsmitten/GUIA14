package Controlador;

import Modelo.DAO.InstruccionesDB;
import Modelo.DAO.MateriasPrimasDB;
import Modelo.DAO.OrdenTrabajoDB;
import Modelo.Instrucciones;
import Modelo.MateriasPrimas;
import Modelo.OrdenesDeTrabajo;

import java.util.ArrayList;
import java.util.TreeSet;

public class ControladorWeb {

    private MateriasPrimasDB materiasPrimasDB = new MateriasPrimasDB();

    public static int consultaMateriaPrima(int codMatPrima) {
        int stock = MateriasPrimasDB.spCantidadStock(codMatPrima);
        return stock;
    }

    public static ArrayList<OrdenesDeTrabajo> selectOTsSinAsignacion() {
        return OrdenTrabajoDB.selectOTsSinAsignacion();
    }

    public static Instrucciones seleccionarInstruccion(int codIns) {
        return InstruccionesDB.seleccionarInstruccion(codIns);
    }

    public static void borrarInstruccion(int codIns){
        InstruccionesDB.borrarInstruccion(codIns);
    }

    public static void updateInstrucciones(String descripcion, String cantNecesaria, String codMatPrima, String codIns){
        InstruccionesDB.updateInstrucciones(descripcion, cantNecesaria, codMatPrima, codIns);
    }

}
