import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;

        while (!salir){
            System.out.printf("""
                    *** Calculadora ***
                    Operaciones que puedes realizar:
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    Escoje una opción:\s""");

            var opcion = consola.nextInt();

            // Si la opción es salir, terminamos antes de pedir operandos
            if (opcion == 5) {
                System.out.println("Saliendo del programa de la Calculadora!");
                salir = true;
                continue;
            }

            // Solo se piden los operandos si la opción es válida y no salir
            System.out.print("Dame el valor 1: ");
            var operando1 = consola.nextDouble();
            System.out.print("Dame el valor 2: ");
            var operando2 = consola.nextDouble();

            switch (opcion){
                case 1 -> {
                    var suma = operando1 + operando2;
                    System.out.printf("Resultado de la suma es: %.2f%n%n", suma);
                }
                case 2 -> {
                    var resta = operando1 - operando2;
                    System.out.printf("Resultado de la resta es: %.2f%n%n", resta);
                }
                case 3 -> {
                    var multiplicacion = operando1 * operando2;
                    System.out.printf("Resultado de la multiplicación es: %.2f%n%n", multiplicacion);
                }
                case 4 -> {
                    if (operando2 != 0){
                        var division = operando1 / operando2;
                        System.out.printf("Resultado de la división es: %.2f%n%n", division);
                    } else {
                        System.out.println("División inválida\n");
                    }
                }
                default -> System.out.println("Opción inválida, selecciona otra opción...");
            }
        }
    }
}
