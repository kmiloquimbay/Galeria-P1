package usuarios;

public class AdministradorGaleria extends Empleado{
    public AdministradorGaleria(String login, String password, String rol){
        super(login, password, rol);
    }
    public void registrarIngresoPieza(){
        // Registra el ingreso de una pieza
    }
    public void confirmarVenta(){
        // Confirma una venta
    }
    public void devolucionPieza(){
        // Realiza una devolución de una pieza
    }
    public boolean verificarComprador(Comprador comprador){
        // Verifica si un comprador está registrado
        return true;
    }
    public void aumentarLimite(){
        // Aumenta el límite de crédito de un comprador
    }
    public boolean verificarUsuario(){
        // Verifica un usuario
        return true;
    }
    public boolean verificarSeriedadOferta(){
        // Verifica la seriedad de una oferta
        return true;
    }
    public void bloquearPieza(){
        // Bloquea una pieza
    }
    public void desbloquearPieza(){
        // Desbloquea una pieza
    }
    



}
