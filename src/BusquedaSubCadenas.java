public class BusquedaSubCadenas {
    public static void main(String[] args) {
        // Buscar SubCadenas
        // indexOf - Devuelve el indice de la primera aparición de la subcadena
        
        var cadena1 = "Hola Mundo";
        
        // SubCadena a buscar "Hola"
        var subCadena1 = cadena1.indexOf("Hola");
        System.out.println("subCadena1 = " + subCadena1);
        
        // lastIndexOf - Devuelve el indice de la última aparición de la subcadena
        // subcadena de Mundo
        var subCadena2 = cadena1.lastIndexOf("Mundo");
        System.out.println("subCadena2 = " + subCadena2);
        
        // SubCadena no encontrada devuelve -1
        var cadena3 = cadena1.lastIndexOf("Java");
        System.out.println("cadena3 = " + cadena3);

    }
}
