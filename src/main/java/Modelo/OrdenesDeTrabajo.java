package Modelo;

import java.util.ArrayList;
import java.util.Calendar;

public class OrdenesDeTrabajo {

    private int codigoOT;
    private Calendar fechaRegistracion;
    private Productos producto;
    private int cantidadRequeridaProductos;
    private Calendar fechaFinalizacion;
    private String descripcion;
    private boolean esUrgente;
    private String nombresResponsables;
    private Supervisores supervisor;
    private ArrayList<Tareas> tareas;

    public OrdenesDeTrabajo(int codigoOT, Calendar fechaRegistracion, Productos producto, int cantidadRequeridaProductos,
                            Calendar fechaFinalizacion, String descripcion, boolean esUrgente, String nombresResponsables,
                            Supervisores supervisor, ArrayList<Tareas> tareas) {
        this.codigoOT = codigoOT;
        this.fechaRegistracion = fechaRegistracion;
        this.producto = producto;
        this.cantidadRequeridaProductos = cantidadRequeridaProductos;
        this.fechaFinalizacion = fechaFinalizacion;
        this.descripcion = descripcion;
        this.esUrgente = esUrgente;
        this.nombresResponsables = nombresResponsables;
        this.supervisor = supervisor;
        this.tareas = tareas;
    }

    public OrdenesDeTrabajo() {
    }

    public int getCodigoOT() {
        return codigoOT;
    }

    public void setCodigoOT(int codigoOT) {
        this.codigoOT = codigoOT;
    }

    public Calendar getFechaRegistracion() {
        return fechaRegistracion;
    }

    public void setFechaRegistracion(Calendar fechaRegistracion) {
        this.fechaRegistracion = fechaRegistracion;
    }

    public Productos getProducto() {
        return producto;
    }

    public void setProducto(Productos producto) {
        this.producto = producto;
    }

    public int getCantidadRequeridaProductos() {
        return cantidadRequeridaProductos;
    }

    public void setCantidadRequeridaProductos(int cantidadRequeridaProductos) {
        this.cantidadRequeridaProductos = cantidadRequeridaProductos;
    }

    public Calendar getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Calendar fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEsUrgente() {
        return esUrgente;
    }

    public void setEsUrgente(boolean esUrgente) {
        this.esUrgente = esUrgente;
    }

    public String getNombresResponsables() {
        return nombresResponsables;
    }

    public void setNombresResponsables(String nombresResponsables) {
        this.nombresResponsables = nombresResponsables;
    }

    public Supervisores getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisores supervisor) {
        this.supervisor = supervisor;
    }

    public ArrayList<Tareas> getTareas() {
        return tareas;
    }

    public void setTareas(ArrayList<Tareas> tareas) {
        this.tareas = tareas;
    }
}
