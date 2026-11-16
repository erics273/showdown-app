package com.pluralsight;

public class SuperVillian extends SuperPerson {

    public SuperVillian(String name, int health, int evilnessLevel) {
        super(name, health);

        setExperiencePoints(evilnessLevel);

        //say something cool
        System.out.printf("%s emerges with a eveilness level of %d%n", getName(), evilnessLevel);
    }
}
