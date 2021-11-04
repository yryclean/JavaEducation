package com.company;

public class Seconds {
    public static void main(String[] args) {
        int second = 360000;
        int minute = second / 60;
        int hour = (second / 60) / 60;
        int day = (second / 60) / 60 / 24;
        System.out.println(360000 + " seconds = " + minute + " minutes or " + hour + " hours or " + day + " days");
    }
}