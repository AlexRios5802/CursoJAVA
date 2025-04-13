public class UnicodeExample {
    public static void main(String[] args) {
        // Carácter Unicode para la letra 'A'
        char letra = 'A';
        System.out.println("Carácter: " + letra);
        System.out.println("Código Unicode: " + (int) letra);

        //Carácter Unicode para el símbolo del euro (€)
        char simboloEuro = '\u20AC';
        System.out.println("Carácter: " + simboloEuro);
        System.out.println("Código Unicode: " + (int) simboloEuro);

        // Carácter Unicode para un carácter chino (中)}
        char caracterChino = '\u4E2D';
        System.out.println("Carácter: " + caracterChino);
        System.out.println("Código Unicode: " + (int) caracterChino);
    }
}
