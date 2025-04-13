public class TiendaEnLinea {
    public static void main(String[] args) {

        System.out.println("*** Tienda en Línea (Detalle Producto) ***");

        String nombreProducto = "Laptop Gamer";
        int precioProducto = 25000; // Se puede usar "double" para poner el punto decimal
        int cantidadDisponible = 3;
        boolean disponible = true;

        // Imprimir el detalle del producto
        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio: $" + precioProducto);
        System.out.println("Cantidad diponible:" + cantidadDisponible);
        System.out.println("Hay disponible: " + disponible);

        // Modificar los valores
        // Otro ingreso de producto
        System.out.println();
        System.out.println("- - - - - - - - - - - -");

        precioProducto = 12500;
        nombreProducto = "TV Smart";
        cantidadDisponible = 0;
        disponible = false;

        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio: $" + precioProducto);
        System.out.println("Cantidad diponible: " + cantidadDisponible);
        System.out.println("Hay disponible: " + disponible);
    }
}
