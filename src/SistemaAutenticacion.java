import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");

        // Declarar usuario y contraseña
        final var user = "admin";
        final var password = 123;

        // Solicitar datos
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el nombre de usuario: ");
        var userLogin = consola.nextLine();

        System.out.print("Ingresa tu contraseña: ");
        var passwordLogin = Integer.parseInt(consola.nextLine());

        // Comparar respuestas
        var filtro = userLogin.equals(user) && passwordLogin == password;
        System.out.println("Datos son correctos: " + filtro);
    }
}
