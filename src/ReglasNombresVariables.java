public class ReglasNombresVariables {
    public static void main(String[] args) {
        // Reglas nombres variables
        String nombreCompleto = "Alex Rios"; // Correcto y buenas prácticas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Alex Rios 2"; // Correcto, no aplica las buenas prácticas
        System.out.println("NombreCompleto = " + NombreCompleto);
        // String nombre-cliente = "Alex"; INCORRECTO
        String nombre_cliente = "Alex"; // Correcto, no aplica buenas prácticas
        String _apellido = "Rios"; // Correcto y aceptable
        String $apellido = "Rios"; // Correcto y aceptable
        int totPzs = 10; // Correcto, no aplica las buenas prácticas
        int totalPiezas = 10; // Correcto y aplica las buenas prácticas
        boolean casado = true; // Correcta, aun puede mejorar
        boolean esCasado = true; // Correcta y aplica buenas prácticas
        boolean isCasado = true; // Correcto y aplica buenas prácticas
        boolean tieneSaldo = true; // Correcto y aplica buenas prácticas
        boolean hasSaldo = true; // Correcto y aplica buenas prácticas
    }
}
