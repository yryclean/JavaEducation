package com.company;

public class Days {
    public static void main(String[] args) {
        int days = 5000;
        int years = days / 365;
        int month = (days % 365) / 31;
        int leftDays = days - years * 365 - month * 31;
        System.out.println("Number of days" + days);
        System.out.println("Years " + years);
        System.out.println("Months " + month);
        System.out.println("Days " + days);
    }

}
