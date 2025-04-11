//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Example for Rectangle
        Shape rectangle = ShapeFactory.createShape("Rectangle", 5.0f, 10.0f); // Width = 5, Height = 10
        System.out.println("Area of Rectangle: " + rectangle.getArea());

        // Example for Circle
        Shape circle = ShapeFactory.createShape("Circle", 7.0f); // Radius = 7
        System.out.println("Area of Circle: " + circle.getArea());
    }
}