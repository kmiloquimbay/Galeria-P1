package galeria.compraYsubasta;

import galeria.inventarioYpiezas.Pieza;

public class Compra {
    private String id;
    private int valorPagado;
    private String tipoPago;

    public Compra(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public int getValorPagado() {
        return valorPagado;
    }

    public void setValorPagado(int valorPagado) {
        this.valorPagado = valorPagado;
    }

    public boolean verificarVentaValorFijo(Pieza pieza, int valorPagado){
        if( valorPagado > pieza.getPrecioFijo() && pieza.isDisponibleVentaValorFijo() && !pieza.isBloqueada()){
            return true;
        }
        return false;
 

    }
}
