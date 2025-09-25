package CalculateArea;

public class Square extends Ractangle {

    public Square(double side) {
        super(side,side);
    }

    @Override
    public void draw() {
        System.out.println("side length : " + width);
    }

    @Override
    public String getName() {
        return "Square";
    }
}
