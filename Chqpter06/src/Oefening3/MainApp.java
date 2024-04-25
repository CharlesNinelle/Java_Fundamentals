package Oefening3;

public class MainApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0]=new Circle(5.0);
        shapes[1]=new Rectangle(4.0,3.0);
        shapes[2]=new Triangle(6.0,2.0);

        double totalArea = 0.0;
        for (Shape shape: shapes){
            totalArea+=shape.getArea();
        }
        System.out.println("Area of shapes: ");
        for (Shape shape:shapes){
            System.out.println(shape.getClass().getSimpleName()+": "+shape.getArea());
        }
        System.out.println("Total area of shapes: "+totalArea);
    }
}
