package Opgave15Square;

import java.util.ArrayList;

public class ma {
    public static void main(String[] args) {
        Square square1 = new Square(6);
        Square square2 = new Square(12);
        Square square3 = new Square(4);
        Square square4 = new Square(5);
        Circle circle1 = new Circle(12);
        Circle circle2 = new Circle(10);
        Circle circle3 = new Circle(14);
        Circle circle4 = new Circle(3);
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(square1);
        shapes.add(square2);
        shapes.add(square3);
        shapes.add(square4);
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(circle3);
        shapes.add(circle4);
        for (Shape shape : shapes) {
            System.out.printf("Shape #%d: area = %f \n", shapes.indexOf(shape), shape.getArea());  // bruger float fordi det er længere tal
        }
    }
}
