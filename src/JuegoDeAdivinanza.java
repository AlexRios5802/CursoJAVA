import java.util.Random;
import java.util.Scanner;

public class JuegoDeAdivinanza {
    public static void main(String[] args) {

        // Uso general
        var consola = new Scanner(System.in);
        Random random = new Random();

        // Código para adivinar ilimitado
        var salir = false;

        // Imprimimos un valor aleatorio


        var aleatorio = random.nextInt(10) + 1;
        var intento = 1;

        while (!salir) {

            System.out.println("\nIntento número: " + intento);
            System.out.print("Ingresa un valor: ");
            var v1 = consola.nextInt();

            if (v1 > aleatorio) {
                System.out.println("Tu valor es incorrecto, debe ser más pequeño\n");
                intento++;
            } else if (v1 < aleatorio) {
                System.out.println("Tu valor es incorrecto, debe ser más grande\n");
                intento++;
            } else {
                System.out.println("Es correcto, adivinaste bien\n");
                salir = true;
            }
        }
        System.out.println("FIN DEL PROGRAMA. Lo lograste en " + intento + " intentos.");

    }
}