import java.util.Scanner;
import java.util.StringJoiner;

public class CredencialesAlumnos {
    public static void main(String[] args) {
        // Crear una credencial con los datos proporcionados

        // Creación del método Scanner
        var consola = new Scanner(System.in);

        // Entrada del NOMBRE
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();

        // Entrada del APELLIDO PATERNO
        System.out.print("Ingresa tu apellido paterno: ");
        var apellidoPaterno = consola.nextLine();

        // Entrada del APELLIDO MATERNO
        System.out.print("Ingresa tu apellido materno: ");
        var apellidoMaterno = consola.nextLine();

        var nombreCompleto = String.join(" ", nombre, apellidoPaterno, apellidoMaterno);


        // Ingreso de la matrícula
        System.out.print("Ingresa tu matricula: ");
        var matricula = consola.nextInt();
        
        // Declaración del dominio fijo
        var dominioEscolar = "@uacam.mx";
        
        // Creación del correo institucional        
        // Tomar las iniciales del primer nombre y de los apellidos
        var nombre0 = nombre.charAt(0);
        var apellidoP0 = apellidoPaterno.charAt(0);
        var apellidoM0 = apellidoMaterno.charAt(0);

        // Juntar esas iniciales
        var iniciales = new StringBuilder();
        iniciales.append(nombre0);
        iniciales.append(apellidoP0);
        iniciales.append(apellidoM0);
        var unionInicales = iniciales.toString();
        // Pasar a minusculas para juntarlo con matrícula y dominio
        var inicialesMin = unionInicales.toLowerCase();

        // unión para la creación del correo institucional
        var unionCorreo = new StringBuilder();
        unionCorreo.append(inicialesMin);
        unionCorreo.append(matricula);
        unionCorreo.append(dominioEscolar);
        var correo = unionCorreo.toString();

        System.out.println("Alumno de la Universidad Autónoma de Campeche");
        System.out.println("Nombre del alumno: " + nombreCompleto);
        System.out.println("Con matrícula: " + matricula);
        System.out.print("Tu correo institucionale es: " + correo);
        

    }
}
