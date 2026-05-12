package com.pluralsight;

import java.util.ArrayList;

public class ShowDownApp {

    public static void main(String[] args) {

        SuperHero hero = new SuperHero("CodeMaster", 300, 10);
        SuperVillian villain = new SuperVillian("Nullinator", 250, 7);

        //equip them with power ups
        //add some power ups to hero and villian
        hero.addPowerUp("Bat", 10);
        hero.addPowerUp("Throwing Star", 20);
        hero.addPowerUp("Laser Phaser", 15);

        villain.addPowerUp("Crowbar", 5);
        villain.addPowerUp("Blow Dart", 25);
        villain.addPowerUp("BFG", 30);

        System.out.println("=== Welcome to the Super Showdown! ===");
        System.out.println(hero.getStatus());
        System.out.println(villain.getStatus());

        while (hero.isAlive() && villain.isAlive()) {
            System.out.println("\n-- Hero's Turn --");
            hero.fight(villain);
            System.out.println(villain.getStatus());

            if (!villain.isAlive()) {
                break;
            }

            System.out.println("\n-- Villain's Turn --");
            villain.fight(hero);
            System.out.println(hero.getStatus());
        }

        System.out.println("\n=== The Battle is Over! ===");

        if (hero.isAlive()) {
            System.out.println(hero.name + " wins the showdown!");
        } else {
            System.out.println(villain.name + " has defeated the hero!");
        }

        System.out.println();

        //show the battle log
        hero.printBattleLog();
        villain.printBattleLog();
    }


}
