package com.pluralsight;

import java.util.ArrayList;

public class ShowDownApp {

    public static void main(String[] args) {


        //lets create our super people (hero and a villian)
        SuperHero hero = new SuperHero("CodeMaster", 300, 10);
        SuperVillian villain = new SuperVillian("Nullinator", 250, 7);

        //here i am just printing a header for the app and sharing the status of the hero an villian before the battle
        System.out.println("=== Welcome to the Super Showdown! ===");
        System.out.println(hero.getStatus());
        System.out.println(villain.getStatus());

        //only jeep fightng if the hero and the villain are alive
        while (hero.isAlive() && villain.isAlive()) {
            //print out whos turn it is, since the hero is going first we'll print that out first
            System.out.println("\n-- Hero's Turn --");
            //make the hero fight the villian
            hero.fight(villain);
            //print out the new status of the villain
            System.out.println(villain.getStatus());

            //if the villian died, then no point in fighting anymore
            //a dead thing can't attack
            if (!villain.isAlive()) {
                //this breaks out of the loop, no reason to keep playing
                break;
            }

            //now the villian has a turn because they are still alive after being attached by the hero
            System.out.println("\n-- Villain's Turn --");
            //make the villian fight the hero
            villain.fight(hero);
            //print out their status
            System.out.println(hero.getStatus());

        }

        System.out.println("\n=== The Battle is Over! ===");

        if (hero.isAlive()) {
            System.out.println(hero.name + " wins the showdown!");
        } else {
            System.out.println(villain.name + " has defeated the hero!");
        }

        System.out.println();
    }


}