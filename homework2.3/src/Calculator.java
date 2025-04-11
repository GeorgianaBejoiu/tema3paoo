public class Calculator {
    // Suma a două numere complexe
    public ComplexNumber suma(ComplexNumber nr1, ComplexNumber nr2) {
        return nr1.add(nr2);
    }

    // Suma între două numere Double, care sunt convertite la ComplexNumber și apoi adunate
    public ComplexNumber suma(double nr1, double nr2) {
        ComplexNumber c1 = DoubleToComplexAdapter.fromDoubleToComplex(nr1);
        ComplexNumber c2 = DoubleToComplexAdapter.fromDoubleToComplex(nr2);
        return c1.add(c2);
    }

    // Suma între un ComplexNumber și un Double, folosind adapterul pentru conversia Double la ComplexNumber
    public ComplexNumber suma(ComplexNumber nr1, double nr2) {
        ComplexNumber c2 = DoubleToComplexAdapter.fromDoubleToComplex(nr2);
        return nr1.add(c2);
    }

    // Suma între un Double și un ComplexNumber, folosind adapterul pentru conversia ComplexNumber la Double
    public ComplexNumber suma(double nr1, ComplexNumber nr2) {
        double mod = ComplexToDoubleAdapter.fromComplexToDouble(nr2);
        ComplexNumber c1 = DoubleToComplexAdapter.fromDoubleToComplex(nr1 + mod);
        return c1;
    }
}
