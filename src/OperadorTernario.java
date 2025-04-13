public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operardor Ternario ***");
        // Sintaxis
        // condicion ? exp1 : exp2

        // Determinar si un número es par o no
        var numero = 10;
        var resultado = (numero % 2 == 0) ? "Par" : "Impar";
        System.out.println("El número " + numero + " es " + resultado);

        // Calcular si es mayor de edad
        var edad = 13;
        var mensaje = (edad >= 18) ? "eres mayor de edad" : "eres menor de edad";
        System.out.println("\nTienes " + edad + ", " + mensaje);

        // Valor positivo, negativo o cero (operador ternario anidado)
        numero = 0;
        resultado = (numero > 0)? "Positivo" : (numero < 0) ? "Negativo" : "Cero";
        System.out.println("\nEl número " + numero + " es " + resultado);

    }
}
