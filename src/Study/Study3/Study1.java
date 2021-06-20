package src.Study.Study3;

import java.util.Scanner;

public class Study1 {
    public static void main(String[] args) {       
        Scanner input = new Scanner(System.in);
        System.out.println("r1 = (-b + √b^2 - 4ac) / 2a");
        System.out.println("r2 = (-b - √b^2 - 4ac) / 2a");
        System.out.println("Enter a, b, c:");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double delta = Math.pow(Math.pow(b, 2) - 4 * a * c, 0.5);       // √b^2-4ac
        double r1 = (-b + delta)/(2 * a);                               // r1's value
        double r2 = (-b - delta)/(2 * a);                               // r2's value

        if (delta == 0) 
            System.out.print("The equation has one root " + r1);

        else if (delta > 0)
            System.out.print("The equation has two roots " + r1 + " and " + r2); 

        else
            System.out.print("The equation has no real roots");
        input.close();
    }
}