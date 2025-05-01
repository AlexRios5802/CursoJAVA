import java.util.Scanner;

public class SistemaDeEnvios {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Envíos - ALEX RIOS ***");

        // Solicitamos los datos
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el destino del paquete (nacional/internacional): ");
        var destino = consola.nextLine();

        System.out.print("Ingresa el peso del paquete (en kg): ");
        var peso = Double.parseDouble(consola.nextLine());

        // Se puede optimizar más este código
        double costoPor = 0;
        switch (destino){
            case "nacional":
                costoPor = 10 * peso;
                break;
            case "internacional":
                costoPor = 20 * peso;
                break;
            default:
                System.out.println("lo que escribiste es incorrecto");
        }
        System.out.printf("El costo de envío del paquete es: %.2f%n ", costoPor);

        System.out.println("\n*** -=-=-=-=-= VERSION 2 =-=-=-=-=- ***");
        System.out.println("*** Sistema de Envíos - TUTORIAL CURSO ***");

        // Definimos las taridas de envío por kg
        final var TARIFA_NACIONAL       = 10.0;
        final var TARIFA_INTERNACIONAL  = 20.0;

        // Solicitamos los valores de destino y peso
        // var consola = new Scanner(System.in);

        System.out.print("Ingresa el destino del paquete (nacional/internacional): ");
        var destino2 = consola.nextLine().strip().toLowerCase();

        System.out.print("Ingresa el peso del paquete (en kg): ");
        var peso2 = Double.parseDouble(consola.nextLine());

        // Calculo del envío del paquete
        Double costoEnvio = switch (destino2){
            case "nacional"         -> peso2 * TARIFA_NACIONAL;
            case "internacional"    -> peso2 * TARIFA_INTERNACIONAL;
            default -> {
                System.out.println("Destino inválido. Ingresa nacional/internacional");
                yield null;
            }
        };

        // Mostramos el costo de envío
        if (costoEnvio != null)
            System.out.printf("El costo de envío de paquete es: $%.2f", costoEnvio);
    }
}
