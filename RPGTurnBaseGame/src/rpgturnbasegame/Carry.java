/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgturnbasegame;

/**
 *
 * @author art
 */
public class Carry extends Hero {

    public Carry(String name) {
        super(name, 110, 34, 4, 0.25); // higher crit chance
    }

    // Critical-based damage
    @Override
    public void skillAtk(Character target, boolean isCrit) {
        // Critical Shot: 1.6 * atk (but critChance higher)
        int raw = (int) Math.round(this.atk * 1.6) - target.def;
        if (isCrit) raw = (int) Math.round(raw * 2.0); // huge crit multiplier for carry
        int damage = Math.max(0, raw);
        target.takeDamage(damage);
        System.out.printf("%s uses Critical Shot on %s for %d damage%s\n",
                          this.name, target.name, damage, (isCrit ? " (CRITICAL!)" : ""));
    }
}
