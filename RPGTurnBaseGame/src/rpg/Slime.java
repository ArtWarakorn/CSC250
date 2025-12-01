/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpg;

/**
 *
 * @author art
 */
public class Slime extends Charactor {
    
    private static final String name = "Slime";
    private int baseHp = 250;
    private static final int NORMAL_ATK = 4;
    private static final int SKILL_ATK = 6;
    
    @Override
    public int takeDmg(int atk_dmg) {
        return 0;
    }
    @Override
    public int useSkill(int skill) {
        
        int atk = 0;
        
        if(skill == 1) {
            atk = NORMAL_ATK;
        }
        
        else if(skill == 2){
            atk = SKILL_ATK;
        }
        return atk;
    }
    @Override
    public boolean isAlive(int Hp){
        
        Hp = baseHp;
        boolean check = false;
        
        if(Hp <= 0) {
   
            check = true;
            
        }
        
        return check;
    }
    
    @Override
    public String showStatus(){
        
        String status = "Name : " + name + "\n"+
                        "Base HP : " + baseHp + "\n"+
                        "Normal DMG(ATK) : " + NORMAL_ATK + "\n"+
                        "Skill DMG(ATK) : " + SKILL_ATK;
        return status;
    }
    
}
