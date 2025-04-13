import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Recetas de Cocina ***");

        var consola = new Scanner(System.in);

        // Ingresar nombre de la receta
        System.out.print("Ingresa el nombre de la receta: ");
        var nombreReceta = consola.nextLine();

        // Ingresar ingredientes principales
        System.out.print("Ingresa los ingredientes: ");
        var ingredientesPrincipales = consola.nextLine();

        // Ingresar tiempo de praparación
        System.out.print("Tiempo de preparación (min): ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        // Ingresar dificultad
        System.out.print("Dificultad: ");
        var dificultad = consola.nextLine();

        // Imprimir los valores
        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("\tNombre receta: " + nombreReceta);
        System.out.println("\tIngredientes: " + ingredientesPrincipales);
        System.out.println("\tTiempo de preparación: " + tiempoPreparacion + " minutos");
        System.out.println("\tDificultad: " + dificultad);


    }
}
