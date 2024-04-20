package usuarios;

public class Empleado extends Usuario {
    private String rol;

    // Constructor de Empleado
    public Empleado(String login, String password, String rol) {
        super(login, password);
        this.rol = rol;
    }

    // Getters y setters
    public String getRol() {
        return rol;
    }
    public void setRol(String rol) {
        this.rol = rol;
    }
}
