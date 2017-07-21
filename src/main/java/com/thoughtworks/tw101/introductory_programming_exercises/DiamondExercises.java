package com.thoughtworks.tw101.introductory_programming_exercises;

/***---------------------------Identified Smells-------------------------------***/
/* Dispenser 1:
 *  The helper methods getStringOfSpaces() and getStringOfStars() could use descriptive comments.
 *  Refactored by renaming getStringOfSpaces() and getStringOfStars()
 *
 * Dispenser 2:
 *  Duplicate code - extracted a line used multiple times within for loops to print a row of spaces
 *  and stars. New method printRow().
 *
 * Bloater 1:
 *  The DiamondExercises class got a bit long.
 *  Refactored by creating a new class Row that holds the methods for storing
 *  and printing rows of spaces and stars.
 *
 * Bloater 2:
 *  The methods drawADiamond() and drawADiamondWithYourName() could be shorter by reusing the
 *  drawAnIsoscelesTriangle() method.
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


    //    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for(int i = 1; i<=n; i++){
            Row row = new Row(n, i);
            row.printRow();
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
        drawAnIsoscelesTriangle(n);
        for(int i = n-1; i>0;i--){
            Row row = new Row(n, i);
            row.printRow();
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
        drawAnIsoscelesTriangle(n);
        System.out.println("Goodness");
        for(int i=n-1; i>0; i--){
            Row row = new Row(n, i);
            row.printRow();
        }
    }
}
