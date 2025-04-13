public class DetalleCharacter {
    public static void main(String[] args) {
        char letra = 'a';

        // Converir a mayúscula
        char mayuscula = Character.toUpperCase(letra);
        System.out.println("Letra en mayúscula " + mayuscula);

        // Verificar si es una letra
        System.out.println("Es una letra: " + Character.isLetter(letra));

        // Verificar si es un digito
        char digito = '1';
        System.out.println("Es un digito: " + Character.isDigit(digito));
    }
}
