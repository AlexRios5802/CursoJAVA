import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        // Programa de Sistema de Empleados
        System.out.println("*** Sistema de Empleados ***");

        var consola = new Scanner(System.in);

        // Ingresar nombreCompleto <---
        System.out.print("Nombre del empleado: ");
        var nombreCompleto = consola.nextLine();

        // Ingresar edad <---
        System.out.print("Edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        // Ingresar salario <---
        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        // Ingresar si es jefe de departamento <---
        System.out.print("¿Es jefe de departamento?: ");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        // Imprimir los valores del Empleado
        System.out.println("\nDatos del Empleado");
        System.out.println("\tNombre: " + nombreCompleto);
        System.out.println("\tEdad: " + edadEmpleado + " años");
        // System.out.println("\tSalario: " + salarioEmpleado + " pesos mensuales");
        System.out.printf("\tSalario: $%.2f%n", salarioEmpleado);
        System.out.println("\tEs jefe de Departamento?: " + esJefeDepartamento);
    }
}
