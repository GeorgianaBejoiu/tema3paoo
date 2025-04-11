import java.util.List;

public class Prelungitor {
    private boolean esteConectatLaPriza;
    private List<AparatElectric> aparate; // Lista de aparate electrice

    // Constructor care primește o listă de aparate electrice
    public Prelungitor(List<AparatElectric> aparate) {
        this.apparate = aparate; // Inițializare corectă a listei
        this.esteConectatLaPriza = false; // Prelungitorul este inițial deconectat
    }

    public void conecteaza() {
        if (!esteConectatLaPriza) {
            esteConectatLaPriza = true;
            System.out.println("Prelungitorul a fost conectat la priză.");
            // Conectează toate aparatele electrice
            for (AparatElectric aparat : aparate) {
                aparat.conecteaza();
            }
        }
    }

    public void deconecteaza() {
        if (esteConectatLaPriza) {
            esteConectatLaPriza = false;
            System.out.println("Prelungitorul a fost deconectat de la priză.");
            // Deconectează toate aparatele electrice
            for (AparatElectric aparat : aparate) {
                aparat.deconecteaza();
            }
        }
    }
}
