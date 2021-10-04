package com.example.cmput301f21t39;

public class Pentagon extends Shape
{
    private int sideA;
    private int sideB;
    private int sideC;
    private int sideD;
    private int sideE;

    Pentagon(int x, int y, int sideA, int sideB, int sideC, int sideD, int sideE)
    {
        super(x,y);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.sideE = sideE;
    }
}
