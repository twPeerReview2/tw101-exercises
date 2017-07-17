package com.thoughtworks.tw101.exercises.exercise8;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

public class Main {

    public static void main(String[] args) {

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 100 + 1);
        Scanner kb = new Scanner(System.in);
        UserInput userInput = new UserInput();
        Dialogue dialogue = new Dialogue();

        dialogue.begin();

        while (true) {
            userInput.setUserInput(kb.nextLine());

            if(userInput.isInvalid()) {
                dialogue.tryAgain();
            }
            else if (userInput.is(randomNumber)) {
                dialogue.success();
                userInput.printHistory();
                break;
            }
            else if (userInput.isGreaterThan(randomNumber)) {
                dialogue.tooHigh();
            }
            else if (userInput.isLessThan(randomNumber)) {
                dialogue.tooLow();
            }
        }
    }
}

class UserInput{
    private int userInput = 0;
    private boolean isInvalid = false;
    ArrayList<Integer> inputHistory = new ArrayList<>();

    public void setUserInput(String userInput) {
        try {
            inputHistory.add(this.userInput);
            this.userInput = Integer.parseInt(userInput);
            isInvalid = false;
        }
        catch (NumberFormatException e){
            isInvalid = true;
        }
    }

    public void printHistory(){
        System.out.print("Previous guesses: ");
        inputHistory.remove(0);
        for (Integer guess: inputHistory) {
            System.out.print(guess + ", ");

        }
    }

    public boolean is(int randomNumber){
    if(userInput == randomNumber)
        return true;
    else
        return false;
    }

    public boolean isGreaterThan(int randomNumber){
        if(userInput > randomNumber)
            return true;
        else
            return false;
    }

    public boolean isLessThan(int randomNumber){
        if(userInput < randomNumber)
            return true;
        else
            return false;
    }

    public boolean isInvalid(){
        if(isInvalid == true)
            return true;
        else return false;
    }


}

class Dialogue{
    public final static String Success = "Congratulations. You won!";
    public final static String TooLow = "Sorry, this number is too low. Try again";
    public final static String TooHigh = "Sorry, this number is too high. Try again";
    public final static String Begin = "Guess a number between 1 and 100";
    public final static String TryAgain = "It appears you entered an invalid number! \nPlease pick a number 1-100";

    public void begin(){System.out.println(Begin);}

    public void success(){System.out.println(Success);}

    public void tooLow(){System.out.println(TooLow);}

    public void tooHigh(){System.out.println(TooHigh);}

    public void tryAgain(){System.out.println(TryAgain);}
}