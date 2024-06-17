package lab01;

public class Circle {
    private double radius;

    public Circle() {};

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.PI * (2 * this.radius);
    }
}
