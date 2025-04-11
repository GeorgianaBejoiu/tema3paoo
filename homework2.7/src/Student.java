import java.util.Random;

public class Student {
    private String nume;

    public Student(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    // Metoda care generează random statusul studentului
    public String status() {
        Random rand = new Random();
        return rand.nextBoolean() ? "Prezent" : "Absent";
    }
}

