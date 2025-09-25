package CalculateArea;

public class CalculateArea {
    public static void main(String[] args) {
        
        Shape[] shapes = new Shape[4];

        
        shapes[0] = new Ractangle(5, 10);
        shapes[1] = new Square(7);
        
        shapes[2] = new Triangle(3, 4, 5);
        
        shapes[3] = new Shape("Circle") {

            @Override
            public double area() { return Math.PI * 5 * 5; } 
            @Override
            public double perimeter() { return 2 * Math.PI * 5; }
            @Override
            public void draw() { System.out.println("radius 5"); }
        };

        System.out.println("____________________________________________\n");
        for (Shape shape : shapes) {
            shape.describe();
            System.out.println("");
        }
        System.out.println("____________________________________________");
    }
}
