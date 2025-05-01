import java.util.Scanner;

public class SistemaDeAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación - Alex Ríos ***");

        // ESPECIFICAMOS LOS VALORES FIJOS
        final var USUARIO = "admin";
        final var PASSWORD = 123;
        // final var PASSWORD = "123";  <------

        // Pedimos los valores
        var consola = new Scanner(System.in);

        // USUARIO
        System.out.print("Ingresa tu usuario: ");
        var usuario = consola.nextLine();

        // PASSWORD
        System.out.print("Ingresa tu password: ");
        var password = Integer.parseInt(consola.nextLine());
        // var password = consola.nextLine(); <-------

        // EVALUAMOS LOS VALORES DE ENTRADA
     // if (usuario.equals(USUARIO) && password.equals(PASSWORD)) <------
        if (usuario.equals(USUARIO) && password == (PASSWORD))
            System.out.println("Bienvenido al sistema");
        else if (!usuario.equals(USUARIO) && password == PASSWORD)
            System.out.println("Usuario incorrecto, favor de corregirlo");
        else if (usuario.equals(USUARIO) && password != PASSWORD)
            System.out.println("Password incorrecto, favor de corregirlo");
        else
            System.out.println("Usuario y contraseña incorrectos, favor de corregirlos");




        System.out.println("\n*** Sistema de Autenticación - Tutorial Curso ***");
        final var USUARIO_VALIDO = "admin";
        final var PASSWORD_VALIDO = "123";

        System.out.print("Ingresa tu usuario: ");
        var usuario2 = consola.nextLine().strip();

        System.out.print("Ingresa tu password: ");
        var password2 = consola.nextLine().strip();

        // Cada caso de validación de usuario y password
        var mensajeAutenticacion = switch (usuario2){
            case USUARIO_VALIDO ->  {
                if (PASSWORD_VALIDO.equals(password2))
                    yield "Bienvenido al Sistema";
                else
                    yield "Password incorrecto, favor de corregirlo";
            }
            default -> {
                if (PASSWORD_VALIDO.equals(password2))
                    yield "Usuario incorrecto, favor de corregirlo!";
                else
                    yield "Usuario y password incorrectos, favor de corregirlos!";
            }
        };
        // Imprimir mensaje
        System.out.println(mensajeAutenticacion);
    }
}

