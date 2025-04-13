import java.util.Scanner;

public class CalculoAreaRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Cálculo de Área y Perímetro de un Rectángulo ***");

        // Ingresar valores para normalizar
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el valor de tu altura: ");
        var altura = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa el valor de tu base: ");
        var base = Integer.parseInt(consola.nextLine());

        // Evaluar valores
        var area =
                base * altura;
        var perimetro =
                2*(base + altura);

        System.out.println("El áre de tu rectangulo de " + base + " por " + altura);
        System.out.println("es: " + area);
        System.out.println("El perimetro es: " + perimetro);

        

    }
}
