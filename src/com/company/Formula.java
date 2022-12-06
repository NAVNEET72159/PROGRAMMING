package com.company;

public class Formula {
    public void formulaSquare(int length) {
        int area = length*length;
        int perimeter = 4*length;
        System.out.println(area);
        System.out.println(perimeter);
    }
    public void formulaRectangle(int length, int breadth) {
        int area = length*breadth;
        int perimeter = 2*(length+breadth);
        System.out.println(area);
        System.out.println(perimeter);
    }
    public void formulaCircle(int radius) {
        double area  = 3.14*radius*radius;
        double perimeter  = 2*3.14*radius;
        System.out.println(area);
        System.out.println(perimeter);
    }
}
