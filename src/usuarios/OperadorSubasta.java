package usuarios;

import galeria.Galeria;
import galeria.compraYsubasta.Oferta;
import galeria.compraYsubasta.Subasta;

public class OperadorSubasta extends Empleado{
    private Galeria galeria;

    public OperadorSubasta(String login, String password, String rol, Galeria galeria, String id){
        super(login, password, rol,id);
        this.galeria=galeria;
    }
    public String terminarSubasta(String id){
        // Termina la subasta
        Subasta subastaTerminar= galeria.encontrarSubasta(id);
        return subastaTerminar.terminarSubasta();
    }
    public String recibirRegistrarOferta(Oferta oferta,String id ){ 
        Subasta subasta= galeria.encontrarSubasta(id);
        return subasta.recibirRegistrarOferta(oferta);
    }
    public boolean evaluarOferta(Oferta oferta,String id ){
        // Evalua que una oferta supere el valor inicial
        Subasta subasta= galeria.encontrarSubasta(id);
        return subasta.evaluarOferta(oferta);
    }


}
