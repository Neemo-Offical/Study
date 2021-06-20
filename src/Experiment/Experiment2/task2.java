import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data;
        int negative = 0;
        int positive = 0;

        do {
            System.out.println("Enter a integer:");
            data = input.nextInt();
            if (data > 0)
                positive++;
            if (data < 0)
                negative++;
        } while (!input.hasNext("%"));
        System.out.println("There are " + positive + " positives and " + negative + " negatives.");
    }
}