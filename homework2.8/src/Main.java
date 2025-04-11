//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
// Creăm aparatele electrice
        AparatElectric aparatCafea = new AparatElectric("Aparat de cafea");
        AparatElectric frigider = new AparatElectric("Frigider");
        AparatElectric televizor = new AparatElectric("Televizor");

        // Creăm prelungitorul cu lista de aparate electrice
        Prelungitor prelungitor = new Prelungitor(Arrays.asList(aparatCafea, frigider, televizor));

        // Conectăm prelungitorul la priză
        prelungitor.conecteaza();

        System.out.println("---");

        // Deconectăm prelungitorul de la priză
        prelungitor.deconecteaza();
    }
}