import java.util.Scanner;

public class SistemasDescuentosVIP {
    public static void main(String[] args) {
        System.out.println("*** Sistemas de Descuentos VIP");
        final var NO_PRODUCTOS_DESCUENTO = 10;
        var consola = new Scanner(System.in);

        System.out.print("Cuantos productos compraste hoy? ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Tienes la membresía de la tienda (true/false)? ");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento =
                cantidadProductos >= NO_PRODUCTOS_DESCUENTO && tienesMembresia;

        System.out.println("Tienes acceso al descuento VIP? " + esElegibleDescuento);

    }
}
