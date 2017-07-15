package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by gdara on 7/14/2017.
 */
public class Troll implements Monster {
    int hitPoints = 40;
    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount/2;
    }

    @Override
    public void reportStatus() {
        System.out.println("Troll Health: " + hitPoints);
    }
}
