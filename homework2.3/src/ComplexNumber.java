public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Calculul modulului unui număr complex
    public double getModulus() {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    // Metoda pentru a aduna două numere complexe
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Suprascrierea metodei toString pentru a vizualiza numărul complex
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
