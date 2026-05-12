package com.pluralsight;

import java.util.Random;

public class SuperHero extends Person {

    public SuperHero(String name, int health, int powerLevel) {
        //when we create a super hero
        //the parent class already knows how to deal with
        //name, health, and experiencePoints
        //so we use super to call the parent constructor
        super(name, health, powerLevel);

    }

    public int getPowerLevel(){
        return this.experiencePoints;
    }

    @Override
    public void fight(Person opponent){
        //Generate a random number to figure out the base damage i am about to deliver to this opponent
        Random randomNumber = new Random();
        int baseDamage = randomNumber.nextInt(101); // this will give me a number between 0 and 100

        //supplement the damage number with the experience points for this superHero
        int damage = baseDamage + this.experiencePoints;

        //figure out how we want to deal that damage to the opponent
        if(baseDamage == 0){
            //if the base damage was 0 then we missed
            System.out.println(this.name + " swings heroically... but misses!");
        }else{
            System.out.println(this.getName() + " lands a heroic punch on " + opponent.getName() + " dealing " + damage + " total damage");
            //deal the damage if the base damage wasnt 0
            opponent.takeDamage(damage);
        }
    }

}
