package Modelo;

public class Supervisores {

    private String nombreApellidoSupervisor;
    private long documentoSupervisor;

    public Supervisores(String nombreApellidoSupervisor, long documentoSupervisor) {
        this.nombreApellidoSupervisor = nombreApellidoSupervisor;
        this.documentoSupervisor = documentoSupervisor;
    }

    public Supervisores() {
    }

    public String getNombreApellidoSupervisor() {
        return nombreApellidoSupervisor;
    }

    public void setNombreApellidoSupervisor(String nombreApellidoSupervisor) {
        this.nombreApellidoSupervisor = nombreApellidoSupervisor;
    }

    public long getDocumentoSupervisor() {
        return documentoSupervisor;
    }

    public void setDocumentoSupervisor(long documentoSupervisor) {
        this.documentoSupervisor = documentoSupervisor;
    }
}
