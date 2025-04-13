import java.util.Scanner;

public class FormateoEjercicio {
    public static void main(String[] args) {
        System.out.println("*** Solicitar datos de Empleado ***");
        
        // Ingresar los datos con Scanner
        var consola = new Scanner(System.in);
        
        // Ingresar nombre completo
        // Apellido Paterno
        System.out.print("Ingresa tu apellido paterno: ");
        var apellidoPaterno = consola.nextLine();
        // Apellido Materno
        System.out.print("Ingresa tu apellido materno: ");
        var apellidoMaterno = consola.nextLine();
        // Nombre
        System.out.print("Ingresa tu nombre(s): ");
        var nombre = consola.nextLine();
        
        // Juntar para Nombre Completo
        var nombreCompleto = String.join(" ", nombre, apellidoPaterno, apellidoMaterno);
        // Poner el nombre en Mayúsculas <----------------------------------------------------------
        var nombreCompletoMayusculas = nombreCompleto.toUpperCase();
        
        // Ingresar edad
        System.out.print("Ingresa tu edad: ");
        var edad = Integer.parseInt(consola.nextLine());

        // Salario de usuario
        System.out.print("Ingresar salario: ");
        var salario = Double.parseDouble(consola.nextLine());

        System.out.println("""
                \nSistemas de Empleados
                -=-=-=-=-=-=-=-=-=-=-=-=
                \tNombre:\t\t%s
                \tEdad:\t\t%d años
                \tSalario:\t$%.2f
                -=-=-=-=-=-=-=-=-=-=-=-=
                """.formatted(nombreCompletoMayusculas, edad, salario));

        System.out.printf("""
                \nSistemas de Empleados
                -=-=-=-=-=-=-=-=-=-=-=-=
                \tNombre:\t\t%s
                \tEdad:\t\t%d años
                \tSalario:\t$%.2f
                -=-=-=-=-=-=-=-=-=-=-=-=
                """.formatted(nombreCompletoMayusculas, edad, salario));


        // println imprime cada línea con un salto automático
        System.out.println("Usando println:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);

        System.out.println(); // línea vacía para separar

        // printf imprime todo seguido si no añades \n
        System.out.println("Usando printf:");
        System.out.printf("Nombre: %s Edad: %d Salario: $%.2f", nombre, edad, salario);
        System.out.println(); // para finalizar la línea después de printf
    }
}
