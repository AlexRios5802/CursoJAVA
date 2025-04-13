public class SistemaReservaHoteles{
    public static void main(String[] args) {
        System.out.println("*** SISTEMA DE RESERVA DE HOTELES");

        // Definimos las variables
        var nombreCliente = "Alex Omar Ríos Pérez";
        var dayStay = "5";
        var tarifa = "2900.00";
        var vistaMar = true;


        // Mostrar el detalle de la reserva
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Días de estancia: " + dayStay);
        System.out.println("Tarifa: $" + tarifa);
        System.out.println("Vista al mar: " + vistaMar);

        System.out.println();
        // Definimos las variables
        nombreCliente = "Maria Fernanda";
        dayStay = "2";
        tarifa = "1160.00";
        vistaMar = false;
        
        // Mostrar el detalle de la reserva
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Días de estancia: " + dayStay);
        System.out.println("Tarifa: $" + tarifa);
        System.out.println("Vista al mar: " + vistaMar);

    }
}
