import java.util.Scanner;

public class CondicionAnidada {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Ingresa la calificación: ");
        var nota = Integer.parseInt(consola.nextLine());

        var calificacion = (nota >= 90) ? "A" :
                (nota >= 80) ? "B" :
                (nota >= 70) ? "C" :
                (nota >= 60) ? "D" : "F";
        System.out.println("Calificación es " + calificacion);
    }
}
