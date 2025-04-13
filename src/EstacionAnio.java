import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args) {
        System.out.println("*** Estación del Año ***");

        var consola = new Scanner(System.in);

        // Sugerencias para elegir
        System.out.printf("""
                \nPuedes elegir entre estos valores
                1 - Enero\t|| 7 - Julio
                2 - Febrero\t|| 8 - Agosto
                3 - Marzo\t|| 9 - Septiembre
                4 - Abril\t|| 10 - Octubre
                5 - Mayo\t|| 11 - Noviembre
                6 - Junio\t|| 12 - Diciembre
                """);

        // Pedir valor
        System.out.print("Ingresa tu valor: ");
        var valor = Integer.parseInt(consola.nextLine());

        if (valor >= 1 && valor <= 2 && valor == 12 ){
            System.out.println("El mes que elegiste es INVIERNO");
        } else if (valor >= 3 && valor <= 5) {
            System.out.println("El mes que elegiste es PRIMAVERA");
        } else if (valor >= 6 && valor <= 8) {
            System.out.println("El mes que elegiste es VERANO");
        } else if (valor >= 9 && valor <= 11) {
            System.out.println("El mes que elegiste es OTOÑO");
        }else{
            System.out.println("Estación del año DESCONOCIDO");
        }

    }
}
