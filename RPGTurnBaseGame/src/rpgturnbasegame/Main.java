/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgturnbasegame;

/**
 *
 * @author art
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Create heroes
        List<Hero> heroes = new ArrayList<>();
        heroes.add(new Attacker("Art"));
        heroes.add(new Carry("Yuki"));
        heroes.add(new Tank("Ragnar"));

        // Create monsters (multiple)
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Slime());
        monsters.add(new Goblin());
        monsters.add(new Dragon());

        // Start battle
        Battle battle = new Battle(heroes, monsters);
        battle.start();

        System.out.println("\nBattle finished.");
    }
}
