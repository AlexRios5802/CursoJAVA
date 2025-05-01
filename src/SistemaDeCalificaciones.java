import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class SistemaDeCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Calificaciones ***");
        // Se nos pide usar la sentencia if-else

        System.out.println("-=-=-=-= VERSIÓN 1 =-=-=-=-=-");
        // Pedimos valores para identificar en donde se ubica este
        var consola = new Scanner(System.in);
        System.out.print("Introduce la calificación en número (1-10): ");
        var calificacion = Integer.parseInt(consola.nextLine());

        // Evaluamos el valor para saber que letra es
        if (calificacion >= 9 && calificacion <= 10){
            System.out.println("Tu calificación es A");
        } else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("Tu calificación es B");
        } else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("Tu calificación es C");
        } else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("Tu calificación es D");
        } else if (calificacion >= 0 && calificacion < 6){
            System.out.println("Tu calificación es F");
        } else{
            System.out.println("Valor desconocido");
        }

        System.out.println("-=-=-=-= VERSIÓN 2 =-=-=-=-=-");
        System.out.println("*** Sistema de calificaciones versión tutorial ***");
        System.out.print("Proporciona una calificación entre 0 y 10: ");
        var calificacion2 = Double.parseDouble(consola.nextLine()); // Consideramos si un valore es 9.4 o 8.7, etc
        String calificacionLetra = null;

        if (calificacion2 >= 9 && calificacion2 <= 10)
            calificacionLetra = "A";
        else if (calificacion2 >= 8 && calificacion2 < 9)
            calificacionLetra = "B";
        else if (calificacion2 >= 7 && calificacion2 < 8)
            calificacionLetra = "C";
        else if (calificacion2 >= 6 && calificacion2 < 7)
            calificacionLetra = "D";
        else if (calificacion2 >= 0 && calificacion2 < 6)
            calificacionLetra = "F";

        if (calificacionLetra != null)
            System.out.printf("Calificación %.1f es equivalente a %s", calificacion2, calificacionLetra);
        else
            System.out.println("Valor desconocido");


    }
}
