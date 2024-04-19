package galeria;

import java.util.List;

public class Fotografia extends Pieza{

    private String resolucion;
    private String tamanio;

    public Fotografia(String titulo, List<Autor> autores, String anioCreacion, String lugarCreacion, String fechaDevolucion, boolean disponibleVentaValorFijo, boolean bloqueada, String resolucion, String tamanio) {
        super(titulo, autores, anioCreacion, lugarCreacion, fechaDevolucion, disponibleVentaValorFijo, bloqueada);
        this.resolucion = resolucion;
        this.tamanio = tamanio;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }


}
