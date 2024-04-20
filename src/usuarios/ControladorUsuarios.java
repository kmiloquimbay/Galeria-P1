package usuarios;

import java.util.Map;

import galeria.Galeria;
import galeria.inventarioYpiezas.Inventario;

import java.util.HashMap;

public class ControladorUsuarios {
    
    private  Map<Integer, Empleado> mapaEmpleados;
    private  Map<Integer, Cliente> mapaClientes ;
    private Galeria galeria;
    
    public ControladorUsuarios(){
        
        mapaEmpleados = new HashMap<Integer, Empleado>();
        mapaClientes = new HashMap<Integer, Cliente>();
    }

    public void setGaleria(Galeria galeria){
        this.galeria=galeria;
    }
    public OperadorSubasta crearOperador(String login, String password, String rol){
        OperadorSubasta operador = new OperadorSubasta(login, password, rol, this.galeria);
        mapaEmpleados.put(Usuario.obtenerNuevoId(), operador);
        return operador;
    }
    
    public Cajero crearCajero(String login, String password, String rol){
        Cajero cajero = new Cajero(login, password, rol, this.galeria);
        mapaEmpleados.put(Usuario.obtenerNuevoId(), cajero);
        return cajero;
    }

    public AdministradorGaleria crearAdmin(String login, String password, String rol){
        AdministradorGaleria administrador = new AdministradorGaleria(login, password, rol, this.galeria);
        mapaEmpleados.put(Usuario.obtenerNuevoId(), administrador);
        return administrador;
    }

    public Comprador crearComprador(String login, String password, String nombre, String telefono, int limiteCompras){
        Comprador comprador = new Comprador(login, password, nombre, telefono, limiteCompras);
        mapaClientes.put(Usuario.obtenerNuevoId(), comprador);
        return comprador;
    }

    public Propietario crearPropietario(String login, String password, String nombre, String telefono){
        Propietario propietario = new Propietario(login, password, nombre, telefono);
        mapaClientes.put(Usuario.obtenerNuevoId(), propietario);
        return propietario;
    }

}
