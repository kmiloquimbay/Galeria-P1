package usuarios;


public class Usuario {
    private String login;
    private String password;
    private static int contadorIds = 1;

    // Constructor de Usuario
    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }

    // Getters y setters
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Método para obtener un nuevo ID para el usuario
    protected static int obtenerNuevoId() {
        return contadorIds++;
    }
}
