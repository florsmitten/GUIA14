package Modelo;

public class FormulariosPedidos {

    private int numeroFormularioPedido;
    private int cantidadRequerida;
    private String[] depositos;
    private MateriasPrimas materiaPrima;

    public FormulariosPedidos(int numeroFormularioPedido, int cantidadRequerida, String[]  depositos, MateriasPrimas materiaPrima) {
        this.numeroFormularioPedido = numeroFormularioPedido;
        this.cantidadRequerida = cantidadRequerida;
        this.depositos = depositos;
        this.materiaPrima = materiaPrima;
    }

    public FormulariosPedidos() {
    }

    public int getNumeroFormularioPedido() {
        return numeroFormularioPedido;
    }

    public void setNumeroFormularioPedido(int numeroFormularioPedido) {
        this.numeroFormularioPedido = numeroFormularioPedido;
    }

    public int getCantidadRequerida() {
        return cantidadRequerida;
    }

    public void setCantidadRequerida(int cantidadRequerida) {
        this.cantidadRequerida = cantidadRequerida;
    }

    public String[]  getDepositos() {
        return depositos;
    }

    public void setDepositos(String[]  depositos) {
        this.depositos = depositos;
    }

    public MateriasPrimas getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(MateriasPrimas materiaPrima) {
        this.materiaPrima = materiaPrima;
    }
}
