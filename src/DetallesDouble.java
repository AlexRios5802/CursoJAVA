public class DetallesDouble {
    public static void main(String[] args) {
        double numero = 3.24259;

        // Convertir a cadena
        String numeroStr = Double.toString(numero);
        System.out.println("Número como cadena: " + numeroStr);

        // Valor máximo y mínimo
        System.out.println("Valor máximo de double: "  + Double.MAX_VALUE);
        System.out.println("Valor mínimo de double: "  + Double.MIN_VALUE);

        // Parsear cadena a double
        double parsedNumero = Double.parseDouble("2.71828");
        System.out.println("Número parseado: " + parsedNumero);

    }
}
