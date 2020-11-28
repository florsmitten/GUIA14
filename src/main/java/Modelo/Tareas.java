package Modelo;

import java.util.Calendar;

public class Tareas {

    private int codigoTarea;
    private boolean tareaRealizada;
    private Calendar fechaFinTarea;
    private String horaFinTarea;
    private Operarios operario;

    public Tareas(int codigoTarea, boolean tareaRealizada, Calendar fechaFinTarea, String horaFinTarea, Operarios operario) {
        this.codigoTarea = codigoTarea;
        this.tareaRealizada = tareaRealizada;
        this.fechaFinTarea = fechaFinTarea;
        this.horaFinTarea = horaFinTarea;
        this.operario = operario;
    }

    public Tareas() {
    }

    public int getCodigoTarea() { return codigoTarea; }

    public void setCodigoTarea(int codigoTarea) { this.codigoTarea = codigoTarea; }

    public boolean isTareaRealizada() {
        return tareaRealizada;
    }

    public void setTareaRealizada(boolean tareaRealizada) {
        this.tareaRealizada = tareaRealizada;
    }

    public Calendar getFechaFinTarea() {
        return fechaFinTarea;
    }

    public void setFechaFinTarea(Calendar fechaFinTarea) {
        this.fechaFinTarea = fechaFinTarea;
    }

    public String getHoraFinTarea() {
        return horaFinTarea;
    }

    public void setHoraFinTarea(String horaFinTarea) {
        this.horaFinTarea = horaFinTarea;
    }

    public Operarios getOperario() {
        return operario;
    }

    public void setOperario(Operarios operario) {
        this.operario = operario;
    }
}
