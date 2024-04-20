package consola;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import galeria.inventarioYpiezas.Autor;
import galeria.inventarioYpiezas.Escultura;
import galeria.inventarioYpiezas.Fotografia;
import galeria.inventarioYpiezas.Pieza;
import galeria.inventarioYpiezas.Pintura;

public class ConsolaUsuarios {
    
    //Setup para mostrar el funcionamiento de los reqs
    Autor autor1= new Autor("Leonardo da Vinci", false);
    List<Autor> autores1= new LinkedList<Autor>();
    Pintura pintura1=new Pintura("Mona Lisa", autores1, 1506, "Italia","20-10-2024", true, false, 77, 53, "Oleo");
    Fotografia foto1= new Fotografia("La niña y el buitre", autores1, 1993, "Sudán","20-10-2024", true, false, "10", "200");
    //Fotografia foto1= new Fotografia("La niña y el buitre", autores1, 1993, "Sudán", "20-10-2024", true, false, "10", "200")
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
        // Implementa el método registrarIngresoPieza
        System.out.println("Método registrarIngresoPieza no implementado.");
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
        // Implementa el método verificarComprador
        System.out.println("Método verificarComprador no implementado.");
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
        // Implementa el método verificarSeriedadOferta
        System.out.println("Método verificarSeriedadOferta no implementado.");
    }

    private static void bloquearPieza() {
        // Implementa el método bloquearPieza
        System.out.println("Método bloquearPieza no implementado.");
    }

    private static void desbloquearPieza() {
        // Implementa el método desbloquearPieza
        System.out.println("Método desbloquearPieza no implementado.");
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
