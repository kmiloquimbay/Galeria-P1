package usuarios;

import java.util.List;
import galeria.inventarioYpiezas.Pieza;

public class Comprador extends Cliente {
    private int limiteCompras;
    private List<Pieza> misPiezas;
    

    public Comprador(String login, String password, String nombre, String telefono, int limiteCompras, List<Pieza> misPiezas, String id){
        super(login, password, nombre, telefono, id);
        this.limiteCompras = limiteCompras;
        this.misPiezas = misPiezas;
    }
    public int getLimiteCompras() {
        return limiteCompras;
    }
    public void setLimiteCompras(int limiteCompras) {
        this.limiteCompras = limiteCompras;
    }
    public List<Pieza> getmisPiezas() {
        return misPiezas;
    }

    public String realizarCompraFija(Pieza pieza){
        // Realiza una compra fija
        return "Compra realizada";
    }
    

}
