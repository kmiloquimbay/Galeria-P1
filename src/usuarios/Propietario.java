package usuarios;

import java.util.LinkedList;
import java.util.List;
import galeria.inventarioYpiezas.Pieza;

public class Propietario extends Cliente{
    private List<Pieza> misPiezasActuales; 
    private List<Pieza> misPiezasPasadas;

    public Propietario(String login, String password, String nombre, String telefono){
        super(login, password, nombre, telefono);
        misPiezasActuales = new LinkedList<Pieza>( );
        misPiezasPasadas = new LinkedList<Pieza>( );

    }
    public void agregarEmpleado(){
        // Agrega un empleado
    }

    public List getMisPiezasActuales(){
        return misPiezasActuales;
    }

    public List getMisPiezasPasadas(){
        return misPiezasPasadas;
    }
    public void agregarPieza(Pieza pieza){
        misPiezasActuales.add(pieza);
    }

    public void pasarAPasadas(Pieza pieza){
        misPiezasActuales.remove(pieza);
        misPiezasPasadas.add(pieza);
    }





}
