public class PalabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("*** break y continue ***");

        System.out.println("PALABRA break");
        // Ejemplo break, imprimir solo el primer numero par
        for (var numero = 1; numero < 10; numero++){
            if (numero % 2 == 0){
                System.out.print(numero + " ");
                break;
            }
        }

        // Ejemplo con continue. Imprimir solo numeros pares, ignora impares
        System.out.println("\nPALABRA continue: ");
        for (var numero = 1; numero < 10; numero++){
            if (numero % 2 == 1){ // numero impar
                continue; // Saltamos a la siguiente iteración
            }
            System.out.print(numero + " "); // Numero pares
        }

    }
}
