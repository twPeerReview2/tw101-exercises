package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int sum =0;
        System.out.print("Odd Numbers: ");
        for(int oddNumber = 1; oddNumber<=99;oddNumber+=2){

            System.out.print(oddNumber+" ");
            sum+=oddNumber;
        }

        System.out.print("\nSum:" + sum);
    }
}
