package usuarios;

import galeria.Galeria;

public class OperadorSubasta extends Empleado{
    private Galeria galeria;

    public OperadorSubasta(String login, String password, String rol, Galeria galeria, String id){
        super(login, password, rol,id);
        this.galeria=galeria;
    }
    public void terminarSubasta(){
        // Termina la subasta
    }
    public void recibirRegistrarOferta(){ 
        // Recibe y registra una oferta
    }
    public void evaluarOferta(){
        // Evalua una oferta
    }


}
