/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgturnbasegame;

/**
 *
 * @author art
 */
public class Slime extends Monster {

    public Slime() {
        super("Slime", 90, 12, 6, 0.05);
    }

    @Override
    public void skillAtk(Character target, boolean isCrit) {
        // Acid Drop: 1.2 * atk
        int raw = (int) Math.round(this.atk * 1.2) - target.def;
        if (isCrit) raw = (int) Math.round(raw * 1.5);
        int damage = Math.max(0, raw);
        target.takeDamage(damage);
        System.out.printf("%s uses Acid Drop on %s for %d damage%s\n",
                          this.name, target.name, damage, (isCrit ? " (CRITICAL!)" : ""));
    }
}
