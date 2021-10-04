package com.example.cmput301f21t39;

public class Triangle extends Shape {
    private int side_a;
    private int side_b;
    private int side_c;

    public Triangle(int x, int y, int side_a, int side_b, int side_c) {
        super(x, y);
        this.side_a = side_a;
        this.side_b = side_b;
        this.side_c = side_c;
    }
}
