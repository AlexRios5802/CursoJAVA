import java.util.Scanner;

public class EstacionAnioMejorado {
    public static void main(String[] args) {
        System.out.println("*** Estación del Año  Mejorado ***");


        var consola = new Scanner(System.in);
        System.out.print("Proporciona el valor del mes (1-12): ");
        var mes = Integer.parseInt(consola.nextLine());


        // Desde aquí vamos a cambiar las cosas

        System.out.println("-=-=-=-=-= VERSION 1 -=-=-=-=-=");
        String mesAnio;
        mesAnio = switch (mes){
            case 1, 2, 12   -> "Invierno";
            case 3, 4, 5    -> "Primavera";
            case 6, 7, 8    -> "Verano";
            case 9, 10, 11  -> "Otoño";
            default -> "Es una estación desconocida";
        };
        System.out.println("La estación que escogiste es: " + mesAnio);


        System.out.println("-=-=-=-=-= VERSION 2 -=-=-=-=-=");
        var estacion = switch (mes){
            case 1, 2, 12   -> "Invierno";
            case 3, 4, 5    -> "Primavera";
            case 6, 7, 8    -> "Verano";
            case 9, 10, 11  -> "Otoño";
            default -> "Estación desconocida";
        };
        System.out.println(estacion);


//        System.out.println("-=-=-=-=-= VERSION 3 -=-=-=-=-=");
//
//
//        var estacion = "";
//        if (mes == 1 || mes == 2 || mes == 12)
//            estacion = "Invierno";
//        else if (mes == 3 || mes == 4 || mes == 5)
//            estacion = "Primavera";
//        else if (mes == 6 || mes == 7 || mes == 8)
//            estacion = "Verano";
//        else if (mes == 9 || mes == 10 || mes == 11)
//            estacion = "Otoño";
//        else
//            estacion = "una estación desconocida.";
//
//        System.out.printf("La estación para el mes %d es %s", mes, estacion);


    }
}
