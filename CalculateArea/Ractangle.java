package CalculateArea;

public class Ractangle extends Shape {

    protected final double width,height;

    public Ractangle (double w, double h) {
        width = w;
        height = h;
    }

    @Override
    public double area() {
        double area = width * height;
        return area;
    }

    @Override
    public double perimeter() {
        double prt = 2*(width + height);
        return prt;
    }

    @Override
    public void draw(){
        System.out.println("Width : " + width + " " + "Height : " + height);
    }

    @Override
    public String getName() {
        return "Ractangle";
    }
}
