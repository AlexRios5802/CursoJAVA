public class DetalleLibro {
    public static void main(String[] args) {
        //Detalle de un libro
        String tituloLibro = "El seño de los anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;

        // Imprimir valores
        System.out.println("Titulo del libro: " + tituloLibro);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Libro disponible: " + libroDisponible);
        System.out.println("Precio: " + precio);

        // Modificar el titulo de libro
        tituloLibro = "El Señor de los Anillos";
        System.out.println(tituloLibro);
    }
}
