import java.util.Scanner;

public class PromedioArreglosAlMes {
    
    public static void main(String[] args) {
        double a, totalArreglos, arreglo, prom;
        int repeticiones;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantos arreglos se hicieron al mes:");
        a = scanner.nextDouble();
        
        totalArreglos = 0;

        for (int i = 1; i <= a; i++) {
            System.out.println("Ingrese el valor de arreglos:");
            arreglo = scanner.nextDouble();
            totalArreglos += arreglo;
        }

        prom = totalArreglos / a;

        System.out.println("El promedio total de sus arreglos: " + prom);

        System.out.println("Cuantas veces desea repetir el proceso?");
        repeticiones = scanner.nextInt();

        for (int j = 1; j <= repeticiones; j++) {
            totalArreglos = 0;

            for (int i = 1; i <= a; i++) {
                System.out.println("Ingrese el valor de arreglos:");
                arreglo = scanner.nextDouble();
                totalArreglos += arreglo;
            }

            prom = totalArreglos / a;
            System.out.println("El promedio total de sus arreglos: " + prom);
        }
    }
}
