package Modelo;

public class Instrucciones implements ICalculable{

    private int codigoInstruccion;
    private String descripcionInstruccion;
    private MateriasPrimas materia;
    private int cantidadNecesaria;

    public Instrucciones(int codigoInstruccion, String descripcionInstruccion, MateriasPrimas materia, int cantidadNecesaria) {
        this.codigoInstruccion = codigoInstruccion;
        this.descripcionInstruccion = descripcionInstruccion;
        this.materia = materia;
        this.cantidadNecesaria = cantidadNecesaria;
    }

    public Instrucciones() {
    }

    public int getCodigoInstruccion() {
        return codigoInstruccion;
    }

    public void setCodigoInstruccion(int codigoInstruccion) {
        this.codigoInstruccion = codigoInstruccion;
    }

    public String getDescripcionInstruccion() {
        return descripcionInstruccion;
    }

    public void setDescripcionInstruccion(String descripcionInstruccion) {
        this.descripcionInstruccion = descripcionInstruccion;
    }

    public MateriasPrimas getMateria() {
        return materia;
    }

    public void setMateria(MateriasPrimas materia) {
        this.materia = materia;
    }

    public int getCantidadNecesaria() {
        return cantidadNecesaria;
    }

    public void setCantidadNecesaria(int cantidadNecesaria) {
        this.cantidadNecesaria = cantidadNecesaria;
    }

    @Override
    public boolean validarStock() {
        return false;
    }
}
