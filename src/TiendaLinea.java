import java.sql.SQLOutput;
import java.util.Scanner;

public class TiendaLinea {
    public static void main(String[] args) {
        System.out.println("*** Tienda en Línea ***");

        // Condiciones de la cantidad de la compra
        final var montoCompra = 1000;

        var consola = new Scanner(System.in);

        // Ingresar valores para poderse evaluar
        System.out.print("¿Cual fue el monto de tu compra? ");
        var montoCompraCliente = Double.parseDouble(consola.nextLine());

        System.out.print("¿Eres miembro de la tienda? (true/false) ");
        var esMiembro = Boolean.parseBoolean(consola.nextLine());

        // Evaluar valores

        // FUNCIONA SOLO AGREGAR LAS OPERACIONES PARA EL DESCUENTO
        // HIZO COMPRA MAYOR A 1000 Y ES MIEMBRO
        if (montoCompraCliente >= montoCompra && esMiembro){ // true + true
            // OPERACIONES PARA EL 10%
            var porcentajeDescuento = (montoCompraCliente/100)*10;
            var descuento = montoCompraCliente - porcentajeDescuento;

            System.out.printf("""
                    \nFelicidades, has obtenido un descuento del 10%%
                    \tMonto de la compra: $%.2f
                    \tMonto del descuento: $%.2f
                    \tMonto final de la compra con descuento: $%.2f
                    """, montoCompraCliente, porcentajeDescuento, descuento);

            // HIZO COMPRA MENOR A 1000 PERO SÍ ES MIEMBRO DE LA TIENDA
        } else if (esMiembro) { // false + true

            var porcentajeDescuento = (montoCompraCliente/100)*5;
            var descuento = montoCompraCliente - porcentajeDescuento;
            System.out.printf("""
                    \nFelicidades, has obtenido un descuento del 5%%
                    \tMonto de la compra: $%.2f
                    \tMonto del descuento: $%.2f
                    \tMonto final de la compra con descuento: $%.2f
                    """, montoCompraCliente, porcentajeDescuento, descuento);

            // HIZO COMPRA MENOR A 1000 Y NO ES MIEMBRO DE LA TIENDA
        }else {
            System.out.printf("""
                    \nNo obtuviste ningún tipo de descuento
                    Te invitamos a hacerte miembro de la tienda
                    \tMonto final de la compra: %d
                    """, montoCompraCliente);
        }

    }
}
