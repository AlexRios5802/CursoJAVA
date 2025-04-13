public class DetallesInteger {
    public static void main(String[] args) {
        int numero = 42;

        // Convertir a cadena
        String numeroStr = Integer.toString(numero);
        System.out.println("Número como cadena: " + numeroStr);

        // Valor máximo y mínimmo
        System.out.println("Valor máximo de int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de int: " + Integer.MIN_VALUE);

        // Parsear cadena a entero
        int parsedNumero = Integer.parseInt("123");
        System.out.println("Número parseado: " + parsedNumero);
    }
}
