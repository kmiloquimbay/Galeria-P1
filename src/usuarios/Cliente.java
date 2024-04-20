package usuarios;

import java.util.HashMap;
import java.util.Map;

public class Cliente extends Usuario {
    private String nombre;
    private String telefono;
    private int id;
    private static Map<Integer, Cliente> mapaClientes = new HashMap<>();

    public Cliente(String login, String password, String nombre, String telefono) {
        super(login, password);
        this.nombre = nombre;
        this.telefono = telefono;
        this.id = obtenerNuevoId();
        mapaClientes.put(id, this);
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}
