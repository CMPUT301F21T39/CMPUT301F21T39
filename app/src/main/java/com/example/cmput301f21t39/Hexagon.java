package com.example.cmput301f21t39;

public class Hexagon extends Shape{

    private int side1;
    private int side2;
    private int side3;
    private int side4;
    private int side5;
    private int side6;
    Hexagon(int x, int y, int side1, int side2, int side3, int side4, int side5, int side6) {

        super(x, y);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.side4 = side4;
        this.side5 = side5;
        this.side6 = side6;
    }
}
