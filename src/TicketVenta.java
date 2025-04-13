import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Generación Ticket de Venta ***");
        var consola =
                new Scanner(System.in);

        System.out.print("Precio leche: ");
        var precioLeche =
                Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        var precioPan =
                Double.parseDouble(consola.nextLine());

        System.out.print("Precio lechuga: ");
        var precioLechuga =
                Double.parseDouble(consola.nextLine());

        System.out.print("Precio plátanos: ");
        var precioPlatano =
                Double.parseDouble(consola.nextLine());

        System.out.print("Aplicar algún descuento (%)? ");
        var descuertoPorcentaje =
                Integer.parseInt(consola.nextLine());

        // Cálculo del subtotal (sin impuestos)
        var subtotal =
                precioLeche + precioPan + precioLechuga + precioPlatano;

        // Aplicar el descuento
        var descuento =
                subtotal * (descuertoPorcentaje/100.0);

        // Subtotal con descuento
        var subtotalConDescuento =
                subtotal - descuento;

        // Cáulculo con impuestos (16%)
        var impuesto =
                subtotalConDescuento * 0.16;

        // Cálculo total de la compra (con impuestos)
        var costoTotalCompra =
                subtotalConDescuento + impuesto;


        // Imprimir el ticket de venta
        System.out.printf("""
                %nTicket de Venta
                -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                Subtotal: $%.2f
                Descuento: $%.2f (%d%%)
                Impuesto (16%%): $%.2f
                Costo total de la compra: $%.2f
                """,
                subtotal, descuento,
                descuertoPorcentaje,
                impuesto, costoTotalCompra);

    }
}
