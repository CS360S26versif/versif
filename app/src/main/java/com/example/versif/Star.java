package com.example.versif;

public class Star extends Shape {
    private int points;

    public Star(int x, int y, int points) {
        this.x = x;
        this.y = y;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}