package usuarios;

import galeria.Galeria;
import galeria.compraYsubasta.Compra;
import galeria.inventarioYpiezas.Pieza;

public class Cajero extends Empleado{
    private Galeria galeria;
    public Cajero(String login, String password, String rol, Galeria galeria,String id){
        super(login, password, rol,id);
        this.galeria=galeria;
    }
    public String registrarPago(Compra compra, Pieza pieza, String idComprador){
        this.galeria.getAdministrador().confirmarVenta(compra, pieza, idComprador);
        return "Pago registrado";
    }
    public void entregarPieza(Pieza pieza, String idComprador){
        // Entrega una pieza
        if (this.galeria.getAdministrador().verificarComprador(idComprador)){
            this.galeria.getInventario().getPiezasEnBodega().remove(pieza);
            this.galeria.getInventario().getPiezasEnExhibicion().add(pieza);
            String nombre = pieza.getTitulo();
            this.galeria.getAdministrador().desbloquearPieza(nombre);
            //agregar a misPiezasActuales de propietario
            this.galeria.getControladorUsuarios().obtenerPropietario(idComprador).getMisPiezasActuales().add(pieza);
        }

    }
    
}