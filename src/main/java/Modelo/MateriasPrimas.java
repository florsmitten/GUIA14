package Modelo;

public class MateriasPrimas {

    private int codigoMateriaPrima;
    private String nombreMateriaPrima;
    private int cantidadStock;

    public MateriasPrimas(int codigoMateriaPrima, String nombreMateriaPrima, int cantidadStock) {
        this.codigoMateriaPrima = codigoMateriaPrima;
        this.nombreMateriaPrima = nombreMateriaPrima;
        this.cantidadStock = cantidadStock;
    }

    public MateriasPrimas() {
    }

    public int getCodigoMateriaPrima() {
        return codigoMateriaPrima;
    }

    public void setCodigoMateriaPrima(int codigoMateriaPrima) {
        this.codigoMateriaPrima = codigoMateriaPrima;
    }

    public String getNombreMateriaPrima() {
        return nombreMateriaPrima;
    }

    public void setNombreMateriaPrima(String nombreMateriaPrima) {
        this.nombreMateriaPrima = nombreMateriaPrima;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }
}
