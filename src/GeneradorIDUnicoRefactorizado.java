import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnicoRefactorizado {
    public static void main(String[] args) {
        // Creación del ID único - Alex Ríos
        System.out.printf("""
                \n*** Generador de ID ***
                Ingrese sus datos para poder generar el ID
                ------------------------------------------
                """);

        // Funciones
        var consola = new Scanner(System.in);
        var random = new Random();

        // Ingresar Nombre
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        var nombreDos = nombre.substring(0, 2).toUpperCase(); // <--- Obtenemos> 2 Dígitos/Mayusculas

        // Ingresar Apellido
        System.out.print("Ingresa tu apellido paterno: ");
        var apellidoPaterno = consola.nextLine();
        var apellidoDos = apellidoPaterno.substring(0, 2).toUpperCase(); // <--- Obtenemos> 2 Dígitos/Mayusculas

        // Ingresar año de nacimiento
        System.out.print("Ingresa el año en el qué naciste: ");
        var anoNacimiento = Integer.parseInt(consola.nextLine());

        // Generador de número Random de 4 díguitos
        var generadoRandom = random.nextInt(9999)+1;
        var randomComplete = """
               %04d
                """.formatted(generadoRandom);

        // ID Generado
        var generadorID = new StringBuilder();
        generadorID.append(nombreDos);
        generadorID.append(apellidoDos);
        generadorID.append(anoNacimiento);
        generadorID.append(randomComplete);
        var ID = generadorID.toString();

        // Imprimir datos
        var datos = """
                *** Tus Datos ***
                \tNomre: %s
                \tApellido: %s
                \tAño de nacimento: %d
                -----------------------
                """.formatted(nombre, apellidoPaterno, anoNacimiento);

        System.out.printf(datos + """
                \nTu ID: """ + ID);
    }
}