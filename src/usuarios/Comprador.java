package usuarios;

import java.util.LinkedList;
import java.util.List;

import galeria.compraYsubasta.Compra;
import galeria.inventarioYpiezas.Pieza;

public class Comprador extends Cliente {
    private int limiteCompras;
    private List<Compra> misCompras;
    

    public Comprador(String login, String password, String nombre, String telefono, int limiteCompras, String id){
        super(login, password, nombre, telefono, id);
        this.limiteCompras = limiteCompras;
        misCompras = new LinkedList<Compra>( );
    }
    public int getLimiteCompras() {
        return limiteCompras;
    }
    public void setLimiteCompras(int limiteCompras) {
        this.limiteCompras = limiteCompras;
    }
    public List<Compra> getmisCompras() {
        return misCompras;
    }

    public void agregarCompra(Compra compra) {
         misCompras.add(compra);
    }
    public String realizarCompraFija(Pieza pieza){
        // Realiza una compra fija
        return "Compra realizada";
    }
    

}
