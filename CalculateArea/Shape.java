package CalculateArea;

public class Shape {

    private String name;

    //Overload
    public Shape () {
        name = "Unknow";
    }

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double area() {
        return 0;
    }

    public double perimeter() {
        return 0;
    }

    public void draw() {
        System.out.println("Draw null");
    }

    public final void describe() {
        System.out.println("Name : " + getName());
        System.out.println("Perimeter is : " + perimeter());
        System.out.println("Area is : " + area());
    }
}
