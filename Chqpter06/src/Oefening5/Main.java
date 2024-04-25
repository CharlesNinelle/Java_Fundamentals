package Oefening5;

public class Main {
    public static void main(String[] args) {
        Shape square = new Square(4.0);
        Shape rectangle = new Rectangle(4.0, 3.0);
        Shape triangle = new Triangle(6.0, 2.0);

        double totalArea = square.getArea() + rectangle.getArea() + triangle.getArea();

        System.out.println("Area of shapes:");
        System.out.println("Square: " + square.getArea());
        System.out.println("Rectangle: " + rectangle.getArea());
        System.out.println("Triangle: " + triangle.getArea());

        System.out.println("Total area: " + totalArea);

        // CheckIng with instanceof if the forms instances of Shape
        if (square instanceof Shape) {
            System.out.println("Square is an instance of Shape.");
        }
        if (rectangle instanceof Shape) {
            System.out.println("Rectangle is an instance of Shape.");
        }
        if (triangle instanceof Shape) {
            System.out.println("Triangle is an instance of Shape.");
        }
    }
}


