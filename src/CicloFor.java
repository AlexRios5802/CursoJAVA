public class CicloFor {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("*** Ciclo for ***");
        for(var contador = 1; contador <= 50; contador++){
            System.out.print(contador + " ");
            Thread.sleep(250); // Le agregué un contador de tiempo para que no aparezca todo de golpe sino por tiempos
        }
    }
}
