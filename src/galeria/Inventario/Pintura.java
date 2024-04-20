package galeria.Inventario;

import java.util.List;

public class Pintura extends Pieza{
    private int alto;
    private int ancho;
    private String tecnica;

    public Pintura(String titulo, List<Autor> autores, String anioCreacion, String lugarCreacion, String fechaDevolucion, boolean disponibleVentaValorFijo, boolean bloqueada, int alto, int ancho, String tecnica) {
        super(titulo, autores, anioCreacion, lugarCreacion, fechaDevolucion, disponibleVentaValorFijo, bloqueada);
        this.alto = alto;
        this.ancho = ancho;
        this.tecnica = tecnica;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getTecnica() {
        return tecnica;
    }

    public void setTecnica(String tecnica) {
        this.tecnica = tecnica;
    }

}
