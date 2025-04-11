//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Creăm un obiect C2Nr
        C2Nr c2Nr = new C2Nr(1, 2);
        System.out.println("Suma din C2Nr: " + c2Nr.getSum()); // Ar trebui să afișeze 3

        // Convertim C2Nr la C3Nr
        C3Nr c3Nr = Adapter.convertC2ToC3(c2Nr);
        System.out.println("Suma din C3Nr: " + c3Nr.getSum()); // Ar trebui să afișeze 3 (deoarece 1+2=3 și ceilalți 0)
    }
    }
