package persistencia;
import java.io.PrintWriter;

import org.json.simple.JSONArray;
import galeria.inventarioYpiezas.*;

public class PersistenciaInventario {
    
    public static void guardarInventario(Inventario inventario) {

        JSONObject inventarioJson = new JSONObject();

        JSONArray piezasEnBodega = new JSONArray();
        JSONArray piezasEnExhibicion = new JSONArray();
        JSONArray piezasPasadas = new JSONArray();

        for (Pieza pieza : inventario.getPiezasEnBodega()) {
            JSONObject piezaJson = guardarPieza(pieza);
            piezasEnBodega.add(piezaJson);
        }

        for (Pieza pieza : inventario.getPiezasEnExhibicion()) {
            JSONObject piezaJson = guardarPieza(pieza);
            piezasEnExhibicion.add(piezaJson);
        }

        for (Pieza pieza : inventario.getPiezasPasadas()) {
            JSONObject piezaJson = guardarPieza(pieza);
            piezasPasadas.add(piezaJson);
        }

        inventarioJson.put("piezasEnBodega", piezasEnBodega);
        inventarioJson.put("piezasEnExhibicion", piezasEnExhibicion);
        inventarioJson.put("piezasPasadas", piezasPasadas);


        PrintWriter pw = new PrintWriter("inventario.json");
        pw.write(inventarioJson.toJSONString());
        pw.close();

    }

    public JSONObject guardarPieza(Pieza pieza){
        JSONObject piezaJson = new JSONObject();
        piezaJson.put("titulo", pieza.getTitulo());
        piezaJson.put("anioCreacion", pieza.getAnioCreacion());
        piezaJson.put("lugarCreacion", pieza.getLugarCreacion());
        piezaJson.put("fechaDevolucion", pieza.getFechaDevolucion());
        piezaJson.put("disponibleVentaValorFijo", pieza.isDisponibleVentaValorFijo());
        piezaJson.put("bloqueada", pieza.isBloqueada());
        piezaJson.put("precioFijo", pieza.getPrecioFijo());
        JSONArray autores = new JSONArray();
        for (Autor autor : pieza.getAutores()) {
            JSONObject autorJson = guardarAutor(autor);
            autores.add(autorJson);
        }
        piezaJson.put("tipoPieza", pieza.getTipoPieza());

        if (pieza.getTipoPieza().equals("Pintura")) {
            Pintura pintura = (Pintura) pieza;
            piezaJson.put("alto", pintura.getAlto());
            piezaJson.put("ancho", pintura.getAncho());
            piezaJson.put("tecnica", pintura.getTecnica());
        } else if (pieza.getTipoPieza().equals("Fotografia")) {
            Fotografia fotografia = (Fotografia) pieza;
            piezaJson.put("resolucion", fotografia.getResolucion());
            piezaJson.put("tamanio", fotografia.getTamanio());
        } else if (pieza.getTipoPieza().equals("Video")) {
            Video video = (Video) pieza;
            piezaJson.put("duracion", video.getDuracion());
            piezaJson.put("tamanio", video.getTamanio());
        }


        return piezaJson;
    }

    public JSONObject guardarAutor(Autor autor){
        JSONObject autorJson = new JSONObject();
        autorJson.put("nombre", autor.getNombre());
        autorJson.put("esAnonimo", autor.isEsAnonimo());

        return autorJson;
    }

    public cargarInventario(JSON)

}
