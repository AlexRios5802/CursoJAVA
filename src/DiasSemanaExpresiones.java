public class DiasSemanaExpresiones {
    public static void main(String[] args) {
        System.out.println("*** Dias de la Semana - Expresiones ***");

        // Versión 1, repitiendo el SOUT
        var dia = 1;
        switch (dia){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Día inválido: " + dia);
        }

        // Versión 2, optimizando el código quitando cosas para reducirlo

        String diaSemana;
        diaSemana = switch (dia){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Día inválido";
        };
        System.out.println(diaSemana);
    }
}
