package lab01;

import lab01.*;

public class MainLab01 {
    public static void main(String[] args) {
        testCircle();
        testExtandClass();
    }

    public static void testCircle() {
        Circle c1 = new Circle(10.0);
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());
        System.out.println(c1);
        Circle c2 = new Circle(25.0);
        System.out.println("Radius: " + c2.getRadius());
        System.out.println("Area: " + c2.getArea());
        System.out.println(c2);
    }

    public static void testExtandClass() {
        Rectangle r1 = new Rectangle("Java");
        r1.doSomeThing();
    }
}
