package persistencia;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import galeria.Galeria;
import galeria.inventarioYpiezas.Inventario;
import usuarios.ControladorUsuarios;

public class PersistenciaGaleria {

    public static Galeria cargarGaleria() throws IOException {

        Inventario inventario = new Inventario();
        PersistenciaInventario.cargarInventario(inventario);

        Galeria galeria = new Galeria(inventario, new ControladorUsuarios());
        PersistenciaSubastasCompras.cargarComprasSubastas(galeria);

        PersistenciaUsuarios.cargarUsuarios(galeria);
        

        return galeria;
        
    }

    public static void salvarGaleria(Galeria galeria) throws FileNotFoundException {
        // Lógica para salvar la galería
        PersistenciaInventario.guardarInventario(galeria.getInventario());
        PersistenciaUsuarios.guardarUsuarios(galeria);
        PersistenciaSubastasCompras.guardarComprasSubastas(galeria.getSubastas(), galeria.getCompras());
    }
}
