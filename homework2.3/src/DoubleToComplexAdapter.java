public class DoubleToComplexAdapter {
    // Convertește un număr Double într-un ComplexNumber (partea imaginară este 0)
    public static ComplexNumber fromDoubleToComplex(double number) {
        return new ComplexNumber(number, 0);
    }
}
