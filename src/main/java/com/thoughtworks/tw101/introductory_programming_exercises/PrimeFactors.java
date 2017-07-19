package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(50);

        print(primeFactors);
    }


    private static List<Integer> generate(int n) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for (int i = 1; i < n; i++){
            if(isPrime(i)){
                if(n%i == 0)
                    primeNumbers.add(i);
            }
            else
                continue;
        }


        return primeNumbers;
    }

    private static boolean isPrime(int numberToCheck){
        boolean isPrime = false;


        if(numberToCheck == 1) return false;
        else if(numberToCheck ==2 || numberToCheck == 5) return true;


        if(noNeedToCheck(numberToCheck))
           return false;
        else if(isDivisible(numberToCheck))
            return false;
        else
            return true;

    }

    private static boolean noNeedToCheck(int num){
        String numberAsString = Integer.toString(num);
        int lastIndex = numberAsString.length() -1;



        switch (numberAsString.charAt(lastIndex)){
            case '0': return true;
            case '2': return true;
            case '4': return true;
            case '5': return true;
            case '6': return true;
            case '8': return true;
            default: return false;
        }
    }

    private static boolean isDivisible(int num){
        for(int i= 2; i<num; i++){
            if(num%i == 0)
                return true;
            else
                continue;
        }
        return false;
    }

    private static void print(List<Integer> list){
        System.out.print("Set of prime numbers: { ");
        for (Integer i: list) {
            System.out.print(i+" ");
        }
        System.out.println("}");
    }
}
