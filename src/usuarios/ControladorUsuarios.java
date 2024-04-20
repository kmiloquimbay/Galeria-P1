package usuarios;
import java.util.Map;

public class ControladorUsuarios {
    private Map<String, Empleado> empleados;
    private Map<String, Cliente> clientes;

    public OperadorSubasta crearOperador(String login, String password, String rol){
        OperadorSubasta operador = new OperadorSubasta(login, password, rol);
        empleados.put(login, operador);
        return operador;
        }
    
    public Cajero crearCajero(String login, String password, String rol){
        Cajero cajero = new Cajero(login, password, rol);
        empleados.put(login, cajero);
        return cajero;
        }

    public AdministradorGaleria crearAdmin(String login, String password, String rol){
        AdministradorGaleria administrador = new AdministradorGaleria(login, password, rol);
        empleados.put(login, administrador);
        return administrador;
        }

    public Comprador crearComprador(String login, String password, String nombre, String telefono, int limiteCompras){
        Comprador comprador = new Comprador(login, password, nombre, telefono, limiteCompras);
        clientes.put(login, comprador);
        return comprador;
        }

    public Cliente crearCliente(String login, String password, String nombre, String telefono){
        Cliente cliente = new Cliente(login, password, nombre, telefono);
        clientes.put(login, cliente);
        return cliente;
        }

    public Empleado obtenerEmpleado(String login){
        return empleados.get(login);
        }
    public Cliente obtenerCliente(String login){
        return clientes.get(login);
        }

    public void eliminarEmpleado(String login){
        empleados.remove(login);
        }
    public void eliminarCliente(String login){
        clientes.remove(login);
        }
    public void modificarEmpleado(String login, String password, String rol){
        Empleado empleado = empleados.get(login);
        empleado.setPassword(password);
        empleado.setRol(rol);
        }
    public void modificarCliente(String login, String password, String nombre, String telefono){
        Cliente cliente = clientes.get(login);
        cliente.setPassword(password);
        cliente.setNombre(nombre);
        cliente.setTelefono(telefono);
        }




}
