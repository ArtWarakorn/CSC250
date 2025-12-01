/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.FinalExsam;

/**
 *
 * @author art
 */

class Person {

    public void show() {
        System.out.println("Person");
    }
}

class Student extends Person {
    
    public void study() {
        System.out.println("Student");
    }
}

public class Casting {
    public static void main(String[] args){
        
//      1. Primitive ()
        int myNum = 10;
        double myDouble = myNum;       //Upcasting 
        System.out.println(myDouble);
        
        double myNum2 = 9.67;
        int myInt = (int)myNum2; // casting สูญเสีย Data (DownCasting)
        System.out.println(myInt);
        
        //2. Reference Casting
        Student s = new Student();
        Person p = s;           //UpCasting
        p.show();
        
        Person p2 = new Person();
        Student s2 = (Student)p2; //error
        s2.study();
    }
    
    //result
    
    /*
    
        10.0
        9
        Person
        ---Exception---
    
    */
}
