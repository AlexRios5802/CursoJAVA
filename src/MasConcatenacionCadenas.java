public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        // Más formas de concatenar cadenas en Java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 usando + : " + cadena3);

        // Metodo concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando concat = " + cadena3);

        // StringBuilder - Constructor de cadenas. Es más eficiente para concatenaciones repetitivas
        // me gusta más esta forma, ya que puedo tener un control visual de mis cadenas
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado = " + resultado);

        // StringBuffer
//        var stringBuffer = new StringBuffer();
//        stringBuffer.append(cadena1).append(" ").append(cadena2);
//        resultado = stringBuffer.toString();
//        System.out.println("resultado stringBuffer = " + stringBuffer);

        // Join
        resultado = String.join(" ", cadena1, "#", cadena2, "Adios");
        System.out.println("resultado join = " + resultado);

    }
}
