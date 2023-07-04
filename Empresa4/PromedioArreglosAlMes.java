import java.util.Scanner;

public class PromedioArreglosAlMes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        RegistroVentas registro = new RegistroVentas();

        int opcion = 0;

        while (opcion != 4) {
            System.out.println("----- MENU -----");
            System.out.println("1. Registrar arreglos");
            System.out.println("2. Registrar usuarios");
            System.out.println("3. Calcular promedio de arreglos");
            System.out.println("4. Salir");
            System.out.println("----------------");

            System.out.println("Seleccione una opción:");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Cuantos arreglos se hicieron al mes:");
                    a = scanner.nextDouble();
                    registro.registrarArreglos(a);
                    break;
                case 2:
                    System.out.println("Cuantos usuarios desea registrar:");
                    a = scanner.nextDouble();
                    registro.registrarUsuarios(a);
                    break;
                case 3:
                    System.out.println("Cuantos arreglos se hicieron al mes:");
                    a = scanner.nextDouble();
                    double prom = registro.calcularPromedioArreglos(a);
                    System.out.println("El promedio total de sus arreglos: " + prom);
                    break;
                case 4:
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