import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebHelper {

    // Instanță unică pentru Singleton
    private static WebHelper instance;

    // Variabilă care va conține conținutul paginii
    private String content;

    // URL hardcodat pentru pagina web
    private static final String WEB_URL = "http://example.com"; // Poți schimba acest URL cu cel dorit

    // Constructor privat pentru a preveni instanțierea din afacerea clasei
    private WebHelper() {
        // Conținutul va fi încărcat doar la prima accesare
        content = null;
    }

    // Metodă pentru a obține instanța unică
    public static WebHelper getInstance() {
        if (instance == null) {
            instance = new WebHelper();
        }
        return instance;
    }

    // Metodă pentru a obține conținutul paginii web
    public String getWebSiteContent() {
        if (content == null) {
            content = loadWebSiteContent();
        }
        return content;
    }

    // Metodă pentru a încărca conținutul paginii web
    private String loadWebSiteContent() {
        StringBuilder result = new StringBuilder();
        try {
            // Creăm un obiect URL folosind URL-ul hardcodat
            URL url = new URL(WEB_URL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Citim răspunsul de la server
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                result.append(inputLine);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
            return "Eroare la încărcarea paginii!";
        }
        return result.toString();
    }
}

