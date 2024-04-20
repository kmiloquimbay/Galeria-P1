package usuarios;

public class Cajero extends Empleado{
    public Cajero(String login, String password, String rol){
        super(login, password, rol);
    }
    public void registrarPago(){
        // Registra un pago
    }
    public void entregarPieza(){
        // Entrega una pieza
    }
    
}