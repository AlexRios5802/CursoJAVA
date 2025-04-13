import java.util.Locale;

public class GeneradorEmailV2 {
    public static void main(String[] args) {
        // Título del proyecto
        System.out.println("\nGENERADOR DE EMAIL");
        System.out.println("- - - - - - - - - - - - ");
        var nom = "Alex Omar";
        var apellidoP = "Ríos";
        var apellidoM = "Pérez";
        var nombreCompleto = String.join(" ", nom, apellidoP, apellidoM);
        System.out.println("Nombre completo: " + nombreCompleto);
        // Pasar nombre completo a minúsculas
        var nombreMin = nombreCompleto.toLowerCase();
        
        // Del nombre completo en minúsculas, remplazaremos los espacios con .
        // Del nombre completo en minúsculas quitamos los acentos a cualquier vocal que aparezca
        var nombreEspacios = nombreMin.
                replace(' ', '.').replace('á', 'a').
                replace('é', 'e').replace('í', 'i').
                replace('ó', 'o').replace('ú', 'u').
                replace('ñ', 'n');
        System.out.println("nombreEspacios = " + nombreEspacios);

        // Pedimos el nombre de la institución para generar el dominio
        var institutionName = "Universidad Autónoma de Campeche";
        System.out.println("Nombre de la Institución: " + institutionName);
        // Pasamos a minúsculas
        var MinInstitutionName = institutionName.toLowerCase();
        // Ahora tomaremos las iniciales para generar el dominio
        var inicialInstitutionU = MinInstitutionName.charAt(0);
        var inicialInstitutionA = MinInstitutionName.charAt(12);
        var inicialInstitutionCAM = MinInstitutionName.substring(24, 27);
        // Uniremos la inicial para terminar el proceso del dominio
        var dominio = new StringBuilder();
        dominio.append(inicialInstitutionU);
        dominio.append(inicialInstitutionA);
        dominio.append(inicialInstitutionCAM);
        var dominioFinal = dominio.toString();

        System.out.println(dominioFinal);

        var email = new StringBuilder();
        email.append(nombreEspacios);
        email.append("@");
        email.append(dominioFinal);
        email.append(".mx");
        var emailGenerado = email.toString();
        System.out.println("Tu Gmail es:" + emailGenerado);
        
    }
}
