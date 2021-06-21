package src.Study.Study7;
import java.util.Scanner;

public class Study1 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int members = input.nextInt();
        int[] score = new int[members];
        System.out.println("Enter " + score.length + " scores:");
        for (int i = 0; i < score.length; i++) {
            score[i] = input.nextInt();
        }
        int best = score[0];
        for (int i=0; i < score.length; i++) {
            if (score[i] > best) best = score[i];
            }
        for (int i = 0; i < score.length; i++) {
            String grade = "F";
            if (score[i] >= best - 10) grade = "A";
            else if (score[i] >= best - 20) grade = "B";
            else if (score[i] >= best - 30) grade = "C";
            else if (score[i] >= best - 40) grade = "D";
            System.out.println("Student " + i + " score is " + score[i] +" and grade is " + grade);
        }
    }
}