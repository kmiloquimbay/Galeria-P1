package galeria.compraYsubasta;

import java.util.LinkedList;
import java.util.List;

import galeria.inventarioYpiezas.Pieza;

public class Subasta {
    private String id;
    private boolean vendida;
    private int valorMinimo;
    public int valorInicial;
    private List<Oferta> ofertas;
    private Pieza pieza;

    
    public Subasta(String id,int valorMinimo,int valorInicial, Pieza pieza) {
        this.id = id;
        this.valorInicial=valorInicial;
        this.valorMinimo=valorMinimo;
        this.pieza=pieza;
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
    public Boolean evaluarOferta(Oferta oferta){
       int valor=oferta.getValorOferta();
       if (valor>valorInicial){
        return true;
       }
       else {
        return false;
       }
    }
    public void recibirRegistrarOferta(Oferta oferta){
        if (evaluarOferta(oferta)){
            agregarOferta(oferta);
        }
    }
    public void terminarSubasta(){
        Oferta ofertaMax=ofertas.get(0);
        for (Oferta oferta : ofertas) {
            if (oferta.getValorOferta() > ofertaMax.getValorOferta()){
                ofertaMax=oferta;
            }
            
        }
        if (ofertaMax.getValorOferta()>valorMinimo){
            Compra compra= new Compra(id, ofertaMax.getValorOferta(), id,pieza );
            vendida=true;
            ofertaMax.getComprador().
             
        }
    }
}
