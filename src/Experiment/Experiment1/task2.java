package src.Experiment.Experiment1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: (e.g., 2012)");
        int year = input.nextInt();

        System.out.println("Enter month: 1-12");
        int month = input.nextInt();

        System.out.println("Enter the day of the month: 1-31");
        int day = input.nextInt();

        System.out.println("Enter the number of days elapsed since the day:");
        int passday = input.nextInt();

        switch (month) {
            case 1 -> {
                month = 13;
                year -= 1;
            }
            case 2 -> {
                month = 14;
                year -= 1;
            }
        }
        String a = "Null";
        String b = "Null";
        int j = Math.abs (year/100),k = year%100;
        int h = (day+(26*(month+1)/10)+k+(k/4)+(j/4)+5*j)%7;

        switch (h) {
            case 0 -> a = "Saturday";
            case 1 -> a = "Sunday";
            case 2 -> a = "Monday";
            case 3 -> a = "Tuesday";
            case 4 -> a = "Wednesday";
            case 5 -> a = "Thursday";
            case 6 -> a = "Friday";
        }
        switch ((h + passday - 1) % 7) {
            case 0 -> b = "Sunday";
            case 1 -> b = "Monday";
            case 2 -> b = "Tuesday";
            case 3 -> b = "Wednesday";
            case 4 -> b = "Thursday";
            case 5 -> b = "Friday";
            case 6 -> b = "Saturday";
        }
        System.out.println(" Day of the week is "+ a + " and the day past " + passday + " day is " + b);
        input.close();
    }   
}