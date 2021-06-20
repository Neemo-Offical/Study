package src.Study.Study3;

import java.util.Scanner;

public class Study18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weight = input.nextDouble();

        if (weight <= 0)
            System.out.println("Invalid input");
        else if (weight > 0 &&  weight <= 1)
            System.out.println("The cost is 3.5$");
        else if (weight > 1 && weight <= 3)
            System.out.println("The cost is 5.5$");
        else if (weight > 3 && weight <= 10)
            System.out.println("The cost is 8.5$");
        else if (weight > 10 && weight <= 20)
            System.out.println("The cost is 10.5$");
        else if (weight > 20)
            System.out.println("The package cannot be shipped");
        input.close();
    }    
}
