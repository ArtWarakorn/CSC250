/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

/**
 *
 * @author art
 */
public abstract class Charactor {
    
    private String name = "";
    private int baseHp = 0;
    private int normalAtk = 0;
    private int skillAtk = 0;
    
    public abstract int takeDmg(int atk_dmg);
    public abstract int useSkill(int skill);
    public abstract boolean isAlive(int Hp);
    public abstract String showStatus();
    
}
