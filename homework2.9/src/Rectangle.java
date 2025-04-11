public class Rectangle implements Shape {
    private float width;
    private float height;

    // Constructor
    public Rectangle(float width, float height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public float getArea() {
        return width * height; // Area of rectangle
    }
}

