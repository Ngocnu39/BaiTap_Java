package bt1_2;
public class Circle {
    private double radius = 1.0;

    // Constructor to initialize the radius
    public Circle(double radius) {
        setRadius(radius);  // Use setter for validation
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius with validation
    public void setRadius(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double area() {
        return Math.PI * radius * radius;
    }

    // Method to calculate the circumference of the circle
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    // String representation of the Circle object
    @Override
    public String toString() {
        return "Circle(radius=" + radius + ")";
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println(circle);  // Output: Circle(radius=5.0)
        System.out.println("Area: " + circle.area());  // Output: Area: 78.53981633974483
        System.out.println("Circumference: " + circle.circumference());  // Output: Circumference: 31.41592653589793

        // Example of setting a new radius
        circle.setRadius(10);
        System.out.println(circle);  // Output: Circle(radius=10.0)
        System.out.println("New Area: " + circle.area());  // Output: New Area: 314.1592653589793
    }

    public Circle() {
    }
}
