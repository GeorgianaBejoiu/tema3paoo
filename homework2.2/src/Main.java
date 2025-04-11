//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Obținem instanța unică a WebHelper
        WebHelper webHelper = WebHelper.getInstance();

        // Accesăm conținutul paginii web (la prima apelare va încărca conținutul)
        String content = webHelper.getWebSiteContent();

        // Afișăm conținutul paginii
        System.out.println("Conținutul paginii web: ");
        System.out.println(content);

        // Apelăm din nou pentru a vedea că nu se mai încarcă pagina
        String contentAgain = webHelper.getWebSiteContent();
        System.out.println("\nConținutul paginii (la a doua accesare): ");
        System.out.println(contentAgain);
    }
}