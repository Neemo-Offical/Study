package src.Study.Study7;
import java.util.Scanner;
public class Study14 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int[] arrayList = new int[5];
        System.out.println("Enter 5 integer:");
        for (int i = 0; i < arrayList.length; i++)
            arrayList[i] = input.nextInt();
        System.out.println("The gcd of numbers is " + gcd(arrayList));
    }
    public static int gcd(int... numbers) {
        if (numbers.length == 1)
            return numbers[0];
        else if (numbers.length == 2)
            return gcd(numbers[0], numbers[1]);
        else{
            int gcd = gcd(numbers[0],numbers[1]);
            for(int i=2;i<numbers.length;i++)
                gcd=gcd(gcd,numbers[i]);
            return gcd;
        }
    }
    public static int gcd(int num1, int num2) {
        int gkd = Math.min(num1, num2);
        while ((!(num1 % gkd == 0 && num2 % gkd == 0)) && gkd >= 2)
            gkd--;
        return gkd;
    }
}
