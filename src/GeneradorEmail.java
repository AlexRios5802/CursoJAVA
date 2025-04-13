public class GeneradorEmail {
    public static void main(String[] args) {

        System.out.println("\nGenerador de Emails");
        System.out.println(" - - - - - - - - - - - - - -");

        // Creación de un Email
        // Entrada del nombre completo
        var nombres = "Alex Omar";
        var apellidoPaterno = "Rios";
        var apellidoMaterno = "Perez";
        var nombreCompleto = String.join(" ", nombres, apellidoPaterno, apellidoMaterno);
        System.out.println("Nombre completo:\n" + nombreCompleto + "\n");

        // Convertir las dos cadenas a minúsculas}
        var minNombres = nombres.toLowerCase();
        var minApellidoP = apellidoPaterno.toLowerCase();
        var minApellidoM = apellidoMaterno.toLowerCase();

        // Unir el nombre completo - JOIN
        var nombreCompletoM = String.join(" ",minNombres, minApellidoP, minApellidoM);

        // Nombre de la institución
        var institucion = "Universidad Autonoma de Campeche";
        var nomInsMin = institucion.toLowerCase(); // Hicimos en minusculas el string
        System.out.println("Nombre de la institución educativa:\n" + institucion  + "\n");

        // Tomaremos sus iniciales
        var letraU = nomInsMin.charAt(0);
        var letraA = nomInsMin.charAt(12);
        var letraCAM = nomInsMin.substring(24, 27);

        // Unir iniciales de la institución
        var unionUniciales = new StringBuilder();
        unionUniciales.append(letraU);
        unionUniciales.append(letraA);
        unionUniciales.append(letraCAM);
        var iniciales = unionUniciales.toString();

        // Dominio del correo
        // CORREGIR, EL DOMINIO ES UACAM, NO ES SOLO .MX
        var dominio = ".mx";

        // Generar correo
        // Del nombre, remplazar los espacios por puntos
        var nombrePuntos = nombreCompletoM.replace(' ', '.');
        var preEmail = new StringBuilder();
        preEmail.append(nombrePuntos);
        preEmail.append("@");
        preEmail.append(iniciales);
        preEmail.append(dominio);
        var Email = preEmail.toString();
        System.out.println("Tu correo es:\n" + Email);
    }
}
