import java.util.Scanner;

public class PromedioArreglosAlMes {
    
    public static void main(String[] args) {
        double a, totalArreglos, arreglo, prom;

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

        Usuario[] usuarios = new Usuario[(int)a];

        for (int i = 0; i < a; i++) {
            Usuario usuario = new Usuario();

            System.out.println("Ingrese la cédula del usuario:");
            usuario.cedula = scanner.nextInt();

            System.out.println("Ingrese el nombre del usuario:");
            usuario.nombre = scanner.next();

            System.out.println("Ingrese el teléfono del usuario:");
            usuario.telefono = scanner.next();

            usuarios[i] = usuario;
        }
        
        System.out.println("El promedio total de sus arreglos: " + prom);
    }
}
