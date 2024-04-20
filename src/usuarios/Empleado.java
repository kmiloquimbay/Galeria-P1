package usuarios;

import java.util.HashMap;
import java.util.Map;

public class Empleado extends Usuario {
    private String rol;
    private int id;
    private static Map<Integer, Empleado> mapaEmpleados = new HashMap<>();

    // Constructor de Empleado
    public Empleado(String login, String password, String rol) {
        super(login, password);
        this.rol = rol;
        this.id = obtenerNuevoId(); 
        mapaEmpleados.put(id, this);
    }

    // Getters y setters
    public String getRol() {
        return rol;
    }

    public int getId() {
        return id;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}