package com.pluralsight;

public abstract class SuperPerson {

    private String name;
    private int health;
    private int experiencePoints;

    public SuperPerson(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        //do some validation to make sure health is handled properly
        if(health >= 0){
            this.health = health;
        }
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        //do some validation to make sure health is handled properly
        if(experiencePoints >= 0){
            this.experiencePoints = experiencePoints;
        }
    }

    public void takeDamage(int damage){
        if(damage >= 0){
            //make sure health doesnt go below 0
            setHealth(Math.max(0, this.health - damage));
        }
    }

    public boolean isAlive(){
        //if the health is greater than 0 they are alive
        return getHealth() > 0;
    }

    public String getStatus(){
        return String.format("%s has %d health", getName(), getHealth());
    }

    public abstract void fight(SuperPerson opponent);

}
