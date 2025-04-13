import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        // Leer un tipo de int
        var consola = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextLine();
        System.out.println("Tu edad es de: " + edad);

        // Leer un tipo Double
        System.out.print("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("tu altura es: " + altura);

        // Consumimos caracteres de salto de línea
        consola.nextLine();

        // Leer un tipo String
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Tu nombre es: " + nombre);

        // Conversión de datos
        System.out.print("Proporciona un valor entero: ");
        // var enteroString = consola.nextLine();
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);

        // Converión - tipo flotante
        System.out.print("Proporciona un valor flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);

        // Conversión - Tipo Boolean
        System.out.print("Proporciona un valor booleano: ");
        var booleann = Boolean.parseBoolean(consola.nextLine());
        System.out.println("booleann = " + booleann);
    }
}
