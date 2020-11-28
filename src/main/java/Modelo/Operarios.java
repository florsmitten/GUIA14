package Modelo;

public class Operarios {

    private String nombreApellidoOperario;
    private long documentoOperario;

    public Operarios(String nombreApellidoOperario, long documentoOperario) {
        this.nombreApellidoOperario = nombreApellidoOperario;
        this.documentoOperario = documentoOperario;
    }

    public Operarios() {
    }

    public String getNombreApellidoOperario() {
        return nombreApellidoOperario;
    }

    public void setNombreApellidoOperario(String nombreApellidoOperario) {
        this.nombreApellidoOperario = nombreApellidoOperario;
    }

    public long getDocumentoOperario() {
        return documentoOperario;
    }

    public void setDocumentoOperario(long documentoOperario) {
        this.documentoOperario = documentoOperario;
    }
}
