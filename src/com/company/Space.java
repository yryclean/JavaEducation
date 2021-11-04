package com.company;

import java.util.Scanner;
import java.util.SortedMap;

public class Space {
    public static void main(String[] args) {

//        String[] yearMonth = {"December", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November"};
        //TODO: my solution is no so smart ;)

//        String s = "All year months are: " + yearMonth[0] + ", " + yearMonth[1] + ", " + yearMonth[2] + ", " + yearMonth[3] + ", " + yearMonth[4] + ", " + yearMonth[5] + ", " + yearMonth[6] + ", " + yearMonth[7] + ", " + yearMonth[8] + ", " + yearMonth[9] + ", " + yearMonth[10] + ", " + yearMonth[11] + ".";
//        System.out.println(s);

//        String result = "";
//        for (int i = 0; i < yearMonth.length; i++) {
//            result += yearMonth[i];
//            if(i == yearMonth.length - 1) {
//                result += ".";
//            } else  {
//                result += ", ";
//            }
//        }
//        System.out.println(result);

        int monthNum = new Scanner(System.in).nextInt();
//        if (monthNum == 1) {
//            System.out.println("January");
//        } else if (monthNum == 2) {
//            System.out.println("February");
//        } else if (monthNum == 3) {
//            System.out.println("March");
//        } else {
//            System.out.println("Incorrect input");
//        }
        switch (monthNum) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            default:
                System.out.println("Incorrect input");
                break;
        }

    }
}