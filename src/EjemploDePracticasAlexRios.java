import java.util.Scanner;

public class EjemploDePracticasAlexRios {
    public static void main(String[] args) {
        // Uso del Scanner y sus diferentes formas
        var consola = new Scanner(System.in);

        // Ingresar Matrícula (int)
        System.out.print("Ingresa tu matrícula: ");
        var matricula = consola.nextInt();
        System.out.println("matricula = " + matricula);

        // Ingresar Edad (int)
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        // AQUÍ ESTÁ EL PROBLEMA, NO ME DEJA INGRESAR EL NOMBRE
        consola.nextLine();

        // Ingresar Nombre completo (String)
        System.out.print("Ingresa tu nombre completo: ");
        var nombre = consola.nextLine(); // ¡Aquí debería fallar!
        System.out.println("nombre = " + nombre);

        // Ingresar Universidad (String)
        System.out.print("Ingresa el nombre de tu universidad: ");
        var universidad = consola.nextLine();
        System.out.println("universidad = " + universidad);


    }
}
