package src.Study.Study9;

import java.util.Random;

public class Study4 {
    public static void main(String[] args) {
        Random r = new Random(1000);
        for (int i = 0, j = 5; i < j; i++) {
            for (int a = 0, b = 10; a < b; a++) {
                int c = r.nextInt(100);
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
