/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgturnbasegame;

/**
 *
 * @author art
 */
public class Dragon extends Monster {

    public Dragon() {
        super("Dragon", 320, 40, 18, 0.12);
    }

    @Override
    public void skillAtk(Character target, boolean isCrit) {
        // Fire Breath: hits all heroes (in our implementation we call per-target)
        int raw = (int) Math.round(this.atk * 1.8) - (target.def / 2);
        if (isCrit) raw = (int) Math.round(raw * 1.5);
        int damage = Math.max(0, raw);
        target.takeDamage(damage);
        System.out.printf("%s breathes fire on %s for %d damage%s\n",
                          this.name, target.name, damage, (isCrit ? " (CRITICAL!)" : ""));
    }
}
