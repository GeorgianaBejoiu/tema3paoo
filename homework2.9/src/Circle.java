public class Circle implements Shape{
    private float radius;

    // Constructor
    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius); // Area of circle (π * r²)
    }
}
