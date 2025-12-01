/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgturnbasegame;

/**
 *
 * @author art
 */
public class Goblin extends Monster {

    public Goblin() {
        super("Goblin", 110, 18, 5, 0.10);
    }

    @Override
    public void skillAtk(Character target, boolean isCrit) {
        // Backstab: 2.0 * atk (single target)
        int raw = (int) Math.round(this.atk * 2.0) - target.def;
        if (isCrit) raw = (int) Math.round(raw * 1.6);
        int damage = Math.max(0, raw);
        target.takeDamage(damage);
        System.out.printf("%s performs Backstab on %s for %d damage%s\n",
                          this.name, target.name, damage, (isCrit ? " (CRITICAL!)" : ""));
    }
}
