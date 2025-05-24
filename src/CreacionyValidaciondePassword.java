import java.util.Scanner;

public class CreacionyValidaciondePassword {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("*** Creación y Validación de Contraseña ***");

        var consola = new Scanner(System.in);
        var salir = false;

        while (!salir) {
            System.out.print("Ingresa tu password (6 caracteres): ");
            var password = consola.nextLine();

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
                salir = true; // Finaliza el ciclo

            } else {
                System.out.println("Deben ser solo 6 caracteres. Vuelve a escribir\n");
                // El bucle continuará y pedirá nuevamente la contraseña
            }
        }

        System.out.println("FIN");
    }
}
