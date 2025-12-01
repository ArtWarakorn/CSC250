/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.FinalExsam;

import java.util.*;

/**
 *
 * @author art
 */
public class Wildcard {

    public static void printObject(List<?> list) { // <?> wild card รับเป็นอะไรก็ได้

        for (Object n : list) {
            System.out.println(n);
        }
    }

    public static void printNumbers(List<? extends Number> list) {
        // <? extends Number> wild card รับเป็น type Number (Ex. int, Double, Number)
        for (Number n : list) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {

        //------1. Wile card-----------------------//
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<String> StringList = Arrays.asList("I", "Say", "Good", "Bye");
        List<Double> numList = Arrays.asList(2.25, 3.33, 4.12);

        printObject(intList);
        printObject(StringList);
        printObject(numList);
        //-----------------------------------------//

        //-------2. wile card number---------------//
        List<Integer> intList2 = Arrays.asList(32, 33, 34);
        List<Double> doubleList = Arrays.asList(2.3, 3.3, 4.3);
        List<Number> numberList = Arrays.asList(2.3, 34, 4.3);

        printNumbers(intList2);
        printNumbers(doubleList);
        printNumbers(numberList);
        //-----------------------------------------//
    }
}
