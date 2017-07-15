package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float areaSum = 0, areaAverage;
        for (Rectangle rec: rectangles) {
            areaSum += rec.area();
        }

        areaAverage = areaSum/rectangles.length;

        return areaAverage;
    }
}
