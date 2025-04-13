import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnicoCurso {
    public static void main(String[] args) {
        // Creación del ID - tutorial
        System.out.println("*** Sistema Generador de ID Único ***");
        var consola = new Scanner(System.in);
        var aleatorio = new Random();

        // Solicitamos nombre de usuario
        System.out.print("Cual es tu nombre? ");
        var nombre = consola.nextLine();

        // Solicitamos el apellido
        System.out.print("Cual es tu apellido? ");
        var apellido = consola.nextLine();

        // Solicitamos el año de nacimiento
        System.out.print("Cual es tu año de nacimiento? (YYYY)");
        var anioNacimiento = consola.nextLine();

        // Normalizar los valores
        var nombre2 = nombre.trim().toUpperCase().substring(0, 2);
        var apellido2 = apellido.trim().toUpperCase().substring(0, 2);
        var anioNacimiento2 = anioNacimiento.trim().substring(2);

        // Generar el valor aleatorio
        var numeroAleatorio = aleatorio.nextInt(9999) + 1;

        // Formato de 4 dígitos
        var numeroAleatorioFormato = String.format("%d", numeroAleatorio);

        // Generar el ID Único
        var idunico = nombre2 + apellido2 + anioNacimiento2 + numeroAleatorioFormato;

        // Imprimir el ID único
        System.out.printf("""
                %nHola %s
                \tTu nuevo número de identificación (ID) generado por el sistema es: 
                \t%s
                \t¡Felicidades!
                """, nombre, idunico);
    }
}
