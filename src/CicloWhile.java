public class CicloWhile {
    public static void main(String[] args) {
        System.out.println("*** Ciclo while ***");

        var contador = 1;

        // Si solo es una línea de código, podemos quitar las llaves
        while (contador <= 5)
            System.out.println(contador++);
    }
}
