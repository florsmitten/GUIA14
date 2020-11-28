package Modelo;

import java.util.ArrayList;

public class Productos {

    private int codigoProducto;
    private String nombreProducto;
    private ArrayList<Instrucciones> instrucciones;

    public Productos(int codigoProducto, String nombreProducto, ArrayList<Instrucciones> instrucciones) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.instrucciones = instrucciones;
    }

    public Productos() {
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public ArrayList<Instrucciones> getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(ArrayList<Instrucciones> instrucciones) {
        this.instrucciones = instrucciones;
    }
}
