package com.pluralsight;

public class SuperHero extends SuperPerson {

    public SuperHero(String name, int health, int powerLevel) {

        //call the parent constructor and give it the things it knows how to handle
        super(name, health);

        //handle all other things the parent constructor doesnt
        setExperiencePoints(powerLevel);

        //say something cool
        System.out.printf("%s arrives with a power level of %d%n", getName(), powerLevel);

    }

}
