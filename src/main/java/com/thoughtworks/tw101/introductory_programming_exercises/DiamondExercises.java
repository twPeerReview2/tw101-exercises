package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(6);
    }

    static String space(int spaceCount){
        String spaces="";
        for(int i= 0; i<spaceCount; i++)
            spaces += " ";

        return spaces;
    }
    static String star(int startCount){
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
            System.out.println(space(n-i) + star((2*i)-1) + space(n-i));
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
            System.out.println(space(n-i)+star((2*i)-1)+space(n-i));
        }

        for(int i = n-1; i>0;i--){
            System.out.println(space(n-i)+star((2*i)-1)+space(n-i));
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
            System.out.println(space(n-i)+star((2*i)-1)+space(n-i));
        }
        System.out.println("Goodness");
        for(int i=n-1; i>0; i--){
            System.out.println(space(n-i)+star((2*i)-1)+space(n-i));
        }
    }
}
