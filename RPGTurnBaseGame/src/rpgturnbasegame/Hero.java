/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgturnbasegame;

/**
 *
 * @author art
 */
public abstract class Hero extends Character {
    protected double critChance; // 0.0 - 1.0

    public Hero(String name, int maxHp, int atk, int def, double critChance) {
        super(name, maxHp, atk, def);
        this.critChance = critChance;
    }

    public double getCritChance() {
        return critChance;
    }
}
