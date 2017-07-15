package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by gdara on 7/14/2017.
 */
public class Orc implements Monster {
    int hitPoints = 20;

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.println("Orc Health: " + hitPoints);
    }

}
