package usuarios;


public class Cliente extends Usuario {
    private String nombre;
    private String telefono;

    public Cliente(String login, String password, String nombre, String telefono) {
        super(login, password);
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
