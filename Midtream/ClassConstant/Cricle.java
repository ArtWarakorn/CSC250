package Midtream.ClassConstant;

public class Cricle {

    public static final double PI = 3.14; // ค่าถูกเก็บที่ class ไม่ใช่ Object

    private int r;

    public Cricle() {

        r = 0;

    }

    public Cricle(int r) {

        this.r = r;

    }

    public double calculate() {

        return PI * (r * r);

    }
}
