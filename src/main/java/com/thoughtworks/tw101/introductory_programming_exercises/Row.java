package com.thoughtworks.tw101.introductory_programming_exercises;

public class Row {
    private int spaceCount;
    private int starCount;

    public Row(int length, int index) {
        this.spaceCount = length-index;
        this.starCount = 2*index - 1;
    }

    private String getStringOfSpaces() {
        String spaces = "";
        for (int i = 0; i < spaceCount; i++)
            spaces += " ";

        return spaces;
    }

    private String getStringOfStars() {
        String stars = "";
        for (int i = 0; i < starCount; i++)
            stars += "*";

        return stars;
    }

    public void printRow() {
        System.out.println(getStringOfSpaces() + getStringOfStars());
    }
}