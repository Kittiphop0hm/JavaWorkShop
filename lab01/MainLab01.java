package lab01;

import lab01.*;

public class MainLab01 {
    public static void main(String[] args) {
        testCircle();
    }

    public static void testCircle() {
        Circle c1 = new Circle(10.0);
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());
    }
    
}