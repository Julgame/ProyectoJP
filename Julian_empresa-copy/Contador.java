import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        int a;
        double totalArreglos = 0;
        double arreglo;
        double prom;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite cuántos arreglos al mes:");
        a = scanner.nextInt();

        for (int i = 1; i <= a; i++) {
            System.out.println("Ingrese el valor del arreglo " + i + ":");
            arreglo = scanner.nextDouble();
            totalArreglos += arreglo;
        }

        prom = totalArreglos / a;

        System.out.println("El promedio total de arreglos del mes: " + prom);
    }
}


