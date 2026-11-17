package com.pluralsight;

import java.util.Random;

public class SuperVillian extends SuperPerson {

    public SuperVillian(String name, int health, int evilnessLevel) {
        super(name, health);

        setExperiencePoints(evilnessLevel);

        //say something cool
        System.out.printf("%s emerges with a eveilness level of %d%n", getName(), evilnessLevel);
    }

    @Override
    public void fight(SuperPerson opponent){
        //generate a base damage number between 0 and 100
        Random damageRand = new Random();
        int baseDamage = damageRand.nextInt(101);

        //if the base damage was 0 then we missed. if it was > 0 we add our experience points to the damage and have the oppenent take the damage
        if(baseDamage == 0 ){
            System.out.printf("%s fires a sneaky shot... but misses!%n", getName());
        }else{
            int damage = baseDamage + getExperiencePoints();
            System.out.printf("%s hits %s with a sneaky shot for %d damage!%n", getName(), opponent.getName(), damage);
            opponent.takeDamage(damage);
        }
    }

    public int getEvilnessLevel(){
        return getExperiencePoints();
    }

}
