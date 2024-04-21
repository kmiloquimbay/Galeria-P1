package consola;

import java.util.List;
import java.util.Scanner;

import galeria.Galeria;
import galeria.compraYsubasta.Compra;
import galeria.compraYsubasta.Oferta;
import galeria.compraYsubasta.Subasta;
import galeria.inventarioYpiezas.Autor;
import galeria.inventarioYpiezas.Fotografia;
import galeria.inventarioYpiezas.Inventario;
import galeria.inventarioYpiezas.Pieza;
import galeria.inventarioYpiezas.Pintura;
import galeria.inventarioYpiezas.Video;
import usuarios.AdministradorGaleria;
import usuarios.Cajero;
import usuarios.Comprador;
import usuarios.ControladorUsuarios;
import usuarios.OperadorSubasta;
import usuarios.Propietario;

public class ConsolaUsuarios {
    
    //Setup para mostrar el funcionamiento de los reqs
    //Galeria
    public static Autor autor1= new Autor("Leonardo da Vinci", false);
    public static Fotografia foto1= new Fotografia("La niña y el buitre", 1993, "Sudán","20-03-2024", true, false, "10", "200");
    public static Video video1= new Video("La Vie", 1983, "Francia","14-11-2024", true, false, "40", "200");
    public static Pintura pintura1=new Pintura("La Flor", 1964, "Italia","20-12-2025", true, true, 77, 53, "Oleo");
    public static Inventario inventario1= new Inventario();
    public static ControladorUsuarios controlador= new ControladorUsuarios();
    public static Galeria galeriaConsola = new Galeria(inventario1,controlador);
    public static Pintura pinturaAgregar=new Pintura("Mona Lisa", 1506, "Italia","20-10-2024", true, false, 77, 53, "Oleo");
    //Usuarios
    public static Comprador comprador= new Comprador("LuisP", "12345", "Luis","3456289290", 1000000,galeriaConsola.getInventario().getPiezasDisponibleVenta(), "547293");
    public static Propietario propietario= new Propietario("santiH", "63248", "Santiago", "456783672","547902");
    public static AdministradorGaleria admin= new AdministradorGaleria("fabio24", "1226745", "Admin",galeriaConsola, "562901");
    public static Cajero cajero= new  Cajero("juanito2", "762598", "Cajero",galeriaConsola, "4439035");
    public static OperadorSubasta operador= new OperadorSubasta("andresP", "12235345", "Operador",galeriaConsola, "653907");

    //Subastas y Compras
    public static Oferta oferta1= new Oferta(20000, comprador);
    public static Oferta oferta2= new Oferta(40000, comprador);
    public static Oferta ofertaRecibir= new Oferta(25000, comprador);
    public static Subasta subasta1= new Subasta("6748899",39034,15000,video1);
    public static Compra compra1= new Compra("567890", 20000, "tarjeta", foto1);
    public static Compra compra2= new Compra("587650", 70000, "tarjeta", pinturaAgregar);

    
    public static void setUp(){
        galeriaConsola.getInventario().guardarEnBodega(foto1);
        galeriaConsola.getInventario().guardarEnBodega(video1);
        galeriaConsola.getInventario().guardarEnBodega(pintura1);
        galeriaConsola.getInventario().ponerEnDisponibles(foto1);
        galeriaConsola.getInventario().ponerEnDisponibles(video1);
        galeriaConsola.getInventario().ponerEnDisponibles(pintura1);
        galeriaConsola.getControladorUsuarios().agregarComprador(comprador);
        galeriaConsola.getControladorUsuarios().agregarPropietario(propietario);
        galeriaConsola.getControladorUsuarios().agregarEmpleado(admin);
        galeriaConsola.getControladorUsuarios().agregarEmpleado(cajero);
        galeriaConsola.getControladorUsuarios().agregarEmpleado(operador);
        subasta1.agregarOferta(oferta1);
        subasta1.agregarOferta(oferta2);
        galeriaConsola.agregarSubasta(subasta1);
        propietario.agregarPieza(foto1);
        propietario.agregarPieza(video1);
        propietario.agregarPieza(pintura1);
        propietario.pasarAPasadas(pintura1);
        galeriaConsola.agregarCompra(compra1);
        galeriaConsola.agregarCompra(compra2);
        comprador.agregarCompra(compra1);
        comprador.agregarCompra(compra2);
    }


    
    // COMPRADOR
    public static void menuComprador() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Comprador ---");
            System.out.println("1. Ver historial de compras");
            System.out.println("2. Realizar compra fija");
            System.out.println("3. Salir");
            System.out.print("Seleccione una acción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    verHistorialCompras();
                    break;
                case 2:
                    realizarCompraFija();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }

    private static void verHistorialCompras() {
        setUp();
        List<Compra> misCompras=comprador.getmisCompras();
        System.out.println("Tus compras son:");
        System.out.println(misCompras.size());
        for (Compra compra : misCompras) {
            
            System.out.println("Pieza:"+ compra.getPieza().getTitulo()+ " Valor Pagado: "+ compra.getValorPagado()); 
        }
            
    }

    public static void realizarCompraFija() {
        setUp();
        // Implementa el método para realizar una compra fija
        System.out.println("Método realizarCompraFija no implementado.");
        
    }


    // PROPIETARIO
    public static void menuPropietario() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Propietario ---");
            System.out.println("1. Ver mis piezas actuales");
            System.out.println("2. Ver mis piezas pasadas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una acción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    verMisPiezasActuales();
                    break;
                case 2:
                    verMisPiezasPasadas();
                    break;
                // Agrega aquí la lógica para las opciones restantes del menú del propietario
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 3);

        scanner.close();
    }

    private static void verMisPiezasActuales() {
        setUp();
        List<Pieza> piezasActuales=propietario.getMisPiezasActuales();
        System.out.println("Tus piezas actuales son:");
        for (Pieza pieza : piezasActuales) {
            System.out.println(pieza.getTitulo()); 
        }
            
        }


    private static void verMisPiezasPasadas()  {
        setUp();
        List<Pieza> piezasPasadas=propietario.getMisPiezasPasadas();
        System.out.println("Tus piezas pasadas son:");
        for (Pieza pieza : piezasPasadas) {
            System.out.println(pieza.getTitulo()); 
        }
            
        }


    // ADMINISTRADOR DE GALERIA
    public static void menuAdministradorGaleria() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Administrador de Galería ---");
            System.out.println("1. Registrar ingreso de pieza");
            System.out.println("2. Confirmar venta");
            System.out.println("3. Devolución de pieza");
            System.out.println("4. Verificar comprador");
            System.out.println("5. Aumentar límite de crédito");
            System.out.println("6. Verificar seriedad de oferta");
            System.out.println("7. Bloquear pieza");
            System.out.println("8. Desbloquear pieza");
            System.out.println("0. Volver al Menú Principal");
            System.out.print("Seleccione una acción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarIngresoPieza();
                    break;
                case 2:
                    confirmarVenta();
                    break;
                case 3:
                    devolucionPieza();
                    break;
                case 4:
                    verificarComprador();
                    break;
                case 5:
                    aumentarLimite();
                    break;
                case 6:
                    verificarSeriedadOferta();
                    break;
                case 7:
                    bloquearPieza();
                    break;
                case 8:
                    desbloquearPieza();
                    break;
                case 0:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void registrarIngresoPieza() {
        setUp();
        galeriaConsola.getInventario().guardarEnBodega(pinturaAgregar);
        System.out.println("Se agrego la pieza con la siguiente info a la bodega de la galeria:");
        System.out.println("Título: "+pinturaAgregar.getTitulo());
        System.out.println("Año Creación: "+pinturaAgregar.getAnioCreacion());
        System.out.println("Lugar Creación: "+pinturaAgregar.getLugarCreacion());
        
    }

    private static void confirmarVenta() {
        setUp();
        admin.confirmarVenta(compra1,foto1,"547293");
        System.out.println("Se confirmo la venta de la pieza "+foto1.getTitulo()+" por un precio de "+compra1.getValorPagado());
    }

    private static void devolucionPieza() {
        setUp();
        System.out.println("El propietario tienae"+ propietario.getMisPiezasActuales().size()+" piezas.");
        admin.devolucionPieza(video1,"547902");
        List<Pieza> piezasActuales=propietario.getMisPiezasActuales();
        System.out.println("Se elimino la pieza: "+video1.getTitulo()+ " y al propietario le quedaron:"+ piezasActuales.size()+" piezas.");
        
            
        }
    

    private static void verificarComprador() {
        setUp();
        
        System.out.println("El resultado de la verificación de la existencia del comprador con id 547293 fue: ");
        System.out.println(admin.verificarComprador("547293"));
        
    }

    private static void aumentarLimite() {
        setUp();
        admin.aumentarLimite("547293", 200000);
        System.out.println("El nuevo limite del comprador 547293 es: "+comprador.getLimiteCompras());
        
    }



    private static void verificarSeriedadOferta() {
        setUp();
        
        System.out.println(admin.verificarSeriedadOferta("547293", 20000));
    }

    private static void bloquearPieza() {
        setUp();
        galeriaConsola.getInventario().bloquearPieza("La niña y el buitre");;
        System.out.println("Se bloqueo la pieza con el siguiente título:");
        System.out.println("Título: "+foto1.getTitulo());
        System.out.println("Esta bloqueada: "+foto1.isBloqueada());
        
    }

    private static void desbloquearPieza() {
        setUp();
        galeriaConsola.getInventario().desbloquearPieza("La Flor");
        System.out.println("Se desbloqueo la pieza con el siguiente título:");
        System.out.println("Título: "+pintura1.getTitulo());
        System.out.println("Esta bloqueada: "+pintura1.isBloqueada());
    }




    // OPERADOR DE SUBASTAS
    public static void menuOperadorSubastas() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Operador de Subastas ---");
            System.out.println("1. Terminar subasta");
            System.out.println("2. Recibir y registrar oferta");
            System.out.println("3. Evaluar oferta");
            System.out.println("0. Volver al Menú Principal");
            System.out.print("Seleccione una acción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    terminarSubasta();
                    break;
                case 2:
                    recibirRegistrarOferta();
                    break;
                case 3:
                    evaluarOferta();
                    break;
                case 0:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void terminarSubasta() {
        setUp();
        String respuesta=operador.terminarSubasta("6748899");
        System.out.println(respuesta);
        
    }

    private static void recibirRegistrarOferta() {
        setUp();
        
        String respuesta=operador.recibirRegistrarOferta(ofertaRecibir,"6748899");
        System.out.println(respuesta);
    }

    private static void evaluarOferta() {
        setUp();
        if (operador.evaluarOferta(ofertaRecibir,"6748899")==true){
            System.out.println("La oferta es correcta pues supera el valor inicial de la subasta");
        }
        else{
            System.out.println("La oferta no es correcta pues no supera el valor inicial de la subasta");
        }
    }



    // CAJERO
    public static void menuCajero() {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú Cajero ---");
            System.out.println("1. Registrar pago");
            System.out.println("2. Entregar pieza");
            System.out.println("0. Volver al Menú Principal");
            System.out.print("Seleccione una acción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarPago();
                    break;
                case 2:
                    entregarPieza();
                    break;
                case 0:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }

    private static void registrarPago() {
        // Implementa el método registrarPago
        System.out.println("Método registrarPago no implementado.");
    }

    private static void entregarPieza() {
        // Implementa el método entregarPieza
        System.out.println("Método entregarPieza no implementado.");
    }
}
