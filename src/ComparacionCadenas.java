public class ComparacionCadenas {
    public static void main(String[] args) {
        // Comparación de Cadenas (pool de cadenas)
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");
        // Comparación de Cadenas (==) comparar si apuntan al mismo objeto, es decir, si comparan a la misma referencia
        System.out.print("cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2);
        // Comparamos cadena1 con cadena 3 (referencia)
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);

        // Comparar contenido usaremos el metodo equals
        System.out.print("cadena1 es igual en contenido a cadena2: ");
        System.out.println(cadena1.equals(cadena3));

    }
}
