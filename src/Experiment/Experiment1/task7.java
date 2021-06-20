package src.Experiment.Experiment1;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score:");
        double grade = input.nextDouble();

        if (grade <= 60 && grade >= 0)
            System.out.println("The GPA is E");
        else if (grade > 60 && grade <= 69)
            System.out.println("The GPA is D");
        else if (grade > 70 && grade <= 79)
            System.out.println("The GPA is C");
        else if (grade > 80 && grade <= 89)
            System.out.println("The GPA is B");
        else if (grade > 90 && grade <= 100)
            System.out.println("The GPA is A");
        else
            System.out.println("[WARNING] A WRONG NUMBER!");
        input.close();
    }    
}
