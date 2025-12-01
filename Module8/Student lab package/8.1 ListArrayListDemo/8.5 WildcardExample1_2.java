/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
import java.util.*;

public class WildcardExample1_2 {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void addElement(List<?> list) {
        // list.add(100);     // ❌ Compile-time error
        // list.add("Hello"); // ❌ Compile-time error
        list.add(null);       // ✅ Only null is allowed
    }

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>(Arrays.asList(10, 20, 30));
        List<String> strList = new ArrayList<>(Arrays.asList("A", "B", "C"));

        printList(intList);
        printList(strList);

        // Try adding elements
        // addElement(intList); // ❌ Compile error if uncommented
        // addElement(strList); // ❌ Compile error if uncommented

        // ✅ Only this works:
        addElement(intList); // adds null
        System.out.println(intList); // [10, 20, 30, null]
    }
}

