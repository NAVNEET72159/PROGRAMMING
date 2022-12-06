package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class timeMachine {
    public static void main(String[] args ) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(bufferedReader.readLine());     //cin>>year;
        int totalNoOfDays = 0, months = 0, currentMonthdays = 0;
        if (year > 1918) {    //Georgian calender
            if (year%400 == 0 || (year%4 == 0 && year%100 != 0)) {
                while (totalNoOfDays<=256) {
                    months++;
                    totalNoOfDays = totalNoOfDays+totalDayInThisMonth(months, true);
                    currentMonthdays = totalDayInThisMonth(months, true);
                    currentMonthdays = currentMonthdays-(totalNoOfDays-256);
                }
            } else {
                while (totalNoOfDays <= 256) {
                    months++;
                    totalNoOfDays = totalNoOfDays + totalDayInThisMonth(months, false);
                    currentMonthdays = totalDayInThisMonth(months, false);
                    currentMonthdays = currentMonthdays-(totalNoOfDays-256);
                }
            }
        }
        if (year<1918) {    //Julian Calender
            if(year%4 ==0) {
                while (totalNoOfDays<=256) {
                    months++;
                    totalNoOfDays = totalNoOfDays+totalDayInThisMonth(months, true);
                    currentMonthdays = totalDayInThisMonth(months, true);
                    currentMonthdays = currentMonthdays-(totalNoOfDays-256);
                }
            } else {
                while (totalNoOfDays <= 256) {
                    months++;
                    totalNoOfDays = totalNoOfDays + totalDayInThisMonth(months, false);
                    currentMonthdays = totalDayInThisMonth(months, false);
                    currentMonthdays = currentMonthdays-(totalNoOfDays-256);
                }
            }
        }
        else{
            while (totalNoOfDays<=256) {
                months++;
                totalNoOfDays = totalNoOfDays+totalDayInThisMonth(months, false);
                currentMonthdays = totalDayInThisMonth(months, false);
                currentMonthdays = currentMonthdays-(totalNoOfDays-256)+13;
            }
        }
        System.out.println(currentMonthdays+".0"+months+"."+year);
    }

    private static int totalDayInThisMonth(int months, boolean isLeap) {
        int days = 0;
        boolean b = months == 1 || months == 3 || months == 5 || months == 7 || months == 8 || months == 10 || months == 12;
        if (isLeap){
            if (b) {
                days = 31;
            }
            if (months == 4|| months == 6 || months == 9 || months == 11) {
                days = 30;
            }
            if (months == 2) {
                days = 29;
            }
        } else {
            if (b) {
                days = 31;
            }
            if (months == 4|| months == 6 || months == 9 || months == 11) {
                days = 30;
            }
            if (months == 2) {
                days = 28;
            }
        }
        return days;
    }
}
