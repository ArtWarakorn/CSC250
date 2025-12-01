/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg.FinalExsam;

/**
 *
 * @author art
 */

class ListData  {
    
    //generics method
    public <T> void add(T item) {
        
        T newItem = item;
        System.out.println(newItem);
    }
}

class PrintItem <T> {
    public void add (T item) {
        System.out.println(item);
    }
}
public class Generics {
    public static void main(String[] args){
        
        //generics method test
        ListData l = new ListData();
        l.add("Test");
        l.add(2+3);
        
        //generics class test
        PrintItem<String> print = new PrintItem<>();        //  (String)
        print.add("Hello String");
        
        PrintItem<Integer> intPrint = new PrintItem<>();    //  (Integer)
        intPrint.add(2*3);
    }
    
    /*
        Result
    
        Test
        5
        Hello String
        6
    
    */
}
