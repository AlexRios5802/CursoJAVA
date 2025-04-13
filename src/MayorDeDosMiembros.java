public class MayorDeDosMiembros {
    public static void main(String[] args) {
        System.out.println("*** Saber si es miebro y aplicar descuento ***");

        var esMiembro = true;
        var descuento = esMiembro ? 0.1 : 0.05;
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
    }
}
