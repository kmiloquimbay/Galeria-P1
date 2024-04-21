package galeria.inventarioYpiezas;

import java.util.LinkedList;
import java.util.List;

public class Inventario {
    private List<Pieza> piezasEnExhibicion;
    private List<Pieza> piezasEnBodega;
    private List<Pieza> piezasPasadas;
    private List<Pieza> piezasDisponibleVenta;

    public Inventario() {
        this.piezasEnExhibicion = new LinkedList<Pieza>( );
        this.piezasEnBodega = new LinkedList<Pieza>( );
        this.piezasPasadas = new LinkedList<Pieza>( );
        this.piezasDisponibleVenta = new LinkedList<Pieza>( );
    }

    public List<Pieza> getPiezasEnExhibicion() {
        return piezasEnExhibicion;
    }

    public void setPiezasEnExhibicion(List<Pieza> piezasEnExhibicion) {
        this.piezasEnExhibicion = piezasEnExhibicion;
    }

    public List<Pieza> getPiezasEnBodega() {
        return piezasEnBodega;
    }

    public void setPiezasEnBodega(List<Pieza> piezasEnBodega) {
        this.piezasEnBodega = piezasEnBodega;
    }

    public List<Pieza> getPiezasPasadas() {
        return piezasPasadas;
    }

    public void setPiezasPasadas(List<Pieza> piezasPasadas) {
        this.piezasPasadas = piezasPasadas;
    }

    public List<Pieza> getPiezasDisponibleVenta() {
        return piezasDisponibleVenta;
    }

    public void setPiezasDisponibleVenta(List<Pieza> piezasDisponibleVenta) {
        this.piezasDisponibleVenta = piezasDisponibleVenta;
    }

    public void guardarEnBodega(Pieza pieza){
        this.piezasEnBodega.add(pieza);
    }
    public void ponerEnDisponibles(Pieza pieza){
        this.piezasDisponibleVenta.add(pieza);
    }
    public void pasarAPasadas(Pieza pieza){
        this.piezasPasadas.add(pieza);
    }

    public void pasarAExhibicion(Pieza pieza){
        this.piezasEnExhibicion.add(pieza);
    }

    public void eliminarDeBodega(Pieza pieza){
        this.piezasEnBodega.remove(pieza);
    }

    public Pieza buscarPieza(String titulo){
        for (Pieza pieza : piezasEnExhibicion) {
            if(pieza.getTitulo().equals(titulo)){
                return pieza;
            }
        }
        for (Pieza pieza : piezasEnBodega) {
            if(pieza.getTitulo().equals(titulo)){
                return pieza;
            }
        }
        for (Pieza pieza : piezasPasadas) {
            if(pieza.getTitulo().equals(titulo)){
                return pieza;
            }
        }
        return null;
        
    }

    public void bloquearPieza(String titulo){
        Pieza pieza = buscarPieza(titulo);
        if(pieza != null){
            pieza.setBloqueada(true);
        }
    }

    public void desbloquearPieza(String titulo){
        Pieza pieza = buscarPieza(titulo);
        if(pieza != null){
            pieza.setBloqueada(false);
        }
    }

    
}
