package galeria.compraYsubasta;

import java.util.LinkedList;
import java.util.List;

public class Subasta {
    private String id;
    private boolean vendida;
    private int valorMinimo;
    public int valorInicial;
    private List<Oferta> ofertas;

    
    public Subasta(String id,int valorMinimo,int valorInicial) {
        this.id = id;
        this.valorInicial=valorInicial;
        this.valorMinimo=valorMinimo;
        ofertas=new LinkedList<Oferta>( );
    }

    public String getId() {
        return id;
    }

    public List<Oferta> getOfertas() {
        return ofertas;
    }

    public void agregarOferta(Oferta oferta) {
        ofertas.add(oferta);
    }

}
