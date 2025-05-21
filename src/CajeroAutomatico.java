import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("*** Aplicación de Cajero Automático ***");

        var consola = new Scanner(System.in);
        var salir = false;

        var SALDO = 1000.00;

        while (!salir){
            System.out.print("""
                    \nOperaciones que puedes realizar:
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opción:\s""");
            var opcion = consola.nextInt();
            switch (opcion){
                case 1 -> {
                    // EL SALDO ENTRA Y SE GUARDA EN UN NUEVA VARIABLE DENTRO DEL WHILE

                    System.out.println("\nConsultando saldo...");
                    Thread.sleep(260);
                    System.out.printf("Tu saldo actual es: $%.2f%n", SALDO);
                    Thread.sleep(1000);
                }
                case 2 -> {
                    System.out.println("Ventana para retirar...");
                    Thread.sleep(260);
                    System.out.print("Ingresa tu mondo a retirar: ");
                    var retirar = consola.nextDouble();
                    if (retirar > SALDO){
                        Thread.sleep(260);
                        System.out.println("Saldo insuficiente...");
                    } else {
                        SALDO -= retirar;
                        Thread.sleep(260);
                        System.out.println("Estás retirando: $" + retirar);
                        Thread.sleep(260);
                        System.out.println("Tu nuevo saldo es de: $" + SALDO);
                        Thread.sleep(1000);
                    }
                }
                case 3 -> {
                    System.out.println("Ventana para depositar...");
                    Thread.sleep(260);
                    System.out.print("Ingresa tu mondo a depositar: ");
                    Thread.sleep(260);
                    var depositar = consola.nextDouble();
                    SALDO += depositar;
                    System.out.println("Estás depositando: $" + depositar);
                    Thread.sleep(260);
                    System.out.println("Tu nuevo saldo es de: $" + SALDO);
                    Thread.sleep(1000);
                }
                case 4 -> {
                    Thread.sleep(260);
                    System.out.println("Saliendo...\n");
                    salir = true;
                    Thread.sleep(1500);
                }
                default -> System.out.println("Valor no válido...");
            }
        }
        System.out.println("Fin del programa");
    }
}
