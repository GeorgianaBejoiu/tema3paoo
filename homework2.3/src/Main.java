//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Cazul 1: Suma a două numere complexe
        ComplexNumber c1 = new ComplexNumber(2, 3);
        ComplexNumber c2 = new ComplexNumber(4, 5);
        ComplexNumber result = calculator.suma(c1, c2);
        System.out.println("Suma a două numere complexe: " + result);

        // Cazul 2: Suma între două numere Double, care sunt convertite la ComplexNumber
        double d1 = 3.0;
        double d2 = 4.0;
        ComplexNumber result2 = calculator.suma(d1, d2);
        System.out.println("Suma a două numere Double (convertite la ComplexNumber): " + result2);

        // Cazul 3: Suma între un ComplexNumber și un Double
        ComplexNumber c3 = new ComplexNumber(1, 2);
        double d3 = 5.0;
        ComplexNumber result3 = calculator.suma(c3, d3);
        System.out.println("Suma între un ComplexNumber și un Double: " + result3);

        // Cazul 4: Suma între un Double și un ComplexNumber
        double d4 = 6.0;
        ComplexNumber c4 = new ComplexNumber(2, 2);
        ComplexNumber result4 = calculator.suma(d4, c4);
        System.out.println("Suma între un Double și un ComplexNumber (modulul ComplexNumber este folosit): " + result4);
    }
}