import java.util.Scanner;
class RegistroVentas {
    private Scanner scanner = new Scanner(System.in);

    public void registrarArreglos(double a) {
        double totalArreglos = 0;

        for (int i = 1; i <= a; i++) {
            System.out.println("Ingrese el valor de arreglos:");
            double arreglo = scanner.nextDouble();
            totalArreglos += arreglo;
        }
    }

    public void registrarUsuarios(double a) {
        Usuario[] usuarios = new Usuario[(int) a];

        for (int i = 0; i < a; i++) {
            int cedula;
            String nombre, telefono;

            System.out.println("Ingrese la cédula del usuario:");
            cedula = scanner.nextInt();

            System.out.println("Ingrese el nombre del usuario:");
            nombre = scanner.next();

            System.out.println("Ingrese el teléfono del usuario:");
            telefono = scanner.next();

            Usuario usuario = new Usuario(cedula, nombre, telefono);
            usuarios[i] = usuario;
        }
    }

    public double calcularPromedioArreglos(double a) {
        double totalArreglos = 0;

        for (int i = 1; i <= a; i++) {
            System.out.println("Ingrese el valor de arreglos:");
            double arreglo = scanner.nextDouble();
            totalArreglos += arreglo;
        }

        return totalArreglos / a;
    }
}
