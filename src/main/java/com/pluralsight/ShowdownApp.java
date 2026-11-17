package com.pluralsight;

import java.util.Random;

public class ShowdownApp {

    public static void main(String[] args) {

       SuperPerson hero = new SuperHero("Eric", 100, 25);
       SuperPerson villian = new SuperVillian("Jim", 100, 25);
       SuperPerson bob = new SuperPerson("Bob", 100);

       //polymorphism works, the compiler knows that these are heros sort of when calling fight
       hero.fight(villian);
       villian.fight(hero);
       bob.fight(villian);



    }



}
