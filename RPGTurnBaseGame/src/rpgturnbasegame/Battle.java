/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rpgturnbasegame;

/**
 *
 * @author art
 */
import java.util.*;
import java.util.stream.Collectors;

/**
 * Battle manager: handles turns, input, simple AI, and win/lose conditions.
 */
public class Battle {
    private List<Hero> heroes;
    private List<Monster> monsters;
    private Scanner scanner;
    private Random rng;

    public Battle(List<Hero> heroes, List<Monster> monsters) {
        this.heroes = new ArrayList<>(heroes);
        this.monsters = new ArrayList<>(monsters);
        this.scanner = new Scanner(System.in);
        this.rng = new Random();
    }

    // Entry point to start the fight loop
    public void start() {
        System.out.println("=== BATTLE START ===");
        int round = 1;
        while (anyAlive(heroes) && anyAlive(monsters)) {
            System.out.println("\n--- Round " + round + " ---");
            showAllStatus();

            // Build turn order by speed simulation: for simplicity heroes first then monsters
            // (You can extend with a speed stat later)
            // Heroes' turns
            for (Hero h : new ArrayList<>(heroes)) {
                if (!h.isAlive()) continue;
                if (!anyAlive(monsters)) break;
                heroTurn(h);
            }

            // Monsters' turns (AI)
            for (Monster m : new ArrayList<>(monsters)) {
                if (!m.isAlive()) continue;
                if (!anyAlive(heroes)) break;
                monsterTurn(m);
            }

            // remove dead from lists (for clarity)
            heroes = heroes.stream().filter(Hero::isAlive).collect(Collectors.toList());
            monsters = monsters.stream().filter(Monster::isAlive).collect(Collectors.toList());

            round++;
        }

        // Result
        if (anyAlive(heroes)) {
            System.out.println("\n=== VICTORY! Heroes win! ===");
        } else {
            System.out.println("\n=== DEFEAT... Monsters win... ===");
        }
    }

    private void showAllStatus() {
        System.out.println("Heroes:");
        for (int i = 0; i < heroes.size(); i++) {
            System.out.printf("  [%d] %s\n", i + 1, heroes.get(i).statusLine());
        }
        System.out.println("Monsters:");
        for (int i = 0; i < monsters.size(); i++) {
            System.out.printf("  [%d] %s\n", i + 1, monsters.get(i).statusLine());
        }
    }

    private boolean anyAlive(List<? extends Character> list) {
        return list.stream().anyMatch(Character::isAlive);
    }

    private void heroTurn(Hero h) {
        System.out.println("\nIt's " + h.name + "'s turn.");
        // choose action
        int action = chooseHeroAction(h);
        if (action == 1) {
            // normal attack
            Monster target = chooseMonsterTarget();
            if (target == null) return;
            boolean isCrit = rng.nextDouble() < h.getCritChance();
            h.normalAtk(target, isCrit);
        } else if (action == 2) {
            Monster target = chooseMonsterTarget();
            if (target == null) return;
            boolean isCrit = rng.nextDouble() < h.getCritChance();
            h.skillAtk(target, isCrit);
        } else {
            System.out.println("Invalid action, skip turn.");
        }
    }

    private int chooseHeroAction(Hero h) {
        System.out.println("Choose action: [1] Normal Attack  [2] Skill Attack");
        while (true) {
            System.out.print("> ");
            String line = scanner.nextLine().trim();
            if (line.isEmpty()) continue;
            try {
                int choice = Integer.parseInt(line);
                if (choice == 1 || choice == 2) return choice;
            } catch (NumberFormatException e) {}
            System.out.println("Please type 1 or 2.");
        }
    }

    private Monster chooseMonsterTarget() {
        System.out.println("Choose target monster:");
        for (int i = 0; i < monsters.size(); i++) {
            Monster m = monsters.get(i);
            System.out.printf("  [%d] %s\n", i + 1, m.statusLine());
        }
        while (true) {
            System.out.print("> ");
            String line = scanner.nextLine().trim();
            try {
                int idx = Integer.parseInt(line) - 1;
                if (idx >= 0 && idx < monsters.size()) {
                    Monster chosen = monsters.get(idx);
                    if (!chosen.isAlive()) {
                        System.out.println("Target is dead. Choose another.");
                        continue;
                    }
                    return chosen;
                }
            } catch (Exception e) {}
            System.out.println("Invalid target index.");
        }
    }

    private void monsterTurn(Monster m) {
        System.out.println("\n-- Monster " + m.name + "'s turn --");
        // Simple AI: choose random alive hero
        List<Hero> aliveHeroes = heroes.stream().filter(Hero::isAlive).collect(Collectors.toList());
        if (aliveHeroes.isEmpty()) return;
        Hero target = aliveHeroes.get(rng.nextInt(aliveHeroes.size()));

        // Randomly choose normal vs skill (70% normal, 30% skill)
        boolean useSkill = rng.nextDouble() < 0.3;
        boolean isCrit = rng.nextDouble() < m.getCritChance();
        if (useSkill) {
            m.skillAtk(target, isCrit);
        } else {
            m.normalAtk(target, isCrit);
        }
    }
}
