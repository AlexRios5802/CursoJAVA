import java.util.Scanner;

public class ElMayorDeDosNumeros {
    public static void main(String[] args) {
        System.out.println("*** El Mayor de Dos Números ***");

        var cosola = new Scanner(System.in);

        // Ingresar valores
        System.out.print("Ingresa el primer valor: ");
        var v1 = Integer.parseInt(cosola.next());

        System.out.print("Ingresa el segundo valor: ");
        var v2 = Integer.parseInt(cosola.next());

        // Comparar valores

        var mayor = 0;
        if (v1 > v2)
            mayor = v1;
        else
            mayor = v2;

        System.out.printf("""
                %nResultado de Comparación
                El valor más grande es: %d
                """, mayor);

    }
}
