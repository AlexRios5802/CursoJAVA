import java.util.Scanner;

public class ComprobacionContrasena {
    public static void main(String[] args) {
        System.out.println("*** Comprobación de contraseñas ***");

        // Pedimos que ingrese su usuario y contraseña
        var USER        = "alexrios";
        var PASSWORD    = 5802;

        var consola = new Scanner(System.in);

        var contador = 1;
        do {
            System.out.print("INGRESA USUARIO: ");
            var usuario = consola.nextLine();

            System.out.print("INGRESA TU CONTRASEÑA: ");
            var contra = Integer.parseInt(consola.next());

            consola.nextLine();
            if (usuario.equals(USER) && contra == PASSWORD){
                System.out.println("BIEN VENIDO " + USER);
                System.out.println("ESTÁS DENTRO");
                break;
            } else {
                System.out.println("USUARIO Y/O CONTRASEÑA INCORRECTOS");
                contador++;
            }
        } while (contador <= 3);
        if (contador > 3) {
            System.out.println("Has superado el número de intentos permitidos.");
        }
    }
}
