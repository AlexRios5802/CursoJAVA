public class ManejoSubCadenas {
    public static void main(String[] args) {
        // Tema de subacdenasa
        
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        // SubCadena
        var subCadena1 = cadena1.substring(0, 5);
        System.out.println("subcadena: " + subCadena1); // Ponemos un rango de índices para la cadena

        var subCadenaF1 = cadena1. substring(5);
        System.out.println("Primera forma de sub cadena: " + subCadenaF1); // Llega del indice al final
    }
}
