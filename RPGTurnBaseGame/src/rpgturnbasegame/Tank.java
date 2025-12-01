/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgturnbasegame;

/**
 *
 * @author art
 */
public class Tank extends Hero {

    public Tank(String name) {
        super(name, 240, 18, 12, 0.08);
    }

    // Lower damage but can reduce enemy defense temporarily (simple version: deal damage)
    @Override
    public void skillAtk(Character target, boolean isCrit) {
        // Shield Bash: atk - (target.def/2)
        int raw = this.atk - (target.def / 2);
        if (isCrit) raw = (int) Math.round(raw * 1.4);
        int damage = Math.max(0, raw);
        target.takeDamage(damage);
        System.out.printf("%s uses Shield Bash on %s for %d damage%s\n",
                          this.name, target.name, damage, (isCrit ? " (CRITICAL!)" : ""));
    }
}
