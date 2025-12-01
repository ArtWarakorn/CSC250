/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgturnbasegame;

/**
 *
 * @author art
 */
public abstract class Character {
    protected String name;
    protected int maxHp;
    protected int hp;
    protected int atk;
    protected int def;

    public Character(String name, int maxHp, int atk, int def) {
        this.name = name;
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.atk = atk;
        this.def = def;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public void takeDamage(int damage) {
        int real = Math.max(0, damage);
        hp -= real;
        if (hp < 0) hp = 0;
    }

    // Normal attack (can be used by both sides)
    public void normalAtk(Character target, boolean isCrit) {
        int baseDamage = Math.max(0, this.atk - target.def);
        int damage = baseDamage;
        if (isCrit) {
            damage = (int) Math.round(baseDamage * 1.5);
        }
        target.takeDamage(damage);
        System.out.printf("%s normal attacks %s for %d damage%s\n",
                          this.name, target.name, damage, (isCrit ? " (CRITICAL!)" : ""));
    }

    // Each concrete subclass must implement skill attack
    public abstract void skillAtk(Character target, boolean isCrit);

    public String statusLine() {
        return String.format("%s HP: %d/%d ATK:%d DEF:%d", name, hp, maxHp, atk, def);
    }
}
