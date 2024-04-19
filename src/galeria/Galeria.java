package galeria;

import java.util.Map;

import usuarios.ControladorUsuarios;

public class Galeria {
    private Inventario inventario;
    private ControladorUsuarios controladorUsuarios;
    private Map<String, Subasta> subastas;
    private Map<String, Compra> compras;

    public Galeria(Inventario inventario, ControladorUsuarios controladorUsuarios, Map<String, Subasta> subastas, Map<String, Compra> compras) {
        this.inventario = inventario;
        this.controladorUsuarios = controladorUsuarios;
        this.subastas = subastas;
        this.compras = compras;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }

    public ControladorUsuarios getControladorUsuarios() {
        return controladorUsuarios;
    }

    public void setControladorUsuarios(ControladorUsuarios controladorUsuarios) {
        this.controladorUsuarios = controladorUsuarios;
    }

    public Map<String, Subasta> getSubastas() {
        return subastas;
    }

    public void setSubastas(Map<String, Subasta> subastas) {
        this.subastas = subastas;
    }

    public Map<String, Compra> getCompras() {
        return compras;
    }

    public void setCompras(Map<String, Compra> compras) {
        this.compras = compras;
    }

    public void agregarSubasta(Subasta subasta){
        this.subastas.put(subasta.getId(), subasta);
    }

    public void agregarCompra(Compra compra){
        this.compras.put(compra.getId(), compra);
    }



}
