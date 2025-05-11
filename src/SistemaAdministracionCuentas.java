import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) throws InterruptedException{

    var consola = new Scanner(System.in);
    var salir = false;

    // Comenzar con la iteración del menu
        while (!salir){
            Thread.sleep(250);
            System.out.print("""
                    *** Sistema de Administración de Cuentas ***
                    Menu:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoge una opción: \s""");
            var opcion = consola.nextInt();

            // Evaluar cada opción}
            switch (opcion){
                case 1 -> {
                    System.out.println("Creando tu cuenta...\n");
                    Thread.sleep(1000);
                    System.out.println("Cuenta creada\n");
                }
                case 2 -> {
                    System.out.println("Eliminando tu cuenta...\n");
                    Thread.sleep(1000);
                    System.out.println("Cuenta eliminada\n");
                }

                case 3 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto");
                    salir = true;
                }
                default -> System.out.println("Opción inválida...\n");
            }
        }
        System.out.println("Fin del Sistema de Administración de Cuentas");
    }
}
