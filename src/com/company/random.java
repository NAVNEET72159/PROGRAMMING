package com.company;

import java.util.Random;

public class random {

    public static void main(String[] args){

        method1();
        method2();
    }

    public static void method1() {
        System.out.println(Math.random());
    }
    public static void method2(){
        Random rd = new Random();
        int x = rd.nextInt(1000);
        System.out.println(x);
    }
}
