package usuarios;

import galeria.Galeria;
import galeria.compraYsubasta.Oferta;

public class AdministradorGaleria extends Empleado{
    public Galeria galeria;
    public AdministradorGaleria(String login, String password, String rol, Galeria galeria, String id){
        super(login, password, rol,id);
        this.galeria=galeria;
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
    public boolean verificarUsuario(Comprador comprador){
        // Verifica si un comprador está registrado
        return true;
    }
    public void aumentarLimite(){
        // Aumenta el límite de crédito de un comprador
    }
    public boolean verificarComprador(String id){
        if ( this.galeria.getControladorUsuarios().obtenerComprador(id) == null ) 
            return false;
        return true;
    }
    public String verificarSeriedadOferta(String id, int valorApagar){
        // Verifica la seriedad de una oferta
        boolean x = verificarComprador(id);
        if (x == false)
            return "El comprador no está registrado";
        else{
            Comprador comprador = this.galeria.getControladorUsuarios().obtenerComprador(id);
            if (comprador.getLimiteCompras() < valorApagar)
                return "El comprador no tiene suficiente crédito";
            else
                return "Oferta seria";
            }
        }
    public void bloquearPieza(String titulo){
        this.galeria.getInventario().bloquearPieza(titulo);
    }
    public void desbloquearPieza(String titulo){
        this.galeria.getInventario().desbloquearPieza(titulo);
    }
    



}
