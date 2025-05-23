import java.util.Scanner;

public class CreacionyValidaciondePassword {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("*** Creación y Validación de Contraseña ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingresa tu password: ");
        var password = consola.nextLine();

        var salir = false;

        while (!salir) {
            if (password.length() == 6) {
                System.out.println("Guardando...\n");
                Thread.sleep(1000);
                System.out.print("""
                        -=-=-=-=-= Validación de contraseña =-=-=-=-=-
                        Ingresar contraseña:\s""");
                var password2 = consola.nextLine();

                if (password.equals(password2)) {
                    System.out.println("Contraseña correcta. Bienvenido");
                } else {
                    System.out.println("Contraseña incorrecta");
                }
                System.out.println("Fin del programa");

            } else {
                System.out.println("Deben ser solo 6 caracteres. Vuelve a escribir");

            }

        }
        System.out.println("FIN");


    }
}
