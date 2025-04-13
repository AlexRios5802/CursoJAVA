import java.util.Scanner;

public class InicializarVariable {
    public static void main(String[] args) {
        System.out.println("*** Inicializar Variables ***");

        var consola = new Scanner(System.in);

        System.out.print("Estado(true/false) ");
        boolean esActivo = Boolean.parseBoolean(consola.nextLine());

        String estado = esActivo ? "Activo" : "Inactivo";
        System.out.println("El estado es " + estado);

    }
}
