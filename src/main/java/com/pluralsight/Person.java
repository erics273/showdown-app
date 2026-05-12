package com.pluralsight;

public class Person {

    //things that describe a person for this application
    protected String name;
    protected int health;
    protected int experiencePoints;

    public Person(String name, int health, int experiencePoints) {
        this.name = name;
        this.health = health;
        this.experiencePoints = experiencePoints;
    }

    //interesting methods
    public boolean isAlive(){
        //return true if health is more than 0 and false if less or =
        return this.health > 0;
    }

    public String getStatus(){
        return this.name + " has " + this.health + " health";
    }

    public void takeDamage(int amount){
        //reduce the health by the amount of damage
        this.health -= amount;
        if(this.health < 0 ) health = 0;
    }

    public void fight(Person opponent){
        System.out.println(this.getName() + " prepares to fight " + opponent.getName());
    }

    //getters and setters
    //out of the way because the are not interesting
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
        this.health = health;
    }

    protected int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }
}
