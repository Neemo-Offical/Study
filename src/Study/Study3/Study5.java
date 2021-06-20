package src.Study.Study3;

import java.util.Scanner;

public class Study5 {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);
        System.out.println("Enter today's day:");
        int today = input.nextInt();
        System.out.println("Enter the number of days elapsed since today:");
        int passday = input.nextInt();
        String a = "Empty";
        String b = "Empty";
        if (today > 6 || today < 0)
            System.out.println("[WARNING] A WRONG NUMBER!");
        else
            switch (today) {
                case 0 -> a = "Sunday";
                case 1 -> a = "Monday";
                case 2 -> a = "Tuesday";
                case 3 -> a = "Wednesday";
                case 4 -> a = "Thursday";
                case 5 -> a = "Friday";
                case 6 -> a = "Saturday";
            }
            switch ((today + passday) % 7) {
                case 0 -> b = "Sunday";
                case 1 -> b = "Monday";
                case 2 -> b = "Tuesday";
                case 3 -> b = "Wednesday";
                case 4 -> b = "Thursday";
                case 5 -> b = "Friday";
                case 6 -> b = "Saturday";
        }
        System.out.print("Today is " + a + " and the future day is " + b);
        input.close();
    }
}
