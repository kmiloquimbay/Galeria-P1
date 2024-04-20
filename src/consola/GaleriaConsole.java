package consola;

    import java.util.Scanner;

public class GaleriaConsole {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionMenuPrincipal;

        // Bienvenida
        System.out.println("Bienvenido a la Galería y Casa de Subastas");

        do {
            // Menú principal
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Cargar Galería");
            System.out.println("2. Salvar Galería");
            System.out.println("3. Ingresar como Usuario");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcionMenuPrincipal = scanner.nextInt();

            switch (opcionMenuPrincipal) {
                case 1:
                    // Lógica para cargar la galería
                    System.out.println("Opción no implementada aún.");
                    break;
                case 2:
                    // Lógica para salvar la galería
                    System.out.println("Opción no implementada aún.");
                    break;
                case 3:
                    ingresarComoUsuario(scanner);
                    break;
                case 0:
                    System.out.println("Gracias por utilizar la Galería y Casa de Subastas. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcionMenuPrincipal != 0);

        scanner.close();
    }

    private static void ingresarComoUsuario(Scanner scanner) {
        int opcionIngresarUsuario;

        System.out.println("\n--- ¿Cómo que tipo de usuario desea ingresar? ---");
        System.out.println("1. Comprador");
        System.out.println("2. Propietario");
        System.out.println("3. Administrador de Galería");
        System.out.println("4. Operador de Subastas");
        System.out.println("5. Cajero");
        System.out.println("0. Volver al Menú Principal");
        System.out.print("Seleccione cómo desea ingresar: ");
        opcionIngresarUsuario = scanner.nextInt();

        switch (opcionIngresarUsuario) {
            case 1:
                System.out.println("Ingresando como Comprador...");
                // Lógica para ingresar como comprador
                break;
            case 2:
                System.out.println("Ingresando como Propietario...");
                // Lógica para ingresar como propietario
                break;
            case 3:
                System.out.println("Ingresando como Administrador de Galería...");
                // Lógica para ingresar como administrador de galería
                break;
            case 4:
                System.out.println("Ingresando como Operador de Subastas...");
                // Lógica para ingresar como operador de subastas
                break;
            case 5:
                System.out.println("Ingresando como Cajero...");
                // Lógica para ingresar como cajero
                break;
            case 0:
                System.out.println("Volviendo al Menú Principal...");
                break;
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }
    }
}


