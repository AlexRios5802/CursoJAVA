public class CaracteresEspeciales {
    public static void main(String[] args) {
        // Caracteres especiales
        // \n - imprimir un salto de línea
        var cadena1 = "Hola\nMundo";
        System.out.println("cadena1 = " + cadena1);

        // \t - tabulador
        var cadena2 = "\tHola\tMundo";
        System.out.println("cadena2 = " + cadena2);

        // \' - agrega una comilla simple
        var cadena3 = "Hola \' Mundo";
        System.out.println("cadena3 = " + cadena3);

        // \" - agrega una comilla dobe
        var cadena4 = "Hola \" Mundo";
        System.out.println("cadena4 = " + cadena4);
        
        // \\ - caracter de diagonmal invertiva+
        var cadena5 = "Hola \\ Mundo";
        System.out.println("cadena5 = " + cadena5);

    }
}
