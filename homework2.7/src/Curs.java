import java.util.List;

public class Curs {
    private List<Student> studenti;

    public Curs(List<Student> studenti) {
        this.studenti = studenti;
    }

    // Metoda care afișează numele studenților și statusul acestora
    public void prezenta() {
        System.out.println("Prezența la curs:");
        for (Student student : studenti) {
            System.out.println(student.getNume() + " - " + student.status());
        }
    }
}

