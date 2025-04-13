public class OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println("*** Operadores Aritméticos ***");
        // No se puede usar var
        int a = 5, b = 3, resultado;
        // Suma +
        resultado = a + b;
        System.out.println("Resultado suma = " + resultado);

        // Resta
        resultado = a - b;
        System.out.println("Resultado resta = " + resultado);

        // Multiplicación *
        resultado = a * b;
        System.out.println("Resultado multiplicación = " + resultado);

        // División /
        resultado = a / b;
        System.out.println("Resultado división = " + resultado);

        // Módulo (residuo división) %
        resultado = a % b;
        System.out.println("Resultado módulo = " + resultado); // <--- Residuo de la división
    }
}
