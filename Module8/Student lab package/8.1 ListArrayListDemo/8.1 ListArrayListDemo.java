/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author woratatmakasiranondh
 */
import java.util.*;
import java.util.function.Predicate;

public class ListArrayListDemo {

    // A tiny domain class for the homogeneous demo
    static class Person {
        final String id;
        final String name;
        Person(String id, String name) { this.id = id; this.name = name; }
        @Override public String toString() { return id + ":" + name; }
    }

    public static void main(String[] args) {
        demoHomogeneous();
        System.out.println("-----");
        demoHeterogeneous();
    }

    // ------------------------------
    // 1) HOMOGENEOUS (type-safe)
    // ------------------------------
    static void demoHomogeneous() {
        // Program to the interface; use ArrayList as the implementation
        List<Person> roster = new ArrayList<>();
        roster.add(new Person("S001", "Ann"));
        roster.add(new Person("S002", "Bob"));
        roster.add(new Person("S003", "Chet"));

        // Index-based access
        System.out.println("Second person: " + roster.get(1));

        // Replace & insert at index
        roster.set(1, new Person("S002", "Bee"));
        roster.add(1, new Person("S009", "NewGuy"));

        // Iterate in order
        for (Person p : roster) {
            System.out.println(" - " + p);
        }

        // Filter with predicate (returns a new list)
        List<Person> withB = filter(roster, p -> p.name.startsWith("B"));
        System.out.println("Starts with B: " + withB);

        // Sort with Comparator (by name)
        roster.sort(Comparator.comparing(p -> p.name));
        System.out.println("Sorted by name: " + roster);
    }

    static <T> List<T> filter(List<T> src, Predicate<? super T> p) {
        List<T> out = new ArrayList<>();
        for (T t : src) if (p.test(t)) out.add(t);
        return out;
    }

    // ------------------------------
    // 2) HETEROGENEOUS (mixed types)
    //    Prefer List<Object> if you must mix.
    //    Raw types are strongly discouraged.
    // ------------------------------
    static void demoHeterogeneous() {
        // Heterogeneous list: elements of different types in one list
        //List<Object> bag = new ArrayList<>();
        List bag = new ArrayList();
        bag.add("hello");           // String
        bag.add(42);                // Integer (autoboxed)
        bag.add(3.14);              // Double (autoboxed)
        bag.add(true);              // Boolean
        bag.add(new Person("X01", "Mix"));

        // Reading requires instanceof checks and casting
        for (Object o : bag) {
            if (o instanceof String s) {
                System.out.println("String upper: " + s.toUpperCase());
            } else if (o instanceof Integer n) {
                System.out.println("Integer *2: " + (n * 2));
            } else if (o instanceof Double d) {
                System.out.println("Double ceil: " + Math.ceil(d));
            } else if (o instanceof Boolean b) {
                System.out.println("Boolean negate: " + !b);
            } else if (o instanceof Person p) {
                System.out.println("Person: " + p);
            }
        }

        // You can still use List APIs (insert/remove by index)
        bag.add(2, "inserted");
        bag.remove(Boolean.TRUE); // removes the first Boolean true
        System.out.println("Bag now: " + bag);

        // ⚠️ Heterogeneous lists lose type safety—errors show up at runtime
        // Example: accidental cast
        try {
            String forced = (String) bag.get(1); // may throw ClassCastException
            System.out.println("Forced cast result: " + forced);
        } catch (ClassCastException ex) {
            System.out.println("ClassCastException (as expected): " + ex.getMessage());
        }
    }
}

