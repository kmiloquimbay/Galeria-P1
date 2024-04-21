package usuarios;

import galeria.Galeria;
import galeria.compraYsubasta.Compra;
import galeria.compraYsubasta.Oferta;
import galeria.inventarioYpiezas.Pieza;

public class AdministradorGaleria extends Empleado{
    public Galeria galeria;
    public AdministradorGaleria(String login, String password, String rol, Galeria galeria, String id){
        super(login, password, rol,id);
        this.galeria=galeria;
    }
    public void registrarIngresoPieza(Pieza pieza){
        if(this.galeria.getInventario().getPiezasEnExhibicion().contains(pieza)){
            this.galeria.getInventario().getPiezasEnExhibicion().remove(pieza);
            this.galeria.getInventario().getPiezasEnBodega().add(pieza);
        }
        else if(this.galeria.getInventario().getPiezasPasadas().contains(pieza)){
            this.galeria.getInventario().getPiezasPasadas().remove(pieza);
            this.galeria.getInventario().getPiezasEnBodega().add(pieza);
        }
    }
    public void confirmarVenta(Compra compra, Pieza pieza, String idComprador){
        // Confirma una venta
        if (compra.verificarVentaValorFijo(pieza , compra.getValorPagado()) && verificarComprador(idComprador)){
            this.galeria.getInventario().getPiezasDisponibleVenta().remove(pieza);
            this.galeria.getInventario().getPiezasPasadas().add(pieza);
            String nombre = pieza.getTitulo();
            bloquearPieza(nombre);
            //agregar la pieza a misCompras del comprador 
            this.galeria.getControladorUsuarios().obtenerComprador(idComprador).getmisPiezas().add(pieza);
            //remover de piezasDisponiblesVenta
            this.galeria.getInventario().getPiezasDisponibleVenta().remove(pieza);
            //agregar a piezasPasadas
            this.galeria.getInventario().getPiezasPasadas().add(pieza);
            //agregar a misPiezasActuales de priopetario
            if (this.galeria.getControladorUsuarios().obtenerPropietario(idComprador) != null){
                this.galeria.getControladorUsuarios().obtenerPropietario(idComprador).getMisPiezasActuales().add(pieza);
            }
            else{
                Comprador comprador = this.galeria.getControladorUsuarios().obtenerComprador(idComprador);
                this.galeria.getControladorUsuarios().crearPropietario(comprador.getLogin(),comprador.getPassword(),comprador.getNombre(),comprador.getTelefono());
            }
        }
    }
    
    public void devolucionPieza(){
        // Realiza una devolución de una pieza
    }
    public boolean verificarUsuario(Comprador comprador){
        // Verifica si un comprador está registrado
        return true;
    }
    public void aumentarLimite(String id, int aumento){
         Comprador comprador = this.galeria.getControladorUsuarios().obtenerComprador(id);
         if (comprador != null && comprador.getLimiteCompras() + aumento >= 0)
            comprador.setLimiteCompras(comprador.getLimiteCompras() + aumento);
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
