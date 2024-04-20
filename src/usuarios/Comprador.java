package usuarios;

public class Comprador extends Cliente {
    private int limiteCompras;
    public Comprador(String login, String password, String nombre, String telefono, int limiteCompras){
        super(login, password, nombre, telefono);
        this.limiteCompras = limiteCompras;
    }
    public int getLimiteCompras() {
        return limiteCompras;
    }
    public void setLimiteCompras(int limiteCompras) {
        this.limiteCompras = limiteCompras;
    }
    

}
