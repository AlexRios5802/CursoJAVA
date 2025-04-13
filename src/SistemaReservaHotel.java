import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hotel ***");

        // Tarifas del hotel
        final var CUARTO_CON_VISTA_MAR = 190.00;
        final var CUARTO_SIN_VISTA_MAR = 150.50;

        var consola = new Scanner(System.in);

        // Pedir nombre, días, y si es cuerto con vista al mar
        System.out.print("Ingresa tu nombre: ");
        var nombreCliente = consola.nextLine();

        System.out.print("Días de estadía en el hotel: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());

        System.out.print("Cuarto con vista al mar (true/false)?: ");
        var cuartoVistaMar = Boolean.parseBoolean(consola.nextLine());

        if (cuartoVistaMar){
            var totalCuarto = CUARTO_CON_VISTA_MAR * diasEstadia;
            System.out.printf("""
                    \n-=-=-=-=-=-= Detalles de la Reservación -=-=-=-=-=-=
                    Cliente: %s
                    Días de estadía: %d
                    Costo total de la estadía: $%.2f
                    Habitación con vista al mar :)
                    """, nombreCliente, diasEstadia, totalCuarto);
        }else{
            var totalCuarto = CUARTO_SIN_VISTA_MAR * diasEstadia;
            System.out.printf("""
                    \n-=-=-=-=-=-= Detalles de la Reservación -=-=-=-=-=-=
                    Cliente: %s
                    Días de estadía: %d
                    Costo total de la estadía: $%.2f
                    Habitación sin vista al mar :(
                    """, nombreCliente, diasEstadia, totalCuarto);
        }


    }
}
