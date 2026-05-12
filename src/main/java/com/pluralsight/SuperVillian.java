package com.pluralsight;

import java.util.Random;

public class SuperVillian extends Person {

    public SuperVillian(String name, int health, int evliness) {
        super(name, health, evliness);
    }

    public int getEvilnessLevel(){
        return this.experiencePoints;
    }

    @Override
    public void fight(Person opponent) {
        //Generate a random number to figure out the base damage i am about to deliver to this opponent
        Random randomNumber = new Random();
        int baseDamage = randomNumber.nextInt(101); // this will give me a number between 0 and 100

        //generate bonus damage from random weapon in inventory
        int bonusDamage = this.getPowerUpBonusRandom();

        //lets take that base damage plus our experience points for the final damage
        int damage = baseDamage + this.getEvilnessLevel() + bonusDamage;

        //figure out how we want to deal that damage to the opponent
        if (baseDamage == 0) {
            //if the base damage was 0 then we missed
            System.out.println(this.name + " fires a sneaky blast... but misses!");
        } else {
            System.out.println(this.getName() + " hits " + opponent.getName() + " with a sneaky blast for " + damage + " total damage");
            //deal the damage if the base damage wasnt 0
            opponent.takeDamage(damage);
            this.logHit(opponent);
        }
    }
}
