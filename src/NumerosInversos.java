public class NumerosInversos {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("*** Números Inversos ***");

        var contador = 10;
        do {
            System.out.print(contador-- + " ");
        } while (contador > 0);


        // Cuenta regresiva
        System.out.println("Iniciando en:");
        var contador1 = 10;
        do {
            System.out.println(contador1--);
            Thread.sleep(1000); // Pausa de 1 segundo
        } while (contador1 >= 0); // Ahora incluye el 0
        System.out.println("¡Comienza!");
    }
}
