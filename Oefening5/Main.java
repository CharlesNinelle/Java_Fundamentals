package Oefening5;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Square(4.0);
        shapes[1] = new Rectangle(4.0, 3.0);
        shapes[2] = new Triangle(6.0, 2.0);

        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }

        System.out.println("Areas of shapes");
        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + ": " + shape.getArea());
        }

        System.out.println("Total area: " + totalArea);

        // Check using instanceof if these obects are instances of the Shape class
        for (Shape shape : shapes)//doorlopen van de array {
            if (shape instanceof Shape) {
                System.out.println(shape.getClass().getSimpleName() + " is an instance of Shape.");
            }
        }
    }
}

