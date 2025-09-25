package CalculateArea;

public class Triangle extends Shape{

    private final double a,b,c;

    public Triangle(double a, double b, double c) {

        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean isValid() {
 
        if((a+b > c) && (a+c > b) && (b+c > a)) 
            return true;
        
        else
            return false;
    }

    @Override
    public double area() {

        double area = 0;
        
        if(isValid() == true) {

            double s = perimeter();
            area = Math.sqrt(s*(s - a) * (s - b) * (s - c));
            return area;
        }
        else
            return 0;
        
    }

    @Override
    public double perimeter() {

        double s = (a+b+c)/2;
        return s;
    }

    @Override
    public final void draw() {
        System.out.println("a : " + a + "\n" + "b : " + b + "\n" + "c" + c);
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}
