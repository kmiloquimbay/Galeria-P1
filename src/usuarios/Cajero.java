package usuarios;

import galeria.Galeria;

public class Cajero extends Empleado{
    private Galeria galeria;
    public Cajero(String login, String password, String rol, Galeria galeria,String id){
        super(login, password, rol,id);
        this.galeria=galeria;
    }
    public void registrarPago(){
        // Registra un pago
    }
    public void entregarPieza(){
        // Entrega una pieza
    }
    
}