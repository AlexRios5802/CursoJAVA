public class RemplazarSubcadenas {
    public static void main(String[] args) {
        // Remplazar subcadenas
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        // Remplazar "Mundo" por "a todos"
        var nuevaCadena = cadena1.replace("Mundo" , "a todos");
        System.out.println("nuevaCadena1 = " + nuevaCadena);
        
        // Reemplzar "Hola" por "Adios"
        nuevaCadena = cadena1.replace("Hola", "Adios");
        System.out.println("nuevaCadena2 = " + nuevaCadena);

        // Remplazar "Hola a todos" por "Adios a todos"
        nuevaCadena = nuevaCadena.replace("Hola", "Adios");
        System.out.println("Adios a todos: " + nuevaCadena);


        // Aparentemente es lo mismo, pero es la única forma que tengo para que pueda imprimir "Adios a todos"

        // Remplazar "Mundo" por "a todos"
        var nuevaCadena1 = cadena1.replace("Mundo" , "a todos");
        System.out.println("nuevaCadena1 = " + nuevaCadena1);

        // Reemplzar "Hola" por "Adios"
        var nuevaCadena2 = cadena1.replace("Hola", "Adios");
        System.out.println("nuevaCadena2 = " + nuevaCadena2);

        // Remplazar "Hola a todos" por "Adios a todos"
        var nuevaCadena3 = nuevaCadena1.replace("Hola", "Adios");
        System.out.println("Adios a todos: " + nuevaCadena3);

    }
}
