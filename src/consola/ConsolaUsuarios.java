package consola;

public class ConsolaUsuarios {

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

    public static void menuAdministradorGaleria() {
        System.out.println("\n--- Menú Administrador de Galería ---");
        System.out.println("1. Ver lista de usuarios");
        System.out.println("2. Agregar nuevo usuario");
        System.out.println("3. Ver registros de ventas");
        System.out.println("4. Ver estado de la galería");
        System.out.println("5. Salir");
        System.out.print("Seleccione una acción: ");
        // Agrega aquí la lógica para las opciones del menú del administrador de galería
    }

    public static void menuOperadorSubastas() {
        System.out.println("\n--- Menú Operador de Subastas ---");
        System.out.println("1. Crear nueva subasta");
        System.out.println("2. Ver subastas activas");
        System.out.println("3. Ver subastas pasadas");
        System.out.println("4. Ver estado de cuenta");
        System.out.println("5. Salir");
        System.out.print("Seleccione una acción: ");
        // Agrega aquí la lógica para las opciones del menú del operador de subastas
    }

    public static void menuCajero() {
        System.out.println("\n--- Menú Cajero ---");
        System.out.println("1. Registrar venta");
        System.out.println("2. Realizar cobros");
        System.out.println("3. Ver estado de cuenta");
        System.out.println("4. Ver registros de ventas");
        System.out.println("5. Salir");
        System.out.print("Seleccione una acción: ");
        // Agrega aquí la lógica para las opciones del menú del cajero
    }
}
