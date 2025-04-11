import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Config {

    private static Config instance = null;
    private String color;
    private int weight;
    private boolean dataLoaded = false;
    private final String configFile = "config.json";

    // Constructor privat
    private Config() {
        // nu încărcăm datele aici!
    }

    // Acces public la instanța Singleton
    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    private void loadData() {
        if (!dataLoaded) {
            JSONParser parser = new JSONParser();
            try (FileReader reader = new FileReader(configFile)) {
                JSONObject obj = (JSONObject) parser.parse(reader);
                this.color = (String) obj.get("color");
                this.weight = ((Long) obj.get("weight")).intValue();
                dataLoaded = true;
            } catch (IOException | ParseException e) {
                System.err.println("Error reading config file: " + e.getMessage());
                // Poți decide aici ce valori implicite să pui
                this.color = "#000000";
                this.weight = 0;
                dataLoaded = true;
            }
        }
    }

    public String getColor() {
        if (!dataLoaded) {
            loadData();
        }
        return color;
    }

    public int getWeight() {
        if (!dataLoaded) {
            loadData();
        }
        return weight;
    }
}

