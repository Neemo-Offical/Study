import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of lines to print");
        int line = input.nextInt();                                 //定义行数
        for (int i = 0; i < line; i++) {                            //整个循环结束条件
            int number = 1;                                         //定义行循环中单次打印的初始值
            System.out.format("%" + (line - i) * 2 + "s", "");      //居中
            for (int j = 0; j <= i; j++) {                          //单行循环结束条件
                System.out.format("%4d", number);                   //行循环——单次输出
                number = number * (i - j) / (j + 1);                //为单次输出值定义新的值
            }
            System.out.println();                                   //转到下一行
        }
    }
}