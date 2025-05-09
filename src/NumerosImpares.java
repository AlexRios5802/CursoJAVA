public class NumerosImpares {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("*** Numeros impares ***");

        var contador = 0;
        do {
            if (contador % 2 != 0)
                System.out.print(contador + " ");
                contador++;
                Thread.sleep(250);
        } while (contador <= 20);
    }
}
