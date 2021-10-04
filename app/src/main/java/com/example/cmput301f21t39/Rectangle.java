package com.example.cmput301f21t39;

public class Rectangle extends Shape{
    private int width;
    private int height;

    Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
}