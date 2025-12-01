/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.FinalExsam;

/**
 *
 * @author art
 */

//interface no constructor

interface Animal {
    public void makeSound();
    public void eatFood();
}

class Dog implements Animal {
    
    @Override
    public void makeSound() {
        System.out.println("Bogg Bogg!!");
    }
    
    @Override
    public void eatFood(){
        System.out.println("Bone ");
    }
}

class Cat implements Animal {
    
    @Override
    public void makeSound() {
        System.out.println("Mow Mow !!");
    }
    
    @Override
    public void eatFood(){
        System.out.println("Fish ");
    }
}

public class TestInterface {
    public static void main(String[] args) {
        Animal animal;
        
        //Dog
        animal = new Dog();
        animal.makeSound();
        animal.eatFood();
        
        //cat
        animal = new Cat();
        animal.makeSound();
        animal.eatFood();
    }
}

//result

/*
    Bogg Bogg!!
    Bone 
    Mow Mow !!
    Fish 
*/


