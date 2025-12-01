/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
import java.util.*;

public class WildcardExample2_2 {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0.0;
        for (Number n : list) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void tryAddElements(List<? extends Number> list) {
        // ❌ These cause compile-time errors:
        // list.add(100);       // Error
        // list.add(3.14);      // Error
        // list.add(new Integer(5)); // Error

        // ✅ Only null can be added
        list.add(null);
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(10, 20, 30));
        List<Double> doubleList = new ArrayList<>(Arrays.asList(1.5, 2.5, 3.5));

        System.out.println("Sum intList: " + sumNumbers(intList));
        System.out.println("Sum doubleList: " + sumNumbers(doubleList));

        tryAddElements(intList);
        tryAddElements(doubleList);

        System.out.println("After adding null:");
        System.out.println("intList: " + intList);
        System.out.println("doubleList: " + doubleList);
    }
}

