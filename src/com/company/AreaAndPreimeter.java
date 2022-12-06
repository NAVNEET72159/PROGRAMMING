package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaAndPreimeter extends Formula {
    int length, breadth, radius;
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public void areaAndPerimeterRectangle() throws IOException {
        length = Integer.parseInt(bufferedReader.readLine());
        breadth = Integer.parseInt(bufferedReader.readLine());
    }

    public void areaAndPerimeterSquare() throws IOException{
        length = Integer.parseInt(bufferedReader.readLine());
    }

    public void areaAndPerimeterCircle() throws IOException {
        radius = Integer.parseInt(bufferedReader.readLine());
    }

}
