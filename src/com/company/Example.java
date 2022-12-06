package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your choice: ");
        System.out.println("1. For Square: ");
        System.out.println("2. For Rectangle: ");
        System.out.println("3. For Circle: ");
        int ch = Integer.parseInt(bufferedReader.readLine());
        int length, breadth, radius;

        AreaAndPreimeter areaAndPreimeter = new AreaAndPreimeter();

        switch (ch) {
            case 1:
                System.out.println("Enter the length: ");
                areaAndPreimeter.areaAndPerimeterSquare();
                areaAndPreimeter.formulaSquare(areaAndPreimeter.length);
                break;

            case 2:
                System.out.println("Enter the length: ");
                length = Integer.parseInt(bufferedReader.readLine());
                breadth = Integer.parseInt(bufferedReader.readLine());
                areaAndPreimeter.areaAndPerimeterRectangle();
                areaAndPreimeter.formulaRectangle(areaAndPreimeter.length, areaAndPreimeter.breadth);
                break;
            case 3:
                System.out.println("Enter the radius: ");
                radius = Integer.parseInt(bufferedReader.readLine());
                areaAndPreimeter.areaAndPerimeterCircle();
                areaAndPreimeter.formulaCircle(areaAndPreimeter.radius);
                break;

            default:
                System.out.println("Enter the right choice: ");
        }
    }
}
