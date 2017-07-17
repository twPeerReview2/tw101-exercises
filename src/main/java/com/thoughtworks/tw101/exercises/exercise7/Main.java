package com.thoughtworks.tw101.exercises.exercise7;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.

public class Main {

    public static void main(String[] args) {

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        Scanner kb = new Scanner(System.in);
        UserInput userInput = new UserInput();
        Dialogue dialogue= new Dialogue();

        dialogue.begin();
        while(true){
            userInput.setUserInput(kb.nextLine());
            if(userInput.getUserInput() == randomNumber) {
                dialogue.success();
                break;
            }
            if(userInput.getUserInput() < randomNumber)
                dialogue.tooLow();
            if(userInput.getUserInput() > randomNumber)
                dialogue.tooHigh();
        }


    }
}

class UserInput{
    private int userInput = 0;

    public int getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = Integer.parseInt(userInput);
    }
}

class Dialogue{
    public final static String Success = "Congratulations. You won!";
    public final static String TooLow = "Sorry, this number is too low. Try again";
    public final static String TooHigh = "Sorry, this number is too high. Try again";
    public final static String Begin = "Guess a number between 1 and 100";

    public void begin(){System.out.println(Begin);}

    public void success(){System.out.println(Success);}

    public void tooLow(){System.out.println(TooLow);}

    public void tooHigh(){System.out.println(TooHigh);}
}