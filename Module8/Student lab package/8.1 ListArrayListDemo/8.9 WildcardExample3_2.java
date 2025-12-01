/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
import java.util.*;

public class WildcardExample3_2 {

    // Method can safely add Integer values
    public static void addNumbers(List<? super Integer> list) {
        list.add(10);    // ✅ Allowed
        list.add(20);    // ✅ Allowed
        list.add(30);    // ✅ Allowed

        // list.add(3.14);  // ❌ Error: Double not allowed
        // list.add("Hi");  // ❌ Error: String not allowed
    }

    // Method cannot assume what the element type is when reading
    public static void printList(List<? super Integer> list) {
        for (Object obj : list) {     // ✅ Must read as Object
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        List<Number> numList = new ArrayList<>();
        List<Object> objList = new ArrayList<>();

        addNumbers(intList);
        addNumbers(numList);
        addNumbers(objList);

        System.out.println("Integer list: ");
        printList(intList);

        System.out.println("Number list: ");
        printList(numList);

        System.out.println("Object list: ");
        printList(objList);
    }
}

