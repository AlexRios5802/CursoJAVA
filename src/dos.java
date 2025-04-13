public class dos {
    public static void main(String[] args) {
        int edad = 23;
        System.out.println("edad = " + edad);
        var nombre = "Alex Ríos";
        System.out.println("nombre = " + nombre);

        var cadena1 = "Hola";
        var cadena2 = new String("Mundo");
        var cadena3 = cadena1 + " " + cadena2;
        var cadena4 = """
                Este es 
                un texto 
                multilineada
                """;
        System.out.println("cadena4 = " + cadena1);
        System.out.println("cadena4 = " + cadena2);
        System.out.println("cadena4 = " + cadena3);
        System.out.println("cadena4 = " + cadena4);

    }
}
