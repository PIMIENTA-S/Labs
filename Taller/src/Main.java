import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del usuario:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el ID del usuario:");
        long id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese su telefono:");
        int tel = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese su correo:");
        String email = scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento:");
        System.out.println("Dia:");
        short dia = (short) scanner.nextInt();
        System.out.println("Mes:");
        short mes = (short) scanner.nextInt();
        System.out.println("Año");
        short anio = (short) scanner.nextInt();
        Fecha fechaNacimiento = new Fecha(dia, mes, anio);
        scanner.nextLine();

        System.out.println("Ingrese la dirección del usuario");
        System.out.println("Calle:");
        String calle = scanner.next();
        System.out.println("Nomenclartura:");
        String nomenclatura = scanner.next();
        System.out.println("Barrio:");
        String barrio = scanner.next();
        System.out.println("Ciudad:");
        String ciudad = scanner.next();
        System.out.println("Edificio:");
        String edificio= scanner.next();
        System.out.println("Apto:");
        String apto = scanner.next();

        Direccion direccion = new Direccion(calle, nomenclatura, barrio, ciudad, edificio, apto);

        Usuario usuario = new Usuario(nombre, id);
        usuario.setTel(tel);
        usuario.setEmail(email);


        // Imprimir el resumen de datos del usuario
        System.out.println("Resumen de sus datos");
        System.out.println(usuario);
        System.out.println(fechaNacimiento);
        System.out.println(direccion);

        // Cerrar el scanner al final
        scanner.close();
    }
}