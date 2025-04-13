import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args) {
        // Creación del ID único - Alex Ríos
        // Título del programa
        System.out.printf("""
                *** Generador de ID ***
                Ingrese sus datos para poder generar el ID
                ------------------------------------------
                """);

        // Función para usar el Scanner
        var consola = new Scanner(System.in);

        // Ingresar nombre
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        // Obtenermos sus primero dos valores
        var nombreDos = nombre.substring(0, 2);
        // Pasamos los valores a mayúsculas
        var nombreMayus = nombreDos.toUpperCase();

        // Ingresar nombre
        System.out.print("Ingresa tu apellido paterno: ");
        var apellidoPaterno = consola.nextLine();
        var apellidoDos = apellidoPaterno.substring(0, 2);
        // Pasamos los valores a mayúsculas
        var apellidoMayus = apellidoDos.toUpperCase();

        // Ingresar año de nacimiento
        System.out.print("Ingresa el año en el qué naciste: ");
        var anoNacimiento = Integer.parseInt(consola.nextLine());

        // Generador de número Random de 4 díguitos
        var random = new Random();
        var generadoRandom = random.nextInt(9999)+1;
        var randomComplete = """
               %04d
                """.formatted(generadoRandom);

        // ID Generado
        var generadorID = new StringBuilder();
        generadorID.append(nombreMayus);
        generadorID.append(apellidoMayus);
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