public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de Cadenas ***");
        var nombre = "Alex Ríos";
        var edad = 23;
        var salario = 2100.90;

        // Strin.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f"
                , nombre, edad, salario);
        System.out.println(mensaje);

        // Metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n",
                nombre, edad, salario);

        var numeroEmpleado = 12;

        // Formateo con text block
        mensaje = """
                %nDetalle Persona:\s
                ------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """.formatted(nombre, numeroEmpleado, edad, salario);
        System.out.println(mensaje);

        // Formateo con text block directamente
        System.out.printf("""
                %nDetalle Persona:\s
                ------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d años
                \tSalario: $%.2f
                """, nombre, numeroEmpleado, edad, salario);

    }
}
