import java.util.Scanner;

public class PromedioArreglosAlMes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad;
        RegistroVentas registro = new RegistroVentas();

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("----- MENU -----");
            System.out.println("1. Registrar arreglos para Cliente Bronce");
            System.out.println("2. Registrar arreglos para Cliente Plata");
            System.out.println("3. Registrar arreglos para Cliente Oro");
            System.out.println("4. Calcular promedio de arreglos para todos los clientes");
            System.out.println("5. Salir");
            System.out.println("----------------");

            System.out.println("Seleccione una opción:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cuantos arreglos desea registrar para Cliente Bronce:");
                    cantidad = scanner.nextInt();
                    registro.registrarArreglos(cantidad);
                    break;
                case 2:
                    System.out.println("Cuantos arreglos desea registrar para Cliente Plata:");
                    cantidad = scanner.nextInt();
                    registro.registrarArreglos(cantidad);
                    break;
                case 3:
                    System.out.println("Cuantos arreglos desea registrar para Cliente Oro:");
                    cantidad = scanner.nextInt();
                    registro.registrarArreglos(cantidad);
                    break;
                case 4:
                    System.out.println("Cuantos arreglos desea calcular el promedio para todos los clientes:");
                    cantidad = scanner.nextInt();
                    double promedio = registro.calcularPromedioArreglos(cantidad);
                    System.out.println("El promedio total de los arreglos de todos los clientes es: " + promedio);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
            System.out.println();
        }
    }
}

