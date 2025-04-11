public class Produs {
    private int id;
    private String nume;
    private double pretLei;

    public Produs(int id, String nume, double pretLei) {
        this.id = id;
        this.nume = nume;
        this.pretLei = pretLei;
    }

    public int getId() {
        return id;
    }

    public String getNume() {
        return nume;
    }

    public double getPretLei() {
        return pretLei;
    }

    @Override
    public String toString() {
        return "Produs{id=" + id + ", nume='" + nume + "', pretLei=" + pretLei + "}";
    }
}
