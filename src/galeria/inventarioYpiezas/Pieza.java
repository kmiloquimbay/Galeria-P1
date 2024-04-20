package galeria.inventarioYpiezas;

import java.util.List;

public abstract class Pieza {
    private String titulo;
    private List<Autor> autores;
    private String anioCreacion;
    private String lugarCreacion;
    private String fechaDevolucion;
    private boolean disponibleVentaValorFijo;
    private boolean bloqueada;

    public Pieza(String titulo, List<Autor> autores, String anioCreacion, String lugarCreacion, String fechaDevolucion, boolean disponibleVentaValorFijo, boolean bloqueada) {
        this.titulo = titulo;
        this.autores = autores;
        this.anioCreacion = anioCreacion;
        this.lugarCreacion = lugarCreacion;
        this.fechaDevolucion = fechaDevolucion;
        this.disponibleVentaValorFijo = disponibleVentaValorFijo;
        this.bloqueada = bloqueada;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public String getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(String anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public String getLugarCreacion() {
        return lugarCreacion;
    }

    public void setLugarCreacion(String lugarCreacion) {
        this.lugarCreacion = lugarCreacion;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public boolean isDisponibleVentaValorFijo() {
        return disponibleVentaValorFijo;
    }

    public void setDisponibleVentaValorFijo(boolean disponibleVentaValorFijo) {
        this.disponibleVentaValorFijo = disponibleVentaValorFijo;
    }

    public boolean isBloqueada() {
        return bloqueada;
    }

    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }


}
