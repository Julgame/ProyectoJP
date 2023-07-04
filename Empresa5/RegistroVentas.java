import java.util.Scanner;

class RegistroVentas {
    private static Scanner scanner = new Scanner(System.in);

    public static void registrarArreglos(double a) {
        double totalArreglos = 0;

        for (int i = 1; i <= a; i++) {
            System.out.println("Ingrese el valor de arreglos:");
            double arreglo = scanner.nextDouble();
            totalArreglos += arreglo;
        }
    }

    public static void registrarClienteBronce() {
        int cedula;
        String nombre, telefono, atributoAdicionalBronce;

        System.out.println("Ingrese la cédula del cliente:");
        cedula = scanner.nextInt();

        System.out.println("Ingrese el nombre del cliente:");
        nombre = scanner.next();

        System.out.println("Ingrese el teléfono del cliente:");
        telefono = scanner.next();

        System.out.println("Ingrese el atributo adicional para el cliente bronce:");
        atributoAdicionalBronce = scanner.next();

        ClienteBronce clienteBronce = new ClienteBronce(cedula, nombre, telefono, atributoAdicionalBronce);
    }

    public static void registrarClientePlata() {
        int cedula;
        String nombre, telefono, atributoAdicionalPlata;

        System.out.println("Ingrese la cédula del cliente:");
        cedula = scanner.nextInt();

        System.out.println("Ingrese el nombre del cliente:");
        nombre = scanner.next();

        System.out.println("Ingrese el teléfono del cliente:");
        telefono = scanner.next();

        System.out.println("Ingrese el atributo adicional para el cliente plata:");
        atributoAdicionalPlata = scanner.next();

        ClientePlata clientePlata = new ClientePlata(cedula, nombre, telefono, atributoAdicionalPlata);
    }

    public static void registrarClienteOro() {
        int cedula;
        String nombre, telefono, atributoAdicionalOro;

        System.out.println("Ingrese la cédula del cliente:");
        cedula = scanner.nextInt();

        System.out.println("Ingrese el nombre del cliente:");
        nombre = scanner.next();

        System.out.println("Ingrese el teléfono del cliente:");
        telefono = scanner.next();

        System.out.println("Ingrese el atributo adicional para el cliente oro:");
        atributoAdicionalOro = scanner.next();

        ClienteOro clienteOro = new ClienteOro(cedula, nombre, telefono, atributoAdicionalOro);
    }

    public static double calcularPromedioArreglos(double a) {
        double totalArreglos = 0;

        for (int i = 1; i <= a; i++) {
            System.out.println("Ingrese el valor de arreglos:");
            double arreglo = scanner.nextDouble();
            totalArreglos += arreglo;
        }

        return totalArreglos / a;
    }
}
