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
                    4. Division
                    5. Salir
                    Escoje una opción:\s""");
            var opcion = consola.nextInt();

            System.out.print("Dame el valor 1: ");
            var operando1 = consola.nextDouble();

            System.out.print("Dame el valor 2:" );
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
                    var division = operando1 / operando2;
                    System.out.printf("Resultado de la division es: %.2f%n%n", division);

                }
                case 5 -> {
                    System.out.println("Saliendo del programa de la Calculadora!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida, selecciona otra opción...");
            }
        }

    }
}
