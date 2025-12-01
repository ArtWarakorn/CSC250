/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.FinalExsam;

/**
 *
 * @author art
 */
interface A { public void printA(); }
interface B { public void printB(); }

class C implements A,B {
    
    @Override
    public void printA() {
        System.out.println("A");
    }
    
    @Override
    public void printB() {
        System.out.println("B");
    }
} 

public class TestMultipleInheritanc {

    public static void main(String[] args) {
        C c;
        c = new C();
        
        c.printA();
        c.printB();
        
    }
    
    //result
    
    /*
        A
        B
    */
}
