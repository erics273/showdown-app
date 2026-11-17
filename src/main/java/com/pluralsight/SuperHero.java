package com.pluralsight;

import java.util.Random;

public class SuperHero extends SuperPerson {

    public SuperHero(String name, int health, int powerLevel) {

        //call the parent constructor and give it the things it knows how to handle
        super(name, health);

        //handle all other things the parent constructor doesnt
        setExperiencePoints(powerLevel);

        //say something cool
        System.out.printf("%s arrives with a power level of %d%n", getName(), powerLevel);

    }

    @Override
    public void fight(SuperPerson opponent){

        //generate a base damage number between 0 and 100
        Random damageRand = new Random();
        int baseDamage = damageRand.nextInt(101);

        //if the base damage was 0 then we missed. if it was > 0 we add our experience points to the damage and have the oppenent take the damage
        if(baseDamage == 0 ){
            System.out.printf("%s swings heroically... but misses!%n", getName());
        }else{
            int damage = baseDamage + getExperiencePoints();
            System.out.printf("%s lands a punch on %s for %d damage!%n", getName(), opponent.getName(), damage);
            opponent.takeDamage(damage);
        }

    }

    public int getPowerLevel(){
        return getExperiencePoints();
    }

}
