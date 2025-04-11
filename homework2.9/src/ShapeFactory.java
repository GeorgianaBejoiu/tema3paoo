public class ShapeFactory {
    // Factory method to create a shape
    public static Shape createShape(String shapeType, float... dimensions) {
        if (shapeType.equalsIgnoreCase("Rectangle") && dimensions.length == 2) {
            return new Rectangle(dimensions[0], dimensions[1]);
        } else if (shapeType.equalsIgnoreCase("Circle") && dimensions.length == 1) {
            return new Circle(dimensions[0]);
        } else {
            throw new IllegalArgumentException("Invalid shape type or dimensions.");
        }
    }
}
