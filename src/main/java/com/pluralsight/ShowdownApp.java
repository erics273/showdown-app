package com.pluralsight;

import java.util.Random;

public class ShowdownApp {

    public static void main(String[] args) {

        //help me generte random number for the damage
        Random random = new Random();

        SuperHero hero = new SuperHero("Cherish", 100, 100);
        SuperVillian villian = new SuperVillian("Redeat", 100, 150);

        System.out.println(hero.getStatus());
        System.out.println(villian.getStatus());

        hero.fight(villian);
        villian.takeDamage(random.nextInt(101));
        villian.fight(hero);
        hero.takeDamage(random.nextInt(101));

        System.out.println(hero.getStatus());
        System.out.println(villian.getStatus());

    }

}
