import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        // Creăm studenții
        Student student1 = new Student("Valentin Popescu");
        Student student2 = new Student("Maria Ionescu");
        Student student3 = new Student("Dan Georgescu");

        // Creăm cursul cu lista de studenți
        Curs curs = new Curs(Arrays.asList(student1, student2, student3));

        // Apelăm metoda prezenta de mai multe ori
        curs.prezenta();
        System.out.println("---");
        curs.prezenta();
    }
}