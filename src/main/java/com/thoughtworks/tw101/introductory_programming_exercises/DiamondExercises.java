package com.thoughtworks.tw101.introductory_programming_exercises;

/***---------------------------Identified Smells-------------------------------***/
/* Dispenser 1:
 *  The helper methods getStringOfSpaces() and getStringOfStars() could use descriptive comments.
 *  Refactored by renaming getStringOfSpaces() and getStringOfStars()
 *
 * Dispenser 2:
 *  Dead code - eliminated calls to getStringOfSpaces() that added spaces after printing
 *  stars for a row. The output looks exactly the same without the extra spaces.
 *
 * Bloater 1:
 *
 *
 * Bloater 2:
 *
 *
 * OO Abuser 1:
 *
 */


public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(6);
    }

    static String getStringOfSpaces(int spaceCount){
        String spaces="";
        for(int i= 0; i<spaceCount; i++)
            spaces += " ";

        return spaces;
    }
    static String getStringOfStars(int startCount){
        String stars="";
        for(int i =0;i<startCount;i++)
            stars+="*";

        return stars;
    }


    //    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for(int i = 1; i<=n; i++){
            System.out.println(getStringOfSpaces(n-i) + getStringOfStars((2*i)-1));
        }

    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        for(int i = 1; i<=n; i++){
            System.out.println(getStringOfSpaces(n-i)+ getStringOfStars((2*i)-1));
        }

        for(int i = n-1; i>0;i--){
            System.out.println(getStringOfSpaces(n-i)+ getStringOfStars((2*i)-1));
        }
    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        for(int i=1; i<=n-1; i++){
            System.out.println(getStringOfSpaces(n-i)+ getStringOfStars((2*i)-1));
        }
        System.out.println("Goodness");
        for(int i=n-1; i>0; i--){
            System.out.println(getStringOfSpaces(n-i)+ getStringOfStars((2*i)-1));
        }
    }
}
