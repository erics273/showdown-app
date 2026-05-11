package com.pluralsight;

public class SuperVillian extends Person {

    public SuperVillian(String name, int health, int evliness) {
        super(name, health, evliness);
    }

    public int getEvilnessLevel(){
        return this.experiencePoints;
    }
}
