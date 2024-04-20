package usuarios;

import java.util.Map;
import java.util.HashMap;

public class ControladorUsuarios {
    private static Map<Integer, Empleado> mapaEmpleados = new HashMap<>();
    private static Map<Integer, Cliente> mapaClientes = new HashMap<>();

    public OperadorSubasta crearOperador(String login, String password, String rol){
        OperadorSubasta operador = new OperadorSubasta(login, password, rol);
        mapaEmpleados.put(Usuario.obtenerNuevoId(), operador);
        return operador;
    }
    
    public Cajero crearCajero(String login, String password, String rol){
        Cajero cajero = new Cajero(login, password, rol);
        mapaEmpleados.put(Usuario.obtenerNuevoId(), cajero);
        return cajero;
    }

    public AdministradorGaleria crearAdmin(String login, String password, String rol){
        AdministradorGaleria administrador = new AdministradorGaleria(login, password, rol);
        mapaEmpleados.put(Usuario.obtenerNuevoId(), administrador);
        return administrador;
    }

    public Comprador crearComprador(String login, String password, String nombre, String telefono, int limiteCompras){
        Comprador comprador = new Comprador(login, password, nombre, telefono, limiteCompras);
        mapaClientes.put(Usuario.obtenerNuevoId(), comprador);
        return comprador;
    }

    public Cliente crearCliente(String login, String password, String nombre, String telefono){
        Cliente cliente = new Cliente(login, password, nombre, telefono);
        mapaClientes.put(Usuario.obtenerNuevoId(), cliente);
        return cliente;
    }

}
