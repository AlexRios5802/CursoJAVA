public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de Datos
        // Enteros (Su valor por default es 0)
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte); // Concatenación de cadenas
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321098765432L; // L o l para indicar tipo long
        System.out.println("tipoLong = " + tipoLong);
        
        // Punto Flotante (Su valor por default es 0.0)
        float tipoFloat = 3.14F; // Si no indicamos otra cosa, cualquier valor en punto flotante sería por default un tipo double
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDounle = 3.1315D;
        System.out.println("tipoDounle = " + tipoDounle);
        
        // Caracter (Valor por default '\u0000')
        char tipoChar = 'A'; // Caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);
        
        // Booleano (Valor por default es false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipo Object (Referencia)
        String nombre = null; // Valor por default
        System.out.println("nombre = " + nombre);
        nombre = "Alex Rios";


    }
}
