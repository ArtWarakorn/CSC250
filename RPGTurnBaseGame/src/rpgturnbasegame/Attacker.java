/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgturnbasegame;

/**
 *
 * @author art
 */
public class Attacker extends Hero {

    public Attacker(String name) {
        // hp, atk, def, critChance
        super(name, 140, 30, 6, 0.15);
    }

    // High single-target burst
    @Override
    public void skillAtk(Character target, boolean isCrit) {
        // Power Strike: 2.2 * atk - target.def
        int raw = (int) Math.round(this.atk * 2.2) - target.def;
        if (isCrit) raw = (int) Math.round(raw * 1.5);
        int damage = Math.max(0, raw);
        target.takeDamage(damage);
        System.out.printf("%s uses Power Strike on %s for %d damage%s\n",
                          this.name, target.name, damage, (isCrit ? " (CRITICAL!)" : ""));
    }
}
