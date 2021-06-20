package src.Experiment.Experiment1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.nextLine();
        System.out.println(word.toLowerCase());
        input.close();
    }
}
