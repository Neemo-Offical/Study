package src.Study.Study7;

import java.util.Scanner;

public class Study8 {
    public static int average(int[] array) {
        int total = 0;
        for (int i : array)
            total += i;
        return total / array.length;
    }
    public static double average(double[] array) {
        double total = 0.0;
        for (double i : array)
            total += i;
        return total / array.length;
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double[] arrayList = new double[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = input.nextDouble();
        }
        System.out.println("The average is " + average(arrayList));
    }
}