package src.Experiment.Experiment1;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five-digit integer:");
        int digit = input.nextInt();
        int digit1 = digit / 10000;                                         //万位数
        int digit2 = digit / 1000 % 10;                                     //千位数
        int digit4 = digit % 100 / 10;                                      //十位数
        int digit5 = digit % 10;                                            //个位数
        if (digit1 == digit5 && digit2 == digit4)
            System.out.println(digit1 + "=" + digit5 + "," + digit2 + "=" + digit4 + "," + digit + " is a palindrome");
        else
            System.out.println(digit1 + "≠" + digit5 + "," + digit2 + "≠" + digit4 + "," +  + digit + " is not a palindrome"); 
        input.close();
    }
}