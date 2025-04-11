public class Adapter {
    public static C3Nr convertC2ToC3(C2Nr c2Nr) {
        // Obținem suma celor două numere din C2Nr
        int sum = c2Nr.getSum();
        // Creăm un obiect C3Nr cu suma ca primul număr și ceilalți doi ca 0
        return new C3Nr(sum, 0, 0);
    }
}
