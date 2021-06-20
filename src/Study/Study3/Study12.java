package src.Study.Study3;

import java.util.Scanner;

public class Study12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three-digit integer:");
        int digit = input.nextInt();
        int digitStart = digit / 100;                                   //百位数
        int digitEnd = digit % 10;                                      //个位数
        if (digitStart == digitEnd)
            System.out.println(digitStart + "=" + digitEnd + "," + digit + " is a palindrome");
        else
            System.out.println(digitStart + "≠" + digitEnd + "," + digit + " is not a palindrome"); 
        input.close();
    }
}
