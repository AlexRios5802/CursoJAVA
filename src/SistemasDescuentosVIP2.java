import java.util.Scanner;

public class SistemasDescuentosVIP2 {
    public static void main(String[] args) {
        System.out.println("*** Sistemas de Descuentos VIP ***");
        // Declaramos el límite
        final int No_PRODUCTOS = 10;
        var consola = new Scanner(System.in);

        // Para que sea VIP debe de tener más de 10 artículos y ser miebro de la tienda
        // Ingresar cantidad. Si es > 10 articulos
        System.out.print("Ingrese la cantidad de artículos comprados: ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        // Ingresar si es miembro de la tienda
        System.out.print("Ingrese si es miembro de la tienda (true/false): ");
        var miebroTienda = Boolean.parseBoolean(consola.nextLine());

        // Comparar. Si es > 10 y sí es miebro, podrá ser VIP
        var esVIP = cantidadProductos >= No_PRODUCTOS && miebroTienda;

        System.out.println("MIEMBRO: " + esVIP);



    }
}
