public class AparatElectric {
    private String nume;
    private boolean esteConectat;

    public AparatElectric(String nume) {
        this.nume = nume;
        this.esteConectat = false; // Implicit aparatul nu este conectat
    }

    public String getNume() {
        return nume;
    }

    public boolean esteConectat() {
        return esteConectat;
    }

    public void conecteaza() {
        if (!esteConectat) {
            esteConectat = true;
            System.out.println(nume + " a fost conectat la curent.");
        }
    }

    public void deconecteaza() {
        if (esteConectat) {
            esteConectat = false;
            System.out.println(nume + " a fost deconectat de la curent.");
        }
    }
}
