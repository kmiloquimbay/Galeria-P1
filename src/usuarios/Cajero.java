package usuarios;

import galeria.Galeria;

public class Cajero extends Empleado{
    private Galeria galeria;
    public Cajero(String login, String password, String rol, Galeria galeria){
        super(login, password, rol);
        this.galeria=galeria;
    }
    public void registrarPago(){
        // Registra un pago
    }
    public void entregarPieza(){
        // Entrega una pieza
    }
    
}