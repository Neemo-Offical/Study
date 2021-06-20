package src.Study.Study3;

import java.util.Scanner;

public class Study26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int integer = input.nextInt();

        boolean a = (integer % 5 == 0 && integer % 6 ==0);
        boolean b = (integer % 5 == 0 || integer % 6 ==0);
        boolean c = (integer % 5 == 0 ^ integer % 6 ==0);
        System.out.println("Is " + integer + " divisible by 5 and 6? " + a);
        System.out.println("Is " + integer + " divisible by 5 or 6? " + b);
        System.out.println("Is " + integer + " divisible by 5 or 6, but not both? " + c);
        input.close();
    }
}