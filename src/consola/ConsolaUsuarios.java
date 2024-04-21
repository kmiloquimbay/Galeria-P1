package consola;

import java.util.Scanner;

import galeria.Galeria;
import galeria.compraYsubasta.Oferta;
import galeria.compraYsubasta.Subasta;
import galeria.inventarioYpiezas.Autor;
import galeria.inventarioYpiezas.Fotografia;
import galeria.inventarioYpiezas.Inventario;
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
    public static Subasta subasta= new Subasta("6748899",39034,28904,video1);

    
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
        subasta.agregarOferta(oferta1);
        subasta.agregarOferta(oferta2);
        
    }


    
    // COMPRADOR
    public static void menuComprador() {
        System.out.println("\n--- Menú Comprador ---");
        System.out.println("1. Ver catálogo de obras");
        System.out.println("2. Participar en subasta");
        System.out.println("3. Ver mis compras");
        System.out.println("4. Ver estado de cuenta");
        System.out.println("5. Salir");
        System.out.print("Seleccione una acción: ");
        // Agrega aquí la lógica para las opciones del menú del comprador
    }


    // PROPIETARIO
    public static void menuPropietario() {
        System.out.println("\n--- Menú Propietario ---");
        System.out.println("1. Ver obras en mi galería");
        System.out.println("2. Agregar nueva obra");
        System.out.println("3. Ver ventas");
        System.out.println("4. Ver estado de cuenta");
        System.out.println("5. Salir");
        System.out.print("Seleccione una acción: ");
        // Agrega aquí la lógica para las opciones del menú del propietario
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
            System.out.println("6. Verificar usuario");
            System.out.println("7. Verificar seriedad de oferta");
            System.out.println("8. Bloquear pieza");
            System.out.println("9. Desbloquear pieza");
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
                    verificarUsuario();
                    break;
                case 7:
                    verificarSeriedadOferta();
                    break;
                case 8:
                    bloquearPieza();
                    break;
                case 9:
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
        // Implementa el método confirmarVenta
        System.out.println("Método confirmarVenta no implementado.");
    }

    private static void devolucionPieza() {
        // Implementa el método devolucionPieza
        System.out.println("Método devolucionPieza no implementado.");
    }

    private static void verificarComprador() {
        setUp();
        
        System.out.println("El resultado de la verificación de la existencia del comprador con id 547293 fue: ");
        System.out.println(admin.verificarComprador("547293"));
        
    }

    private static void aumentarLimite() {
        // Implementa el método aumentarLimite
        System.out.println("Método aumentarLimite no implementado.");
    }

    private static void verificarUsuario() {
        // Implementa el método verificarUsuario
        System.out.println("Método verificarUsuario no implementado.");
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
        // Implementa el método terminarSubasta
        System.out.println("Método terminarSubasta no implementado.");
    }

    private static void recibirRegistrarOferta() {
        // Implementa el método recibirRegistrarOferta
        System.out.println("Método recibirRegistrarOferta no implementado.");
    }

    private static void evaluarOferta() {
        // Implementa el método evaluarOferta
        System.out.println("Método evaluarOferta no implementado.");
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
