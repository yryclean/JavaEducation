package com.company;
public class Boolean {
    public static void main(String[] args) {
        int time = 15;
        int temp = 19;
        boolean night = time >= 23 || time <=5;
        boolean goodWeather = temp > 25;
        if (night) {
            System.out.println("Go to sleep");
        }
        if (!night && goodWeather) {
            System.out.println("Go for a walk");
        }
        if (!night && !goodWeather) {
            System.out.println("Read a book");
        }
    }
}
