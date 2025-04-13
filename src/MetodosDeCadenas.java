public class MetodosDeCadenas {
    public static void main(String[] args) {
        // Metodos de cadenas
        var cadena1 = "Hola Mundo";

        // Obtener el largo de una cadena
        // var longitud = cadena1.length();
        // System.out.println("longitud = " + longitud);
        System.out.println("Obtener el largo de una cadena: " + cadena1.length());

        // Remplazar caracteres
        //var nuevaCadena = cadena1.replace('o', 'a');
        //System.out.println("nuevaCadena = " + nuevaCadena);
        System.out.println("Remplazar caracteres: " + cadena1.replace('o', 'a'));

        // Convertir a mayusculas - por completo
        // var mayusculas = cadena1.toUpperCase();
        // System.out.println("mayusculas = " + mayusculas);
        System.out.println("Mayusculas " + cadena1.toUpperCase());

        // Convertir a minusculas - por completo
        // System.out.println("minusculas: " + cadena1.toLowerCase());
        var minusculas = cadena1.toLowerCase();
        System.out.println("minusculas = " + minusculas);

        // Eliminar espacios al inicio y al final de una cadena
        var cadena2 = " Alex Rios     ";
        System.out.println("cadena2 con espacios: " + cadena2);
        System.out.println("cadena2 sin todos los espacios: " + cadena2.replaceAll("\\s", "")); // Quita todos los espacios de la cadena
        System.out.println("cadena2 sin espacios: " + cadena2.trim());

    }
}
